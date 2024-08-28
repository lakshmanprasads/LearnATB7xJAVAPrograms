package Ex_2172024;

public class condition_loops13
{
    public static void main(String[] args)
    {
        //for loop  - for(A;B;C)
        //A- initialization,  B-condition for termination , C-(increment/decrement)/ updation
        // C will get executed only if B is true
        //without A;B;C. infinite loop
        // in for loop short,byte,char,int,float,double are supported. String cannot be used
        int i =1;  // A(initialization part) can be taken out
        for (; i<10 ; i++)
        {
            System.out.println(i);
        }
    }
}
