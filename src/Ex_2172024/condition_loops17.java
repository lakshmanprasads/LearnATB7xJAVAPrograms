package Ex_2172024;

import java.util.Scanner;

public class condition_loops17
{
    public static void main(String[] args)
    {
        // Factorial program 5!=5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int j=1;
        for (int i = 1; i <=n ; i++)
        {
         j= j*i;
        }
        System.out.println(j);
        sc.close();
    }
}
