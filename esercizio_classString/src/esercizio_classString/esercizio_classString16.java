package esercizio_classString;

import java.util.Random;
import java.util.Scanner;

public class esercizio_classString16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ESERCIZIO: Generatore di Password Avanzato

Realizza un programma Java che:

✔️ 1. Chiede all’utente:

la lunghezza della password,

se desidera includere:

lettere maiuscole

lettere minuscole

numeri

simboli speciali

(es. @ _ # ! ? % $)

✔️ 2. In base alle preferenze, costruisce dinamicamente la stringa dei caratteri disponibili.

Esempio: se l’utente sceglie solo numeri e maiuscole → la stringa sarà "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".

✔️ 3. Usa StringBuilder per generare la password

con il metodo che hai già compreso:

Random

nextInt()

charAt()

append()

✔️ 4. Mostra in output:

la password generata,

la sua lunghezza (length()),

la capacity del StringBuilder,

il tempo impiegato per generarla usando System.nanoTime().

✔️ 5. Funzionalità extra (opzionale):

Il programma deve generare almeno 1 carattere per ogni categoria selezionata.

💡 Obiettivo dell’esercizio

Mettere in pratica:

costruzione dinamica di una stringa,

uso della classe Random,

selezione di caratteri con charAt,

comprensione di StringBuilder e capacity,

gestione dell’input da tastiera,

cicli e condizioni,

creazione di un piccolo algoritmo.
 */
		
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder password = new StringBuilder();
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Quanti caratteri deve avere la password?");
		int lunghezzaPassword = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Nella password vuoi inserire i caratteri maiuscoli? si/no ");
		String sceltaMaiuscola = scanner.nextLine();
		System.out.println();
		
		System.out.print("Nella password vuoi inserire i caratteri minuscoli? si/no ");
		String sceltaMinuscoli = scanner.nextLine();
		System.out.println();

		System.out.print("Nella password vuoi inserire i caratteri numerici? si/no ");
		String sceltaNumeri = scanner.nextLine();
		System.out.println();

		System.out.print("Nella password vuoi inserire i simboli? si/no ");
		String sceltaSimboli = scanner.nextLine();
		System.out.println();
		
		StringBuilder maiuscole = new StringBuilder("ABCDEFGHILMNOPQRSTUVZ");
		StringBuilder minuscole = new StringBuilder("abcdefghilmnopqrstuvz");
		StringBuilder numeri = new StringBuilder("1234567890");
		StringBuilder simboli = new StringBuilder("@ _#!?%$");
		
		StringBuilder caratteriPassword = new StringBuilder("");
		
		if(sceltaMaiuscola.equalsIgnoreCase("si"))
		{
			caratteriPassword.append(maiuscole);
		}
		
		if(sceltaMinuscoli.equalsIgnoreCase("si"))
		{
			caratteriPassword.append(minuscole);
		}
		
		if(sceltaNumeri.equalsIgnoreCase("si"))
		{
			caratteriPassword.append(numeri);
		}
		
		if(sceltaSimboli.equalsIgnoreCase("si"))
		{
			caratteriPassword.append(simboli);
		}
		
		Random random = new Random();
		
		for (int i = 0; i < lunghezzaPassword; i++)
		{
			int indiceCasuale = random.nextInt(caratteriPassword.length());
			
			char carattereCorrente = caratteriPassword.charAt(indiceCasuale);
			
			password.append(carattereCorrente);
		}
		
		long endTime =System.currentTimeMillis();
		
		System.out.println("La password è: " + password);
		System.out.println("La lunghezza dela password è: " + password.length());
		System.out.println("La capacity della password è: " + password.capacity());
		System.out.println("Il tempo impiegato alla creazione della password è: " + (endTime - startTime) + " millisecondi.");
		
	}

}
