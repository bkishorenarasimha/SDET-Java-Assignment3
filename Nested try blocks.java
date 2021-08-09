public class NestedTryBlock 
{
public static void main(String[] args) 
	{ 
	 String str = "Scientech Easy"; 
	 int x[ ] = {0, 1, 2, 3, 4}; 
	try 
		{ 
		  str = null; 
		  int slen = str.length(); 
		  System.out.println("String length: " +slen); 

			try
				{ 
				  int y = 6; 
				  System.out.println(x[y]); 
				} 
			catch(ArrayIndexOutOfBoundsException e) 
			{
			  System.out.println("Exception is thrown"); 
			  System.out.println(e.toString()); 
			 } 
		} 
	catch(NullPointerException n) 
	{ 
	  System.out.println("Exception is thrown "); 
	  System.out.println(n.toString()); 
	  } 
	 } 
}