package com.oops.com;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class ValidationExample {
public static void checkAge(int age) throws InvalidAgeException {//throws-will pass functionality like passing
	
	if(age<18) {
		throw new InvalidAgeException("Age must be within 18");
	}//throw- will invoke error
	System.out.println("Age is valid.Registration Successful");
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter age :");
		int age=sc.nextInt();
		checkAge(age);
	} catch(InvalidAgeException e) {
		System.out.println("Validation Error"+ e.getMessage());
	}
	sc.close();//to prevent memory leak or memory loss
}
}
