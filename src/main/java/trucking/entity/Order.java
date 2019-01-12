package trucking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
@Data
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double price;

    @OneToOne
    private Parcel parcel;

    @OneToOne
    private Recipient recipient;

    public Order() {}
}
