package Ownpractice;

import java.util.Arrays;
import java.lang.*;

public class SortArray
{
    public static void main(String[] args)
    {
        int arr[]=new int[]{5,8,6,41,35,2,44,4,24};
        Arrays.sort(arr);
                System.out.println("Sorted array is:" + Arrays.toString(arr));
       // System.out.println("The Sorted array is:");
        //for(int ele:arr)
          //  System.out.print(ele+" ");
        System.out.println("Position is:" + Arrays.binarySearch(arr, 2));
    }
}
