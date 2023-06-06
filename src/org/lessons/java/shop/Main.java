package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

public class Main {

    public static void main(String[] args) {



        Prodotto tablet = new Prodotto("teblet", "12 policci", 149, 0.22);

        Smartphone iphone = new Smartphone("iphone", "iphone 14 pro max", 1499.00, 0.22,"FDDSD232312", 128);

        Televisione tv = new Televisione("samsung", "smart tv UHD", 2550.00, 0.22, 85, true);

        Cuffia bose = new Cuffia("bose", "cuffie cancellazione rumore", 459.99, 0.22,"black","wireless");

        System.out.println("Prezzo con iva : " + iphone.getFullName() + "\n" + iphone.getPrezzoIva() + " €");

        System.out.println("Prezzo con iva : " + tv.getFullName() + "\n" + tv.getPrezzoIva() + " €");

        System.out.println("Prezzo con iva : " + bose.getFullName() + "\n" + bose.getPrezzoIva() + " €");

        System.out.println("Prezzo con iva : " + tablet.getFullName() + "\n" + tablet.getPrezzoIva() + " €");


    }
}
