package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esercizio proposto:

Titolo: Convertitore di lettere

Descrizione:

Scrivi un programma Java che:

Chiede all’utente di inserire una singola lettera (può essere minuscola o maiuscola).

Controlla:

se la lettera è minuscola, la converte in maiuscola;

se la lettera è maiuscola, la converte in minuscola;

se non è una lettera, stampa un messaggio di errore.

Stampa il risultato della conversione.

🧠 Suggerimenti:

Usa Scanner per leggere l’input.

Usa i metodi statici della classe Character:

Character.isLowerCase()

Character.isUpperCase()

Character.toLowerCase()

Character.toUpperCase()

💻 Esempio di esecuzione:
Inserisci una lettera: a
Hai inserito una lettera minuscola.
La versione maiuscola è: A


oppure:

Inserisci una lettera: G
Hai inserito una lettera maiuscola.
La versione minuscola è: g


oppure:

Inserisci una lettera: 3
Errore: non hai inserito una lettera.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un carattere");
		
		String carattere = scanner.nextLine();
		
		char primoCarattere = carattere.charAt(0);
		
		if (Character.isUpperCase(primoCarattere)) {
			System.out.println("hai inserito una lettera maiuscola " + primoCarattere);
			primoCarattere = Character.toLowerCase(primoCarattere);
			 
			 System.out.println("la versione minuscola è: " + primoCarattere);
			 
			}else if (Character.isLowerCase(primoCarattere)) {
				System.out.println("hai inserito una lettera minuscola " + primoCarattere);

				primoCarattere = Character.toUpperCase(primoCarattere);
				 System.out.println("la versione maiuscola è: " + primoCarattere);
				
			}else {
				System.out.println("errore non hai inserito una lettera");
			}
		

		
		
	}

}
