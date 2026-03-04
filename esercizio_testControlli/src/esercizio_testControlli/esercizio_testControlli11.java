package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Esercizio 1: Verifica Lunghezza Stringa
Crea una classe VerificaLunghezza con un metodo static boolean verificaLunghezza(String s, int maxLen) 
che restituisce true se la stringa s ha lunghezza ≤ maxLen, altrimenti false.
 Nel main, usa Scanner per leggere una stringa e un intero, chiama la funzione e stampa "Valida" o "Troppo lunga".

java
import java.util.Scanner;

// Completa qui: enum non necessario, solo if semplice
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		
		String parola = scanner.nextLine();
		
		System.out.println("Inserisci il limite massimo della stringa");
		int maxLen = scanner.nextInt();
		scanner.nextLine();
		
		if (verificaLunghezza(parola,maxLen))
		{
			System.out.println("Valida");
		}
		else
		{
			System.out.println("Troppo lunga");
		}
		
	}

	public static boolean verificaLunghezza(String s, int maxLen)
	{
		boolean controllo = false;
		if (s.length() <= maxLen)
		{
			controllo = true;
		}
		else
		{
			controllo = false;
		}
		return controllo;
	}
	//voto 9/10
}
