package Argomento1_List;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1/5 — Spese settimanali
Crea una classe che gestisce una lista di spese giornaliere.

Traccia
Realizza una classe GestoreSpese con:

java

private List<Double> spese = new ArrayList<>();
e questi metodi:

java

aggiungiSpesa(double importo)
rimuoviSpesa(double importo)
cercaSpesa(double importo)
calcolaTotale()
calcolaMedia()
trovaSpesaPiuAlta()
trovaSpesaPiuBassa()
stampaSpese()
stampaSpeseSopraSoglia(double soglia)
Vincoli
Nel main inserisci almeno:

8 spese;

almeno 1 valore ripetuto;

almeno 1 valore 0.0;

almeno 1 valore alto per testare massimo e soglia.

Cosa deve fare ogni metodo
aggiungiSpesa: aggiunge il valore alla lista.

rimuoviSpesa: rimuove la prima occorrenza del valore.

cercaSpesa: restituisce true o false.

calcolaTotale: somma tutte le spese.

calcolaMedia: calcola la media solo se la lista non è vuota.

trovaSpesaPiuAlta: trova il valore massimo.

trovaSpesaPiuBassa: trova il valore minimo.

stampaSpese: stampa indice e importo.

stampaSpeseSopraSoglia: stampa solo le spese maggiori della soglia.

La rimozione per valore in una List elimina la prima occorrenza trovata;
 indexOf restituisce l’indice della prima occorrenza oppure -1 se non trova l’elemento.
oracle
+2

Controlli obbligatori
Nel codice devi gestire:

lista vuota;

importo non trovato;

rimozione di un valore presente più volte;

media con divisione corretta;

stampa ordinata con indice.

Suggerimento di struttura
Ti consiglio questo flusso:

crea la classe GestoreSpese;

scrivi prima aggiungiSpesa, stampaSpese, calcolaTotale;

poi calcolaMedia, trovaSpesaPiuAlta, trovaSpesaPiuBassa;

infine cercaSpesa, rimuoviSpesa, stampaSpeseSopraSoglia;

nel main testa tutto con varie chiamate.

Piccolo schema logico
Una lista potrebbe essere così:

java

[12.5, 7.0, 0.0, 12.5, 30.0]
Da qui dovresti essere in grado di:

calcolare totale e media;

trovare massimo e minimo;

cercare 12.5;

rimuovere solo la prima 12.5;

stampare solo le spese sopra 10.0.
		 */
		
		
		GestoreSpese spese = new GestoreSpese();
		
		spese.aggiungiSpesa(12.5);
		spese.aggiungiSpesa(7.0);
		spese.aggiungiSpesa(0.0);
		spese.aggiungiSpesa(12.5);
		spese.aggiungiSpesa(30.0);
		System.out.println();
		
		spese.stampaSpese();
		System.out.println("Il totale delle spese è: " + spese.calcolaTotale());
		System.out.println("La media delle spese è: " + spese.calcolaMedia());
		System.out.println("La spesa piu alta è: " + spese.trovaSpesaPiuAlta());
		System.out.println("La spesa più bassa è: " + spese.trovaSpesaPiuBassa());
		System.out.println("La spesa da cercarcare è: " + spese.cercaSpesa(12.5) + " che è presente");
		spese.rimuoviSpesa(12.5);
		spese.stampaSpeseSopraSoglia(10.0);
	}

}
