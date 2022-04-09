// 11.Program to Reverse the String using Recursion.
import java.util.*;
class reverseUsingRecursion
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string:");
      String str = new String(sc.nextLine());
      int n = str.length();
      reverseString(str,n);
    }

    static void reverseString(String str,int n)
    {
      StringBuilder rev = new StringBuilder(str);
      rev.reverse();
      System.out.println("The reversed string is : "+ rev.toString());
    }
}