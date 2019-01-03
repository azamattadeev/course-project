package trucking.entity;

import trucking.entity.enums.ParcelStatus;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parcel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "track_number", unique = true)
    private String trackNumber;

    @OneToOne(targetEntity = Route.class)
    private Route route;

    @ManyToOne(targetEntity = Warehouse.class)
    private Warehouse currentWarehouse;

    @ManyToOne(targetEntity = Flight.class)
    private Flight currentFlight;

    @ManyToMany(mappedBy = "parcels", fetch = FetchType.LAZY)
    private List<Client> clients;

    @Column(name = "is_on_the_way")
    private boolean isOnTheWay;

    private double length;
    private double width;
    private double height;

    private double weight;

    @Enumerated(value = EnumType.STRING)
    private ParcelStatus status;

    @OneToOne
    private Order order;

    private String description;

    public Parcel(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Warehouse getCurrentWarehouse() {
        return currentWarehouse;
    }

    public void setCurrentWarehouse(Warehouse currentWarehouse) {
        this.currentWarehouse = currentWarehouse;
    }

    public Flight getCurrentFlight() {
        return currentFlight;
    }

    public void setCurrentFlight(Flight currentFlight) {
        this.currentFlight = currentFlight;
    }

    public boolean isOnTheWay() {
        return isOnTheWay;
    }

    public void setOnTheWay(boolean onTheWay) {
        isOnTheWay = onTheWay;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ParcelStatus getStatus() {
        return status;
    }

    public void setStatus(ParcelStatus status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
