package Ex_2872024;

public class SecondHighestSalaryinArray
{
    public static void main(String[] args)
    {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = 1;
        int second_max = 1;
        int i = 0;
        System.out.println("Length of array is:" + salaries.length);
        for (i = 0; i < salaries.length; i++)
        {
            if (max < salaries[i])
            {
                max = salaries[i];
            }
        }
        System.out.println("Highest salary is:" + max);
        for (i = 0; i < salaries.length; i++) {
            if (salaries[i] < max)
            {
                if (second_max < salaries[i])
                    second_max = salaries[i];
            }
        }System.out.println("Second Highest salary is:" + second_max);
    }
}