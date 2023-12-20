class Computer {
    private String processor;
    private int ram; // in gigabytes
    private int storage; // in gigabytes

    // Constructor
    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Method to calculate the price of the computer
    public double calculatePrice() {
        // A simple calculation, you can adjust based on your pricing model
        double basePrice = 500.0; // Base price for all computers
        double ramPrice = 10.0 * ram; // Additional price based on RAM capacity
        double storagePrice = 5.0 * storage; // Additional price based on storage capacity
        return basePrice + ramPrice + storagePrice;
    }

    // Method to print computer's information
    public void printComputerInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    // Getter methods
    public String getProcessor() {
        return processor;
    }

    public int getRAM() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }
}

// ComputerTest class
class ComputerTest {
    public static void main(String[] args) {
        // Creating an object of Computer class
        Computer myComputer = new Computer("Intel i7", 16, 512);

        // Printing computer's information
        myComputer.printComputerInfo();
    }
}
