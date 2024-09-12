import java.util.*;
public class serach{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //int size = sc.nextInt();

        int number[]=new int[3];

        //input
        for(int i=0; i<number.length;i++){
            number[i]=sc.nextInt();
        }

        System.out.println("Enter number you want to serch: ");
        int x = sc.nextInt();
        
        //output
        for(int i=0; i<number.length;i++){
            if(number[i]==x){
                System.out.println("Number found at index: "+ i);
            }
            
        }

    }
}