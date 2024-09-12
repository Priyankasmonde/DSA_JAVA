//pseudo code to print all divisors
// public class sum_of_divisors
// {
//     public static void main(String[] args){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }


//Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

import java.util.Scanner;

public class sum_of_divisors{
    public int sum_div(int n){
        long sum=0;
        for(int i=1; i<=n;i++){
            int div= (n/i);
            sum+=div*i;
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        sum_of_divisors ob= new sum_of_divisors();
        System.out.println(ob.sum_div(n));
    }
}
