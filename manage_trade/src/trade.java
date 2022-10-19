import java.util.Scanner;  
public class trade {
    // field
    protected int idTrade;
    protected int day;
    protected int month;
    protected int year;
    protected float price;
    protected int summary;
    protected float costCrash;

    // get and set method
    public int getIdTrade() {
        return idTrade;
    }

    public void setIdTrade(int idTrade) {
        this.idTrade = idTrade;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = summary;
    }

    public float getCostCrash() {
        return costCrash;
    }

    // constructor
    public trade() {

    }

    public trade(int idTrade, int day, int month, int year, float price, int summary) {
        this.idTrade = idTrade;
        this.day = day;
        this.month = month;
        this.year = year;
        this.price = price;
        this.summary = summary;
    }

    // input and output method
    public void im(Scanner scan) {
        System.out.print("idTrade: ");
        this.idTrade = Integer.parseInt(scan.nextLine());
        System.out.print("day: ");
        this.day = Integer.parseInt(scan.nextLine());
        System.out.print("month: ");
        this.month = Integer.parseInt(scan.nextLine());
        System.out.print("year: ");
        this.year = Integer.parseInt(scan.nextLine());
        System.out.print("price: ");
        this.price = Float.parseFloat(scan.nextLine());
        System.out.print("summary: ");
        this.summary = Integer.parseInt(scan.nextLine());
    }

    public void ex() {
        System.out.print("\nIdtrade: " + idTrade + "\tDay: " + day + "\tMonth: " + month + "\tYear: " + year
                + "\tPrice: " + price + "\tSummary: " + summary);
    }
    // business method
    public void sumCostCrash(){
        this.costCrash = 0;
    }
}
