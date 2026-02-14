package Day_5.OOPs_in_Java;

class Prime
{
    public boolean prime_checker(int num)
    {
       if(num == 0 || num == 1)
       {
           return false;
       }
       for(int i=2; i<num; i++) {
           if (num % i != 0)
           {
               continue;
           }
               return false;
           }
        return true;
       }
    }

public class IsPrime
{
    public static void main(String[] args)
    {
        int num = 5;
        Prime prm = new Prime();
        boolean result = prm.prime_checker(num);
        if (result)
        {
            System.out.println("Your number is Prime");
        }
        else
        {
            System.out.println("Your number is not a Prime");
        }
    }
}
