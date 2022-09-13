import java.util.Scanner;

public class student {
    // field
    private String name;
    private int id;
    private float math_m;
    private float physical_m;
    private float chemistry_m;
    private float average;
    private String resultStu = "";

    // get and set method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMath_m() {
        return math_m;
    }

    public void setMath_m(float math_m) {
        this.math_m = math_m;
    }

    public float getPhysical_m() {
        return physical_m;
    }

    public void setPhysical_m(float physical_m) {
        this.physical_m = physical_m;
    }

    public float getChemistry_m() {
        return chemistry_m;
    }

    public void setChemistry_m(float chemistry_m) {
        this.chemistry_m = chemistry_m;
    }

    public float getAverage() {
        return average;
    }

    public String getResultStu() {
        return resultStu;
    }

    // constructor
    public student() {

    }

    public student(String name, int id, float m, float p, float c) {
        this.name = name;
        this.id = id;
        this.math_m = m;
        this.physical_m = p;
        this.chemistry_m = c;
    }

    // input and output method
    public void im_stu(Scanner scan) {
        System.out.println("name: ");
        this.name = scan.nextLine();
        System.out.println("Your id: ");
        this.id = Integer.parseInt(scan.nextLine());
        System.out.println("m: ");
        this.math_m = Float.parseFloat(scan.nextLine());
        System.out.println("p: ");
        this.physical_m = Float.parseFloat(scan.nextLine());
        System.out.println("c: ");
        this.chemistry_m = Float.parseFloat(scan.nextLine());
    }

    public void ex_stu() {
        System.out.println("Id: " + id + "\tName: " + name
                + "\tmath: " + math_m + "\t physical: " + physical_m + "\t   chemistry: " + chemistry_m
                + "\tAverage: " + average + "\tYour level: " + resultStu +
                "\n----------------------------------------------------------------------------------");
    }

    // method
    public void average() {
        this.average = (math_m + physical_m + chemistry_m) / 3;
    }

    public void resultStu() {
        if (average >= 0 && average >= 9)
            resultStu = "Excellent!!!";
        else if (this.average >= 8)
            resultStu = "good";
        else if (this.average >= 7)
            resultStu = "temp good";
        else if (this.average >= 6)
            resultStu = "medium";
        else if (this.average >= 5)
            resultStu = "bad";
        else
            resultStu = "very very bad";
        System.out.println(resultStu);

    }
}