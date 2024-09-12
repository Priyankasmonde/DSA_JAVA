import java.util.*;
public class max_array {
    public static void main(String s[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int number[]=new int[n];
        int max=(Integer.MIN_VALUE);  //integer.min_value is -infinity value means it will consider -1 -2 -3 -4 also
        //int[] arr={10,20,30,40,50};
        System.out.println("Enter numbers in array and array size is "+ n);
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Entered numbers are: ");
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
            if(number[i]>max){
                max=number[i];
                
            }
           
        }
        System.out.println("max value from array is : "+max);
        
    }
}
