import java.util.Scanner;

public class train_parent {
    // field
    protected String turnNumber;
    protected String busserName;
    protected int carNumber;
    protected float income;

    // get and set method
    public String getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(String turnNumber) {
        this.turnNumber = turnNumber;
    }

    public String getBusserName() {
        return busserName;
    }

    public void setBusserName(String busserName) {
        this.busserName = busserName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    // constructor
    public train_parent() {
        this.busserName = "";
        this.income = 0;
    }

    public train_parent(String turnNumber, String busserName, int carNumber, int income) {
        this.turnNumber = turnNumber;
        this.busserName = busserName;
        this.carNumber = carNumber;
        this.income = income;
    }

    // input and output method
    public void im(Scanner scan) {
        System.out.println("TurnNumber: ");
        this.turnNumber = scan.nextLine();
        System.out.println("BusserName: ");
        this.busserName = scan.nextLine();
        System.out.println("CarNumber: ");
        this.carNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Income: ");
        this.income = Float.parseFloat(scan.nextLine());
    }

    public void ex() {
        System.out.print("TurnNumber: " + turnNumber + "\tBusserName: " + busserName +
                "\tCarNumber: " + carNumber + "\tIncome: " + income);
    }
    // business method
}
