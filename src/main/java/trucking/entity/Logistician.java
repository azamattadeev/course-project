package trucking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Logistician implements Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    public Logistician() {}

}