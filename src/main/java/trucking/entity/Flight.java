package trucking.entity;

import lombok.Data;
import trucking.entity.enums.FlightStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Data
public class Flight implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Way way;

    @Column(name = "is_full")
    private boolean full;

    @Column(name = "specific_price_in_dollars")
    private double specificPriceInDollars;

    private ZonedDateTime departureTime;

    private FlightStatus status;

    public Flight(){
        full = false;
    }
}