/*
        A 
        A B
        A B C 
        A B C D
        A B C D E
 */
import java.util.*;
public class character_pattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch +" ");
            }
        System.out.print("\n");
        }

    }
}



/*
A B C D E 
A B C D
A B C 
A B
A
 */

// import java.util.*;
// public class character_pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(char ch='A'; ch<='A'+(n-i-1); ch++){
//                 System.out.print(ch +" ");
//             }
//         System.out.print("\n");
//         }

//     }
// }



/*
        A         
        B B       
        C C C     
        D D D D   
        E E E E E
 */
// import java.util.*;
// public class character_pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             char ch= (char) ('A' + i);
//             for(int j=0; j<=i;j++){
//                 System.out.print(ch +" ");
//             }
//         System.out.print("\n");
//         }

//     }
// }

/*
    A    
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */
// import java.util.*;
// public class character_pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int space=0; space<n-i-1; space++){
//                 System.out.print(" ");  //spaces
//             }
//              char ch= 'A';
//              int breakpoint= (2*i+1)/2;
//             for (int j=1; j<=2*i+1; j++){// characters
//                 System.out.print(ch);
//                 if(j<=breakpoint){
//                     ch++;
//                 }
//                 else{
//                     ch--;
//                 }

//             }

//             for(int spcae2=0; spcae2<n-i-1; spcae2++){
//                 System.out.print(" "); // 2nd space
//             }
//             System.out.print("\n");
//         }

//     }
// }

/*
        E
        DE
        CDE
        BCDE
        ABCDE
 */
// import java.util.*;
// public class character_pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
        
//         for(int i=0;i<n;i++){
//             for(char ch=(char) ('E' - i); ch<='E'; ch++){
//                 System.out.print(ch);
//             }
//         System.out.print("\n");
//         }

//     }
// }


/*
        E
        ED
        EDC
        EDCB
        EDCBA
 */


// import java.util.*;
// public class character_pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n=sc.nextInt();
        
//         for(int i=0;i<n;i++){
//             char ch='E';
//             for(int j =0; j<=i;j++){
//                 System.out.print(ch);
//                 ch--;
//             }
//         System.out.print("\n");
//         }

//     }
// }