package Ex_2072024;
import java.util.Scanner;
import java.lang.System;

public class TriangleClassifier_if {
    public static void main(String[] args) {
        // Triangle classifier
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("side1");
            int side1 = sc.nextInt();
        System.out.println("side2");
            int side2 = sc.nextInt();
        System.out.println("side3");
            int side3 = sc.nextInt();

            if((side1 == side2) && (side1 == side3) && (side2 == side3))
                System.out.println("It is an Equilateral triangle");
            else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
                System.out.println("It is an Isosceles triangle");
            }
            else System.out.println("It is a scalene triangle");
    }
}
