//Pallindrome Problem
//         1
//        212
//       32123
//      4321234
//      543212345
import java.util.*;
public class LL {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
                for(int k=n-i;k>0;k--) {
                    System.out.print(" ");
                }
                for(int k=i;k>0;k--) {
                    System.out.print(k);
                }
                for(int k=2;k<=i;k++) {
                    System.out.print(k);
                }
                System.out.println();
            }


    }
}
