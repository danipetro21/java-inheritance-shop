package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

public class Main {

    public static void main(String[] args) {



        Prodotto televisione = new Prodotto("televisione", "55 policci", 149, 0.22);

        Smartphone iphone = new Smartphone("iphone", "iphone 14 pro max", 1499.00, 0.22,"FDDSD232312", 128);


        System.out.println("Prezzo con iva : " + iphone.getFullName() + "\n" + iphone.getPrezzoIva() + " €");

        System.out.println("Prezzo con iva : " + televisione.getFullName() + "\n" + televisione.getPrezzoIva() + " €");


    }
}
