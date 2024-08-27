package Ex_2072024;

import java.util.Scanner;

public class condition_loops7
{
    public static void main(String[] args)
    {
        //For JDK 17 and above we can avoid using break stmt
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Itemcode between 001 to 006:");
        int itemcode= sc.nextInt();
        switch(itemcode)
        {
            case 001,002,003-> System.out.println("It is a Electronic gadget");
//                break;
            case 004,005,006-> System.out.println("It is a Mechanical Gadget");
//                break;
            default-> System.out.println("None");
        }

    }
}
