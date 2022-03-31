//Program to Check if the Substring is present in the given String. 
import java.util.*;

class substring_present 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		String st ="geeksforgeeks";
		String str = new String(sc.nextLine());
		System.out.print(st.contains(str));
	}
}