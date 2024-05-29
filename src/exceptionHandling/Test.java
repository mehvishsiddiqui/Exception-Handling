package exceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	
	TooYoungException(String msg)
	{
		super(msg);
	}
}


class TooOldException extends RuntimeException{
	
	TooOldException(String msg)
	{
		super(msg);
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = scanner.nextInt();
	
        
		if (age>60)
		{
			throw new TooYoungException("Please wait sometime you will get best match soon!!!");
		}
		
		else if (age<18)
		{
			throw new TooOldException("Your age is already crossed for marriage , noi chance of getting married");
		}
		
		else {
			System.out.println("Thanks for Registration you will get your information by emails on progess");
		}
	}

}
