package com.cashapona.exceptionhandling.jun21;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * @author Anuradha
 */
class ExceptionsHandling{
	/*
	 * handling NullPointerException by using try-catch  
	 * it is raised when a null object is referred
	 */
	@SuppressWarnings("null")
	public void nullPointerExceptionDemo() {
		try{
			String s=null;
			System.out.println(s.charAt(0));
		}catch(NullPointerException ne) {
			System.out.println("NullPointerException : Can't get char(0) because given string is null ");
		}
	}
	/*
	 * handling ArithmeticExceptionRunner by using try-catch
	 * Arithmetic abnormalities like divide by zero results in ArithmeticExceptionRunner.
	 */
	public void arithmeticExceptionDemo() {
		int a=10 , b=0;
		try {
			int c=a/b;
			System.out.println("Result : "+c);
		}catch(RuntimeException ae) {
			System.out.println("ArithmeticExceptionRunner : Can't divide any number by zero");
		}
	}
	/*
	 * handling StirngIndexOutOfBoundException by using try-catch
	 * It is thrown by String class methods to indicate that an index is either negative
	 *  or greater than the size of the string
	 */
	public void stirngIndexOutOfBoundException() {
		try {
			String string="I like java programming";
			char c=string.charAt(24);
			System.out.println("charAt(24) : "+c);
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : We can't get char(24) from the given string");
		}
	}
	/*
	 * handling ArrayIndexOutOfBoundsException using try-catch
	 * when an array element is accessed using an illegal index
	 */
	public void arrayIndexOutOfBoundsException() {
		try {
			int[] array= {12,23,45};
			//accessing 6th element in array of size 5
			System.out.println("array[6] : "+array[6]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException : We can't get array[6] from the given array");
		}
	}
	/*
	 * demonstrate FileNotFoundException
	 * when the file does not exist or does not open
	 */
	public void fileNotFoundException() {
		FileOutputStream fout = null;
		try{    
            fout=new FileOutputStream("C:\\users\\User\\abc.txt");    
            String s=" Welcome to java ";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
			fout.close();    
            System.out.println("successfully file created...");    
           }
		catch(Exception e)
		{
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}
	}
	/*
	 * handling NumberFormatException
	 * when a method could not convert a int into a string format.
	 */
	public void numberFormatException() {
		try{
			int number=Integer.parseInt("anu");
			System.out.println(number);
		}catch(NumberFormatException ne) {
			System.out.println("NumberFormatException");

		}
	}
	/*
	 * handling InputMissmatchException using try-catch
	 * it is thrown when the input read does not match a pattern specified
	 */
	public void inputMismatchException() {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter value, to get square value");
			int number=scanner.nextInt();
			System.out.println(number*number);
			scanner.close();
		}catch(InputMismatchException ie) {
			System.out.println(ie+" : You are not entered integer value");
		}
	}
	/*
	 * handling NoSuchElementException
	 * it is thrown when the next element accessed does not exist
	 */
	public void noSuchElementException() {
		try{
			List<Integer> list=new ArrayList<Integer>();
			list.iterator().next();
		}catch(Exception e) {
			System.out.println(e+" : No elements in a List");
		}
		
	}
	/*
	 * handling ClassCastException using try-catch
	 * when you attempt to cast one object into another object that is not a member of the class hierarchy
	 */
	public void classCastException() {
		try {
			Object o=new Object();
			String string=(String)o;
			System.out.println("string : "+string);
		}catch(ClassCastException e) {
			System.out.println("ClassCastException, can't cast string to object ");
		}
	}
	/*
	 * handling IllegalStateException
	 * it is thrown when a method is being called at an illegal or inappropriate time
	 */
	public void illegalStateException() {
	    try {
	    	ArrayList<Object> names = new ArrayList<>();
		    names.add("anu");
		    names.add("radha");
		    Iterator<Object> iterator = names.iterator();
		    while (iterator.hasNext()) {
		      iterator.remove();
		    }
	    }catch(IllegalStateException e) {
	    	System.out.println("Calling remove() inside while loop will throw an IllegalStateException");
	    }
	}
}
public class ExceptionHandlingImplementationWithTryCatch {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionsHandling exception=new ExceptionsHandling();
		exception.nullPointerExceptionDemo();
		exception.arithmeticExceptionDemo();
		exception.stirngIndexOutOfBoundException();
		exception.arrayIndexOutOfBoundsException();
		exception.fileNotFoundException();
		exception.inputMismatchException();
		exception.noSuchElementException();
		exception.classCastException() ;
		exception.illegalStateException();
	}
}

