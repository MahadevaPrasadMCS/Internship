class maximum
{
    public static void main(String[] args)
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
        System.out.println("The maximum value of the array is : "+max);
    }
}