import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class listTrade {
    final int one_bili = 1000;
    // field
    private ArrayList<trade> listTrade_V;
    private int sumTradeGold;
    private int sumTradeCurrency;
    private float averageSumCurrency;
    // get and set method

    public ArrayList<trade> getListTrade_V() {
        return listTrade_V;
    }

    public float getAverageSumCurrency() {
        return averageSumCurrency;
    }

    public int getSumTradeGold() {
        return sumTradeGold;
    }

    public int getSumTradeCurrency() {
        return sumTradeCurrency;
    }

    public void setListTrade_V(ArrayList<trade> listTrade_V) {
        this.listTrade_V = listTrade_V;
    }

    // constructor
    public listTrade() {
        this.listTrade_V = new ArrayList<trade>();
    }

    public listTrade(ArrayList<trade> listTrade_V) {
        this.listTrade_V = listTrade_V;
    }

    // input and output

    public void im_list(Scanner scan) {
        boolean flag = true;
        trade trade_im;
        do {
            System.out.println("1. trade gold");
            System.out.println("2. trade currency");
            System.out.println("0 to close");
            int choosen = Integer.parseInt(scan.nextLine());
            switch (choosen) {
                case 1:
                    trade_im = new trade_gold();
                    trade_im.im(scan);
                    trade_im.sumCostCrash();
                    listTrade_V.add(trade_im);
                    break;
                case 2:
                    trade_im = new trade_currency();
                    trade_im.im(scan);
                    trade_im.sumCostCrash();
                    listTrade_V.add(trade_im);
                    break;
                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("NOn value! choosen 1 - 2 - 0");
                    break;
            }
        } while (flag);
    }

    public void ex_list() {
        for (trade trade : listTrade_V) {
            trade.ex();
        }
    }

    // business method

    public void dumyData() {
        trade trade_gold = new trade_gold(1, 1, 1, 2020, 4, 5, "sjc");
        this.listTrade_V.add(trade_gold);
        trade_gold = new trade_gold(2, 2, 1, 2020, 5, 10, "sjc");
        this.listTrade_V.add(trade_gold);
        trade_gold = new trade_gold(3, 3, 4, 2020, 12, 11, "9999");
        this.listTrade_V.add(trade_gold);
        trade trade_currency = new trade_currency(4, 5, 5, 2020, 1100, 10, 23, 2);
        this.listTrade_V.add(trade_currency);
        trade_currency = new trade_currency(5, 6, 7, 2020, 4100, 11, 10, 1);
        this.listTrade_V.add(trade_currency);

    }

    public void sumTradeGold() {
        this.sumTradeGold = 0;
        for (trade trade : listTrade_V) {
            if (trade instanceof trade_gold) {
                this.sumTradeGold += trade.summary;
            }
        }
    }

    public void sumTradeCurrency() {
        this.sumTradeCurrency = 0;
        for (trade trade : listTrade_V) {
            if (trade instanceof trade_currency) {
                this.sumTradeCurrency += trade.summary;
            }
        }
    }

    public void averageSumCurrency() {
        this.averageSumCurrency = 0;
        float costCrash = 0;
        for (trade trade : listTrade_V) {
            if (trade instanceof trade_currency) {
                costCrash += trade.costCrash;
            }
        }
        averageSumCurrency = costCrash / this.sumTradeCurrency;
    }

    public void loopFlowFact() {
        System.out.println("Trade get rate over one bili: ");
        for (trade trade : this.listTrade_V) {
            if (trade.getPrice() > one_bili) {
                trade.ex();
            }
        }
    }

    public void sumAllTrade(){
        for (trade trade : listTrade_V) {
            trade.sumCostCrash();
        }
    }

}
