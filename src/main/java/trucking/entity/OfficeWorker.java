package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class OfficeWorker implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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