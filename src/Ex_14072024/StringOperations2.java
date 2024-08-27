package Ex_14072024;

public class StringOperations2
{
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2);    // checks for ref.   /*same string objects with two references.
        // memory location is also same in SCP which utilizes the immutable nature of string

        System.out.println(s1.equals(s2));  // checks for content

        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s3==s4);    // Diff string objects with diff references
        System.out.println(s3.equals(s4));  // checks if the contents are same

        System.out.println(s1==s3); // s1 is in scp and s3 is in Heap area. Both refers to diff memory locations
        System.out.println(s1.equals(s3)); // contents are same
    }
}
