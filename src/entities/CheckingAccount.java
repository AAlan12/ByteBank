package entities;

public class CheckingAccount extends Account{

    public CheckingAccount(Integer agency, Integer number){
        super(agency, number);
    }

    @Override
    public boolean withdraw(double value){
        double amountWithdraw = value + 0.2;
        return super.withdraw(amountWithdraw);
    }
}
