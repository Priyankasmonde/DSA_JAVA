//Given an array of consecutive integers with one missing element, write a function to find the missing number.

class missingElement{
    public int miss_ele(int[] arr){
        int n=arr.length+1;// to calculate the length of entire array
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int i:arr){
            actualsum+=i;
        }
        return totalsum-actualsum;
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,4,5,6};
        missingElement me=new missingElement();
        System.out.println(me.miss_ele(arr));
    }
}