import java.util.Scanner;

public class secondLargest {
    public int slaregst(int n, int[] arr){
        int largest= arr[0];
        int sl=Integer.MIN_VALUE;
        for(int i=1; i<arr.length ; i++){
            if(arr[i] > largest){
                sl=largest;
                largest=arr[i];
                
            }else if(arr[i]>sl && arr[i]<largest){
                sl=arr[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the numbers in array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        secondLargest ob= new secondLargest();
        System.out.println("second largest element is: " +ob.slaregst(n,arr));
    }
}
