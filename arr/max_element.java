public class max_element{
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        int arr[]={23, 45,2,4, 8};
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
       }
       System.out.println(max);
    }
}