//6.Program to Accepts two Strings & Compare them. 
import java.util.*;
class compare_2_strings
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = new String(sc.nextLine());
		String str2 = new String(sc.nextLine());
		int res = str1.compareTo(str2);
		if(res==0)
			System.out.println("same");
		if(res>0)
			System.out.println("greater");
		if(res<0)
			System.out.println("smaller");
	}
} 