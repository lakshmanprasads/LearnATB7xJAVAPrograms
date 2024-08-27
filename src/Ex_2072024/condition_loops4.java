package Ex_2072024;

import java.util.Scanner;

public class condition_loops4
{
    public static void main(String[] args)
    {
        //Switch - Better for 2+ conditions
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Mon");
                break;                          // breaks the loop
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Day is out of Range");
        }
        System.out.println("----Outside of loop----");

    }
}
