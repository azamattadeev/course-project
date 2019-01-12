package trucking.entity;

import lombok.Data;
import trucking.entity.enums.ParcelStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "track_number", unique = true)
    private String trackNumber;

    @OneToOne(targetEntity = Route.class)
    private Route route;

    @ManyToOne(targetEntity = Warehouse.class)
    private Warehouse currentWarehouse;

    @ManyToOne(targetEntity = Flight.class)
    private Flight currentFlight;

    @ManyToMany(mappedBy = "parcels", fetch = FetchType.LAZY)
    private List<Client> clients;

    @Column(name = "is_on_the_way")
    private boolean isOnTheWay;

    private double length;
    private double width;
    private double height;

    private double weight;

    @Enumerated(value = EnumType.STRING)
    private ParcelStatus status;

    @OneToOne
    private Order order;

    private String description;

    public Parcel() {}
}