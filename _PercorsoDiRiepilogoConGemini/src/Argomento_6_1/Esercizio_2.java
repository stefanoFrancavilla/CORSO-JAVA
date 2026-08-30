package Argomento_6_1;

import java.util.ArrayList;

public class Esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2
Crea una classe Prodotto con:

nome

prezzo

Poi crea una ArrayList<Prodotto> con almeno 5 prodotti.
Scrivi un metodo che:

rimuove tutti i prodotti con prezzo minore di 20;

stampa i prodotti rimasti con nome e prezzo.

Obiettivo: esercitarti con oggetti personalizzati dentro una lista e con una condizione di eliminazione.
		 */
		
		ArrayList<Prodotto> prodotti = new ArrayList<>();
		
		Prodotto sedia = new Prodotto("Sedia", 80);
		Prodotto setBicchieri = new Prodotto("Bicchieri", 15);
		Prodotto tovaglia = new Prodotto("Tovaglia", 10);
		Prodotto tavolo = new Prodotto("Tavolo", 150);
		Prodotto setPiatti = new Prodotto("Piatti", 45);
		
		prodotti.add(sedia);
		prodotti.add(setBicchieri);
		prodotti.add(tovaglia);
		prodotti.add(tavolo);
		prodotti.add(setPiatti);
		
		prodotti.removeIf(prodotto -> prodotto.getPrezzo() < 20);
		
		System.out.println(prodotti.toString());
		
		
	}

}
