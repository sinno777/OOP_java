import java.util.ArrayList;

public class school {
    // field
    private stu_list student_List_entire;

    // get and set method
    public stu_list getStudent_List_entire() {
        return student_List_entire;
    }

    public void setStudent_List_entire(stu_list student_List_entire) {
        this.student_List_entire = student_List_entire;
    }

    // constructor
    public school() {
        setDefault();
    }

    private void setDefault() {
        this.student_List_entire = new stu_list();
    }

    // input and output method
    public void im_school() {
        student stu = new student("Lan", 1, 9.2f, 9, 9);
        this.student_List_entire.addStu(stu);
        stu = new student("Hung", 2, 4.2f, 4, 5.3f);
        this.student_List_entire.addStu(stu);
        stu = new student("Lan", 3, 7.2f, 4, 9);
        this.student_List_entire.addStu(stu);
        stu = new student("Yen", 4, 3.2f, 4, 4);
        this.student_List_entire.addStu(stu);
        stu = new student("Toan", 5, 9.2f, 9, 10);
        this.student_List_entire.addStu(stu);
        stu = new student("Huu", 6, 7.2f, 7, 6);
        this.student_List_entire.addStu(stu);
        stu = new student("Ly", 7, 3.2f, 3, 3);
        this.student_List_entire.addStu(stu);
        stu = new student("Trung", 8, 9.2f, 10, 10);
        this.student_List_entire.addStu(stu);
        stu = new student("Quyen", 9, 9, 7.2f, 8);
        this.student_List_entire.addStu(stu);
        stu = new student("Linh", 10, 5.2f, 5, 6);
        this.student_List_entire.addStu(stu);
    }

    public void ex_school() {
        this.student_List_entire.ex_list();
    }

    // business method

    public void addStu(student stu) {
        this.student_List_entire.addStu(stu);
    }

    public void average() {
        this.student_List_entire.average();
    }

    public void resultStu() {
        this.student_List_entire.resultStu();
    }

    public ArrayList<student> searchStuAverageMax() {
        return this.student_List_entire.searchStuAverageMax();
    }
}
