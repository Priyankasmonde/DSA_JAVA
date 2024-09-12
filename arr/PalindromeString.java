public class PalindromeString {
    public static void main(String[] args) {
       String s = "aa";
       String reverse = "";
       
       // Create the reverse string
       for (int i = s.length() - 1; i >= 0; i--) {
           reverse += s.charAt(i);
       }
       
       // Print the reversed string (optional)
       System.out.println(reverse);
       
       // Check if the original string is equal to the reversed string
       if (s.equals(reverse)) {
           System.out.println("String is palindrome");
       } else {
           System.out.println("String is not palindrome");
       }
    }
}
