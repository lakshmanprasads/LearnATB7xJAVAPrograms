package Ex_2872024;

import java.util.Scanner;

public class RightTriangleStarPattern
{
    public static void main(String[] args)
    {
        String str="*";
        System.out.println(str);
        for (int i=0;i<4;i++)
        {
            str+= "*";
            System.out.println(str);
        }

        // Another Method
        char c='*';
        int n=5;
        for (int i = 1; i <=n ; i++)
        {
            System.out.println();
            for (int j = 0; j<i; j++)
            {
                System.out.print(c);
            }
        }
    }
}