import java.util.Scanner;  
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        doMenu(scan);
    }

    public static void inMenu() {
        System.out.println("Choosen please!");
        System.out.println("1 to import trade");
        System.out.println("2 to summary for particular type trade");
        System.out.println("3 to sum Average for costCrash Currency");
        System.out.println("4 export index trade get trade over one_bili");
        System.out.println("0  to close");
    }

    public static void doMenu(Scanner scan) {
        boolean flag = true;
        listTrade listTrade_v1 = new listTrade();
        listTrade_v1.dumyData();
        listTrade_v1.sumAllTrade();
        do {
            inMenu();
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    listTrade_v1.im_list(scan);
                    break;
                case 2:
                    listTrade_v1.sumTradeCurrency();
                    listTrade_v1.sumTradeGold();
                    System.out.println("Trade Currency: " + listTrade_v1.getSumTradeCurrency());
                    System.out.println("Trade Gold: " + listTrade_v1.getSumTradeGold());
                    break;
                case 3:
                    listTrade_v1.averageSumCurrency();
                    System.out.println("Average Currency: " + listTrade_v1.getAverageSumCurrency());
                    break;
                case 4:
                    listTrade_v1.loopFlowFact();
                    break;
                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("0 to 4! please!");
                    break;
            }
        } while (flag);

    }
}
