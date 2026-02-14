package Day_5.OOPs_in_Java;

class Armstrong
{
    public boolean armstrongChecker_String(int num)
    {
        String str = String.valueOf(num);
        int digits = str.length();
        int sum = 0;
        for(int i=0; i<digits; i++)
        {
            int n = str.charAt(i) - '0';
            sum += (int) Math.pow(n,digits);
        }
        return sum == num;
    }

    public boolean armstrongChecker_Divisor(int num)
    {
        int digits = String.valueOf(num).length();
        int sum = 0;
        int n1 = num;
        while(n1 > 0)
        {
            int n = n1 % 10;
            sum += (int) Math.pow(n, digits);
            n1 = (n1-n) / 10;
        }
        return sum == num;
    }
}

public class Is_Armstrong
{
    public static void main(String [] args)
    {
        int num = 9474;
        Armstrong arm = new Armstrong();
        boolean result = arm.armstrongChecker_Divisor(num);

        if(result)
        {
            System.out.println("The number "+num+" is Armstrong number");
        }
        else
        {
            System.out.println("The number "+num+" is not an Armstrong number");
        }
    }
}
