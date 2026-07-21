/*
 * Topic: Inheritance
 * Core idea: `extends` lets a class reuse another's fields and methods. Java
 * deliberately limits a class to extending exactly one parent (no multiple
 * inheritance of state) - multiple behaviours instead come from interfaces
 * (see the Interfaces file).
 *
 * Real World Example: Employee Management System
 */

public class Inheritance {

    static class Employee {
        int employeeId;
        String name;

        Employee(int employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }

        void display() {
            System.out.println(employeeId + " " + name);
        }
    }

    // Single inheritance
    static class Developer extends Employee {
        String technology;

        Developer(int employeeId, String name, String technology) {
            super(employeeId, name);
            this.technology = technology;
        }

        void showTechnology() {
            System.out.println(technology);
        }
    }

    // Multilevel inheritance - a chain of `extends`
    static class Person {
        void speak() {
            System.out.println("Speaking");
        }
    }

    static class Staff extends Person {
        void work() {
            System.out.println("Working");
        }
    }

    static class TeamLead extends Staff {
        void manage() {
            System.out.println("Managing Team");
        }
    }

    // A class cannot extend two classes at once:
    //   class Manager extends Employee, Person { }   // will not compile

    public static void main(String[] args) {

        Developer developer = new Developer(1001, "John", "Java");
        developer.display();
        developer.showTechnology();

        TeamLead teamLead = new TeamLead();
        teamLead.speak();
        teamLead.work();
        teamLead.manage();
    }
}
