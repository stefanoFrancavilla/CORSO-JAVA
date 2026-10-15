package Esercizi_1;

public class GestionaleOrdini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: gestionale ordini
Crea nel package Esercizi_1 un file chiamato GestionaleOrdini.java.

Dati da gestire
Ogni ordine è rappresentato da una stringa in questo formato:

text


nomeProdotto:quantita:prezzoUnitario
Esempio:

text


Mouse:3:25.50
Significa:

prodotto: Mouse

quantità: 3

prezzo unitario: 25.50

1. Interfaccia e classe anonima
Crea questa interfaccia:

java


interface ValidatoreOrdine {
    boolean accetta(String ordine);
}
Nel main, implementala con una classe anonima.

Un ordine è valido solo se:

non è null;

non è vuoto;

contiene esattamente due caratteri :;

il nome del prodotto non è vuoto;

la quantità è un numero intero maggiore di 0;

il prezzo unitario è un numero decimale maggiore di 0.

2. Metodo di parsing
Crea questo metodo:

java


public static String[] separaOrdine(String ordine)
Deve ricevere una stringa valida nel formato:

text


Mouse:3:25.50
E restituire un array di tre elementi:

text


["Mouse", "3", "25.50"]
Usa il metodo split(":").

3. Metodo per calcolare il totale
Crea questo metodo:

java


public static double calcolaTotale(String[] datiOrdine)
Deve ricevere l’array creato dal metodo precedente e restituire il totale dell’ordine:

text


quantita * prezzoUnitario
Per l’ordine "Mouse:3:25.50", il totale è:

text


76.5
4. Lista ordini
Crea questa lista nel main:

java


List<String> ordini = new ArrayList<>(List.of(
    "Mouse:3:25.50",
    "Tastiera:2:45.00",
    "Monitor:1:199.99",
    "Cavo:0:10.00",
    "SSD:2:89.90",
    "Mouse:1:25.50"
));
5. Filtrare gli ordini
Usa removeIf con una lambda per rimuovere tutti gli ordini non validi, usando il tuo ValidatoreOrdine.

Dopo la rimozione, stampa la lista.

Output atteso:

text


[Mouse:3:25.50, Tastiera:2:45.00, Monitor:1:199.99, SSD:2:89.90, Mouse:1:25.50]
6. Trasformare gli ordini
Usa replaceAll con una lambda per trasformare ogni ordine nel suo totale.

Per farlo, dentro la lambda puoi chiamare i metodi separaOrdine e calcolaTotale.

Dopo la trasformazione, stampa la lista.

Output atteso:

text


[76.5, 90.0, 199.99, 179.8, 25.5]
7. Ordinare i totali
Usa sort con una lambda per ordinare i totali dal più alto al più basso.

Dopo l’ordinamento, stampa la lista.

Output atteso:

text


[199.99, 179.8, 90.0, 76.5, 25.5]
8. Conteggio prodotti
Crea questo metodo:

java


public static Map<String, Integer> contaProdotti(List<String> ordini)
Deve ricevere la lista degli ordini validi, prima della trasformazione in totali.

Deve restituire una Map<String, Integer> che conta quante volte appare ogni prodotto.

Con la lista iniziale, dopo aver rimosso l’ordine non valido, l’output atteso è:

text


{Mouse=2, Tastiera=1, Monitor=1, SSD=1}
9. Totale complessivo
Crea questo metodo:

java


public static double calcolaTotaleComplessivo(List<String> ordini)
Deve ricevere la lista degli ordini validi e restituire la somma dei totali di tutti gli ordini.

Con la lista iniziale, il risultato atteso è:

text


571.79
Regole
Non usare Stream.

Usa una classe anonima per ValidatoreOrdine.

Usa lambda per removeIf, replaceAll e sort.

Usa Map per contare i prodotti.

Gestisci correttamente i controlli null prima di chiamare metodi sulle stringhe.

Stampa la lista dopo ogni modifica principale, così puoi verificare i passaggi.
		 */
	}

}
