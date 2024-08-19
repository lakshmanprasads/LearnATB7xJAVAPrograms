package Ex_13072024;

public class Logicaloperator
{
    public static void main(String[] args)
    {
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        boolean c = !(a > 10 && a < 5); // BODMAS
        System.out.println(b);
        System.out.println(c);
    }
}
