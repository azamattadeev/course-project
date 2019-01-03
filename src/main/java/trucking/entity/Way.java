package trucking.entity;

import trucking.entity.enums.TransportationType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Duration;
import java.util.Objects;

@Entity
public class Way implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loading_duration")
    private Duration loadingDuration;
    @Column(name = "unloading_duration")
    private Duration unloadingDuration;
    @Column(name = "transportation_duration")
    private Duration transportationDuration;

    @Enumerated(value = EnumType.ORDINAL)
    @Column(name = "transportation_type")
    private TransportationType transportationType;

    @ManyToOne
    private Warehouse fromWarehouse;

    @ManyToOne
    private Warehouse toWarehouse;

    @Column(name = "specific_price_in_dollars")
    private double specificPriceInDollars;

    public Way(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Duration getLoadingDuration() {
        return loadingDuration;
    }

    public void setLoadingDuration(Duration loadingDuration) {
        this.loadingDuration = loadingDuration;
    }

    public Duration getUnloadingDuration() {
        return unloadingDuration;
    }

    public void setUnloadingDuration(Duration unloadingDuration) {
        this.unloadingDuration = unloadingDuration;
    }

    public Duration getTransportationDuration() {
        return transportationDuration;
    }

    public void setTransportationDuration(Duration transportationDuration) {
        this.transportationDuration = transportationDuration;
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(TransportationType transportationType) {
        this.transportationType = transportationType;
    }

    public Warehouse getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(Warehouse fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public Warehouse getToWarehouse() {
        return toWarehouse;
    }

    public void setToWarehouse(Warehouse toWarehouse) {
        this.toWarehouse = toWarehouse;
    }

    public double getSpecificPriceInDollars() {
        return specificPriceInDollars;
    }

    public void setSpecificPriceInDollars(double specificPriceInDollars) {
        this.specificPriceInDollars = specificPriceInDollars;
    }

    @Override
    public String toString() {
        return "Way{" +
                "transportationType=" + transportationType +
                ", fromWarehouse=" + fromWarehouse +
                ", toWarehouse=" + toWarehouse +
                '}';
    }
}