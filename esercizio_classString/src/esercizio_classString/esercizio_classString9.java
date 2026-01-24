package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivere un programma che, prese due stringhe in input,
		 *  stampi la loro unione.
		 *   Esempio Stringa1: ciao
		 *    Stringa2: mamma 
		 *    Stringhe unite: ciao mamma
         */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		String String1 = scanner.nextLine();
		
		System.out.println("inserisci un'altra parola");
		String String2 = scanner.nextLine();
		
		System.out.println(String1 + " " + String2);
		
		scanner.close();
		
		
	}

}
