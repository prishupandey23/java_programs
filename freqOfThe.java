// 9.Program to Find the Frequency of the Word ‘the’ in a given Sentence. 
import java.util.*;
class freqOfThe
{
	public static void main(String args[])
	{
	  int count=0;
      Scanner sc = new Scanner(System.in);
      String pat = new String("the");
      StringBuffer str = new StringBuffer(sc.nextLine());
      int n = str.length();
      int m = pat.length();
      for(int i=0;i<n-m;i++)
      {
      	int j;
      	for(j=0;j<m;j++)
      		if(pat.charAt(j)!=str.charAt(i+j))
      			break;
      		if(j==m)
      			count++;
      	
      }
      System.out.println("The frequency of the word the is : "+count);
	}
	
}