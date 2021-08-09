public class Stringtocharandreverse {
    public static void main(String[] args) {
		String str1 = "A brown fox ran away fast";
		String str2="";
		//str1 = str1.replace(" ","");	
		System.out.println("characters are"); 
		char A[] = str1.toCharArray();
			for(int i=0;i<A.length;i++)
			{
				System.out.println(A[i]);
				str2+=A[i];
			}
		System.out.println("string is "+str2);
	}
}
    