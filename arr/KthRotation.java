public class KthRotation {
    public static void d_rotation(int[] arr, int d){
        int n=arr.length;
        int temp;
        for(int i=1;i<=d;i++){
            temp=arr[n-1];
            for(int j=n-1; j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[i]=temp;
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        d_rotation(arr, 3);
    }
}
