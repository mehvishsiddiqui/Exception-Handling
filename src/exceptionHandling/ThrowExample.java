package exceptionHandling;

// here what is happening is we are printing 10/0 and it will raise an exception , main method is responsible for creating 
//exception object and handing over to the jvm  it will come searching for the handling code since there is no  handling code 
//it will print the exception to the console using default exception handler . Everything is happening here internally.  

public class ThrowExample {
	
	public static void main(String[] args) {
		
		System.out.println(10/0);
	}

}
