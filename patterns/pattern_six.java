/*
    1
    01
    101
    0101
    10101
 */

import java.util.*;

public class pattern_six {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n= sc.nextInt();
        int starting=1;
        for(int i=0; i<n;i++){
            if(i % 2==0){
                starting=1;
            }
            else{
                starting=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(starting);
                starting = 1- starting;
            }
            System.out.print("\n");
        }
    }
}
