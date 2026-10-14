package Esercizi_1;

interface FiltroStringa {
    boolean accetta(String s);
}

public class Esercizio_2 {

    public static void main(String[] args) {

        FiltroStringa filtro = new FiltroStringa() {

            @Override
            public boolean accetta(String s) {
                return s.toLowerCase().startsWith("a") && s.length() >= 4;
            }
        };

        System.out.println(filtro.accetta("Albero")); // true
        System.out.println(filtro.accetta("albero")); // true
        System.out.println(filtro.accetta("Ape"));    // false
        System.out.println(filtro.accetta("Casa"));   // false
    }
}