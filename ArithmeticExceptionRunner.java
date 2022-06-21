package com.cashapona.exceptionhandling.jun20;
/**
 * @author Anuradha
 */
class ArithmeticException{
	private int a;
	private  int b;
	static int divisible;
	
	public int divideNumber(int x, int y) {
		try{
			divisible=a/b;
		}catch(Exception e) {
			System.out.println("ArithmeticException : given number can't divisible  by zero");
		}
		return divisible;
	}
}
public class ArithmeticExceptionRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArithmeticException arithmeticException=new ArithmeticException();
		arithmeticException.divideNumber(12,0);
	}
}
