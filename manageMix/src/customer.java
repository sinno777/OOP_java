public class customer extends person {
    private String nameFirm;
    private int rateBill;
    private String rate;

    // get and set method
    public String getNameFirm() {
        return nameFirm;
    }

    public void setNameFirm(String nameFirm) {
        this.nameFirm = nameFirm;
    }

    public int getRateBill() {
        return rateBill;
    }

    public void setRateBill(int rateBill) {
        this.rateBill = rateBill;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    // constructor
    public customer() {

    }

    public customer(String name, String address, String id, String email, String nameFirm, int rateBill, String rate) {
        super(name, address,  id, email);
        this.nameFirm = nameFirm;
        this.rateBill = rateBill;
        this.rate = rate;
    }

    // input and output method
    @Override
    public void im(Scanner scan) {
        super.im(scan);
        System.out.print("NameFirm: ");
        nameFirm = scan.nextLine();
        System.out.print("RateBill: ");
        rateBill = Integer.parseInt(scan.nextLine());
        System.out.print("Rate: ");
        rate = scan.nextLine();
    }

    @Override
    public void ex() {
        super.ex();
        System.out.print("\tNameFirm: " + nameFirm + "\tRateBill: " + rateBill + "\tRate: " + rate);
    }
    // business method

}
