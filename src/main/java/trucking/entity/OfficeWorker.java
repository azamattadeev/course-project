package trucking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OfficeWorker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;

    @ManyToOne
    private Warehouse warehouse;

    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;
    private String passwordHash;

    public OfficeWorker() {}
}