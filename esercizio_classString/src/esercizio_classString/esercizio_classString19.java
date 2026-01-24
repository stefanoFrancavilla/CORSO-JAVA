package esercizio_classString;

import java.util.Scanner;

public class esercizio_classString19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: AnalizzatoreDiTesto

Scrivi un programma Java chiamato AnalizzatoreDiTesto che:

Chiede all’utente una frase

Usa una String per memorizzarla, ad esempio:

String frase = "precipitevolissimevolmente";


(puoi iniziare così, poi in futuro usare Scanner).

Stampa qualche informazione di base

Lunghezza totale della stringa (length()).

Primo carattere e il suo codice numerico (charAt(0) e codePointAt(0)).

Ultimo carattere e il suo codice numerico.

Stampa tutti i caratteri uno per riga

Con un for da 0 a frase.length() - 1:

Stampa:

Posizione i: carattere = X, codice = Y


usando charAt(i) e codePointAt(i).

Crea una versione “alternata” della frase

Nuova stringa fraseAlternata inizialmente vuota "".

Per ogni carattere:

Se l’indice è pari → lettera maiuscola.

Se l’indice è dispari → lettera minuscola.

Puoi fare:

O usando i codici (char ± 32, come hai fatto).

O usando Character.toUpperCase() / toLowerCase() (se vuoi spingerti oltre).

Alla fine stampa la stringa risultante:

System.out.println("Frase alternata: " + fraseAlternata);


Crea la frase al contrario

Usa un altro for che parte da frase.length() - 1 fino a 0.

Costruisci fraseInvertita concatenando i caratteri al contrario.

Stampa fraseInvertita.

Verifica la presenza di una sottostringa

Crea una String sottostringa = "java"; (o un’altra parola).

Usa indexOf(sottostringa):

Se il risultato è -1 → stampa che non è presente.

Altrimenti → stampa la posizione in cui inizia.

Prova anche lastIndexOf(sottostringa) e stampa il risultato.

Usa startsWith ed endsWith

Chiedi al programma (con valori fissati nel codice) ad esempio:

System.out.println(frase.startsWith("pre"));
System.out.println(frase.endsWith("mente"));


Stampa una frase descrittiva del risultato (true/false).

Confronta stringhe con ==, equals, equalsIgnoreCase

Crea:

String s1 = "Rosso";
String s2 = "Rosso";
String s3 = new String("Rosso");
String s4 = "rosso";


Stampa:

System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equalsIgnoreCase(s4));


Aggiungi dei commenti nel codice spiegando cosa succede (String pool, confronto del reference, confronto del contenuto, case sensitive / insensitive).

Prova isEmpty e isBlank

Crea:

String vuota = "";
String soloSpazio = " ";
String conTab = "\t";


Stampa:

System.out.println(vuota.isEmpty());
System.out.println(soloSpazio.isEmpty());
System.out.println(conTab.isEmpty());

System.out.println(vuota.isBlank());
System.out.println(soloSpazio.isBlank());
System.out.println(conTab.isBlank());


Stampa anche la length() di ognuna.

Usa qualche carattere di escape

Crea una stringa:

String citazione = "Cesare disse: \"il dado è tratto\".\nNuova riga con un \\ backslash.";


Stampa la stringa e commenta nel codice a cosa servono \", \\, \n.

Usa un text block

Crea un text block con lo stesso contenuto di citazione (o simile):

String citazione2 = """
        Cesare disse: "il dado è tratto".
        Nuova riga con un \ backslash.
        """;


Stampa entrambe (citazione e citazione2) e confrontale con:

System.out.println(citazione.equals(citazione2));


Aggiungi un commento sul fatto che il text block rende il codice più leggibile.

Usa una costante final

Crea:

final String COSTANTE_APPLICAZIONE = "ANALIZZATORE_V1";


Stampala all’inizio del programma.

Prova a de-commentare una riga in cui cerchi di cambiarla per vedere l’errore del compilatore.
		 */
		

		final String COSTANTE_APPLICAZIONE = "ANALIZZATORE_V1";
		System.out.println(COSTANTE_APPLICAZIONE);
		//COSTANTE_APPLICAZIONE = "analizzatore_v1";
		//Essendo una costante non puo essere modificata in alcun modo.Infatti ache provandoci il sistema ci da errore: (The final local variable COSTANTE_APPLICAZIONE cannot be assigned. It must be blank and not using a compound assignment)
		
		System.out.println("-------------------------------------------------------------------");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una frase");
		
		String frase = scanner.nextLine();
		
		System.out.println("La frase inserita è: " + frase);
		System.out.println("La lunghezza della frase è: " + frase.length());
		System.out.println("Il primo carattere della frase è: " + frase.charAt(0) + " ,ed il suo codice di riferimento è: " + frase.codePointAt(0));
		System.out.println("l'ultimo carattere della frase è: " + frase.charAt(frase.length() -1) + " ,ed il suo codice di riferimento è: " + frase.codePointAt(frase.length() -1));

		System.out.println("-------------------------------------------------------------------");
		for ( int i = 0; i < frase.length(); i++)
		{
			System.out.println("Posizione " + i + " : carattere = " + frase.charAt(i) + " codice = " + frase.codePointAt(i));
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		String fraseAlternata = "";
		
		for (int i = 0; i < frase.length(); i++)
		{
			char carattereCorrente = frase.charAt(i);
			
			if (i % 2 == 0)
			{
				fraseAlternata += Character.toUpperCase(carattereCorrente) ;
			}
			else
			{
				
				fraseAlternata += Character.toLowerCase(carattereCorrente);
			}
		}
		System.out.println("Frase alternata: " + fraseAlternata);
		
		System.out.println("-------------------------------------------------------------------");

		String fraseInvertita = "";
		
		for ( int i = frase.length() -1 ; i >= 0; i-- )
		{
			fraseInvertita += frase.charAt(i);
		}
		System.out.println("Frase invertita: " + fraseInvertita);
		
		System.out.println("-------------------------------------------------------------------");

		String sottoStringa = "java";
		
		if (frase.indexOf(sottoStringa) == -1)
		{
			System.out.println("il carattere non è presente");
		}
		else
		{
			System.out.println("il carattere è presente, alla posizione: " + frase.indexOf(sottoStringa));
		}
		System.out.println("-------------------------------------------------------------------");

		if (frase.lastIndexOf(sottoStringa) == -1)
		{
			System.out.println("Il carattere non è presente");
		}
		else
		{
			System.out.println("il carattere è presente, alla posizione: " + frase.lastIndexOf(sottoStringa));
		}
		System.out.println("-------------------------------------------------------------------");

		String parolaLunga = "preoccupante";
		
		if ( parolaLunga.startsWith("pre") == true)
		{
			System.out.println("La parola parolaLunga inizia con questa sequenza di caratteri");
		}
		else
		{
			System.out.println("La parola parolaLunga non inizia con questa sequenza di caratteri");
		}
		System.out.println("-------------------------------------------------------------------");

		if ( parolaLunga.endsWith("nte") == true)
		{
			System.out.println("La parola parolaLunga finisce con questa sequenza di caratteri");
		}
		else
		{
			System.out.println("La parola parolaLunga non finisce con questa sequenza di caratteri");
		}
		System.out.println("-------------------------------------------------------------------");

		String s1 = "Rosso";
		String s2 = "Rosso";
		String s3 = new String("Rosso");
		String s4 = "rosso";
		
		System.out.println(s1 == s2); // In questo caso s1 è identico a s2 poichè hanno lo stesso reference, di conseguenza il risultato sarà true.
		System.out.println(s1 == s3); // Anche se la sequenza di caratteri è la stessa, s3 usa il costruttore è quindi ha un reference differente, di conseguenza il risultato sarà false.
		System.out.println(s1.equals(s3)); // Con equals, stiamo prendendo in considerazione solo la sequenza di caratteri, in questo caso s1 e s3 coincidono, quindi il risultato sarà true 
		System.out.println(s1.equals(s4));// In questo caso anche se la sequenza di caratteri è la stessa, s4 usa un carattere iniziale il maiuscolo. In conclusione il risultato sarà false.
		System.out.println(s1.equalsIgnoreCase(s4)); // Con la funzione equalsIgnore stiamo prendendo in cosiderazione la sequenza di caratteri, ignorando che sia maiuscolo o minuscolo.Quindi il risultato sarà true.
		System.out.println("-------------------------------------------------------------------");
		
		String vuota = "";
		String soloSpazio = " ";
		String conTab = "\t";
		
		System.out.println(vuota.isEmpty()); // Nel caso seguente, con isEmpty stiamo chiedendo se la lunghezza della stringa è 0, di conseguenza il risultato sarà true 
		System.out.println(soloSpazio.isEmpty());// Anche lo spazio è un carattere, quindi la sua lunghezza è 1 e quindi risposta sarà false.
		System.out.println(conTab.isEmpty());// Stessa cosa, come lo spazio.Il tab viene considerato un catrattere, quindi anche qui la sua lunghezza è 1 e quindi la risposta è false. 
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println(vuota.isBlank()); //Con il comando isBlank stiamo chiedendo se la stringa contiene un carattere al suo interno, non tenedo inm considerazione i caratteri di spaziatura, quindi true.
		System.out.println(soloSpazio.isBlank());// Anche lo spazio fa parte dei caratteri di spaziatura, quindi non lo tiene in cosiderazione come carattere, di conseguenza il risultato sarà true.
		System.out.println(conTab.isBlank());// Stessa cosa per il tab, essendo un carattere di spaziatura non viene preso in cosiderazione, di conseguenza il risultato è true.
		System.out.println("-------------------------------------------------------------------");

		System.out.println(vuota.length()); // Con questa stampa stiamo dimostrando che la sua lunghezza è 0, quindi una stringa vuota.
		System.out.println(soloSpazio.length());// Anche se può sembrare vuota la sua lunghezza è 1, perchè lo spazio è comunque un carattere. 
		System.out.println(conTab.length());// Stessa cosa dello spazio, la sua lunghezza è 1 , poichè il tab è comunque considerato un carattere.
		
		System.out.println("-------------------------------------------------------------------");

		String citazione = "Cesare disse: \"il dado è tratto\"."
				+ "\nNuova riga con un \\ backslash.";
		
		String citazione2 = """
		        Cesare disse: "il dado è tratto".
		        Nuova riga con un \\ backslash.
		        """;
		System.out.println(citazione); // Con la funzione \n possiamo concatenare più frasi di un teso rendendolo più intuitiva la sua lettura.
		//Nella stringa citazione abbiamo usato \" , è un'escape che ci serve per mandare a stampa il carattere (").
		//Abbiamo utilizzato anche un'escape \\ , che manda a stampa il carattere (\).
		// Infine abbiamo urilizzato \n , che ci consente di andare a capo e continuare il nostro testo.
		System.out.println();
		System.out.println(citazione2);// Con text block invece oltre ad essere intuitiva la lettura, è più semplice anche nella scrittura
		
		System.out.println(citazione.equals(citazione2));
		
		scanner.close();
		
		/*
		 * 8.5/10 (se devo mettere un numero intero: 9/10)

Motivo: lavoro completo, ben commentato e quasi tutto aderente alla traccia. Ti tolgo qualcosina per:

mancato controllo su stringa vuota (bug possibile),

startsWith/endsWith applicati a una variabile diversa da frase come richiesto,

piccoli dettagli di precisione e ottimizzazione.
		 */
	}
}
