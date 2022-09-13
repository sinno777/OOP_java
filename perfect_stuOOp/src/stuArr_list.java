import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

/*
 * people create: KhoaSN
 * Aim: Manage Student
 * Date: 1/9/2022
 * Versions: 1.0
 * Bonus: together with stuClass.java to finish this pj
 */
public class stuArr_list {
    // 1 field
    private ArrayList<stuClass> stuList;
    // private stuClass stu;

    // 2 get and set method
    public ArrayList<stuClass> getstuList() {
        return stuList;
    }

    public void setstuList(ArrayList<stuClass> stuList) {
        this.stuList = stuList;
    }

    // 3 method main and to save performent - we need just involk when we call it to
    // that use method
    public stuArr_list() {// remember name class is important
        setUpDefault();
    }

    private void setUpDefault() {
        this.stuList = new ArrayList<stuClass>();
    }


    // 4 input and output method
    // Because this is a arrayList of sudent, so we must use loop, special loop_each
    public void im_List(Scanner scan) {
        for (stuClass stu : stuList) {
            stu.im(scan);
        }
    }

    public void ex_list() {
        for (stuClass stu : stuList) {
            stu.ex();
        }
    }

    public void addStu(stuClass stu) {
        this.stuList.add(stu);
    }

    // 5 business method
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
    // if (this.stuList.size() > 0) { // less 1 member in stuList
    // stuClass stuMax = this.stuList.get(0);
    // for (stuClass stuCurrent : this.stuList) {
    // if (stuCurrent.getaverage() > stuMax.getaverage()) {
    // stuMax = stuCurrent;
    // }
    // }
    // for (stuClass stuCurrent : this.stuList) {
    // if (stuCurrent.getaverage() == stuMax.getaverage()) {
    // listMax.add(stuCurrent);
    // }
    // }
    // }
    // return listMax;
    // }

    public ArrayList<stuClass> searchStuAverageMax() {
        ArrayList<stuClass> listMax = new ArrayList<stuClass>();
        if (this.stuArr_list.size() > 0) { // less 1 member in stuList
            stuClass stuMax = this.stuArr_list.get(0);
            int firstPos = 0;
            for (int i = 0; i < this.stuArr_list.size(); i++) {
                stuClass stuCurrent = this.stuArr_list.get(i);
                if (stuCurrent.getaverage() > stuMax.getaverage()) {
                    stuMax = stuCurrent;
                    firstPos = i;
                }
            }
            // add max average student in listMax
            listMax.add(stuMax);
            // remember
            for (int i = firstPos + 1; i < this.stuArr_list.size(); i++) {
                stuClass stuCurrent = this.stuArr_list.get(i);
                if (stuCurrent.getaverage() == stuMax.getaverage()) {
                    listMax.add(stuCurrent);
                }
            }
        }
        return listMax;
    }
}
