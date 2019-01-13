package trucking.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class RouteNode implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Flight flight;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private RouteNode nextNode;

    public RouteNode(){}

    public RouteNode(Flight flight, RouteNode nextNode) {
        this.flight = flight;
        this.nextNode = nextNode;
    }
}
