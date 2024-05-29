package exceptionHandling;

public class Case2 {
	
	//if an exception rises and is handled
	//first try block statement is executed successfully but the next one is an arithmetic exception 
	//catch block will handle the arithmetic exception and will execute
	//finally block will also be executed as it contains the cleanup code 

     public static void main(String[] args) {
		
		try 
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		
		finally
		{
			System.out.println("finally");
		}
	}

}
