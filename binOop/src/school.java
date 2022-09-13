import java.util.ArrayList;

public class school {
    // field
    private stuList stuList_entire;
    /*
     * private stuList "others list";
     * ...
     */

    // get and set method
    public stuList getStuList_entire() {
        return stuList_entire;
    }

    public void setStuList_entire(stuList stuList_entire) {
        this.stuList_entire = stuList_entire;
    }

    // constructor
    public school() {
        this.stuList_entire = new stuList(); // must new oj
    }

    // input and output method
    public void imSchool() { // pesudo data
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
        this.stuList_entire.exList();
    }

    // business method -- can a lot of list others student
    public void addStu(stuClass stu) { // admit import student in school
        this.stuList_entire.addStu(stu);
    }

    public void average() {
        this.stuList_entire.average();

    }

    public void levelStu() {
        this.stuList_entire.levelStu();
    }

    public ArrayList<stuClass> searchStuAverageMax() { // remember
        return this.stuList_entire.searchStuAverageMax();
    }

    public ArrayList<stuClass> lookForBadStu() {
        return this.stuList_entire.lookForBadStu();
    }

    public void im_helper(ArrayList<stuClass> list) {
        for (stuClass stu : list) {
            stu.ex();
        }
    }

    public ArrayList<stuClass> searchStuName(String name) {
        // ArrayList<stuClass> listName = new ArrayList<stuClass>();
        // for (stuClass stu : this.stuList_entire.getStuList()) {
        //     if(stu.getName().equalsIgnoreCase(name)){
        //         listName.add(stu);
        //     }
        // }
        // return listName; 
        return this.stuList_entire.searchStuName(name);
    }

    public stuClass lookForId(int id) {
        return this.stuList_entire.lookForId(id);
    }

    public boolean deletedStuFromId(int id){
        return this.stuList_entire.deletedStuFromId(id);
    }

}
