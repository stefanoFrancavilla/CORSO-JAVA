package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli_switch14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ecco un esercizio pratico simile al giorno della settimana, da scrivere da zero in Java.

Esercizio: Funzione Mese Anno
Scrivi una funzione:

java
public static String stagione(int mese)
Che ritorna:
1-3 → "Inverno"
4-6 → "Primavera"
7-9 → "Estate"
10-12 → "Autunno"
default → "Mese non valido"

✅ Extra: Nel main chiedi all'utente un numero di mese (Scanner) e stampa il risultato.

Esempio output:

text
Inserisci numero mese (1-12): 7
Stagione: Estate
Suggerimenti
Usa switch con case 1: case 2: case 3: (fall-through).

Oppure if-else per range (mese >=1 && mese <=3).

Non dimenticare return e break!

Scrivi il codice completo (classe + main + metodo), compila e testa con mese=2 e mese=13. Poi mandamelo per il controllo!
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci numero mese (1-12)");
		
	    int scelta = scanner.nextInt();
	    
	    String messaggio = stagione (scelta);
	    
	    System.out.println("Stagione: " + messaggio);
		
		
	scanner.close();	
	}
	
	
	public static String stagione ( int mese)
	{
		String messaggio;
		
		switch (mese) {
		
		
		case 1, 2, 3:
		messaggio = "Inverno";
		break;
		
		case 4, 5, 6:
			messaggio = "Primavera";
		break;
		
		case 7, 8, 9:
			messaggio = "Estate";
		break;
		
		case 10, 11, 12:
			messaggio = "Autunno";
		break;
		
		default:
			messaggio = "Mese non valido";
			break;
		
		}
		return messaggio;
	}

	/*
	 * Il tuo codice è eccellente e funzionale! Hai seguito tutti i requisiti perfettamente.

Valutazione: 10/10
Perché 10/10:

Scanner usato correttamente con nextInt().

Input/output esattamente come richiesto.

switch ben strutturato con tutti i range.

return e break posizionati alla perfezione.

scanner.close() presente (buona pratica).
	 */
}
