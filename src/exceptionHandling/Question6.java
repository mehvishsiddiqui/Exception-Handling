package exceptionHandling;

import java.util.ArrayList;

public class Question6 {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList() ;
		try
		{
			while(true) {
				l.add("My String");
			}
		}
		
		catch (RuntimeException e)
		{
			System.out.println("caught a RuntimeException ");
		}
		
		catch (Exception e)
		{
			System.out.println("Exception e");
		}
		
		System.out.println("Ready to use");
	}

}
