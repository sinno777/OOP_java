import java.util.Scanner;

public class manageStu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stuList list = new stuList();
        doMenu(scan, list);
    }

    private static void printMenu() {
        System.out.println("Choosen please!");
        System.out.println("1 to add student");
        System.out.println("2 to export list student");
        System.out.println("0 close");
    }

    private static void doMenu(Scanner scan, stuList list) {
        boolean flag = true;
        do {
            printMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    stuClass stu = new stuClass();
                    stu.im(scan);
                    list.addStu(stu);
                    break;
                case 2:
                    list.average();
                    list.levelStu();
                    list.ex();
                    break;

                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
