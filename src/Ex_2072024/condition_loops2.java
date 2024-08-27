package Ex_2072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class condition_loops2
{
    public static void main(String[] args)
    {
        //Grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score:");
        int score = sc.nextInt();
        char grade = 'F';
        if(score >=90 && score<=100)
        {
            grade = 'A';
            System.out.println("Grade is:"+grade);
        } else if (score>=80 && score <=90)
        {
            grade='B';
            System.out.println("Grade is:"+grade);
        }else if (score>=70 && score <=80)
        {
            grade='C';
            System.out.println("Grade is:"+grade);
        }else if (score>=60 && score <=70)
        {
            grade='D';
            System.out.println("Grade is:"+grade);
        }else if (score>=50 && score <=60)
        {
            grade='E';
            System.out.println("Grade is:"+grade);
        }else
        {
            System.out.println("Grade is:"+grade);
        }
        sc.close();  // if it is not specified Garbage collector will close it
    }
}
