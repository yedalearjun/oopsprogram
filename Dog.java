class  Dog {
private String breed;
private int age;
private double weight;

// Constructor
public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        }

// Method to calculate dog's age in human years
public int calculateAgeInHumanYears() {
        // A simple conversion, you can adjust as needed
        return age * 7;
        }

// Method to print dog's information
public void printDogInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (in human years: " + calculateAgeInHumanYears() + " years)");
        System.out.println("Weight: " + weight + " kg");
        }

// Getter methods
public String getBreed() {
        return breed;
        }

public int getAge() {
        return age;
        }

public double getWeight() {
        return weight;
        }
        }

// DogTest class
 class DogTest {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog myDog = new Dog("Labrador", 3, 25.5);

        // Printing dog's information
        myDog.printDogInfo();
    }
}