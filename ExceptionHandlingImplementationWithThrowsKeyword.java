package com.cashapona.exceptionhandling.jun21;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * @author Anuradha
 */
public class ExceptionHandlingImplementationWithThrowsKeyword {
	/*
	 * handling NullPointerException by using try-catch  
	 * it is raised when a null object is referred
	 */
	@SuppressWarnings("null")
	public static void nullPointerExceptionDemo() throws NullPointerException {
			String s=null;
			System.out.println(s.charAt(0));
			throw new NullPointerException();
	}
	/*
	 * handling ArithmeticExceptionRunner by using try-catch
	 * Arithmetic abnormalities like divide by zero results in ArithmeticExceptionRunner.
	 */
	public static void arithmeticExceptionDemo() throws  RuntimeException{
		int a=10 , b=0;
		int c=a/b;
		System.out.println("Result : "+c);
	}
	/*
	 * handling StirngIndexOutOfBoundsException by using try-catch
	 * It is thrown by String class methods to indicate that an index is either negative
	 *  or greater than the size of the string
	 */
	public static void stirngIndexOutOfBoundsException() throws StringIndexOutOfBoundsException {
		String string="I like java programming";
		char c=string.charAt(24);
		System.out.println("charAt(24) : "+c);
	}
	/*
	 * handling ArrayIndexOutOfBoundsException using try-catch
	 * when an array element is accessed using an illegal index
	 */
	public static void arrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException{
		int[] array= {12,23,45};
		//accessing 6th element in array of size 5
		System.out.println("array[6] : "+array[6]);
	}
	/*
	 * handling IOException 
	 */
	@SuppressWarnings("resource")
	public static void iOException () throws IOException {
		FileOutputStream fout=new FileOutputStream("C:\\users\\User\\abc.txt");    
        String s=" Welcome to java ";    
        byte b[]=s.getBytes();//converting string into byte array 
        fout.write(b);
        System.out.println("successfully file created...");    
	}
	/*
	 * handling NumberFormatException
	 * when a method could not convert a int into a string format.
	 */
	public static void numberFormatException() throws NumberFormatException{
		int number=Integer.parseInt("anu");
		System.out.println(number);
	}
	/*
	 * handling InputMismatchException using try-catch
	 * it is thrown when the input read does not match a pattern specified
	 */
	public static void inputMismatchException() throws InputMismatchException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value, to get square value");
		int number=scanner.nextInt();
		System.out.println("Square value : "+number*number);
		scanner.close();
	}
	/*
	 * handling NoSuchElementException
	 * it is thrown when the next element accessed does not exist
	 */
	public static void noSuchElementException() throws NoSuchElementException {
		List<Integer> list=new ArrayList<Integer>();
		list.iterator().next();
	}
	/*
	 * handling ClassCastException using try-catch
	 * when you attempt to cast one object into another object that is not a member of the class hierarchy
	 */
	public static void classCastException() {
		Object o=new Object();
		String string=(String)o;
		System.out.println("string : "+string);
	}
	/*
	 * handling IllegalStateException
	 * it is thrown when a method is being called at an illegal or inappropriate time
	 */
	public static void illegalStateException() throws IllegalStateException{
	   	ArrayList<Object> names = new ArrayList<>();
		names.add("anu");
		names.add("radha");
		Iterator<Object> iterator = names.iterator();
		while (iterator.hasNext()) {
		iterator.remove();
		}
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		try{
			nullPointerExceptionDemo();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
		}
		try{
			arithmeticExceptionDemo();
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException caught");
		}
		try{
			stirngIndexOutOfBoundsException();
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught");
		}
		try{
			arrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		}
		try{
			iOException();
		}catch(IOException e) {
			System.out.println("IOException");

		}
		try{
			inputMismatchException();
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		try{
			noSuchElementException();
		}catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException ");
		}
		try{
			classCastException();
		}catch(ClassCastException e) {
			System.out.println("ClassCastException ");
		}
		try{
			illegalStateException();
		}catch(IllegalStateException e) {
			System.out.println("IllegalStateException");
		}
		try{
			numberFormatException();
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
	}
}
