package Ex_13072024;

public class Finalkeyword
{
    public static void main(String[] args) {
       int a= 10;
        a+=1;   // Compound assignment operator
         final String s = " str";
         String b = s.concat("ing");
         String c = s.trim();
       System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);
    }
}
