package Ex_2072024;

import java.util.Scanner;

public class condition_loops8
{
    public static void main(String[] args)
    {
        //For JDK > 13. switch can return values but used rarely
        char code = 'A';
        int val = switch(code)
        {
            case 'A':
                yield 65;  //return 65 is not supported
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value:"+code);
        };
        System.out.println(val);
    }
}
