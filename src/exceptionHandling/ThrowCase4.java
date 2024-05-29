package exceptionHandling;

public class ThrowCase4 extends RuntimeException{// by extending we are making ThrowCase4 a subclass of RE and this is way we can throw the exception
	// we are customizing an exception
	
	
	public static void main(String[] args) {
		
		throw new ThrowCase4();
	}

}
