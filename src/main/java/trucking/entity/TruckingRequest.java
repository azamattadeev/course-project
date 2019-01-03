package trucking.entity;

import trucking.entity.enums.TruckingRequestStatus;

import javax.persistence.*;

@Entity
public class TruckingRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "shipping_addres")
    private String shippingAddress;

    private double length;
    private double width;
    private double height;

    @Enumerated(value = EnumType.STRING)
    private TruckingRequestStatus status;

    private String locationCountry;
    private String locationCity;

    private double weight;

    @Column(name = "contact_number", length = 20)
    private String contactNumber;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "customer_name", length = 40)
    private String customerName;

    private String description;

    public TruckingRequest(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
