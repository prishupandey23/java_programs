// 13.Program to find the First Capital Letter in a String using Recursion.
import java.util.*;
class firstCapitalLetterUsingRecursion
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string:");
      String str = new String(sc.nextLine());
      int n = str.length();
      System.out.print(copyString(str,n));
    }

    static int copyString(String str,int n)
    {
      if(n<0)
      	return 0;
      copyString(str,n-1);
      if(Character.isUpperCase(str.charAt(n)))
      	return n;
    }
}