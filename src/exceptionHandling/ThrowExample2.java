package exceptionHandling;

public class ThrowExample2 {

	public static void main(String[] args) {
		
		throw new ArithmeticException("/ by zero");
		
		  // new ---> is the keyword to create a new object
		
		  // ArithmeticException() ---> it is the exception object that is being created explicitly
		
          // throw ---> it is used to hand over our exception object to jvm manually	
	}     
}
