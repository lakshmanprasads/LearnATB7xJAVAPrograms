package Ex_2172024;

public class condition_loops10
{
    public static void main(String[] args)
    {
        //for loop  - for(A;B;C)
        //A- initialization,  B-condition for termination , C-(increment/decrement)/ updation
        // C will get executed only if B is true
        //without A;B;C. infinite loop
        for (int i=0; i>=1;i++)
        {
            System.out.println(i);
        }
        for (int i=0; ;i++) // infinite loop - reuse the circular value. It uses the negative values of integer range after attaining the mx value
        {
            System.out.println(i);
        }
//        for (int i=0; ;) // without A;B;C. infinite loop. It uses the negative values of integer range after attaining the max value
//        {
//            System.out.println(i);
//        }
    }
}
