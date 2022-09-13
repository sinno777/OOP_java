import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // create a list consist of multi student
        school stSchool = new school();
        stSchool.imSc();
        doMenu(scan, stSchool);

    }

    public static void printMenu() { // remember static
        System.out.println("Choosen please!");
        System.out.println("1 to add student");
        System.out.println("2 to export list student");
        System.out.println("3 loop average max in list student");
        System.out.println("0 close"); // when falg = false
    }

    // do menu + switch to filter conditions
    public static void doMenu(Scanner scan, school stSchool) {
        boolean flag = true;
        do {
            printMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    stuClass stu = new stuClass();
                    stu.im(scan);
                    stSchool.addStu(stu);
                    break;
                case 2:
                    stSchool.average();
                    stSchool.levelStu();
                    stSchool.ex();
                    break;
                case 3:
                    ArrayList<stuClass> listMax = stSchool.searchStuAverageMax();
                    for (stuClass stumax : listMax) {
                        stumax.ex();
                    }
                    break;

                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
