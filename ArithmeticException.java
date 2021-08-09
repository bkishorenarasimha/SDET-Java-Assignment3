public class NumberFormatExceptionExample {  
      
    public static void main(String[] args) 
	{
	int a = 10;
        try {  
                 int b = a/0;  
			}
		catch(ArithmeticException ex)
		{  
			System.err.println("ArithmeticException in try block");  
		}
    }
}