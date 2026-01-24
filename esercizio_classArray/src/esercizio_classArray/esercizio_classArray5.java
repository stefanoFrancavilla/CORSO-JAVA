package esercizio_classArray;

public class esercizio_classArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma Java chiamato SommaNumeri che:

Accetti due numeri interi tramite gli argomenti del metodo main
(cioè tramite args[0] e args[1]).

Controlli che l’utente abbia effettivamente inserito due argomenti.

Se ne ha inserito meno, stampa un messaggio di errore:

Devi inserire due numeri interi come argomenti!


Se sono presenti due argomenti:

Converti gli argomenti da String a int

Calcola la somma

Stampa a schermo il risultato, per esempio:

La somma è: 15

🔍 Esempio di output

Se lanci il programma così:

10 5


Il programma dovrà stampare:

La somma è: 15

⭐ Obiettivo didattico

Utilizzare args[]

Controllare la lunghezza dell’array

Convertire valori (Integer.parseInt)

Gestire errori di input
		 */
		
		int sommaNumeri = 0;
		
		for(int i = 0; i < args.length; i++)
		{
		   Integer.parseInt(args[i]);
			sommaNumeri = sommaNumeri + Integer.parseInt(args[i]);
		}
		
		System.out.println("La somma è: " + sommaNumeri);
		System.out.println("la lunghezza dell'array è: " + args.length);


		 
	
		
	}

}
