import java.util.Scanner;

public class train_suburb extends train_parent {
    // field
    private String destination;
    private float numDayRun;

    // get and set method
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getNumDayRun() {
        return numDayRun;
    }

    public void setNumDayRun(float numDayRun) {
        this.numDayRun = numDayRun;
    }

    // constructor
    public train_suburb() {
        super();
    }

    public train_suburb(String turnNumber, String busserName, int carNumber, int income,
            String destination, float numDayRun) {
        super(turnNumber, busserName, carNumber, income);
        this.destination = destination;
        this.numDayRun = numDayRun;
    }

    // input and output method
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.println("Destination: ");
        destination = scan.nextLine();
        System.out.println("NumDayRun: ");
        numDayRun = Float.parseFloat(scan.nextLine());
    }

    @Override
    public void ex() {
        super.ex();
        System.out.println("\tDestination: " + destination + "\tNumDayRun" + numDayRun);
    }
    // business method
}
