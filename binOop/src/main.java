import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // stuList list = new stuList(); // like to stuClass stu = new stuClass();
        school school_V = new school();
        school_V.imSchool();
        doMenu(scan, school_V);

    }

    public static void listMenu() {
        System.out.println("Choosen please!");
        System.out.println("1 to add student");
        System.out.println("2 to export list student");
        System.out.println("3 look student max average");
        System.out.println("4 look student bad average");
        System.out.println("5 look \"name\" student");
        System.out.println("6 look \"id\" student");
        System.out.println("7 deleted student from \"id\"");
        System.out.println("0 close");
    }

    public static void doMenu(Scanner scan, school school_V) {
        boolean flag = true;
        do {
            listMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    stuClass stu = new stuClass();
                    stu.im(scan);
                    school_V.addStu(stu);
                    break;
                case 2:
                    school_V.average();
                    school_V.levelStu();
                    school_V.ex();
                    break;
                case 3:
                    ArrayList<stuClass> listMax = school_V.searchStuAverageMax();
                    school_V.im_helper(listMax);
                    break;
                case 4:
                    ArrayList<stuClass> listStuBad = school_V.lookForBadStu();
                    school_V.im_helper(listStuBad);
                    break;
                case 5:
                    System.out.println("Name student need search: ");
                    String name = scan.nextLine();
                    ArrayList<stuClass> listName = school_V.searchStuName(name);
                    school_V.im_helper(listName);
                    break;
                case 6:
                    System.out.println("Id student need search: ");
                    int id = Integer.parseInt(scan.nextLine());
                    stuClass stuId = school_V.lookForId(id);
                    if (stuId != null) {
                        stuId.ex();
                    } else
                        System.out.println("Non see this student or student wasn't import");
                    break;
                case 7:
                    System.out.println("Deleted student from id: ");
                    int idDel = Integer.parseInt(scan.nextLine());
                    Boolean idDelSt = school_V.deletedStuFromId(idDel);
                    if (idDelSt) {
                        System.out.println("Deleted succesion!!!");
                    } else
                        System.out.println("Non see this student or student wasn't import");
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }

}

// result stuList constructor main method for stuList(parameter)
// transfont idDelSt form String to int