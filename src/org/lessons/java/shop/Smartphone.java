package org.lessons.java.shop;

import java.util.Scanner;

public class Smartphone extends Prodotto {

    private String imei;
    private int memory;

    public Smartphone(){

    }

    public Smartphone(String nome, String descrizione, double prezzo, double iva, String imei, int memory) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String getFullName() {
        return super.getFullName() + "-" + imei + "-" + memory;
    }

    @Override
    public void inputCarrello(){
        super.inputCarrello();

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci imei prodotto: ");
        String ime = scan.nextLine();
        setImei(ime);

        System.out.print("Inserisci memoria prodotto: ");
        int memoria = scan.nextInt();
        setMemory(memoria);
    }

    @Override
    public String getCheckOut(){
        return super.getCheckOut() + " - " + "Imei: " + imei + " - " + "Memoria: " + memory;
    }


    @Override
    public double prezzoScontato() {
        double scontoS = 5;
        double newPrezzo;
        if (memory <= 32 && isCartaFedeltà()){
            return newPrezzo = super.prezzoScontato() - (super.prezzoScontato() * scontoS / 100);
        }else{
            return super.prezzoScontato();
        }
    }

}
