package com.oops.com;
public class ExceptionDemo{
	double balance=7000;
	//int number;
	//String name[10];
	//22 bytes
	void withdraw(double amount,int pin) {
		try {
			if(pin!=1234) {
				throw new Exception("Invalid Pin");//throw is a keyword use to invoke error 
			}
			if(amount>balance) {
				throw new Exception("Insufficient Balance");
			}
		System.out.println("transaction succesfull");
		}
		catch(Exception e) {//void func(int a)// void amt(ExceptionDemo d)
			System.out.println("");
		}
		finally {
			//execute irrespective of error
		}
	}
}