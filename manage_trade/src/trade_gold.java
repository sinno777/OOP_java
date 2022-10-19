import java.util.Scanner;  
public class trade_gold extends trade {
    // field
    private String typeGold;

    // get and set method
    public String getTypeGold() {
        return typeGold;
    }

    public void setTypeGold(String typeGold) {
        this.typeGold = typeGold;
    }

    // constructor
    public trade_gold() {

    }

    public trade_gold(int idTrade, int day, int month, int year, float price, int summary, String typeGold) {
        super(idTrade, day, month, year, price, summary);
        this.typeGold = typeGold;
    }

    // input and output method\
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.print("TypeGold: ");
        this.typeGold = scan.nextLine();
    }
    
    @Override
    public void ex() {
        super.ex();
        System.out.println("TypeGold: " + typeGold + "\tSumCostCrash: " + costCrash);
    }

    // business method
    @Override
    public void sumCostCrash() {
        this.costCrash = this.price * this.summary;
    }
}
