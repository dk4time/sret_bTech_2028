/*
 * Topic: Interfaces
 * Core idea: an interface is a pure contract - no state, method signatures
 * only (plus optional default methods since Java 8). A class can implement
 * as many interfaces as it needs - Java's real answer to not allowing
 * multiple inheritance of classes.
 *
 * Real World Example: Vehicle Management System (continued from Abstraction)
 */

public class Interfaces {

    interface ElectricPowered {
        void chargeBattery();

        // Default method - a concrete method living directly on the interface,
        // usable without every implementer rewriting it
        default void showChargingTip() {
            System.out.println("Tip: charge overnight for best battery life");
        }
    }

    interface Insurable {
        double calculatePremium();
    }

    static class ElectricCar implements ElectricPowered, Insurable {

        private final double vehicleValue;

        ElectricCar(double vehicleValue) {
            this.vehicleValue = vehicleValue;
        }

        @Override
        public void chargeBattery() {
            System.out.println("Charging battery...");
        }

        @Override
        public double calculatePremium() {
            return vehicleValue * 0.03;
        }
    }

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar(2000000);

        car.chargeBattery();
        car.showChargingTip();
        System.out.println("Annual premium: " + car.calculatePremium());

        // Programming to an interface type - common, idiomatic Java style
        ElectricPowered chargeable = car;
        chargeable.chargeBattery();
    }
}
