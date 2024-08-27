package Ex_14072024;

public class StringOperations3
{
    public static void main(String[] args)
    {
        String password="Pass123";
        String pass=password.toLowerCase(); //creates another string object in scp
        System.out.println(password);
        System.out.println(pass);
        System.out.println(password==pass); // diff references
        System.out.println(password.equals(pass)); // diff contents
        System.out.println(password.equalsIgnoreCase(pass));
    }
}
