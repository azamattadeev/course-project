package trucking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String surname;

    @OneToOne(mappedBy = "recipient")
    private Order order;

    @Column(name = "passport_number", length = 40)
    private String passportNumber;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    private String email;

    public Recipient() {}
}