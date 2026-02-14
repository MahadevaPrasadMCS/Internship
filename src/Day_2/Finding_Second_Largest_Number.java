package Day_2;

public class Finding_Second_Largest_Number
{
    public  static void main(String[] args)
    {
        int [] arr = {3, 45, 67, 23, 15};
        int max = Integer.MIN_VALUE;
        int sec_max = max - 1;
        for(int num : arr)
        {
            if(max < num)
            {
                sec_max = max;
                max = num;
            }
            if(max != num && sec_max < num)
            {
                sec_max = num;
            }
        }
        System.out.println("The second largest element of the array is : " + sec_max);
    }
}
