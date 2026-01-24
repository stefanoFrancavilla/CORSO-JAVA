package esercizi_riepilogo;
import java.util.Scanner;
public class esercizi_riepilogo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scrivi un programma Java che:

Dichiari una variabile int eta e le assegni un valore (per esempio 17 o 20).

Dichiari una variabile booleana isMaggiorenne che valga true se eta >= 18, altrimenti false.

Stampi a video il valore della variabile isMaggiorenne.

Usi una struttura if / else per stampare:

"Puoi votare" se isMaggiorenne è true

"Non puoi votare" se isMaggiorenne è false
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inserisci la tua età : ");
		
		int eta = scanner.nextInt();
		System.out.println();
		
		boolean isMaggiorenne = eta >= 18;
		
		if (eta < 18 && eta >=1) {
	    
		isMaggiorenne = false;
		System.out.println("non puoi votare , perchè sei minorenne");
		
		}else if (isMaggiorenne) {
			System.out.println("puoi votare, perchè sei maggiorenne");
		}
		else if (eta <= 0) {
			isMaggiorenne = false;
			System.out.println("numero non valido");
			
		}
			scanner.close();
			
		}
	}
// esercizio completato senza aiuto!!!!!!!

