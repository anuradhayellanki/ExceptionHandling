package com.cashapona.exceptionhandling.jun21;
/**
 * @author Anuradha
 */
public class ThrowsExceptionHandling {
	public static void checkAge(int age) throws  ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("Access denied - You must be atleast 18 years old");
		}else {
			System.out.println("Access granted - You are old enough");
		}
	}
	public static void checkNumber(int number)throws ArithmeticException {
		if(number<1) {
			throw new ArithmeticException("Number is negatve , can't calculate square value");
		}else {
			System.out.println("Square of " + number + " is " + (number*number));  
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkAge(20);
		try{
			checkAge(13);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		checkNumber(4);
		try{
			checkNumber(-1);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}


