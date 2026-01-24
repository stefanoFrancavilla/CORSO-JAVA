package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esercizio: Conta vocali e consonanti

Obiettivo:
Scrivi un programma Java che chieda all’utente di inserire una parola intera (non solo una lettera) e poi stampi:

quante vocali contiene,

quante consonanti,

e quante altre (numeri o simboli).

🧩 Requisiti

Usa Scanner per leggere l’input da tastiera.

Converti la parola in maiuscolo per semplificare il controllo.

Scorri ogni carattere della parola con un ciclo for.

Usa i metodi della classe Character:

Character.isLetter() per controllare se è una lettera,

Character.toUpperCase() per trasformarla in maiuscolo.

Usa una serie di if per verificare se il carattere è una vocale, consonante o altro.

💻 Esempio di esecuzione
Inserisci una parola: Ciao!
Vocali: 3
Consonanti: 1
Altri caratteri: 1
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un testo, o una parola");
		
		String parola = scanner.nextLine();
		System.out.println();
		
		parola = parola.toUpperCase();
		
		int vocali = 0;
		int consonanti = 0;
		int caratteri = 0;
		int altri = 0;
		int spazi = 0;
		
		for(int i = 0; i < parola.length(); i++) {
			
			char carattere = parola.charAt(i);
			
			if (Character.isSpaceChar(carattere)) {
				
				spazi++;
				continue;
			}
			
			if (Character.isLetter(carattere)) {
				
				if (carattere == 'A' || carattere == 'E' || carattere == 'I' || carattere == 'O' || carattere == 'U') {
					
					vocali ++;
					
				}else {
					consonanti ++;
				}
				
			} else {
				altri++;
			}
			caratteri++;
			
		}
	
	System.out.println("parola inserita: " + parola + " | vocali nel testo: " + vocali + " | consonanti nel testo: " + consonanti + " | altri simboli nel testo: " + altri + " | caratteri nel testo: " + caratteri + " | spazi nel testo: " + spazi);
	
	scanner.close();
	}

}
