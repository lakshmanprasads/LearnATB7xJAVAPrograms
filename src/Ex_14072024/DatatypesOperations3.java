package Ex_14072024;

public class DatatypesOperations3
{
    public static void main(String[] args)
    {
        int course = 100;
        float GST = 28.65F;
        int total= course+(int)GST; //Narrowing requires explicit typecasting here other wise JVM will show error
        float total_price = course+GST;
        System.out.println(total_price);
        System.out.println(total);

    }
}
