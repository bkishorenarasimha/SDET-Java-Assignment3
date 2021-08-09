public class NumberFormatExceptionExample {  
  
	public static void main(String[] args) 
	{
	String Str1 = "ABC";	
		try {  
				 int a = Integer.parseInt(Str1);  
			}
		catch(NumberFormatException ex)
		{  
			System.err.println("Invalid string in argument");  
		}
	}  
}  