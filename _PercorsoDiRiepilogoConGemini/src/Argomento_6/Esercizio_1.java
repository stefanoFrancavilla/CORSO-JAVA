package Argomento_6;

import java.util.ArrayList;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1 (Facile) — Gestione Prodotti con List (ArrayList)
Crea una classe di supporto Prodotto con attributi privati nome (String) e prezzo (double), costruttore, getter e metodo toString().

Nel main, crea un ArrayList<Prodotto> e aggiungi 4 prodotti.

Calcola e stampa:

Il totale dei prezzi di tutti i prodotti.

Rimuovi dalla lista tutti i prodotti con prezzo superiore a 50€ e stampa la lista aggiornata.
		 */
		
		Prodotto prodotto1 = new Prodotto("quaderno", 1);
		Prodotto prodotto2 = new Prodotto("penna", 1.50);
		Prodotto prodotto3 = new Prodotto("matita", 0.75);
		Prodotto prodotto4 = new Prodotto("stampante", 120);
		Prodotto prodotto5 = new Prodotto("zaino", 75);
		Prodotto prodotto6 = new Prodotto("pc", 350);
		
		
		ArrayList<Prodotto> lista = new ArrayList<>();
		lista.add(prodotto1);
		lista.add(prodotto2);
		lista.add(prodotto3);
		lista.add(prodotto4);
		lista.add(prodotto5);
		lista.add(prodotto6);
		
		double totaleProdotti = 0;
		double prezzoCorrente = 0;
		for (int i = 0; i < lista.size(); i++)
		{
			prezzoCorrente = lista.get(i).getPrezzo();
			totaleProdotti += prezzoCorrente;
		}
		
		System.out.println("Totale prezzi " + totaleProdotti);
		
		rimuoviProdottiCostosi(lista);
		
		System.out.println(lista.toString());
	}
	
	public static void rimuoviProdottiCostosi(ArrayList<Prodotto> lista)
	{
	lista.removeIf(prodotto -> prodotto.getPrezzo() > 50);
	}

}
