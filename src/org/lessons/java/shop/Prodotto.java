package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

import java.util.Scanner;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    private boolean cartaFedeltà;


    public Prodotto() {
        this.codice = Helper.generateCode();
    }

    public Prodotto(Boolean cartaFedeltà){
        this.cartaFedeltà = cartaFedeltà;
    }

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

    public boolean isCartaFedeltà() {
        return cartaFedeltà;
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

    public void setCartaFedeltà(boolean cartaFedeltà) {
        this.cartaFedeltà = cartaFedeltà;
    }

    public String getFullName() {
        return codice + "-" + nome;
    }


    public String getCheckOut() {
        return "Codice Prodotto: " + codice + " - " + "Nome: " + nome;
    }

    public double getPrezzoIva() {
        return Helper.getPrezzoIva(prezzo, iva);
    }

    public void inputCarrello() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci marca prodotto: ");
        String marca = scan.nextLine();
        setNome(marca);

        System.out.print("Inserisci descrizione prodotto: ");
        String desc = scan.nextLine();
        setDescrizione(desc);

        System.out.print("Inserisci prezzo prodotto: ");
        double pre = scan.nextDouble();
        setPrezzo(pre);

        System.out.print("Inserisci iva prodotto: ");
        double vat = scan.nextDouble();
        setIva(vat);

    }

    public double prezzoScontato() {
        double sconto = 2;
        double prezzoScontato;
        if (cartaFedeltà) {

            prezzoScontato = getPrezzoIva() - (getPrezzoIva() * sconto / 100);
            return prezzoScontato;
        } else {
            return getPrezzoIva();
        }

    }


}
