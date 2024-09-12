//Given an integer array, find the minimum value and its index in the array.

public class Find_min{
    public static void main(String[] args) {
        int arr[]={5,2,4,3,1};
        int result[]=findminarray(arr);
        System.out.print(result[0]);
        System.out.print(" " +result[1]);
    }
    public static int[] findminarray(int[] array){
        int min=Integer.MAX_VALUE;
       // int arr[]={5,2,4,3,1};
        int minIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                minIndex=i;
            }
        }
        return new int[]{min, minIndex};
    }
}