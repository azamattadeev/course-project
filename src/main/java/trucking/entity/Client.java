package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Client implements Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    private String country;

    private String city;

    private String address;

    private String passwordHash;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Parcel> parcels;

    public Client() {}

}
