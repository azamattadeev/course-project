package trucking.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Data
public class ParcelLocationNode {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nodeNumber;

    private WayNode wayNode;

    private ZonedDateTime departureTime;

    private ZonedDateTime arrivalTime;

    public ParcelLocationNode(){}

}
