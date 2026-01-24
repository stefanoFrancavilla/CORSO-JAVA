package esercizio_classString;

public class esercizio_classString20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// -----------------------------------------mini esame riassuntivo--------------------------------
		
		/*
		 * Ti propongo un “mini esame” strutturato a livelli, basato esattamente sulle cose che hai usato nel tuo codice:

String, char, codePointAt, length, charAt

immutabilità delle stringhe, toUpperCase, == vs .equals

indexOf, lastIndexOf, startsWith, endsWith, isEmpty, isBlank

split, String.join

StringBuilder / StringBuffer, capacity, length, append, insert, replace, delete, reverse

Random e generazione di stringhe casuali

cicli for, while annidati

Parte 1 – Teoria & concetti (risposta scritta)

1. Immutabilità di String (3 punti)
Spiega con le tue parole cosa significa che le stringhe in Java sono immutabili e descrivi cosa succede in memoria quando esegui queste istruzioni:

String s = "ciao";
s = s.toUpperCase();


2. == vs .equals (3 punti)
Dato il seguente codice:

String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b);
System.out.println(a == c);
System.out.println(a.equals(c));


Scrivi che output ti aspetti (true/false).

Spiega perché ottieni quei risultati, parlando di:

string literal pool

oggetti diversi con new String(...)

3. isEmpty() vs isBlank() (3 punti)
Per ognuna delle seguenti stringhe indica il risultato di isEmpty() e isBlank() e spiega il perché.

String s1 = "";
String s2 = " ";
String s3 = "\t";
String s4 = "ciao";


Completa una tabellina tipo:

Stringa	s.isEmpty()	s.isBlank()	Spiegazione breve
s1			
s2			
s3			
s4			

4. indexOf e lastIndexOf (3 punti)
Hai questa stringa:

String testo = "ABCDABCDABCD";


Cosa restituisce testo.indexOf("CD")?

Cosa restituisce testo.lastIndexOf("CD")?

Cosa restituisce testo.indexOf("Z") e perché?

5. startsWith / endsWith (2 punti)
Scrivi il risultato (true/false) e una breve spiegazione:

String parola = "programmazione";

parola.startsWith("pro")
parola.startsWith("Pro")
parola.endsWith("zione")
parola.endsWith("zioni")

Parte 2 – Lettura e comprensione codice

6. Analisi di un ciclo con charAt (4 punti)

Che cosa stampa il seguente codice? (Scrivi l’output completo, riga per riga.)

String s = "Java";

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    int code = s.codePointAt(i);
    System.out.println("i=" + i + ", c=" + c + ", code=" + code);
}


7. Analisi split e join (4 punti)

Che cosa conterrà l’array parole e cosa conterrà frase2?

String frase = "Uno Due Tre Quattro";
String[] parole = frase.split(" ");

String frase2 = String.join("-", parole);


Scrivi il contenuto di parole elemento per elemento.

Scrivi il valore finale di frase2.

8. StringBuilder – capacity vs length (4 punti)

Considera:

StringBuilder sb = new StringBuilder("Ciao");
System.out.println("capacity: " + sb.capacity());
System.out.println("length  : " + sb.length());

sb.append(" a tutti!");
System.out.println("capacity: " + sb.capacity());
System.out.println("length  : " + sb.length());


Spiega concettualmente la differenza tra capacity() e length().

Senza fissarti sul numero esatto, descrivi come può cambiare la capacity e quando viene aumentata.

Parte 3 – Esercizi pratici di programmazione (scrivi il codice)
9. Alternanza maiuscole/minuscole (6 punti)

Scrivi un metodo:

public static String alternaMaiuscoleMinuscole(String input)


Che prende una stringa e restituisce una nuova stringa in cui:

i caratteri in posizione pari (0, 2, 4, …) sono maiuscoli

i caratteri in posizione dispari sono minuscoli

Esempio:

input: "precipitevolissimevolmente"

output atteso: "PrEcIpItEvOlIsSiMeVoLmEnTe"

Vincolo:

non usare -32, usa invece i metodi di Character (Character.toUpperCase, Character.toLowerCase).

10. Reverse di una stringa (3 punti)

Scrivi un metodo:

public static String inverti(String input)


che restituisce la stringa input al contrario, senza usare StringBuilder.reverse().

Suggerimento: usa un ciclo che parte da input.length() - 1 fino a 0.

11. Cerca parola in una frase (4 punti)

Scrivi un metodo:

public static boolean contieneParola(String frase, String parola)


che restituisce true se parola è presente in frase, false altrimenti.

Requisiti:

Usa indexOf.

Ignora maiuscole/minuscole (puoi usare toLowerCase() o toUpperCase()).

Esempi:

contieneParola("Marco Rossi", "Rossi") → true

contieneParola("Marco Rossi", "rossi") → true

contieneParola("Marco Rossi", "Bianchi") → false

12. Split e stampa formattata (5 punti)

Hai una stringa con parole separate da virgola:

String prodotti = "Pane,Latte,Uova,Burro,Formaggio";


Scrivi un metodo che:

Usa .split(",") per creare un array di stringhe.

Stampa ogni elemento in una riga diversa nel formato:

Prodotto 1: Pane
Prodotto 2: Latte
...

13. Generatore di password (6 punti)

Partendo dall’idea del tuo codice, scrivi un metodo:

public static String generaPassword(int lunghezza)


che:

Usa questa stringa di caratteri disponibili:

String caratteri = "ABCDEFGHILMNOPQRSTUVZ1234567890_@";


Usa Random per scegliere caratteri casuali.

Usa StringBuilder per costruire la password.

Restituisce una password lunga lunghezza.

14. Uso avanzato di StringBuilder (8 punti)

Scrivi un metodo:

public static String formattaFrase(String nome, int eta, String citta)


che deve restituire una frase del tipo:

"Ciao NOME, hai ETA anni e vivi a CITTA."


Requisiti:

Usa solo StringBuilder (niente concatenazioni con +).

Cambia il nome in maiuscolo usando toUpperCase().

Se citta è vuota o isBlank(), usa la stringa "una città sconosciuta".

Esempi:

formattaFrase("Luca", 30, "Mantova") → "Ciao LUCA, hai 30 anni e vivi a Mantova."

formattaFrase("Marco", 25, " ") → "Ciao MARCO, hai 25 anni e vivi a una città sconosciuta."

15. Confronto prestazioni String vs StringBuilder (bonus – 8 punti)

Scrivi un piccolo programma che:

Usa una String e in un ciclo da 0 a 50_000 fa:

s = s + "x";


Usa uno StringBuilder e in un ciclo da 0 a 50_000 fa:

sb.append("x");


Misura il tempo con System.currentTimeMillis() come nel tuo esempio e stampa i due tempi.

Poi, in poche righe, scrivi le tue conclusioni:

Chi è più veloce e di quanto circa?

Perché?

Come usare questo “esame”

Prova a farlo come se fossi davvero a un esame:

Niente copia-incolla da internet 😀

Puoi usare solo l’IDE per compilare e provare.

Punteggio indicativo: /60 + bonus.

Quando hai finito:

Se vuoi, incollami le tue soluzioni (una parte alla volta) e ti faccio una correzione dettagliata con suggerimenti su cosa ripassare.

Oppure posso fornirti io una possibile soluzione commentata per confrontare il tuo lavoro.

Se vuoi, posso anche trasformare questi esercizi in un unico file Main.java già strutturato, dove tu devi solo riempire i metodi.
		 */
	}

}
