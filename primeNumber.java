import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      boolean flag=false;
      int n = in.nextInt();
     for(int i=2;i<n/2;i++){
        
        flag =(n%i==0)? true:false;
     }
     System.out.println((!flag)?"prime" : "Not prime");

    }
}
