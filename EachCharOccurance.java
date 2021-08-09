public class CharOccurance
{
	  public static void main(String args[]) 
	  {
	      
	  String input = "DevLabs Alliance Training";
	  input = input.replace(" ","");
	  input = input.toLowerCase();  
	  int count=0;
	  for(int i=0; i<input.length(); i++)
		  {
		  count=0;
			  for(int j=0; j<input.length(); j++)
				{ 
				  if(input.charAt(i) == input.charAt(j))
					count++;
				}	  
			System.out.println("The Character '"+input.charAt(i)+"' appears "+count+" times.");
	       }
	}
}