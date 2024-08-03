package HackerRankPractice;

import java.util.Scanner;
import java.lang.*;

public class StdinStdout {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d=scan.nextDouble();
            String s = scan.nextLine();
            String l = scan.nextLine();
            scan.close();
            /** The extra line(String l = scan.nextLine();) is needed to clear the buffer, so that scanner class will be able to read it correctly, if u still want to write this code ,without the extra line you must use the String, before using int and double in scanner class**/
            System.out.println("String: " + l);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }

