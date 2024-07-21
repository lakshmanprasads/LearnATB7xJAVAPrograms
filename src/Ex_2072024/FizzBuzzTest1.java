package Ex_2072024;
import java.lang.System;

public class FizzBuzzTest1 {
    public static void main(String[] args) {
        int a=1;
        for (a=1; a <= 100; a++) {
            if ((a%3 == 0) && (a%5 == 0))
                System.out.println("FizzBuzz");
            else if (a%5 == 0) System.out.println("Buzz");
            else if (a%3 == 0) System.out.println("Fizz");
            else System.out.println(a);
        }
    }
}
