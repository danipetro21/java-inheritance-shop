package org.lessons.java.shop;

import java.util.Scanner;

public class Televisione extends Prodotto {

    private int dimensione;
    private boolean smart;


    public Televisione() {

    }

    public Televisione(String nome, String descrizione, double prezzo, double iva, int dimensione, boolean smart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensione = dimensione;
        this.smart = smart;
    }

    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }


    @Override
    public String getFullName() {
        return super.getFullName() + "-" + dimensione + "-" + smart;
    }

    @Override
    public void inputCarrello() {
        super.inputCarrello();

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci dimensione prodotto: ");
        int dim = scan.nextInt();
        setDimensione(dim);

        System.out.print("Specifica con true o false se è smart: ");
        boolean smar = scan.nextBoolean();
        setSmart(smar);
    }

    @Override
    public String getCheckOut() {
        return super.getCheckOut() + " - " + "Pollici: " + dimensione;
    }

    @Override
    public double prezzoScontato() {
        double scontoS = 10;
        double newPrezzo;
        if (!smart && isCartaFedeltà()){
            return newPrezzo = super.prezzoScontato() - (super.prezzoScontato() * scontoS / 100);
        }else{
            return super.prezzoScontato();
        }
    }
}
