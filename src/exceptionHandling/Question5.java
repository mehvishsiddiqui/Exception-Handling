package exceptionHandling;

public class Question5 {

	public static void main(String[] args) {
		
		String[] name = {"Thomas" , "Bunny" , "Chinny"}; //an array of name is created which hold three names
		
		String[] pwds = new String[3]; // an array of password is declared but not initialized with index 3
		
		int i=0; // a variable i is declared and its value is 0
		try
		{
			for(String n:name) 
			{
				pwds [i] = n.substring(2,6);
				i++;
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Invalid Name");
		}
		
		for(String p:pwds) 
		{
			System.out.println(p);
		}
	}
}
