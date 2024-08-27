package Ex_14072024;

public class DatatypesOperations2
{
    public static void main(String[] args)
    {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b=60;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 150;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

        short s = 120;
        int s1=s;
        int s2=(int)s;
        System.out.println(s1+s2);

        int s3 = 250;
        short x = (short)s3;
        //short y = s3;
        System.out.println(x);
    }
}
