package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(50,65);
        Rettangolo r2 = new Rettangolo(25,70);
        stampaRettangolo(r1);
        stampaRettangolo(r2);



    }

public static void stampaRettangolo(Rettangolo r1 ){

        int a = r1.area();
        int p = r1.perimetro();
    System.out.println("Area : " + a + " Perimetro : " + p);

}

}
