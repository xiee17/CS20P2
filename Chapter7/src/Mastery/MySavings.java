package Mastery;

public class MySavings {

    private int penny;
    private int nickel;
    private int dime;
    private int quarter;

    // Default constructor
    public MySavings() {
        penny = 0;
        nickel = 0;
        dime = 0;
        quarter = 0;
    }

    public void addPenny(int amount) {
        penny += amount;
    }

    public void addNickel(int amount) {
        nickel += amount;
    }

    public void addDime(int amount) {
        dime += amount;
    }

    public void addQuarter(int amount) {
        quarter += amount;
    }

    public double getTotal() {
        return penny * 0.01 + nickel * 0.05 + dime * 0.10 + quarter * 0.25;
    }

    public void takeMoneyOut() {
        penny = 0;
        nickel = 0;
        dime = 0;
        quarter = 0;
    }
}
