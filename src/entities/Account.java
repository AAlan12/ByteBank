package entities;

public class Account {
    private Integer agency;
    private Integer number;
    private Double balance;
    private AccountHolder holder;
    private static int total;

    public Account(){

    }

    public  Account(Integer agency, Integer number){
        Account.total ++;
        System.out.println("Total accounts: " +Account.total);
        System.out.println();
        this.agency = agency;
        this.number = number;
        System.out.println("Account is being created " +this.number);
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
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

    public void deposit(double value){
        this.balance += value;
    }

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
