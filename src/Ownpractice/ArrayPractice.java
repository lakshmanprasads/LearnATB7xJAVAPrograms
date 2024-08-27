package Ownpractice;

import java.util.*;

public class ArrayPractice
{
    public static void main(String[] args) {
        //Finding an element in an array. key=7
        int[] arr1=new int[]{5, 1, 1, 9, 7, 2, 6, 10};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int key = sc.nextInt();
        int L;
        L = arr1.length;
        for(int i=0;i<arr1.length;i++)
        {
            if (arr1[i] == key)
            {
                System.out.println("Given Value is available in index no:"+ i);
                break;
            }
            else if (i==(L-1))
                System.out.println("Given value is not available");
            else if (arr1[i] != key)
                continue;
        }
    }
}