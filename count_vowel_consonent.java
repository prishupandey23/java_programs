// Program to Count the Number of Vowels & Consonants in a Sentence. 
import java.util.*;
class count_vowel_consonent
{
	public static void main(String args[])
	{
		int vcount=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = new String(sc.nextLine());
		String vow = new String("aeiou");
		for(int i=0;i<vow.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(vow.charAt(i)==str.charAt(j))
					vcount++;
			}
		}
		for(int i = 0; i < str.length(); i++) {  
           if(str.charAt(i) == ' ')  
               count++;  
        }  
		System.out.println("Vowel count is "+vcount);
	    System.out.println("Consonant count is "+(str.length()-1-vcount-count));
	    System.out.println(count);

	} 
}