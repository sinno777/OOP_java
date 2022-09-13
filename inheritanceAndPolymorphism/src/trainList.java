import java.util.ArrayList;
import java.util.Scanner;

public class trainList {
    // field
    private ArrayList<train_parent> train_list;
    private float sumIncome;
    private float sumSubTrain;
    private float sumMainTrain;

    // get and set method

    public ArrayList<train_parent> getTrain_list() {
        return train_list;
    }

    public float getSumIncome() {
        return sumIncome;
    }

    public float getSumSubTrain() {
        return sumSubTrain;
    }

    public float getSumMainTrain() {
        return sumMainTrain;
    }

    public void setTrain_list(ArrayList<train_parent> train_list) {
        this.train_list = train_list;
    }

    // constructor
    public trainList() {
        train_list = new ArrayList<train_parent>();
    }

    // input and output
    public void im_list(Scanner scan) {
        boolean flag = true;
        train_parent train;
        do {
            System.out.println("Import your choosen: ");
            System.out.println("1 to import");
            System.out.println("2 to export");
            System.out.println("0 to escape");
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    train = new train_downTown();
                    train.im(scan);
                    this.train_list.add(train);
                    break;
                case 2:
                    train = new train_suburb();
                    train.im(scan);
                    this.train_list.add(train);
                    break;

                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public void ex_list() {
        for (train_parent train : this.train_list) {
            train.ex();
        }
    }

    // business method
    public void dumyData() {
        train_parent train;
        train = new train_downTown("1", "noi 1", 02, 1200, "so 12", 35);
        this.train_list.add(train);

        train = new train_downTown("2", "noi 1", 02, 1100, "so 12", 3.5f);
        this.train_list.add(train);

        train = new train_suburb("3", "ngoai 1", 121, 2000, "Binh Thuan", 12);
        this.train_list.add(train);

        train = new train_suburb("4", "ngoai 2", 111, 3000, "Binh Thuan", 2);
        this.train_list.add(train);
    }

    public void sumIncome() {
        sumIncome = 0;
        for (train_parent train : this.train_list) {
            sumIncome += train.getIncome();

        }
    }

    public void sumMainTrain() {
        sumMainTrain = 0;
        for (train_parent train : train_list) {
            if (train instanceof train_downTown) {
                sumMainTrain += train.getIncome();
            }
        }
    }

    public void sumSubTrain() {
        sumSubTrain = 0;
        for (train_parent train : this.train_list) {
            if (train instanceof train_suburb) {
                sumSubTrain += train.getIncome();
            }
        }
    }

    public float icomeTrainBinhThuan(){
        float imcome = 0;
        for (train_parent train : this.train_list) {
            if(train instanceof train_suburb){
                if(((train_suburb)train).getDestination().equalsIgnoreCase("Binh Thuan")){
                    imcome += train.getIncome();
                }
            }
        }
        return imcome;
    }
}
