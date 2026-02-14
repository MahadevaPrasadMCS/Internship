package day_4.Oops_Java;

abstract class Payment
{
    protected double amount;
    Payment(double amt)
    {
        this.amount = amt;
    }

    abstract void makePayment();

    public void printReceipt()
    {
        System.out.println("Payment of "+amount+" processed successfully\n");
    }
}

class CreditCardPayment extends Payment
{
    CreditCardPayment(double amt)
    {
        super(amt);
    }
    public void makePayment()
    {
        System.out.println("Processing credit card payment of "+amount);
    }
}

class UPIPayment extends Payment
{
    UPIPayment(double amt)
    {
        super(amt);
    }
    public void makePayment()
    {
        System.out.println("Processing UPI payment of "+amount);
    }
}

public class Abstraction {
    public static void main(String [] args)
    {
        CreditCardPayment ccp = new CreditCardPayment(1500.00);
        ccp.makePayment();
        ccp.printReceipt();

        UPIPayment up = new UPIPayment(800.0);
        up.makePayment();
        up.printReceipt();
    }
}
