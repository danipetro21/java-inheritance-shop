package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = Helper.generateCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    public String getFullName() {
        return codice + "-" + nome;
    }


}
