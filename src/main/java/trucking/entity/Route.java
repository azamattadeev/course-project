package trucking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Route {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(targetEntity = WayNode.class, cascade = CascadeType.ALL)
    private WayNode firstWayNode;

    @OneToOne(mappedBy = "route")
    private Parcel parcel;

    public Route(){}
}
