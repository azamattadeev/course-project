package trucking.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double price;

    @OneToOne
    private Parcel parcel;

    @OneToOne
    private Recipient recipient;

    public Order() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

}
