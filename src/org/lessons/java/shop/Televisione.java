package org.lessons.java.shop;

public class Televisione extends Prodotto{

    private int dimensione;
    private boolean smart ;
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
}
