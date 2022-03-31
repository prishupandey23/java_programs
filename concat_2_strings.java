//2. Java Program to read two Strings & Concatenate the Strings. 
import java.util.*;
class concat_2_strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1-:");
        String sb1=new String(sc.nextLine());
        System.out.println("Enter the string 2-:");
        String sb2=new String(sc.nextLine());
        System.out.println(sb1.concat(sb2));
    }
}