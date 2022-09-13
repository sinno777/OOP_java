import java.util.ArrayList;
import java.util.Scanner;

public class stuList {
    // field
    private ArrayList<stuClass> stuList;

    // get and set method
    public ArrayList<stuClass> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<stuClass> stuList) {
        this.stuList = stuList;
    }

    // constructor
    public stuList() {
        setDefault();
    }

    private void setDefault() {
        this.stuList = new ArrayList<stuClass>();
    }

    // input and output method --> must loop ForEach
    public void imList(Scanner scan) {
        for (stuClass stu : stuList) {
            stu.im(scan);
        }
    }

    public void exList() {
        for (stuClass stu : stuList) {
            stu.ex();
        }
    }

    public void addStu(stuClass stu) { // just loop member invidual
        this.stuList.add(stu);
    }

    // business method
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

    // public ArrayList<stuClass> searchStuAverageMax() {
    // ArrayList<stuClass> listMax = new ArrayList<stuClass>();
    // stuClass stuMax = this.stuList.get(0);
    // for (stuClass stuCurrent : this.stuList) {
    // if (stuCurrent.getAverage() > stuMax.getAverage()) {
    // stuMax = stuCurrent;
    // }
    // }
    // for (stuClass stuCurrent : this.stuList) {
    // if (stuCurrent.getAverage() == stuMax.getAverage()) {
    // listMax.add(stuCurrent);
    // }
    // }
    // return listMax;
    // }

    public ArrayList<stuClass> searchStuAverageMax() {
        ArrayList<stuClass> listMax = new ArrayList<stuClass>();
        if (this.stuList.size() > 0) { // less 1 member in stuList
            stuClass stuMax = this.stuList.get(0);
            int firstPos = 0;
            for (int i = 0; i < this.stuList.size(); i++) {
                stuClass stuCurrent = this.stuList.get(i);
                if (stuCurrent.getAverage() > stuMax.getAverage()) {
                    stuMax = stuCurrent;
                    firstPos = i;
                }
            }
            // add max average student in listMax
            listMax.add(stuMax);
            // remember
            for (int i = firstPos + 1; i < this.stuList.size(); i++) {
                stuClass stuCurrent = this.stuList.get(i);
                if (stuCurrent.getAverage() == stuMax.getAverage()) {
                    listMax.add(stuCurrent);
                }
            }
        }
        return listMax;
    }

    public ArrayList<stuClass> lookForBadStu() {
        ArrayList<stuClass> listBadStu = new ArrayList<stuClass>();
        if (this.stuList.size() > 0) {
            // stuClass stuBad = this.stuList.get(0);
            for (stuClass stu : this.stuList) {
                if (stu.getAverage() < 5) {
                    listBadStu.add(stu);
                }
            }
        }
        return listBadStu;
    }

    public ArrayList<stuClass> searchStuName(String name) {
        ArrayList<stuClass> list = new ArrayList<stuClass>();
        if (this.stuList.size() > 0) {
            for (stuClass stu : stuList) {
                if (stu.getName().equalsIgnoreCase(name)) {
                    list.add(stu);
                }
            }
        }
        return list;
    }

    public stuClass lookForId(int id) { // just return a particular id, so i must one stuClass student
        stuClass stuId = null;
        for (stuClass stu : this.stuList) {
            if (stu.getId() == id) {
                stuId = stu;
                break;
            }
        }
        return stuId;
    }

    public boolean deletedStuFromId(int id) { // just return a particular id, so i must one stuClass student
        boolean stuDel = false;
        for (stuClass stu : this.stuList) {
            if (stu.getId() == id) {
                this.stuList.remove(stu);
                stuDel = true;
                break;
            }
        }
        return stuDel; // sumary deletedStuFromId wasn't deleted student , so non return type data stuClass
    }

}
