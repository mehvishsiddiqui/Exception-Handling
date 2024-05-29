package exceptionHandling;

public class Case3 {

	//if an exception rises and is not handled
		//first try block statement is executed successfully but the next one is an arithmetic exception 
		//catch block will not be able to handle the exception as it is for NullPointerException
		//finally block will also be executed as it contains the cleanup code 
	    // and then after that the exception ill be printed to the console
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("catch");
		}
		
		finally
		{
			System.out.println("finally");
		}
	}
}
