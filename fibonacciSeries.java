import java.util.Scanner;
//se

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = 0, second = 1,third=0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i < n; i++) {
            third=first+second;
            first=second;
            second=third;            

            System.out.println(third);
        }

    }

}
// 0+1+1+2+3+