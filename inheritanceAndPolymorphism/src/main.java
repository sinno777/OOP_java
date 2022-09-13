import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        trainList train = new trainList();
        Scanner scan = new Scanner(System.in);
        //train.im_list(scan);
        train.dumyData();
        train.ex_list(); 
        train.sumIncome();
        // System.out.println(train.getSumIncome());
        // train.sumMainTrain();
        // System.out.println(train.getSumMainTrain());
        // train.sumSubTrain();
        // System.out.println(train.getSumSubTrain());
        float incomeBT = train.icomeTrainBinhThuan();
        System.out.println(incomeBT);
    }
}
