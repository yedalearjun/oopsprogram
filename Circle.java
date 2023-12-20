class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }
}

// CircleTest class
 class CircleTest {
    public static void main(String[] args) {
        // Creating an object of Circle class
        Circle myCircle = new Circle(5.0);

        // Calculating and printing area and circumference
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Circumference: " + myCircle.calculateCircumference());
    }
}
