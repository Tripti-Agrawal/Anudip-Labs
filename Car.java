public class Car {
    private String make;
    private String model;
    private short year;
    private int price;
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Innova", (short) 2020, 1800000);
        Car car2 = new Car("Hyundai", "Creta", (short) 2022, 1500000);
        car1.displayInfo();
        car2.displayInfo();
    }
}
