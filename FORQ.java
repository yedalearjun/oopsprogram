class Furniture {
    private String type;
    private String material;
    private double price;

    // Constructor
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    // Method to calculate the discount on the furniture based on material
    public double calculateDiscount() {
        // A simple discount calculation based on material, you can adjust as needed
        double discountRate = 0.05; // 5% discount for specific materials
        if (material.equalsIgnoreCase("wood") || material.equalsIgnoreCase("leather")) {
            return discountRate * price;
        } else {
            return 0.0; // No discount for other materials
        }
    }

    // Method to print furniture's information
    public void printFurnitureInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
    }

    // Getter methods
    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}

// FurnitureTest class
class FurnitureTest {
    public static void main(String[] args) {
        // Creating an object of Furniture class
        Furniture myFurniture = new Furniture("Chair", "Wood", 150.0);

        // Printing furniture's information
        myFurniture.printFurnitureInfo();
    }
}
