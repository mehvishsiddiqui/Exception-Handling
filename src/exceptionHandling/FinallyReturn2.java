package exceptionHandling;

public class FinallyReturn2 {

	// finally block will get more priority than return statement
	// return statement will be dominated by the finally block
	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	
	public static int m1() 
	{
		try
		{
			return 111;
		}
		catch (Exception e)
		{
			return 222;
		}
		finally
		{
			return 333;
		}
	}
}
