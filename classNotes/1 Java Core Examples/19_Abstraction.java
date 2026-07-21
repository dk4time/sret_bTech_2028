/*
 * Topic: Abstraction (via abstract class)
 * Core idea: an abstract class can mix concrete, shared behaviour with
 * abstract methods that every subclass must implement. Use it when related
 * types share both state AND some implementation. (The other abstraction
 * mechanism - interfaces, pure contracts - gets its own file next.)
 *
 * Real World Example: Vehicle Management System
 */

public class Abstraction {

    abstract static class Vehicle {

        protected String registrationNumber;

        Vehicle(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        // Concrete method - shared by every subclass as-is
        void showRegistration() {
            System.out.println("Registered as: " + registrationNumber);
        }

        // Abstract method - every subclass MUST provide its own version
        abstract void start();
    }

    static class Car extends Vehicle {
        Car(String registrationNumber) {
            super(registrationNumber);
        }

        @Override
        void start() {
            System.out.println("Car Started");
        }
    }

    static class Bike extends Vehicle {
        Bike(String registrationNumber) {
            super(registrationNumber);
        }

        @Override
        void start() {
            System.out.println("Bike Started");
        }
    }

    public static void main(String[] args) {

        Car car = new Car("TN-01-AB-1234");
        car.showRegistration();
        car.start();

        Bike bike = new Bike("TN-02-CD-5678");
        bike.showRegistration();
        bike.start();

        // Vehicle v = new Vehicle("X");   // would not compile - abstract classes can't be instantiated
    }
}
