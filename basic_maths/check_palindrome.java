//Given an integer x, return true if x is a palindrome, and false otherwise.

import java.util.Scanner;

class check_palindrome{
    public boolean isPalindrome(int x){
        int reverse=0;
        int lastdigit;
        int dup=x;
        while(x>0){
            lastdigit=x%10;
            reverse= (reverse*10)+lastdigit;
            x=x/10;
        }
        if(reverse==dup){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a value: ");
        int x= sc.nextInt();
        
        check_palindrome myObj = new check_palindrome();
        System.out.println(myObj.isPalindrome(x));
    }
}