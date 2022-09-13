import java.util.ArrayList;
import java.util.Scanner;

public class stu_list {
    // field
    private ArrayList<student> student_List; // this is a parent list

    // get and set method
    public ArrayList<student> getStudent_List() {
        return student_List;
    }

    public void setStudent_List(ArrayList<student> student_List) {
        this.student_List = student_List;
    }

    // constructor
    public stu_list() {
        setDefault();
    }

    private void setDefault() {
        this.student_List = new ArrayList<student>(); // was new student_List
    }

    // input and output method
    public void im_list(Scanner scan) {
        for (student stu : student_List) {
            stu.im_stu(scan);
        }
    }

    public void ex_list() {
        for (student stu : student_List) {
            stu.ex_stu();
        }
    }

    // method business
    public void addStu(student stu) {
        this.student_List.add(stu);
    }

    public void average() {
        for (student stu : student_List) {
            stu.average();
        }
    }

    public void resultStu() {
        for (student stu : student_List) {
            stu.resultStu();
        }
    }

    public ArrayList<student> searchStuAverageMax() {
        ArrayList<student> listMax = new ArrayList<student>();
        if (this.student_List.size() > 0) {
            student stuMax = student_List.get(0);
            int firstPos = 0;
            for (int i = 0; i < student_List.size(); i++) {
                student stuCurrent = this.student_List.get(i);
                if (stuMax.getAverage() < stuCurrent.getAverage()){
                    stuMax = stuCurrent;
                    firstPos = i;
                } 
            }
            // add member average max into listMax
            listMax.add(stuMax);

            for (int i = firstPos + 1; i < student_List.size(); i++) {
                student stuCurrent = this.student_List.get(i);
                if(stuCurrent.getAverage() == stuMax.getAverage()) {
                    listMax.add(stuCurrent);
                }
            }
        }
        return listMax;
    }
}
