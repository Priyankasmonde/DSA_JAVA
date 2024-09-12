//pseudo code

// import java.math.*;
// public class gcd_or_hcf {
//     public static void main(String[] args) {
//        int gcd=1;
//        int n1=20;
//        int n2=40;
//        int min=(n1<n2)?n1:n2;
//        int minimum=min(n1, n2);
//        for(int i =1; i<=minimum; i++) {
//             if(n1%i==0 && n2%i==0){
//                 gcd=i;
//             }
//        }
//     }
// }

//optimize code using euclidean  algo

import java.util.Scanner;

public class gcd_or_hcf{
    public int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a= sc.nextInt();
        System.out.print("enter the value of b: ");
        int b= sc.nextInt();
        gcd_or_hcf ob= new gcd_or_hcf();
        System.out.println(ob.gcd(a, b));
    }
}

