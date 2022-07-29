package entities.accountSystem;

public class TaxCalculator {
    private double totaltax;

    public  void register(Taxable taxable){
        double value = taxable.getAmountTax();
        this.totaltax += value;
    }

    public  double getTotaltax(){
        return totaltax;
    }
}
