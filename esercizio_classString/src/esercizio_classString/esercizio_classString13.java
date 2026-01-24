package esercizio_classString;

import java.util.Scanner;

public class esercizio_classString13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Converti, Modifica e Ricostruisci una Frase
Descrizione

Scrivi un programma che:

Chieda all’utente di inserire una frase.

Divida la frase in parole usando .split(" "), ottenendo un array.

Modifichi l'array (vedi richieste specifiche sotto).

Ricomponga la frase usando String.join(" ", arrayModificato).

Stampi la frase finale.

✏️ Richieste specifiche

Dopo aver ottenuto l’array:

Trasforma tutte le parole in maiuscolo

Aggiungi alla fine dell’array la parola "FINE"

Ricomponi la frase usando String.join(" ", array)

🎯 Obiettivo didattico

Usare split()

Manipolare un array di stringhe

Usare String.join() come nel tuo esempio

Capire l’importanza del delimitatore passato a join()

🔍 Esempio di input/output

Input utente:

ciao come stai


Array generato:

["ciao","come","stai"]


Array modificato:

["CIAO","COME","STAI","FINE"]


Output finale:

CIAO COME STAI FINE

		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una frase");
		
		String frase = scanner.nextLine();
		
		System.out.println();
        System.out.println(" La frase inserita è: " + frase);
		System.out.println("-----------------------------------------------------");

		
		String [] paroleFrase = frase.split(" ");
		System.out.println("Array generato: ");
		System.out.println();

		
		for(int i = 0; i < paroleFrase.length; i++)
		{
			System.out.println(paroleFrase[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		String[] paroleFraseMaiuscolo = new String[paroleFrase.length + 1 ];
		paroleFraseMaiuscolo[paroleFraseMaiuscolo.length - 1] = "FINE";
		
		System.out.println("Array modificato: ");
		System.out.println();


		for(int s = 0; s < paroleFrase.length; s++)
		{
			paroleFraseMaiuscolo[s] = paroleFrase[s].toUpperCase();
			System.out.println(paroleFraseMaiuscolo[s]);
			}	
		System.out.println(paroleFraseMaiuscolo[paroleFraseMaiuscolo.length - 1]);
		
		System.out.println("-----------------------------------------------------");

		String fraseMaiuscolo = String.join(" ", paroleFraseMaiuscolo);
		System.out.println("Output finale: ");
		System.out.println(fraseMaiuscolo);
		System.out.println("-----------------------------------------------------");

		scanner.close();
		
		// 9/10 voto finale
	}

}
