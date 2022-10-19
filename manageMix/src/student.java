public class student extends person {
    private int math;
    private int physical;
    private int chemistry;

    // get and set method
    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    // constructor
    public student () {
        
    }

    public student(String name, String address, String id, String email, int math, int physical, int chemistry) {
        super(name, address, id, email);
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    // input and output method
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.print("Math: ");
        math = Integer.parseInt(scan.nextLine());
        System.out.print("Physical: ");
        physical = Integer.parseInt(scan.nextLine());
        System.out.print("Chemistry: ");
        chemistry = Integer.parseInt(scan.nextLine());
    }

    @Override
    public void ex() {
        super.ex();
        System.out.print("\tMath: " + math + "\tPhysical: " + physical + "\tChemistry: " + chemistry);
    }
    // business method

}
