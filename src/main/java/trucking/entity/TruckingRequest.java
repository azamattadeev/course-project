package trucking.entity;

import trucking.entity.enums.TruckingRequestStatus;

import javax.persistence.*;

@Entity
public class TruckingRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "location_address")
    private String locationAddress;

    private double length;
    private double width;
    private double height;

    @Enumerated(value = EnumType.STRING)
    private TruckingRequestStatus status;

    private String locationCountry;
    private String locationCity;

    private String shippingCountry;
    private String shippingCity;

    private double weight;

    @Column(name = "contact_number", length = 20)
    private String contactNumber;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "customer_name", length = 40)
    private String customerName;

    private String usersDescription;

    private String workersDescription;

    @ManyToOne
    private Warehouse orderProcessingOffice;

    public TruckingRequest(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUsersDescription() {
        return usersDescription;
    }

    public void setUsersDescription(String usersDescription) {
        this.usersDescription = usersDescription;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public TruckingRequestStatus getStatus() {
        return status;
    }

    public void setStatus(TruckingRequestStatus status) {
        this.status = status;
    }

    public String getWorkersDescription() {
        return workersDescription;
    }

    public void setWorkersDescription(String workersDescription) {
        this.workersDescription = workersDescription;
    }

    public Warehouse getOrderProcessingOffice() {
        return orderProcessingOffice;
    }

    public void setOrderProcessingOffice(Warehouse orderProcessingOffice) {
        this.orderProcessingOffice = orderProcessingOffice;
    }
}
