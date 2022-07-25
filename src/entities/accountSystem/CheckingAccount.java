package entities.accountSystem;

public class CheckingAccount extends Account implements Taxable{

    public CheckingAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public boolean withdraw(double value){
        double amountWithdraw = value + 0.2;
        return super.withdraw(amountWithdraw);
    }

    @Override
    public double getAmountTax() {
        return super.balance * 0.01;
    }
}
