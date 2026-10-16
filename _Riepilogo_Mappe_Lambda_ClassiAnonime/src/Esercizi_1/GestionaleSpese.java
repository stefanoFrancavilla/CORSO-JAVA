package Esercizi_1;

public class GestionaleSpese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Esercizio: gestionale spese
Crea nel package Esercizi_1 un file chiamato GestionaleSpese.java.

Formato delle spese
Ogni spesa è una stringa in questo formato:

text


categoria:importo
Esempi:

text


Affitto:1200.50
Spesa:85.30
Benzina:60
1. Interfaccia e classe anonima
Crea questa interfaccia:

java


interface ValidatoreSpesa {
    boolean accetta(String spesa);
}
Nel main, implementala con una classe anonima.

Una spesa è valida solo se:

non è null;

non è vuota;

contiene esattamente un carattere :;

la categoria non è vuota;

l’importo è un numero maggiore di 0.

Attenzione: devi controllare che esista il carattere : prima di fare il parsing, altrimenti rischi un errore.

2. Separare la spesa
Crea questo metodo:

java


public static String[] separaSpesa(String spesa)
Deve trasformare:

text


Affitto:1200.50
in:

text


["Affitto", "1200.50"]
3. Calcolare l’importo
Crea questo metodo:

java


public static double recuperaImporto(String[] datiSpesa)
Deve ricevere l’array creato da separaSpesa e restituire l’importo come double.

4. Lista di partenza
Crea questa lista:

java


List<String> spese = new ArrayList<>(List.of(
    "Affitto:1200.50",
    "Spesa:85.30",
    "Benzina:60",
    "Svago:-20",
    "Internet:49.90",
    ":30",
    "Ristorante:75.20",
    "Benzina:45.80"
));
5. Filtrare le spese
Usa removeIf con una lambda e il tuo validatore per rimuovere le spese non valide.

Dopo la rimozione, stampa la lista.

Output atteso:

text


[Affitto:1200.50, Spesa:85.30, Benzina:60, Internet:49.90, Ristorante:75.20, Benzina:45.80]
6. Trasformare in importi
Usa replaceAll con una lambda per trasformare ogni spesa nel suo importo numerico.

Dopo la trasformazione, stampa la lista.

Output atteso:

text


[1200.5, 85.3, 60.0, 49.9, 75.2, 45.8]
7. Ordinare gli importi
Usa sort con una lambda per ordinare gli importi dal più alto al più basso.

Dopo l’ordinamento, stampa la lista.

Output atteso:

text


[1200.5, 85.3, 75.2, 60.0, 49.9, 45.8]
8. Conteggio categorie
Crea questo metodo:

java


public static Map<String, Integer> contaCategorie(List<String> spese)
Deve ricevere la lista delle spese valide, prima della trasformazione in importi.

Deve restituire una Map<String, Integer> con il numero di spese per ogni categoria.

Output atteso:

text


{Affitto=1, Spesa=1, Benzina=2, Internet=1, Ristorante=1}
9. Totale per categoria
Crea questo metodo:

java


public static Map<String, Double> totalePerCategoria(List<String> spese)
Deve ricevere la lista delle spese valide e restituire una Map<String, Double> con la somma degli importi per ogni categoria.

Output atteso:

text


{Affitto=1200.5, Spesa=85.3, Benzina=105.8, Internet=49.9, Ristorante=75.2}
10. Totale complessivo
Crea questo metodo:

java


public static double totaleComplessivo(List<String> spese)
Deve restituire la somma di tutti gli importi validi.

Output atteso:

text


1516.7
Regole
Non usare Stream.

Usa una classe anonima per ValidatoreSpesa.

Usa lambda per removeIf, replaceAll e sort.

Usa Map per i due conteggi/somme per categoria.

Controlla sempre null e la presenza del : prima di usare split, substring o i metodi di conversione.

Stampa la lista dopo ogni modifica principale.
 */
	}

}
