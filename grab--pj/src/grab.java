package bin;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class grab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int typeServices;
        int indexKm;
        int timeWait;

        System.out.println("Choosen Type Services: ");
        typeServices = Integer.parseInt(scan.nextLine());
        System.out.println("Inport km: ");
        indexKm = Integer.parseInt(scan.nextLine());
        System.out.println("Import time Waite: ");
        timeWait = Integer.parseInt(scan.nextLine());

    }

    public static int checkPrice(int indexKm) {
        if(indexKm > 0 && indexKm < 1)
        
    }

    public static int choosenTypeSv(int typeServices, int indexKm) {
        switch (typeServices) {
            case 1:// GrabCar
                return checkPrice(indexKm);
            default:

        }
    }

    public static int checkTimeWait(int timeWait) {

    }
}
