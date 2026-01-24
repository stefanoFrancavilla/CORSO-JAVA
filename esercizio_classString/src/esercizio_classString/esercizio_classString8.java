package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1 Scrivere un programma che, preso in input da tastiera una stringa e un numero,
		 *  stampa il carattere che si trova nella posizione indicata dal numero preso in input.
		 *   Esempio Original String = Java Exercises!                                                                          
		 *      The character at position 0 is J                                                                             
		 *       The character at position 10 is i
		 *        
         */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una parola o una frase");
		String frase = scanner.nextLine();
		
		System.out.println("inserisci un numero per vedere a quale carattere corrisponde");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		if (num < (frase.length())) {
		System.out.println("il numero: " + num + " corrisponde al carattere: " + frase.charAt(num));
		}
		else
		{
		System.out.println("il numero inserito non è valido");
		}
		
		scanner.close();
		
		/*
		 * import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola o una frase:");
        String frase = scanner.nextLine();

        System.out.println("Inserisci un numero per vedere a quale carattere corrisponde:");
        int num = scanner.nextInt();

        if (num >= 0 && num < frase.length()) {
            System.out.println("Il numero: " + num + " corrisponde al carattere: " + frase.charAt(num));
        } else {
            System.out.println("Il numero inserito non è valido");
        }

        scanner.close();
    }
}
		 */
	}
}
