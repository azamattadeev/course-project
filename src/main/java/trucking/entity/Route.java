package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Route implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(targetEntity = WayNode.class, cascade = CascadeType.ALL)
    private WayNode firstWayNode;

    @OneToOne(mappedBy = "route")
    private Parcel parcel;

    public Route(){}
}
