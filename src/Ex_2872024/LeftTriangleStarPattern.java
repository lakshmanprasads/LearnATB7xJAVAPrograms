package Ex_2872024;

public class LeftTriangleStarPattern
{
    public static void main(String[] args)
    {
        String str = "*****";
        int n = str.length();
        int i = 0;
        for (i = 0; i < n; n--)
        {
            String str1 = str.substring(i, n);
            System.out.println(str1);
        }

        // Another Method

        int m=5; int j;
        for (i = 0; i <= m; i++)
        {
            System.out.println();
            for (j = 5; j>i; j--)
            {
                System.out.print('*');
            }

        }
    }
}