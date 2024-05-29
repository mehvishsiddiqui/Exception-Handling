package exceptionHandling;

public class Case1 {
	
	// if there is no exception 
	// since there is no exception try block will be executed successfully and 
	//than finally block will be executed as there is no need 
	// for catch blocks handling code 
	
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("try");
		}
		
		catch(Exception e)
		{
			System.out.println("catch");
		}
		
		finally
		{
			System.out.println("finally");
		}
	}

}
