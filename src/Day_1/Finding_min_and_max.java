package Day_1;

class Maximum
{
    public void max_finder()
    {
        int [] arr = {4, 5, 8, 10, 2};
        int max = Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num > max)
            {
                max = num;
            }
        }
        System.out.println("Maximum value of the array is : "+max);
    }
}

class Minimum
{
    public void min_finder()
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

class Finding_min_and_max
{
    public static void main(String [] args)
    {
        Maximum max = new Maximum();
        max.max_finder();

        Minimum min = new Minimum();
        min.min_finder();
    }
}