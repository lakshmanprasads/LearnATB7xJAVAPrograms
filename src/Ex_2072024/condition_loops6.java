package Ex_2072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class condition_loops6
{
    public static void main(String[] args)
    {
        //For JDK 13 and above we can use multiple conditions in switch
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Itemcode between 001 to 006:");
        int itemcode= sc.nextInt();
        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("It is a Electronic gadget");
                break;
            case 004,005,006:
                System.out.println("It is a Mechanical Gadget");
                break;
            default:
                System.out.println("None");
        }

    }
}
