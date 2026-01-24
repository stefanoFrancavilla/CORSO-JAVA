package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scrivere un programma che:

Prende in input da tastiera una stringa.

Prende in input un numero intero.

Stampa la sottostringa che parte dalla posizione indicata dal numero fino alla fine della stringa.

Esempio

Input:

Stringa: Programmazione
Numero: 5


Output:

La sottostringa dalla posizione 5 è: ammazione
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		System.out.print("Stringa: ");
		System.out.println();
		
		String parola = scanner.nextLine();
		
		System.out.println("Inserisci un numero intero");
		System.out.print("Numero: ");
		
		int numero = scanner.nextInt();
		System.out.println();
		
		String sottostringa ="";
		for (int i = numero; i < parola.length(); i++)
		{
			sottostringa = sottostringa + parola.charAt(i);
		}
		System.out.println("La sottostringa dalla posizione " + numero + " è: " + sottostringa);
		
		scanner.close();
	}

}
