//8.Program to Check if a String is a Palindrome without using the Built-in Function. 
import java.util.*;
class palindrom
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = new String(sc.nextLine());
		int low=0;
		int high=str.length()-1;
		while(low<high)
		{
			if(str.charAt(low)!=str.charAt(high))
				System.out.println("false");
			low++;
		    high--;
		}
		System.out.println("true");
	}
	}