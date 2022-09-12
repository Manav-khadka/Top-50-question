import java.util.Scanner;

public class integerPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        System.out.println((n==reversenum(n))? "palindrome":"Not palindrome");
    }
     static int reversenum(int n) {
        int reversedNum=0;
        while (n!=0) {
            int remainder=n%10;
            reversedNum=reversedNum*10+remainder;
            n/=10;
        }
        return reversedNum;
    }
    
}
