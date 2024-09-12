import java.util.Scanner;

public class second_smallest {
    public int second_small(int n, int[] arr){
        int smallest = Integer.MAX_VALUE;
        int second_smaller = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<smallest){
                second_smaller=smallest;
                smallest=arr[i];
            }else if(arr[i] > smallest && arr[i] < second_smaller){
                second_smaller=arr[i];
            }

        }
        return second_smaller;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        second_smallest ob=new second_smallest();
        System.out.println("second smallest number is: "+ob.second_small(n, arr));
    }
}
