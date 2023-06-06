package org.lessons.java.helper;

import java.math.BigDecimal;

public class Helper {

    public static int generateCode(){

        int min = 10;
        int max = 1000;
        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        return randomNumber;

    }


    public static double getPrezzoIva(double prezzoNetto, double iva){
        double prezzoIva;
        prezzoIva = prezzoNetto + (prezzoNetto * iva);

        return prezzoIva;

    }


}
