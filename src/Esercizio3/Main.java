package Esercizio3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Cliente
        Cliente c1 = new Cliente(1,"Achille","achille@gmial.com",12122002);

        //Vari articoli
        Articolo n1 = new Articolo(1,"iphone",1000,23);
        Articolo n2 = new Articolo(2,"galaxy",850,3);
        Articolo n3 = new Articolo(3,"mac",2500,139);
        // Array articolo
        Articolo[] articoli = new Articolo[3];
        articoli[0]= n1;
        articoli[1]= n2;
        articoli[2]=n3;
        // funzione per il totale
         int tot= totale(articoli);

         //Carrello
        Carrello car1 = new Carrello(c1,articoli,tot);


        System.out.println(car1.getClienteAssociato().getNomeCognome());
        System.out.println(car1.getTotali());






    }


    public static int totale(Articolo[] art){
        int totale=0;

        for (int i = 0; i < art.length; i++) {
            int prezzi = art[i].getPrezzo();
            totale += prezzi;
        }
        return totale;

    }




}
