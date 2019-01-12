package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_table")
@Data
public class Order implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    @OneToOne
    private Parcel parcel;

    @OneToOne
    private Recipient recipient;

    public Order() {}
}
