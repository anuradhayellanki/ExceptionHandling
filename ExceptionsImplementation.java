package com.cashapona.exceptionhandling.jun21;
import java.util.Scanner;
/**
 * @author Anuradha
 */
class Exceptions{
	/*
	 * demonistrate NullPointerException
	 */
	@SuppressWarnings("null")
	public void nullPointerException() {
		String s=null;
		System.out.println(s.charAt(0));
	}
	/*
	 * demonistrate ArithmeticExceptionRunner
	 */
	public void arithmeticException() {
		int a=10 , b=0;
		int c=a/b;
		System.out.println("Result : "+c);
		
	}
	/*
	 * demonistrate StirngIndexOutOfBoundException
	 */
	public void stirngIndexOutOfBoundsException() {
		String string="I like java programming";
		char c=string.charAt(24);
		System.out.println("charAt(24) : "+c);
	}
	/*
	 * demonistrate ArrayIndexOutOfBoundsException
	 */
	public void arrayIndexOutOfBoundsException() {
		int[] array=new int[5];
		//accessing 6th element in array of size 5
		System.out.println("array[6] : "+array[6]);
	}
	/*
	 * demonstrate FileNotFoundException
	 */
	public int numberFormatException() {
		int number=Integer.parseInt("anu");
		return number ;
	}
	/*
	 * demonstrate InputMissmatchException
	 */
	public void inputMissmatchException() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value, to get square value");
		int number=scanner.nextInt();
		System.out.println(number*number);
		scanner.close();
	}
	/*
	 * demonstrate ClassCastException 
	 */
	public void classCastException() {
		Object o=new Object();
		String string=(String)o;
		System.out.println("string : "+string);
	}
}
public class ExceptionsImplementation {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exceptions exception=new Exceptions();
		exception.nullPointerException();
		exception.arithmeticException();
		exception.stirngIndexOutOfBoundsException();
		exception.arrayIndexOutOfBoundsException();
		exception.classCastException();
	}
}
