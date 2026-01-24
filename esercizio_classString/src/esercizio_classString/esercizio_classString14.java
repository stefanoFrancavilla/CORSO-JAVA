package esercizio_classString;

import java.util.Scanner;

public class esercizio_classString14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1 – Creazione e modifica di una frase

Obiettivo: usare StringBuilder e append().

Consegna:
Crea un programma che costruisce questa frase:

"Marco sta studiando Java e vuole migliorare ogni giorno."

Ma devi costruirla pezzo per pezzo usando solo StringBuilder e vari append().

Richiesta:

Usa almeno 5 append()

Stampa la frase finale con toString()

Stampa anche la capacità iniziale e finale del builder


✅ Esercizio 2 – Gestione capacità

Obiettivo: esercitarsi con capacity(), ensureCapacity(), e append che superano la capacità.

Consegna:

Crea un StringBuilder con capacità iniziale 10

Visualizza la capacità

Aggiungi una frase che superi chiaramente la capacità, per esempio:
"Oggi è una bella giornata per programmare!"

Stampa la capacità dopo l’append

Spiega nei commenti perché la capacità è cambiata


✅ Esercizio 3 – Costruire una lista di elementi

Obiettivo: costruire dinamicamente una stringa complessa senza creare centinaia di oggetti String.

Consegna:
Scrivi un programma che:

Chiede all’utente quanti nomi vuole inserire

Li aggiunge a una lista formattata, ad esempio:

Lista dei partecipanti:
- Luca
- Sara
- Martina
- Giorgio


La costruzione del testo deve usare solo StringBuilder

Alla fine stampa:

la lista completa

la capacità finale del builder

quanti caratteri contiene (length())


🔥 Esercizio bonus – Clonare uno StringBuilder

Obiettivo: usare il costruttore che riceve una stringa.

Consegna:

Crea uno StringBuilder con un testo a piacere

Creane un secondo passando builder1.toString()

Modifica solo il secondo aggiungendo qualcosa

Mostra che builder1 non viene modificato

Spiega perché
		 */
		
		
		System.out.println("----------------------Esercizio 1--------------------------");
		StringBuilder frase = new StringBuilder();
		
		System.out.println("La capacità iniziale è: " + frase.capacity());
		System.out.println();
		
		frase.append("Marco");
		frase.append(" sta");
		frase.append(" studiando");
		frase.append(" Java");
		frase.append(" e");
		frase.append(" vuole");
		frase.append(" migliorare");
		frase.append(" ogni");
		frase.append(" giorno.");
		
		System.out.println(frase.toString());
		System.out.println();

		System.out.println("La capacità finale è: " + frase.capacity());
		System.out.println();

		System.out.println("----------------------Esercizio 2--------------------------");

		StringBuilder frase2 = new StringBuilder(10);
		
		System.out.println("La capacity iniziale di frase2 è: " + frase2.capacity());
		System.out.println();

		frase2.append("Oggi è una bella giornata per programmare!");
		
		System.out.println("La capacity finale di frase2 è: " + frase2.capacity());
		System.out.println();
		
		/*
		 * La capacity iniziale di frase2 è di 10, poichè l'abbiamo impostato noi con il costruttore,
		 * altrimenti sarebbe stata 16 di default. 
		 * Siccome la frase superava la cacity iniziale di 10,
		 * lo StringBuilder ha aumentato la sua capacity in modo da far rientrare la frase.
		 * La regola seguita è la seguente: aggiunge prima 1 alla capacity per poi moltiplicare il tutto per 2. 
		 */
		
		System.out.println("----------------------Esercizio 3--------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanti nomi vuoi inserire nella lista?");
		
		int numeroNomi = scanner.nextInt();
		scanner.nextLine();
		
		StringBuilder nomi = new StringBuilder();
		String spazio = " ";
		
		for (int i = 0; i < numeroNomi; i++)
		{
			System.out.print("Inserisci il nome  ");
			nomi.append(scanner.nextLine() + spazio);
			}
		
		System.out.println();
		System.out.println("I nomi inseriti dall'utente sono: " + nomi);
		System.out.println();
		System.out.println("La capacity dopo l'inserimento dei nomi è: " + nomi.capacity());
		System.out.println();
		System.out.println("La length dopo l'inserimento dei nomi è: " + nomi.length());
		
		System.out.println("----------------------Esercizio Bonus--------------------------");
		
		StringBuilder builder1 = new StringBuilder("La mamma sta cucinando");
		
		StringBuilder builder2 = new StringBuilder(builder1.toString());
		
		System.out.println("La frase iniziale di builder1 è: " + builder1.toString());
		System.out.println();

		System.out.println("La frase iniziale di builder2 è: " + builder2.toString());
		System.out.println("--------------------------------------------------------");

		builder2.append(", speriamo sia buono.");
		
		System.out.println("La frase finale di builder1 è: " + builder1.toString());
		System.out.println();
		
		System.out.println("La frase finale di builder2 è: " + builder2.toString());
		System.out.println();
		
		scanner.close();
		/*
		 * Nell'esercizio bonus abbiamo utilizzato la sequenza di caratteri di cui era composta builder1, per formare builder2.
		 * Abbiamo proceduto a modificare builder2 con un'append , aggiungendogli un'alptra sequenza di caratteri.
		 * Come si può notare dall'output finale , sono due oggetti distinti.
		 * Anche se le due sequenze di carattere sono le medesime all'inizio, modificando l'oggetto builder2 , non si va  a compromettere la sequeza di caratteri di builder1
		 * Bisogna vederli come due oggetti separati, con due indirizzi diversi
		 * 
		 */
		
		
		// voto finale 9/10
	}

}
