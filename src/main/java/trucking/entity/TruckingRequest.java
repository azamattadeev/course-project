package trucking.entity;

import lombok.Data;
import trucking.entity.enums.TruckingRequestStatus;

import javax.persistence.*;

@Entity
@Data
public class TruckingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "location_address")
    private String locationAddress;

    private double length;
    private double width;
    private double height;

    @Enumerated(value = EnumType.STRING)
    private TruckingRequestStatus status;

    private String locationCountry;
    private String locationCity;

    private String shippingCountry;
    private String shippingCity;

    private double weight;

    @Column(name = "contact_number", length = 20)
    private String contactNumber;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "customer_name", length = 40)
    private String customerName;

    private String usersDescription;

    private String workersDescription;

    @ManyToOne
    private Warehouse orderProcessingOffice;

    public TruckingRequest() {}
}