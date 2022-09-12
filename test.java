import java.io.*;

public class test {
 public static void main(String[] args)
 {
  int base = 3, power = 3;
  int result = 1;
  // running loop while the power > 0
  while (power != 0) {
   result = result *base;
   // power will get reduced after
   // each multiplication
   power--;
  }
  System.out.println("Result = " + result);
 }
}