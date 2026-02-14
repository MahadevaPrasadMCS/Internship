package Day_5.OOPs_in_Java;

public class GCD {
    public static int gcd_recursive(int n1, int n2)
    {
        int max_digit = Math.max(n1, n2);
        int min_digit = Math.min(n1, n2);

        if(min_digit == 0) return max_digit;

        return gcd_recursive(min_digit, max_digit % min_digit);
    }

    public static int gcd_iterative(int n1, int n2)
    {
        int max_digit = Math.max(n1, n2);
        int min_digit = Math.min(n1, n2);
        while (min_digit != 0)
        {
            int remainder = max_digit % min_digit;
            max_digit = min_digit;
            min_digit = remainder;
        }
        return max_digit;
    }

    public static void main(String [] args)
    {
        int num1 = 73, num2 = 6;
        int gcd = gcd_recursive(num1, num2);
        int gcd1 = gcd_iterative(num1, num2);

        System.out.println("The gcd of "+num1+" and "+num2+" is "+gcd);
        System.out.println("The gcd of "+num1+" and "+num2+" is "+gcd1);
    }
}
