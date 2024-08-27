package Ownpractice;

public class stringpractice_Heap_SCP {
      public static void main(String[] args) {
            System.out.println("string demo");
            String s1="abc";
            String s2=new String("abc"); //created in Heap area
            String s3="def"; //s3 and s4 are present in SCP(String constant pool) - SCP stores only unique values
            String s4="def";
            if(s1==s2)
                  System.out.println("s1 and s2 are same");
            else
                  System.out.println("s1 and s2 are Different");
            if(s3==s4) System.out.println("s3 and s4 are same");
            else System.out.println("s3 and s4 are Different");
            s3 = s4;
            System.out.println(s3+s4+123+3+"asd");

    }
}
