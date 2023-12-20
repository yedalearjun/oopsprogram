class Shirt {
    private String size;
    private String color;
    private double price;

    // Constructor
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // Method to calculate the discount on the shirt based on size
    public double calculateDiscount() {
        // A simple discount calculation based on size, you can adjust as needed
        double discountRate = 0.1; // 10% discount for specific sizes
        if (size.equalsIgnoreCase("XL") || size.equalsIgnoreCase("XXL")) {
            return discountRate * price;
        } else {
            return 0.0; // No discount for other sizes
        }
    }

    // Method to print shirt's information
    public void printShirtInfo() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
    }

    // Getter methods
    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

// ShirtTest class
class ShirtTest {
    public static void main(String[] args) {
        // Creating an object of Shirt class
        Shirt myShirt = new Shirt("XL", "Blue", 25.0);

        // Printing shirt's information
        myShirt.printShirtInfo();
    }
}