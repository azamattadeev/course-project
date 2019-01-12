package trucking.entity;

import lombok.Data;
import trucking.entity.enums.TransportationType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Duration;

@Entity
@Data
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
}