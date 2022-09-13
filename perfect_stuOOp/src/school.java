import java.util.ArrayList;

public class school {
    // field
    private stuArr_list stuList_entire;
    /*
     * private stuList "others list";
     * ...
     */

    // get and set method
    public stuArr_list getStuList_entire() {
        return stuList_entire;
    }

    public void setStuList_entire(stuArr_list stuList_entire) {
        this.stuList_entire = stuList_entire;
    }

    // constructor
    // public void setUpDefault() {
    //     this.stuList_entire = new school();
    //     // ... others method ex: list University
    // }
    
    public school() {
        this.stuList_entire = new stuArr_list();
        // setUpDefault();
    }

    // input and output method
    public void imSc() { // pesudo data
        stuClass stu = new stuClass("Lan", 1, 9.2f, 9, 9);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Hung", 2, 4.2f, 4, 5.3f);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Lan", 3, 7.2f, 4, 9);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Yen", 4, 3.2f, 4, 4);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Toan", 5, 9.2f, 9, 10);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Huu", 6, 7.2f, 7, 6);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Ly", 7, 3.2f, 3, 3);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Trung", 8, 9.2f, 10, 10);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Quyen", 9, 9, 7.2f, 8);
        this.stuList_entire.addStu(stu);
        stu = new stuClass("Linh", 10, 5.2f, 5, 6);
        this.stuList_entire.addStu(stu);
    }

    public void ex() {
        this.stuList_entire.ex_list();
    }

    // business method -- can a lot of list others student
    public void average() {
        this.stuList_entire.average();

    }

    public void levelStu() {
        this.stuList_entire.levelStu();
    }

    public void addStu(stuClass stu) {
        this.stuList_entire.addStu(stu);
    }

    public ArrayList<stuClass> searchStuAverageMax() {
        return this.stuList_entire.searchStuAverageMax();
    }

}
