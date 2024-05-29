package exceptionHandling;

// what is exception handling?
//Exception handling is the process of dealing with these exceptional conditions in a controlled manner. 
//This usually involves detecting exceptions,deciding how to respond to them, 
//and possibly taking corrective actions to recover from the error.

// what is exception 
//An exception is an uncontrolled and unexpected event that disturbs the normal flow of the program 

// What is the purpose of exception handling ?
// The main purpose of exception handling is to manage and respond to exceptional conditions that may occur dealing the execution 

public class Example {

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
		System.out.println("hello");
	}

}
//normal termination
