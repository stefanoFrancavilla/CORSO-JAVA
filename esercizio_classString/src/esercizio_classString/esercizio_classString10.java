package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivere un programma che, preso una stringa e un carattere in input,
		 *  stampi la prima posizione di quel carattere nella stringa.
		 *   Esempio 
		 *   Original String : pippo                                                     
		 *   Character: p                                                                               
		 *    posiction: 0
         */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		String frase  = scanner.nextLine();
		System.out.println();
		
		System.out.println("inserisci un carattere da ricercare");
		char carattere = scanner.next().charAt(0);
		scanner.nextLine();
		
		if (frase.indexOf(carattere) > -1) {
			
		
	  System.out.println("il carattere: " + carattere + " è alla posizione: " + frase.indexOf(carattere));
	
		}
		else
		{
			System.out.println("il carattere: " + carattere + " non è presente nella parola");
		}
		}

}
