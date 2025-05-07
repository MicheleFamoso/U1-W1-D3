package Esercizio2;

import java.util.Arrays;

public class Sim {
    private long numeroDiTelefono;
    private int credito;
    private Chiamata[] chiamate;

//Costruttore


    public Sim(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;


    }

    //Metodi get e set


    public long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    // Funzioni

    public  void leggi(){
        System.out.println("Credito : " + credito);
        System.out.println("Numero : " + numeroDiTelefono);
        System.out.println("Chiamate : " + Arrays.toString(chiamate));

    }



}
