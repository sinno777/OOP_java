import java.util.Scanner;

public class stuClass {
    private String name;
    private int id;
    private float math_m;
    private float physical_m;
    private float chemistry_m;
    private float average; // non set method
    private String levelStu = ""; // non set method

    // 2 get and set method
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

    public String getLevelStu() {
        return levelStu;
    }

    // constructor or method main
    public stuClass() {

    }

    public stuClass(String name, int id, float m, float p, float c) {
        this.name = name;
        this.id = id;
        this.math_m = m;
        this.physical_m = p;
        this.chemistry_m = c;
    }

    // input and output method
    public void im(Scanner scan) {
        System.out.println("name: ");
        this.name = scan.nextLine();
        System.out.println("Your id: ");
        this.id = Integer.parseInt(scan.nextLine());
        checkMath(scan);
    }

    public void ex() {
        System.out.println("Id: " + id + "\tName: " + name
                + "\tmath: " + math_m + "\t physical: " + physical_m + "\t   chemistry: " + chemistry_m
                + "\tAverage: " + average + "\tYour level: " + levelStu +
                "\n----------------------------------------------------------------------------------");
    }

    // business method
    public void checkMath(Scanner scan) {
        boolean flag = true;
        do {
            System.out.println("m: ");
            this.math_m = Float.parseFloat(scan.nextLine());
            System.out.println("p: ");
            this.physical_m = Float.parseFloat(scan.nextLine());
            System.out.println("c: ");
            this.chemistry_m = Float.parseFloat(scan.nextLine());
            if ((this.math_m > 10.0 || this.physical_m > 10.0 || this.chemistry_m > 10.0) ||
                    (this.math_m < 0 || this.physical_m < 0 || this.chemistry_m < 0)) {
                flag = false;
                System.out.println("Please again!");
            } else
                flag = true;
        } while (!flag);
    }

    public void average() {
        this.average = (math_m + physical_m + chemistry_m) / 3;
    }

    public void levelStu() {
        if (average >= 0 && average >= 9)
            levelStu = "Excellent!!!";
        else if (this.average >= 8)
            levelStu = "good";
        else if (this.average >= 7)
            levelStu = "temp good";
        else if (this.average >= 6)
            levelStu = "medium";
        else if (this.average >= 5)
            levelStu = "bad";
        else
            levelStu = "very very bad";
    }

}
