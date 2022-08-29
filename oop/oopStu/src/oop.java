import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        studentInit st1 = new studentInit();
        st1.name = "KhoaSupper";
        st1.email = "KhoaSupper.com";

        System.out.println("name: ");
        String name = scan.nextLine();
        System.out.println("email: ");
        String email = scan.nextLine();
        studentInit st2 = new studentInit(name, email);

        System.out.println("Name1 " + st1.name + " email1 " + st1.email);
        System.out.println("Name2 " + st2.name + " email2 " + st2.email);
    }
}
