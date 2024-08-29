package Ex_2172024;

public class condition_loops15
{
    public static void main(String[] args)
    {
        //for loop  - for(A;B;C)
        //A- initialization,  B-condition for termination , C-(increment/decrement)/ updation
        // C will get executed only if B is true
        // Even and odd number program

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even->" + i);
                //continue;
            } else {
                System.out.println("Odd->" + i);
            }
        }
    }
}
