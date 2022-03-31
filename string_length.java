//7.Program to Find the Length of a String without using the Built-in Function. 
import java.util.*;
class string_length
{
	public static void main(String args[])
	{
		String str ="geeksforgeek";
		int len=0;
		for(int i=0;str.charAt(i)!='\0';i++)
		{
			len++;
		}
		System.out.println(len);
	}
}