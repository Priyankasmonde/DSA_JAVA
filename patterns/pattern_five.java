/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/

// import java.util.Scanner;

// public class pattern_five {
//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=1;i<2*n-1;i++){
//             int stars=i;
//             if(i>n){
//                 stars=2*n-i;
//             }
//             for(int j=1;j<=stars;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");



//         }
//     }
// }

/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

import java.util.Scanner;

public class pattern_five {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        int spaces= 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");// stars
            }
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");// spaces
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");// stars
            }
            System.out.print("\n");
            if(i<n){
                spaces -=2;
            }else{
                spaces +=2;
            }



        }
    }
}