package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

public class Main {

    public static void main(String[] args) {

        double prezzoNetto = 200.00;
        double iva = 0.22;


        Prodotto televisione = new Prodotto("televisione", "55 policci", prezzoNetto, iva);

        System.out.println(televisione.getFullName());
        System.out.println("Prezzo netto: " + televisione.getPrezzo() + " €");
        System.out.println("Prezzo con iva: " + Helper.getPrezzoIva(prezzoNetto, iva) + " €");

    }
}
