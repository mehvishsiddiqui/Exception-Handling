package exceptionHandling;

public class DefultExceptionHandling {
	
	public static void main(String[] args) 
	{
		
		doStuff();
	}
	
	public static void doStuff() 
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}

}

//abnormal termination
