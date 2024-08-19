package Ex_13072024;

public class Datatypes2 {
    public static void main(String[] args)
    {
       //Behaviour of + symbol

        String s3 = "str";
        int x = 10;
        int y = 565;

        System.out.println(x+y+s3);  // BODMAS is followed
        System.out.println(s3+x+y);  // IF STRING FOUND REST IS CONSIDERED AS STRING
        System.out.println(x+s3+y);

        System.out.println(x+y+s3+y+s3+x+y);  // BODMAS RULE FOLLOWED BY STRING
    }
}
