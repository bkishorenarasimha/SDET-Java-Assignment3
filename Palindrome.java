import java.util.*;   
public class Palindrome
{  
public static void main(String args[])  
   {  
	  String str1 = "trurt", rev = ""; 
	  int len = str1.length();   
	  
	  for ( int i = len - 1; i >= 0; i-- )
			{
				rev = rev + str1.charAt(i);
			}		
	  if (str1.equals(rev))  
	   {  
		System.out.println("str1 is a palindrome.");  
	   }
	  else  
		 System.out.println("str1 isn't a palindrome.");   
   } 
}