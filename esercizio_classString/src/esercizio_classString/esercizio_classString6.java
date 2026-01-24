package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ✅ Esercizio: Validazione input utente

Scrivi un programma Java che:

Chieda all’utente di inserire il proprio nome.

Il testo inserito deve essere analizzato con:

isEmpty()

isBlank()

length()

Il programma deve distinguere questi casi:

stringa completamente vuota (es: "")

stringa con soli spazi o tab o newline (es: " ", "\t", "\n")

stringa con almeno un carattere visibile

In base al caso, stampa un messaggio appropriato.

🧩 Obiettivo dell’esercizio

Imparare a capire la differenza tra:

Metodo / Caratteristica	Comportamento
isEmpty()	Vero solo se la lunghezza è 0
isBlank()	Vero se contiene solo spazi, tab, newline o è vuota
length()	Restituisce il numero di caratteri (compresi spazio, tab, ecc.)
 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci il tuo nome");
		String nome = scanner.nextLine();
		
		int lunghezza = nome.length();
		
		System.out.println("la lunghezza della stringa è: " + lunghezza);
		
		boolean isEmpty = nome.isEmpty();
		boolean isBlank = nome.isBlank();
		
		System.out.println("isEmpty: " + isEmpty);
		System.out.println("isBlank: " + isBlank);
	}

}
