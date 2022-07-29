package entities.accountSystem;

public class LifeInsurance implements Taxable{

    @Override
    public double getAmountTax() {
        return 42;
    }
}
