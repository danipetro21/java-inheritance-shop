package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        System.out.println("Benvenuto nel JAVA SHOP!!!!");
        System.out.println("Iniziamo ad aggiungere qualche prodotto al carrello");
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti prodotti vuoi aggiungere?: ");
        int n = scan.nextInt();

        Prodotto[] checkout = new Prodotto[n];
        double sommaCarrello = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Hai 3 scelte: ");
            System.out.println("1-Smartphone");
            System.out.println("2-Televisore");
            System.out.println("3-Cuffie");

            System.out.print("SCELTA:: ");
            int scelta = scan.nextInt();

            switch (scelta) {
                case 1:
                    Smartphone tel = new Smartphone();
                    tel.inputCarrello();

                    sommaCarrello += tel.getPrezzoIva();

                    checkout[i] = tel;

                    break;
                case 2:
                    Televisione tv = new Televisione();
                    tv.inputCarrello();

                    sommaCarrello += tv.getPrezzoIva();

                    checkout[i] = tv;

                    break;
                case 3:
                    Cuffia headset = new Cuffia();
                    headset.inputCarrello();

                    sommaCarrello += headset.getPrezzoIva();

                    checkout[i] = headset;

                    break;

            }
        }

        System.out.println("Ecco il check-out del carello: ");


        for (int i = 0; i < n; i++) {

            System.out.println(checkout[i].getCheckOut());

        }

        System.out.println("La somma totale del carello compresa l'iva: " + sommaCarrello + " €");
    }
}
