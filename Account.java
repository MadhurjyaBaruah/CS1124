class Account
{
    protected int accNo;
    protected String name;
    protected String address;
    protected String phoneNo;
    protected String dob;
    protected double balance;

    public Account(int accNo, String name, String address, String phoneNo, String dob, double balance)
    {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }
}

class SavingAccount extends Account
{
    public SavingAccount(int accNo, String name, String address, String phoneNo, String dob, double balance)
    {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
}

class AccountDemo
{
    public static void main(String[] args)
    {
        SavingAccount account = new SavingAccount(12345, "Raj", "Guwahati", "9999999999", "01-01-1990", 5000.0);

        System.out.println("Name: " + account.name);
        System.out.println("Address: " + account.address);
        System.out.println("Phone: " + account.phoneNo);
        System.out.println("DOB: " + account.dob);
        System.out.println("Balance: " + account.balance);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(10000);
    }
}