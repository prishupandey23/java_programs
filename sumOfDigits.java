// 10.Program to Read a String and find the Sum of all Digits in the String. 
import java.util.*;
class sumOfDigits
{
	public static void main(String args[])
	{
	  int sum=0;
      Scanner sc = new Scanner(System.in);
      StringBuffer str = new StringBuffer(sc.nextLine());
      for(int i=0;i<str.length();i++)
      {
      	if(Character.isDigit(str.charAt(i)))
      		sum=sum+Character.getNumericValue(str.charAt(i));
      }

      System.out.println("The sum of all Digits in the String is : "+sum);
  }
}