package esercizi_6;

import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Scrivere un programma che richieda all’utente di inserire una stringa e ne stampi solo le vocali.
   Per esempio, se viene inserita la stringa "Ciao Ciccio!", il programma stampa "iaoiio".
 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa.");
		
		String parola = scanner.nextLine();
		
		String vocali = "aeiouAEIOU";
		String stampaVocali = "";
		for (int i = 0; i < parola.length(); i++)
		{
			char carattereCorrente = parola.charAt(i);
			for(int c = 0; c < vocali.length();c++)
			{
				char vocale = vocali.charAt(c);
				if (carattereCorrente == vocale)
				{
					stampaVocali = stampaVocali + carattereCorrente;
				}
			}
		}
		System.out.println(stampaVocali);
	}
//voto 9.5/10
}
