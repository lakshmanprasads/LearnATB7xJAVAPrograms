package Ex_2172024;

import javax.xml.namespace.QName;

public class functions
{
    public static void main(String[] args)
    {
        // Functions - It is a block of code which can be reused
        // Types - Pre-built eg: math.max();
        //         User created/defined functions
        //  We have to DEFINE the function separately and CALL it from the main function

        // Function types based on parameters
        // fnt 1* without parameter and without return type
        // fnt 2* without parameter and with  return type
        // fnt 3* with parameter and without return type
        // fnt 4* with parameter and with return type
        fnt1();
        System.out.println("---------------");
        String result = fnt2();
        System.out.println(result);
        System.out.println("---------------");
        fnt3("Prasad");
        System.out.println("---------------");
        int sum_result=fnt4(3,5);
        System.out.println(sum_result);

    }
    static void fnt1()
    {
        System.out.println("without parameter and without return type");
    }
    static String fnt2()
    {
        System.out.println("without parameter and with  return type");
        return "str";     // it means
    }
    static void fnt3(String name)
    {
        System.out.println("with parameter and without return type");
        System.out.println("Your input String is:"+name);
    }
    static int fnt4(int a, int b)
    {
        System.out.println("with parameter and with return type");
        return a+b;
    }
}

