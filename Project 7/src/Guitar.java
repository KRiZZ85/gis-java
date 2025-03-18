public class Guitar {

    // Attributes (Variables)
    private String brand;
    private String model;
    private String type; // Acoustic, Electric, Bass
    private double price;
    private String serialNumber;

    // Constructor
    public Guitar(String brand, String model, String type, double price, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    // toString() method for displaying guitar details
    @Override
    public String toString() {
        return "Guitar [Brand=" + brand + ", Model=" + model + ", Type=" + type + ", Price=$" + price + ", SerialNumber=" + serialNumber + "]";
    }
}
