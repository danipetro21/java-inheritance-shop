package org.lessons.java.shop;

import java.util.Scanner;

public class Cuffia extends Prodotto {

    private String colore;
    private String connettivita;

    public Cuffia() {

    }


    public Cuffia(String nome, String descrizione, double prezzo, double iva, String colore, String connettivita) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.connettivita = connettivita;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getConnettivita() {
        return connettivita;
    }

    public void setConnettivita(String connettivita) {
        this.connettivita = connettivita;
    }

    @Override
    public String getFullName() {
        return super.getFullName() + "-" + colore + "-" + connettivita;
    }

    @Override
    public void inputCarrello() {
        super.inputCarrello();

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci colore prodotto: ");
        String color = scan.nextLine();
        setColore(color);

        System.out.print("Specifica la connettivita': ");
        String conn = scan.nextLine();
        setConnettivita(conn);
    }

    public double getDifferenza() {
        double prezzoSott;
        return prezzoSott = getPrezzoIva() - prezzoScontato();
    }

    @Override
    public String getCheckOut() {
        return super.getCheckOut() + " - " + "Colore: " + colore + " - " + "Connettivita: " + connettivita + " | Sconto: " + String.format("%.2f", getDifferenza()) + " €";
    }

    @Override
    public double prezzoScontato() {
        double scontoS = 7;
        double newPrezzo;
        if (connettivita.equals("cablate") && isCartaFedeltà()) {
            return newPrezzo = super.prezzoScontato() - (super.prezzoScontato() * scontoS / 100);
        } else {
            return super.prezzoScontato();
        }
    }

}
