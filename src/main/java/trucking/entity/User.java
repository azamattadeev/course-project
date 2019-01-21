package trucking.entity;

import lombok.Data;
import trucking.entity.enums.RoleEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "user_table")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    @Column(nullable = false, unique = true)
    private String email;
    private String hashPassword;

    @ElementCollection(targetClass = RoleEnum.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name="user_roles")
    @Column(name="role")
    private Set<RoleEnum> roles;

    @OneToOne
    private Logistician logisticianAccount;
    @OneToOne
    private OfficeWorker officeWorkerAccount;
    @OneToOne
    private Client clientAccount;
    @OneToOne
    private WarehouseManager warehouseManagerAccount;

    public User(){}
}
