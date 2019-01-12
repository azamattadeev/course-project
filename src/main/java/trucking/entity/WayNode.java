package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class WayNode implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Way way;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private WayNode nextNode;

    public WayNode(){}

    public WayNode(Way way, WayNode nextNode) {
        this.way = way;
        this.nextNode = nextNode;
    }
}
