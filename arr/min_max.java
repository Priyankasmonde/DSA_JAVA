import java.util.Scanner;

public class min_max {
    public int getMin(int arr[], int n){
    
        int min= arr[0];
            for(int i =1; i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }return min ;
    }
    public int getMax(int arr[], int n){
    
        int max= arr[0];
            for(int i =1; i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }return max ;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        min_max ch= new min_max();
        System.out.println(ch.getMin(arr, n));
        System.out.println(ch.getMax(arr, n));
    }
}

