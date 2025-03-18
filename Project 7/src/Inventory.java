// Inventory.java
import java.util.ArrayList;

public class Inventory {
    // List to store Guitar objects
    private ArrayList<Guitar> guitars;

    // Constructor to initialize inventory
    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    // Add Guitar
    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
        System.out.println("Guitar added successfully!");
    }

    // Remove Guitar
    public void removeGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                guitars.remove(guitar);
                System.out.println("Guitar removed successfully!");
                return;
            }
        }
        System.out.println("Guitar not found.");
    }

    // Search Guitar
    public void searchGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                System.out.println("Guitar found: " + guitar);
                return;
            }
        }
        System.out.println("Guitar not found.");
    }

    // Display all Guitars
    public void displayInventory() {
        if (guitars.isEmpty()) {
            System.out.println("No guitars in inventory.");
        } else {
            System.out.println("\n--- Guitar Inventory ---");
            for (Guitar guitar : guitars) {
                System.out.println(guitar);
            }
        }
    }
}
