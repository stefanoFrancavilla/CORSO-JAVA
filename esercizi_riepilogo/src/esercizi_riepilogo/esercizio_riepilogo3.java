package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 🧩 Esercizio: Codifica e Decodifica di una Parola

Scrivi un programma Java che:

Chiede all’utente di inserire una parola (solo lettere minuscole).

Per ogni carattere della parola:

Mostra il carattere originale e il valore numerico ASCII corrispondente.

Crea una nuova parola, spostando ogni lettera di +1 nella tabella ASCII.
(es: a → b, b → c, z → { → nota: non importa se esce dall’alfabeto, serve per capire il funzionamento).

Stampa la parola codificata.

Poi decodifica la parola tornando indietro di 1, ricostruendo la parola originale.

🔧 Esempio di esecuzione:
Inserisci una parola: casa
c -> 99
a -> 97
s -> 115
a -> 97

Parola codificata: dbtb
Parola decodificata: casa
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci una parola");
		
		String ing = scanner.nextLine();
		
		ing = ing.toLowerCase();
		String risultato ="";
		String risultato2 ="";
		
		for (int i = 0; i < ing.length() ; i ++) {
		
		risultato = risultato + ing.codePointAt(i);
		
		
		}
		System.out.println("la parola inserita è: " + ing);
		System.out.println();
		System.out.println("il valore numerico della parola inserita è: " + risultato);
		System.out.println();
		
		for (int s = 0; s < ing.length(); s++) {
			
			risultato2 = risultato2 + ing.charAt(s);
		
		}
		System.out.println("parola inserita  " + risultato2);
	}

}
