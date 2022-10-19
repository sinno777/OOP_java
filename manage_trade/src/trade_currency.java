import java.util.Scanner;  
public class trade_currency extends trade {
    // field
    private float rate;
    private int typeCurrency;

    // get and set method
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getTypeCurrency() {
        return typeCurrency;
    }

    public void setTypeCurrency(int typeCurrency) {
        this.typeCurrency = typeCurrency;
    }

    // constructor
    public trade_currency() {

    }

    public trade_currency(int idTrade, int day, int month, int year, float price, int summary, float rate,
            int typeCurrency) {
        super(idTrade, day, month, year, price, summary);
        this.rate = rate;
        this.typeCurrency = typeCurrency;
    }

    // input and output method
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.print("\tRate: ");
        this.rate = Float.parseFloat(scan.nextLine());
        System.out.print("\t1.VND, 2.USD, 3.EURO: ");
        this.typeCurrency = Integer.parseInt(scan.nextLine());
    }

    @Override
    public void ex() {
        super.ex();
        System.out.print("\tRate: " + rate);
        sumCostCrash();
    }

    // business method
    @Override
    public void sumCostCrash() {
        String tempt = "";
        if (this.typeCurrency == 1)
            tempt = "VND";
        else if (this.typeCurrency == 2)
            tempt = "USD";
        else
            tempt = "EURO";
        this.costCrash = this.rate * this.summary + this.price;
        //System.out.print("Result: " + costCrash + " " + tempt);
    }
}