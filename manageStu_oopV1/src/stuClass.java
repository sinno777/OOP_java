import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class stuClass {
    private String name;
    private String id;
    private float math_m;
    private float physical_m;
    private float chemistry_m;
    private float average;
    private String levelStu = "";

    // method main
    public stuClass() {

    }

    // method revol
    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return id;
    }

    public void setmath_m(float math_m) {
        this.math_m = math_m;
    }

    public float getmath_m() {
        return math_m;
    }

    public void setphysical_m(float physical_m) {
        this.physical_m = physical_m;
    }

    public float getphysical_m() {
        return physical_m;
    }

    public void setchemistry_m(float chemistry_m) {
        this.chemistry_m = chemistry_m;
    }

    public float getchemistry_m() {
        return chemistry_m;
    }

    public String getlevelStu() {
        return levelStu;
    }

    // method xl
    public void average() {
        this.average = (math_m + physical_m + chemistry_m) / 3;
    }

    public void levelStu() {
        if (this.average >= 0 && this.average >= 9)
            this.levelStu = "Excellent!!!";
        else if (this.average >= 8)
            this.levelStu = "Good!";
        else if (this.average >= 7)
            this.levelStu = "temp good";
        else if (this.average >= 6)
            this.levelStu = "medium";
        else if (this.average >= 5)
            this.levelStu = "Bad";
        else
            this.levelStu = "very bad, not mentions!";
    }

    // method export and import
    public void im(Scanner scan) {
        System.out.println("Your mame: ");
        this.name = scan.nextLine();
        System.out.println("Your id: ");
        this.id = scan.nextLine();
        System.out.println("m: ");
        this.math_m = Float.parseFloat(scan.nextLine());
        System.out.println("p: ");
        this.physical_m = Float.parseFloat(scan.nextLine());
        System.out.println("c: ");
        this.chemistry_m = Float.parseFloat(scan.nextLine());
    }

    public void ex() {
        System.out.println("Name: " + name + " and id: " + id + "\nYour mark math - physical - chemistry: "
                + math_m + " - " + physical_m + " - " + chemistry_m
                + " \n- average: " + average + "\n--->Your level: " + levelStu
                +"\n-----------------------------------------------------");
    }
}