package exceptionHandling;


public class ThrowCase1 {

	//static ArithmeticException e = new ArithmeticException();// the e compulsory should point to some object
	static ArithmeticException e = new ArithmeticException();  ;// if e is not pointing to some object than it will give us nullPointerError because its value is null
	// here we are creating a variable "e" of type ArithmeticException which is static and it is not initialized
	
	public static void main(String[] args) 
	{
		
		throw e ;
		// here we are throwing an exception since e is null it will result in NullPointerException
	}
}
