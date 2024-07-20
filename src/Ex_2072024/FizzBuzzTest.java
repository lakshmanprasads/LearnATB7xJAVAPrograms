package Ex_2072024;
import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        System.out.println("Enter the number");
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
      if((a%3==0) && (a%5==0))
          System.out.println("FizzBuzz");
      else if (a%5==0) {
          System.out.println("Buzz");
      } else if (a%3==0){
          System.out.println("Fizz");
      }
    }
}
