package Ownpractice;

import java.util.Locale;

public class Stringclass
{
    public static void main(String[] args)
    {
        //Substring
        String name=new String(" Jack and Jill");
        System.out.println(name.substring(0,4));
        System.out.println(name.subSequence(0,8));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.charAt(6));
        System.out.println(name.concat(" in Well"));
        System.out.println(name.trim());
        System.out.println(name.codePointAt(5));
        System.out.println(name.contains("Jack"));
        System.out.println(name.endsWith("Jill"));
        System.out.println(name.substring(5));
        System.out.println(name.startsWith(""));
        System.out.println(name.indent(54));
        System.out.println(name.contentEquals(" Jack and Jill"));
        System.out.println(name.equals(" Jack and Jill"));
        System.out.println(name.intern());
    }
}
