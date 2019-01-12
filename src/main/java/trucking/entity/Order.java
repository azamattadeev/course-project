package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "order_table")
@Data
public class Order implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    @OneToMany
    private List<Parcel> parcels;

    @OneToOne
    private Person recipient;

    @OneToOne
    private Person sender;

    public Order() {}
}
