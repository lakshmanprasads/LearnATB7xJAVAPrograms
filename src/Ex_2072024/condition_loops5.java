package Ex_2072024;

import java.util.Scanner;

public class condition_loops5
{
    public static void main(String[] args)
    {
        //Switch - Better for 2+ conditions
        //Find vowel
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char c=sc.next().charAt(0);

        switch (c)
        {
            case 'a':
                System.out.println("Entered character is a Vowel");
                break;
            case 'e':
                System.out.println("Entered character is a Vowel");
                break;
            case 'i':
                System.out.println("Entered character is a Vowel");
                break;
            case 'o':
                System.out.println("Entered character is a Vowel");
                break;
            case 'u':
                System.out.println("Entered character is a Vowel");
                break;
            default:
                System.out.println("Not a Vowel. It is a Consonant");
        }
        System.out.println("---Outside of loop---");
    }
}
