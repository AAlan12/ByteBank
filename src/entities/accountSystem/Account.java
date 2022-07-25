package entities.accountSystem;

public abstract class Account {
    private int agency;
    private int number;
    protected double balance;
    private AccountHolder holder;
    private static int total = 0;

    public Account(){

    }

    public  Account(int agency, int number){
        Account.total ++;
        System.out.println("Total accounts: " +Account.total);
        System.out.println();
        this.agency = agency;
        this.number = number;
        System.out.println("Account is being created " +this.number);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        if(agency <=0){
            System.out.println("Cannot value less than 0");
            return;
        }
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number <= 0){
            System.out.println("Cannot value less than 0");
            return;
        }
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountHolder getHolder() {
        return holder;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public static int getTotal(){
        return Account.total;
    }

    public abstract void deposit(double value);

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }else {
            return false;
        }
    }

    public  boolean transfer(double value, Account account){
        if(this.balance >value){
            this.balance -= value;
            account.deposit(value);
            return true;
        }
        return false;
    }

}
