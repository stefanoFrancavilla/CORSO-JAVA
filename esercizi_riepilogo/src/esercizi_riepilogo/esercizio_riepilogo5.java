package esercizi_riepilogo;

public class esercizio_riepilogo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Somma, pari/dispari e conteggio

Scrivi un programma Java che:

Stampi tutti i numeri da 1 a 20.

Indichi per ciascun numero se è pari o dispari.

Calcoli e stampi alla fine:

la somma di tutti i numeri pari,

la somma di tutti i numeri dispari,

e il numero totale di numeri stampati.

💡 Suggerimenti

Usa un ciclo for per scorrere i numeri da 1 a 20.

Usa l’operatore % per verificare se un numero è pari (num % 2 == 0).

Tieni traccia delle somme con due variabili (sommaPari e sommaDispari).
		 */
		
		int sommaPari = 0;
		int sommaDispari = 0;
		int sommaNumeri = 0;
		
		
		for (int i = 1; i <= 20; i++) {
			
			
		if ( i % 2 == 0) {
			System.out.println("numero " + i + " è pari");
			sommaPari = sommaPari + i;
			System.out.println();
		}else {
			System.out.println("numero " + i + " è dispari");
			sommaDispari = sommaDispari + i;
			System.out.println();
		}
		sommaNumeri = sommaNumeri + i; 
		
		}
		System.out.println("la somma di tutti i numeri pari fino a 20 è: " + sommaPari);
		System.out.println();
		System.out.println("la somma di tutti i numeri dispari fino a 20 è: " + sommaDispari);
		System.out.println();
		System.out.println("la somma di tutti i numeri fino a 20 è: " + sommaNumeri);
		System.out.println();
		
	}

}
