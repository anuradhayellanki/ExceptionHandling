package com.cashapona.exceptionhandling.jun20;
/**
 * @author Anuradha
 */
public class FinallyRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {1,2};
		try {
			System.out.println("Access element 5 : "+a[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown");
			e.printStackTrace();
		}finally {
			System.out.println("Finally block is started");
			System.out.println("First element value : "+a[0]);
			System.out.println("Finally block is ended");
		}
	}
}
