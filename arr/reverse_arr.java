import java.util.*;
public class reverse_arr 
{

    //array with function
/*
    public static void reverse(int arr[]) 
    {
        int[] b= new int[arr.length];
        int j=arr.length;
       for(int i=0;i<arr.length;i++)    {
        b[j-1]=arr[i];
        j--;
       }   
       System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < arr.length; k++) { 
            System.out.println(b[k]); 
        } 
        
    }
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter array size: ");
            int n= sc.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter elements in array of size " +n+ ": ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter elements in array are: ");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            
            reverse(arr);

            
            
    }
    

    // array without function
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in array of size " +n+ ": ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter elements in array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("reversed array is: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }*/

//write a code to reverse array of specific index
        public static void reverse(int arr[], int s, int e) 
        {
            int[] b= new int[arr.length];
            int j=arr.length;
        for(int i=0;i<arr.length;i++)    {
            if(i==s){
            b[j-1]=arr[e];
            j--;
            }
        }   
        System.out.println("Reversed array is: \n"); 
            for (int k = 0; k < arr.length; k++) { 
                System.out.println(b[k]); 
            } 
        
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter array size: ");
            int n= sc.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter elements in array of size " +n+ ": ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Entered elements in array are: ");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            
            reverse(arr, 2 ,5);

            
            
    }
    
    
    
}
