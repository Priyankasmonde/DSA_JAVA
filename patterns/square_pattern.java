/*
    *****
    *   *
    *   *
    *   *
    *****
 */

// import java.util.Scanner;

// public class square_pattern {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n= sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 || j==0 || i==n-1|| j==n-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }



import java.util.Scanner;

public class square_pattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n= sc.nextInt();
        for(int i=0; i<2*n-1; i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right= (2*n-2)-j;
                int down= (2*n-2)-i;
                System.out.print(n-min(min(top, down), min(left, right)));
            }
            System.out.print("\n");
        }
    }
}