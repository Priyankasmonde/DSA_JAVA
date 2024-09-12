public class UnionSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4,5};
        int arr2[]={1,2,3,4,5,6,7};
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            //skip duplicates from arr1
            while(i>0 && i<n1 && arr1[i]==arr1[i-1]){
                i++;
            }

            //skip duplicates from arr2
            while(j>0 && j<n2 && arr2[j]==arr2[j-1]){
                j++;
            }

            if(i<n1 && j<n2){
                //If the element in arr1 is smaller, it is added to the union, and the pointer i is incremented.
                if(arr1[i]<arr2[j]){
                    System.out.println(arr1[i]);
                    i++;
                }

                //If the element in arr2 is smaller, it is added to the union, and the pointer j is incremented.
                else if(arr2[j]<arr1[i]){
                    System.out.println(arr2[j]);
                    j++;
                }

                //If both elements are equal, they are added once, and both pointers are incremented.
                else{
                    System.out.println(arr1[i]);
                    i++;
                    j++;
                }
            }
        }
        // Print remaining elements of arr1. The program checks for any remaining elements in either array and adds them to the union, ensuring no duplicates.
        while(i<n1){
            if(i==0 || arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i] + " ");
            }i++;
        }
         // Print remaining elements of arr2
         while (j < n2) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                System.out.println(arr2[j] + " ");
            }
            j++;
        }
    }
}
