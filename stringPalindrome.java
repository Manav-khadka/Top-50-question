import java.util.Scanner;

public class stringPalindrome{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= new String();
        word =input.nextLine();
        String n =reverse(word);
        System.out.println(word);
        System.out.println(n);
        
        if (word.equals(n)) {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }

     static String reverse(String word) {
        int l=word.length();
        String reverseWord="";
        for(int i=l-1;i>=0;i--){
            reverseWord=reverseWord+word.charAt(i);

        }
        return reverseWord;
        
    }
}