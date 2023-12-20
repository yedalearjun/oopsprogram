class TV {
    private String brand;
    private int size; // in inches
    private double price;

    // Constructor
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Method to calculate the discount on the TV based on size
    public double calculateDiscount() {
        // A simple discount calculation based on size, you can adjust as needed
        double discountRate = 0.02; // 2% discount for each inch
        return size * discountRate * price;
    }

    // Method to print TV's information
    public void printTVInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}

// TVTest class
class TVTest {
    public static void main(String[] args) {
        // Creating an object of TV class
        TV myTV = new TV("Samsung", 55, 1000.0);

        // Printing TV's information
        myTV.printTVInfo();
    }
}