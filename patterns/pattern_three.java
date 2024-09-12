/* 
 *****
 ****
 ***
 **
 *
*/
import java.util.Scanner;

public class pattern_three {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
        System.out.print("\n");
        }
    }
}

/*
 12345
 1234
 123
 12
 1
 */




// import java.util.Scanner;

// public class pattern_three {
//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j);
//             }
//         System.out.print("\n");
//         }
//     }
// }
