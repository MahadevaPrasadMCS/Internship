package Day_5.OOPs_in_Java;

class Swap
{
    public int [] swapper(int a, int b)
    {
        a = (a + b) - (b = a);
        return new int[]{a, b};
    }
}

public class Swap_without_temp
{
    public static void main()
    {
        int a = 10;
        int b = 15;

        Swap swp = new Swap();
        int [] result = swp.swapper(a, b);

        System.out.println("Value of a before swap : "+a);
        System.out.println("Value of b before swap : "+b);

        System.out.println("Value of a after swap : "+result[0]);
        System.out.println("Value of a after swap : "+result[1]);
    }
}
