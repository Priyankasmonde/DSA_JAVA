//pseudo code

// public class reserve_number {
//     public static void main(String[] args){
//         int reverse=0;
//         int lastdigit;
//        int  N=-145;
//         while(N>0){
//             lastdigit = N%10;
//             reverse= (reverse*10) + lastdigit;
//             N= N/10;
//         }
//         System.out.print(reverse);
//     }
// }


//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

import java.util.Scanner;

class reserve_number{
    public int evenlydivide(int n){
        int lastdigit;
        long reverse=0;
        boolean sign=true;
        if(n<0){
            sign=false;
        }
        n=Math.abs(n);
        while (n>0) {
            lastdigit= n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
            if(n>Integer.MAX_VALUE){
                return 0;
            }
        }
        if(sign==false){
            return -1*(int)reverse;
        }
        return (int)reverse;
            
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        reserve_number ob= new reserve_number();
        System.out.println(ob.evenlydivide(n));
    }
}