class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }
    // Method Overloading
    public void startEngine(String carName){
       System.out.println("Engine started of " + carName);

    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

//Inheritance
class Car extends Vehicle{

    private String color;

    public Car(String manufacturer, int year, String color) {
        super(manufacturer, year);
        this.color = color;
    }
    //Method Overridding
 public void startEngine() {
     super.startEngine();;
        System.out.println("Car Engine started.");
    }
    public void drift() {
        System.out.println("The car is drifting!");
    }

} 


public class inherit {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("tata", 2002);
        Car car = new Car("tata", 2020, "red");
        car.startEngine();
        car.startEngine("tata");

}
 }
