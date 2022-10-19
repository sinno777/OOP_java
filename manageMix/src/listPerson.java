import java.time.Period;
import java.util.ArrayList;

public class listPerson {
    // field
    ArrayList<person> listMix;
    // get and set method

    public ArrayList<person> getListMix() {
        return listMix;
    }

    public void setListMix(ArrayList<person> listMix) {
        this.listMix = listMix;
    }

    // constructor
    public listPerson() {
        this.listMix = new ArrayList<person>();
    }

    // input and output method

    private void inMenu() {
        System.out.println("1 - Import student");
        System.out.println("2 - Import Employee");
        System.out.println("3 - Import Customer");
        System.out.println("0 - Close");
    }

    public void im(Scanner scan) {
        boolean flag = true;
        do {
            inMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            person person;
            switch (choosen) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    person = new student();
                    person.im(scan);
                    listMix.add(person);
                    break;
                case 2:
                    person = new employee();
                    person.im(scan);
                    listMix.add(person);
                    break;
                case 3:
                    person = new customer();
                    person.im(scan);
                    listMix.add(person);
                    break;

                default:
                    break;
            }
        } while (flag);

    }
    // business method
}
