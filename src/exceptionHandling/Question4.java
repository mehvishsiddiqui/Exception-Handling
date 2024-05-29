package exceptionHandling;

public class Question4 {
	public static void main(String[] args) {
		
	
	String [] s = new String[2];
	
	int i = 0;
	
	for (String s1:s) {
		
		s[i].concat("element" + i);
		i++ ;
	}
	
	for(i=0 ; i<s.length ; i++)
	{
		System.out.println(s[i]);
	}

  }
}
