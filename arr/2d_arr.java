import java.util.*;
public class 2d_arr {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new arr[4][5];
        for(int i=0;i<4; i++)
        {
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4; i++)
        {
            for(int j=0;j<5;j++){
                System.out.println(arr[i][j]);
            }
        }
        
    }
}
