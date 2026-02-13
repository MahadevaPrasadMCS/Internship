package OOPs_in_Java;

class BankAccount
{
    private final String accountHolderName;
    private final String accountNumber;
    private double balance;

    BankAccount(String accountHolderName, String accountNumber, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid deposit amount");
            return;
        }

        System.out.println("Deposited: "+amount);
        balance += amount;

    }
    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("withdrawn: "+amount);
        balance -= amount;

    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccountDetails()
    {
        return "Account Holder: " + getAccountHolderName() + ", Account Number: " + getAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

class BankSystem
{
    static void main()
    {
        BankAccount account = new BankAccount("Prasad","41362327598",5000.0);
        System.out.println(account.getAccountDetails());
        account.deposit(5000.0);
        account.withdraw(2000.0);
        System.out.println("Current Balance: "+account.getBalance());
    }
}