public class swap_arr {
    public static void main(String[] args) {
        int[] arr={10,20, 30,40,50,60};
    //     swap(arr);
    //     System.out.println(arr[0]);
    //     System.out.println(arr[1]);
    // }
    // public static void swap(int[] arr) {
    //     int temp= arr[0];
    //     arr[0]=arr[1];
    //     arr[1]=temp;
    // }

    //swaping adjacent array
    int temp;
    for(int i=0;i<arr.length;i+=2){
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;

    }
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    

}
}
