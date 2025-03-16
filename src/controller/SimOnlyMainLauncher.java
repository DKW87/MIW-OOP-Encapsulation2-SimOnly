package Controller;

import Model.Verbruik;

import java.util.Scanner;

public class SimOnlyMainLauncher {

    public static void main(String[] args) {

        // variabelen
        Scanner userInput = new Scanner(System.in);

        Verbruik augustusVerbruik = new Verbruik("Augustus", 4563);
        Verbruik oktoberVerbruik = new Verbruik("Oktober", 2134);
        augustusVerbruik.toonVerbruik();
        oktoberVerbruik.toonVerbruik();

        System.out.println(" ");

        Verbruik[] aantalMaandenVerbruikArray = new Verbruik[4];
        aantalMaandenVerbruikArray[0] = new Verbruik("Juli");
        aantalMaandenVerbruikArray[1] = new Verbruik("Augustus");
        aantalMaandenVerbruikArray[2] = new Verbruik("September");
        aantalMaandenVerbruikArray[3] = new Verbruik("Oktober");

        for (int i = 0; i < aantalMaandenVerbruikArray.length; i++) {
            System.out.println("Geef je dataverbruik in MB per maand:");
            System.out.printf("%s: ", aantalMaandenVerbruikArray[i].getMaand());
            aantalMaandenVerbruikArray[i].setHoeveelheidMb(userInput.nextInt());
        }

        System.out.println(" ");

        for (int i = 0; i < aantalMaandenVerbruikArray.length; i++) {
            if (i == 0) {
                System.out.printf("%-10s%8s%8s%n", "MAAND", "MB", "KOSTEN");
            }
            aantalMaandenVerbruikArray[i].toonVerbruik();
        }

    }

}
