public class moveZeros{
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0){
                    swap(arr, i,j);
                    j++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
