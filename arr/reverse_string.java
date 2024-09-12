// public class reverse_string {
//     public static void main(String[] args) {
//         String str= "abcde";
//         String rstr="";
//         for(int i=str.length()-1; i>=0;i--){
//             rstr+=str.charAt(i);
//         }
//         System.out.println(rstr);


//     }
// }

//Write a function that reverses a string. The input string is given as an array of characters s. You must do this by modifying the input array in-place with O(1) extra memory.


public class reverse_string{
    public void rev_string(String[] s){
        int start=0;
        int end=s.length-1;
        while(start<=end){
            String temp=s[start];
            s[start]= s[end];
            s[end]=temp;
            start++;
            end--;
        }
        return;
    }

        public static void main(String agrs[]){
            reverse_string rs=new reverse_string();
           String s[]={"c", "o", "d", "e"};
            System.out.printf(rs.rev_string(s));
        }
    }
