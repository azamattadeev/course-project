package trucking.entity;

import javax.persistence.*;

@Entity
public class WayNode {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Way way;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private WayNode nextNode;

    public WayNode(){}

    public WayNode(Way way, WayNode nextNode) {
        this.way = way;
        this.nextNode = nextNode;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
    }

    public WayNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(WayNode nextNode) {
        this.nextNode = nextNode;
    }
}
