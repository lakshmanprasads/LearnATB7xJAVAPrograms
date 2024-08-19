package Ex_13072024;

public class Datatypes1 {
    public static void main(String[] args) {
        // Formatting
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        int age = 98;
        String s = "stg";
        char c = 'c';
        float f = 6.35f;
        double d= 53.656464646;
        long l= 6464654987941984435l;
//        System.out.println("You age is -> " + age);
        System.out.printf("You age is -> %d\n",age);
        System.out.printf("Value of String is %s\n",s);
        System.out.printf("Character is %c\n",c);
        System.out.printf("Float value is %f\n",f);
        System.out.println("Double value is "+d);
        System.out.printf("Long value is %d",l);
    }
}
