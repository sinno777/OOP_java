import java.util.Scanner;

public class train_downTown extends train_parent {
    // field
    private String numTurn;
    private float indexKm;

    // get and set method
    public String getNumTurn() {
        return numTurn;
    }

    public void setNumTurn(String numTurn) {
        this.numTurn = numTurn;
    }

    public float getIndexKm() {
        return indexKm;
    }

    public void setIndexKm(float indexKm) {
        this.indexKm = indexKm;
    }

    // constructor
    public train_downTown() {
        super();
    }

    public train_downTown(String turnNumber, String busserName, int carNumber, int income,
            String numTurn, float indexKm) {
        super(turnNumber, busserName, carNumber, income);
        this.numTurn = numTurn;
        this.indexKm = indexKm;
    }

    // input and output method
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.println("NumTurn: ");
        this.numTurn = scan.nextLine();
        System.out.println("IndexKm: ");
        this.indexKm = Float.parseFloat(scan.nextLine());
    }

    @Override
    public void ex() {
        super.ex();
        System.out.println("\tNumTurn: " + numTurn + "\tIndexKm: " + indexKm);
    }
    // business method
}
