import java.util.*;
public class sum_array {
    public static void main(String s[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int number[]=new int[n];
        int sum=0;
        //int[] arr={10,20,30,40,50};
        System.out.println("Enter numbers in array and array size is "+ n);
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Entered numbers are: ");
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
            sum=sum+ number[i];
           
        }
        System.out.println("Sum of all array elements are: "+sum);
    }
}
