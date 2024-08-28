package Ex_2172024;

public class condition_loops14
{
    public static void main(String[] args)
    {
        //for loop  - for(A;B;C)
        //A- initialization,  B-condition for termination , C-(increment/decrement)/ updation
        // C will get executed only if B is true
        //without A;B;C. infinite loop
        // in for loop short,byte,char,int,float,double are supported. String cannot be used
        for (int i=1; i<10 ; i++)
        {
            if(i==5)
                break;      // moves the flow to end of loop
            System.out.println(i);
        }
        System.out.println();
        for (int i=1; i<10 ; i++)
        {
            if(i==5)
                continue;   // moves the flow to beginning of loop
            System.out.println("After i\n"+i);
        }
    }
}
