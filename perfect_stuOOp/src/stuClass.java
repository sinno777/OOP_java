
/*
 * people create: KhoaSN
 * Aim: Manage Student
 * Date: 1/9/2022
 * Versions: 1.0
 */
import java.util.Scanner;

public class stuClass {
    // 1 field
    private String name;
    private int id;
    private float math_m;
    private float physical_m;
    private float chemistry_m;
    private float average;
    private String levelStu = "";

    // 2 method main
    public stuClass() {

    }

    public stuClass(String name, int id, float m, float p, float c) {
        this.name = name;
        this.id = id;
        this.math_m = m;
        this.physical_m = p;
        this.chemistry_m = c;
    }

    // get and set method
    public void getname(String name) {
        this.name = name;
    }

    public String setname() {
        return name;
    }

    public void getid(int id) {
        this.id = id;
    }

    public int setid() {
        return id;
    }

    public void getmath_m(float math_m) {
        this.math_m = math_m;
    }

    public float setmath_m() {
        return math_m;
    }

    public void getphysical_m(float physical_m) {
        this.physical_m = physical_m;
    }

    public float setphysical_m() {
        return physical_m;
    }

    public void getchemistry_m(float chemistry_m) {
        this.chemistry_m = chemistry_m;
    }

    public float setchemistry_m() {
        return chemistry_m;
    }

    public float getaverage() {
        return average;
    }

    public String getlevelStu() {
        return levelStu;
    }

    // 3 method input and output
    public void im(Scanner scan) {
        System.out.println("Your name: ");
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

    public void ex() {
        System.out.println(
                "Id: " + id + "\tName: " + name
                    + "\tmath: " + math_m + "\t physical: " + physical_m + "\t   chemistry: " + chemistry_m
                    + "\tAverage: " + average + "\tYour level: " + levelStu +
                    "\n----------------------------------------------------------------------------------");
    }

    // 4 method business
    public void average() {
        this.average = (math_m + physical_m + chemistry_m) / 3;
    }

    public void levelStu() {
        if (this.average >= 0 && this.average >= 9)
            levelStu = "Excellent!!!!";
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
        // System.out.println(levelStu);
    }
}
// sumary is issue just solve 1 small part, still rest is wanna import very
// student . We must use method arrayList or linklist. In fact, when we working
// on
// we will be see we pro when we use arrayList or linklist to apply into real
// proeject
// So current, we should best practice this method.
// all right! next class in vs code to i show you see mark emphasise produce
// stuArr_list.java