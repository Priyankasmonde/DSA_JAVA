//pseudo code to chcek number is prime or not

// public class check_prime {
//     public static void main(String[] args) {
//         int n=4;
//         int count=0;
//         for(int i=1; i<=n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.print("numebr is prime");
//         }else{
//             System.out.print("number is not prime");
//         }
//     }
// }


//optimize way
public class check_prime {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.print("numebr is prime");
        }else{
            System.out.print("number is not prime");
        }
    }
}
