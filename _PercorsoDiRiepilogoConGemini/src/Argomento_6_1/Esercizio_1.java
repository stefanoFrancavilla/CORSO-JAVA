package Argomento_6_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1
Hai una ArrayList<Integer> che contiene questi numeri:

java

[12, 5, 48, 60, 33, 81, 7]
Scrivi un metodo che:

rimuove tutti i numeri maggiori di 50;

stampa la lista finale.

Obiettivo: allenarti a filtrare elementi in modo corretto senza usare remove() dentro un for-each.
		 */
		
		ArrayList<Integer> numeri = new ArrayList<>(Arrays.asList( 12, 5, 48, 60, 33, 81, 7));
		
		numeri.removeIf(numero -> numero.intValue() > 50);
		System.out.println(numeri.toString());
	}

}
