package Esercizio2;

public class Chiamata {
    private String minutiChiamata;
    private int numeroChiamata;

    //Costruttore


    public Chiamata(String minutiChiamata, int numeroChiamata) {
        this.minutiChiamata = minutiChiamata;
        this.numeroChiamata = numeroChiamata;
    }

    //Metodi get e setter


    public String getMinutiChiamata() {
        return minutiChiamata;
    }

    public void setMinutiChiamata(String minutiChiamata) {
        this.minutiChiamata = minutiChiamata;
    }

    public int getNumeroChiamata() {
        return numeroChiamata;
    }

    public void setNumeroChiamata(int numeroChiamata) {
        this.numeroChiamata = numeroChiamata;
    }
}
