import java.util.Scanner;

public class check_sorrted {
    
    
    public boolean sorted(int n, int[] arr){
        for(int i=1; i<n;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
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
        check_sorrted ch= new check_sorrted();
        System.out.println(ch.sorted(n,arr));
    }
}
