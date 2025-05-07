package Esercizio1;

public class Rettangolo {

    private int larghezza;
    private int altezza;


    //Costruttore
    public Rettangolo(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    //Metodi get e set
    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    // Metodi di Rettangolo
    public int area(){
        return larghezza * altezza;

    }

    public int perimetro (){

        return (larghezza + altezza) * 2;
    }




}
