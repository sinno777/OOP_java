import java.util.ArrayList;
import java.util.Scanner;

public class stuList {
    // 1 field
    private ArrayList<stuClass> stuList;
    private stuList stu;

    // 2 get, set method
    public ArrayList<stuClass> getstuList() {
        return stuList;
    }

    public void setstuList(ArrayList<stuClass> stuList) {
        this.stuList = stuList;
    }
    
    // constructor
    private void setUpDefault() {
        this.stuList = new ArrayList<stuClass>();
    }

    public stuList() {
        setUpDefault();
    }

    // 3 input, output method
    public void im(Scanner scan) {
        for (stuClass stu : stuList) {
            stu.im(scan);
        }
    }

    public void ex() {
        for (stuClass stu : stuList) {
            stu.ex();
        }
    }

    public void addStu(stuClass stu) {
        this.stuList.add(stu);
    }

    // 4 business method
    public void average() {
        for (stuClass stu : stuList) {
            stu.average();
        }
    }

    public void levelStu() {
        for (stuClass stu : stuList) {
            stu.levelStu();
        }

    }

}
