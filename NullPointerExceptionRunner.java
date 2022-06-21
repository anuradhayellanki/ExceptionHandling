package com.cashapona.exceptionhandling.jun20;
/**
 * @author Anuradha
 */
public class NullPointerExceptionRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1();
		System.out.println("main ended");

	}
	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}
	@SuppressWarnings("null")
	private static void method2() {
		try{
			String str=null;
			str.length();
			System.out.println("method2 ended");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception caught");

		}
	}
}
