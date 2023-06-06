package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String imei;
    private int memory;

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

}
