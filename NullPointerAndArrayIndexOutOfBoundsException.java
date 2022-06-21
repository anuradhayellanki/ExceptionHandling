package com.cashapona.exceptionhandling.jun20;
/**
 * @author Anuradha
 *
 */
public class NullPointerAndArrayIndexOutOfBoundsException  {
	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args)  {
		try {
			  int array[] = {1,0};
		      System.out.println("a[3] : "+array[3]);
		      String str=null;
		      str.length();
		      System.out.println(str);
		    } 
			catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
		      System.out.println("Both Exceptions are caught ");
		      e.printStackTrace();
		    }
		}
}


