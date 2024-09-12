import java.util.Arrays;

public class CountOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 1, 2, 3, 4, 6};
        count_occur(arr);
    }

    public static void count_occur(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + " - " + count);
            
        }
    }
}

//Given an integer array and an integer element, count the number of occurrences of the element in the array

// import java.util.Arrays;

// public class CountOccurence{
//     public static void main(String[] args) {
//         int arr[]={1,2,2,3,4,2};
//         int num=1;
//         occurence(arr, num);
//     }
//     public static void occurence(int[] arr, int num){
//         //Arrays.sort(arr);
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==num){
//                 count++;
                
//             }
//         }System.out.println(count);
//     }
// }