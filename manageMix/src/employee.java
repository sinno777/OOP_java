public class employee extends person {
    private int numDayWork;
    private float incomePerDay;

    // get and set method
    public int getNumDayWork() {
        return numDayWork;
    }

    public void setNumDayWork(int numDayWork) {
        this.numDayWork = numDayWork;
    }

    public float getIncomePerDay() {
        return incomePerDay;
    }

    public void setIncomePerDay(float incomePerDay) {
        this.incomePerDay = incomePerDay;
    }

    // constructor method
    public employee() {

    }

    public employee(String name, String address, String id, String email, int numDayWork, float incomePerDay) {
        super(name, address,  id, email);
        this.numDayWork = numDayWork;
        this.incomePerDay = incomePerDay;
    }

    // input and output
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.print("NumDayWork: ");
        numDayWork = Integer.parseInt(scan.nextLine());
        System.out.print("IncomePerDay: ");
        incomePerDay = Float.parseFloat(scan.nextLine());
    }

    @Override
    public void ex() {
        super.ex();
        System.out.print("\tNumDayWork: " + numDayWork + "\tIncomePerDay: " + incomePerDay);
    }
    // business method

}
