package trucking.entity;

import javax.persistence.*;

@Entity
public class Route {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(targetEntity = WayNode.class, cascade = CascadeType.ALL)
    private WayNode firstWayNode;

    @OneToOne(mappedBy = "route")
    private Parcel parcel;

    public Route(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public WayNode getFirstWayNode() {
        return firstWayNode;
    }

    public void setFirstWayNode(WayNode firstWayNode) {
        this.firstWayNode = firstWayNode;
    }
}
