package trucking.entity;

import trucking.entity.enums.FlightStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public double getSpecificPriceInDollars() {
        return specificPriceInDollars;
    }

    public void setSpecificPriceInDollars(double specificPriceInDollars) {
        this.specificPriceInDollars = specificPriceInDollars;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "way=" + way +
                ", departureTime=" + departureTime +
                ", status=" + status +
                '}';
    }
}