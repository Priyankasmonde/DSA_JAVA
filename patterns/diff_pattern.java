/*
********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
 */
import java.util.Scanner;

public class diff_pattern {
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n= sc.nextInt();
         int iniS=0;
        for(int i=0; i<n; i++){
            for(int str1=1; str1<=(n-i); str1++){
                System.out.print("*");// stars
            }
            for(int space=0; space<iniS; space++){
                System.out.print(" ");
            }
            for(int str2=1; str2<=(n-i); str2++){
                System.out.print("*");// stars2
            }
            iniS +=2;
            System.out.print("\n");
        }
            iniS=2*n-2;
            for(int i=1; i<=n; i++){
                for(int str1=1; str1<=i; str1++){
                    System.out.print("*");// stars
                }
                for(int space=0; space<iniS; space++){
                    System.out.print(" ");
                }
                for(int str2=1; str2<=i; str2++){
                    System.out.print("*");// stars2
                }
            iniS -=2;
            System.out.print("\n");
            

        }
     
    }

}
