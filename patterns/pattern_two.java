/*
        *
        **
        ***
        ****
*/
import java.util.*;
public class pattern_two{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
        System.out.print("\n");
        }

    }
}


// same way but instead of * use numbers
/*
    1
    12
    123
    1234
    12345
 */

//  import java.util.*;
// public class pattern_two{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//         System.out.print("\n");
//         }

//     }
// }


