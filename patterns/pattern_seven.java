/*
    1       1
    12     21
    123   321
    1234 4321
 */

import java.util.Scanner;

public class pattern_seven {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n= sc.nextInt();
        int space= 2*(n-1);
        for(int i=1;i<=n;i++){
            for(int n1=1; n1<=i;n1++){
                System.out.print(n1);//numbers
            }
            for(int sp=1;sp<=space;sp++){
                System.out.print(" ");
            }
            for(int n2=i; n2>=1;n2--){
                System.out.print(n2);
            }
            System.out.print("\n");
            space -= 2;
        }
    }
}

