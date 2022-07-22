package entities;

public class Account {
    private Integer agency;
    private Integer number;
    private Double balance;

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
