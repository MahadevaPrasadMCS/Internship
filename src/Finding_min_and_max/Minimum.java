package Finding_min_and_max;

public class Minimum
{
    public static void main(String[] args)
    {
        int [] arr = {4, 5, 8, 10, 2};
        int min = Integer.MAX_VALUE;

        for(int num : arr)
        {
            if(num < min)
            {
                min = num;
            }
        }
        System.out.println("The minimum value of the array is : "+min);
    }
}
