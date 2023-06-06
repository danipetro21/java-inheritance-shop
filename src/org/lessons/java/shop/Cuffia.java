package org.lessons.java.shop;

public class Cuffia extends Prodotto{

    private String colore;
    private String connettivita;

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

}
