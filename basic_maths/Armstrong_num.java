import java.util.Scanner;

public class Armstrong_num {
    public boolean armstrong(int n){
        int sum=0;
        int dup=n;
        int count=0;
        int temp=n;
        // while(n>0){
        //     int lastdigit= n%10;
            
        //     sum=sum+(lastdigit*count);
        //     n=n/10;
        // }
        while(temp>0){
            
            temp=temp/10;
            count++;
        }
        while(temp>0){
            int lastdigit=temp%10;
            sum=(int) (sum+Math.pow(lastdigit,count));
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a numebr to check if it is armstrong no or not: ");
        int n=sc.nextInt();
        Armstrong_num ob= new Armstrong_num();
        System.out.println(ob.armstrong(n));
    }


}
