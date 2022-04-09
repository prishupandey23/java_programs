// 12.Program to Copy One String to Another using Recursion.
import java.util.*;
class copyStringToAnotherString
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string:");
      String str = new String(sc.nextLine());
      int n = str.length();
      copyString(str,n);
    }

    static void copyString(String str,int n)
    {
      StringBuilder rev = new StringBuilder(str);
      System.out.println("The copied string is : "+ rev);
    }
}