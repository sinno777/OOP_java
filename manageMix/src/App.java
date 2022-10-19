import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        doMenu(scan);
    }

    public static void inMenu(Scanner scan){
        System.out.println("0 - Close program");
        System.out.println("1 - Add person into list");
        System.out.println("2 - Remove person out list");
        System.out.println("3 - Sort person folow first and last name");
    }

    public static void doMenu(Scanner scan) {
        flag = true;
        do {
            inMenu(scan);
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
            
                default:
                System.out.println("NOn value");
                    break;
            }
        } while (flag);
    }
}
