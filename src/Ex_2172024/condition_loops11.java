package Ex_2172024;

public class condition_loops11
{
    public static void main(String[] args)
    {
        //for loop  - for(A;B;C)
        //A- initialization,  B-condition for termination , C-(increment/decrement)/ updation
        // C will get executed only if B is true
        //without A;B;C. infinite loop
        final boolean b=true; // final means value is fixed
//        for (int i = 0; b ; i++)   // infinite loop occurs
//        {
//            System.out.println("HI");
//        }
        for (double f = 0.2; f < 10.32; f++) // in for loop short,byte,char,int,float,double are supported
        {
            System.out.println("HI \t"+f);
        }
        for (float f = 1.1f; f < 10.1; f++)
        {
            System.out.println("HI \n"+f);
        }
    }
}
