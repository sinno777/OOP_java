import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // stu_list list = new stu_list();
        school school_V = new school();
        school_V.im_school();
        doMenu(scan, school_V);
    }

    public static void printMenu() {
        System.out.println("Choosen please!");
        System.out.println("1 to add student");
        System.out.println("2 to export list student");
        System.out.println("3 look student max average");
        System.out.println("0 close");
    }

    public static void doMenu(Scanner scan, school school) {
        boolean flag = true;
        do {
            printMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    student stu = new student();
                    stu.im_stu(scan);
                    school.addStu(stu);
                    break;
                case 2:
                    school.average();
                    school.resultStu();
                    school.ex_school();
                    break;
                case 3:
                    ArrayList<student> listMax = school.searchStuAverageMax();
                    for (student stuMax : listMax) {
                        stuMax.ex_stu();
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
