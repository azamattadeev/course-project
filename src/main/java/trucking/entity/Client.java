package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String city;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Parcel> parcels;

    public Client() {}

}
