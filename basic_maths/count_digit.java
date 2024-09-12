//pseudo code

// public class count_digit {
//     public static void main(String[] args) {
//         int N=779;
//         int count=0;
//         int lastdigit;
//         while(N>0){
//             //lastdigit= N % 10;
//             count ++;
//             N=N/10;
//         }
//         System.out.print(count);
//     }
    
// }

//Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

import java.util.*;

public class count_digit{
    public int cnt_dgt(int x){
        int temp=x;
        int count=0;
        while(temp>0){
            int rem= temp%10;
            if(rem!=0 && x%rem==0){
                count++;
            }
            temp= temp/10;
        }
        return count;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no : ");
        int x = sc.nextInt();
        count_digit ob= new count_digit();
        System.out.println(ob.cnt_dgt(x));
    }
}


