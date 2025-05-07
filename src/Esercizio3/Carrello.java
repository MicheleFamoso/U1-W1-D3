package Esercizio3;

import java.util.Arrays;

public class Carrello {

    private Cliente clienteAssociato;
    private Articolo[] articoli;
    private int totali;

    //Costruttore


    public Carrello(Cliente clienteAssociato, Articolo[] articoli, int totali) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
        this.totali = totali;
    }

    //Get e set


    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public int getTotali() {
        return totali;
    }

    public void setTotali(int totali) {
        this.totali = totali;
    }



}
