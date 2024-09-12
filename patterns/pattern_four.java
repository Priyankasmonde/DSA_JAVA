/*
     *
    ***
   *****
  *******
 *********   
 */

// import java.util.Scanner;

// public class pattern_four {
//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int s1=0; s1<n-i-1; s1++) //space 1
//             {
//                 System.out.print(" ");
//             }
//             for(int st=0; st < 2*i+1; st++)// stars
//             {
//                 System.out.print("*");
//             }
//             for(int s2=0 ; s2<n-i-1; s2++){
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


/*
*********
 *******
  *****
   ***
    *
 */

 import java.util.Scanner;

public class pattern_four {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int s1=0; s1<i; s1++) //space 1
            {
                System.out.print(" ");
            }
            for(int st=0; st < 2*n - (2*i+1); st++)// stars
            {
                System.out.print("*");
            }
            for(int s2=0 ; s2<i; s2++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}