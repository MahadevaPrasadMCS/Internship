import java.util.Scanner;

class Addition_with_input
{
    public static void main(String[] args)
    {
        int a, b;
        int sum;
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        a = scr.nextInt();

        System.out.println("Enter your second number: ");
        b = scr.nextInt();

        sum = a + b;

        System.out.println("Sum of your two numbers is : " + sum);
    }
}