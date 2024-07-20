package Ex_2072024;
import java.lang.System;
import java.util.Scanner;
import java.lang.String;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Input year");
        Scanner sc = new Scanner(System.in);
        int Input_year = sc.nextInt();
        if(Input_year%4 == 0)
            System.out.println("It is a Leap Year");
        else System.out.println("It is not a Leap year");
        sc.close();
        }
    }

