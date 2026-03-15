package com.oops.com;
public class Abstract {

	   public static void main(String [] args) {
	      
	      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	      Salary s=new Salary("Kenny","Hawkins",2,3000.0);
	      
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	}
	abstract class Employee {
	   private String name;
	   private String address;
	   private int number;

	   public Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   
	   public double computePay() {
	     System.out.println("Inside Employee computePay");
	     return 0.0;
	   }
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }
	 
	   public String getAddress() {
	      return address;
	   }
	   
	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }
	 
	   public int getNumber() {
	      return number;
	   }
	}
	class Salary extends Employee{
		private double salary;
		public Salary(String address,String name,int number,double salary) {
			super(name,address,number);
			setSalary(salary);
		}
		public void mailCheck() {
			System.out.println("Mailing Check to"+ getName() + "withsalary" + salary);		
		}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
	}
		public double computepay() {
			System.out.println("Computing salary pay for"+getName());
			return salary/52;
		}
	}