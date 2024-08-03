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
    }
}