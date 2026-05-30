package appunti;

public class Appunti_stringEfunzioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * String: a cosa serve
String rappresenta testo, cioè sequenze di caratteri. In Java le stringhe sono oggetti e hanno tanti metodi già pronti per lavorare sul testo.

Le funzioni più usate di String
Ecco le più utili da conoscere:

length() → restituisce la lunghezza della stringa.

charAt(int index) → restituisce il carattere in una posizione.

substring(...) → prende una parte della stringa.

equals(...) → confronta due stringhe.

equalsIgnoreCase(...) → confronta senza distinguere maiuscole/minuscole.

contains(...) → controlla se una stringa contiene un testo.

startsWith(...) / endsWith(...) → controlla inizio o fine.

toUpperCase() / toLowerCase() → cambia tutto in maiuscolo o minuscolo.

trim() → toglie gli spazi all’inizio e alla fine.

replace(...) → sostituisce una parte di testo.

split(...) → divide la stringa in parti.

indexOf(...) → cerca la posizione di un testo.

isEmpty() → controlla se è vuota.

Esempi semplici
java
String testo = "Ciao Java";

System.out.println(testo.length());          // 9
System.out.println(testo.charAt(0));         // C
System.out.println(testo.substring(5));      // Java
System.out.println(testo.toUpperCase());     // CIAO JAVA
System.out.println(testo.contains("Java"));  // true
java
String nome = "   Marco   ";
System.out.println(nome.trim());             // Marco
java
String frase = "Java è bello";
String[] parti = frase.split(" ");
String e wrapper: differenza semplice
I wrapper servono per trasformare i primitivi in oggetti.

String serve per gestire il testo.

Quindi:

int → Integer

double → Double

boolean → Boolean

char → Character

ma per il testo usi direttamente String.

Come si usa bene
Usa String quando lavori con:

nomi;

frasi;

messaggi;

dati letti da input;

controlli su testo.

Per esempio:

java
String nome = "Stefano";
String saluto = "Ciao " + nome;
Regola facile
Wrapper = per i numeri, i booleani e i caratteri quando servono come oggetti.

String = per il testo, con tanti metodi utili già pronti.




String in Java: funzioni e utilizzo
La classe String serve per lavorare con il testo. Qui trovi le funzioni più importanti spiegate in modo semplice, con il loro utilizzo.

1. length()
Cosa fa
Restituisce il numero di caratteri della stringa.

Utilizzo
Usala quando vuoi sapere quanto è lunga una parola o una frase.

Esempio
java
String testo = "Ciao";
System.out.println(testo.length());
Risultato
java
4
2. charAt(int index)
Cosa fa
Restituisce il carattere nella posizione indicata.

Utilizzo
Usala quando vuoi leggere un carattere preciso dentro la stringa.

Esempio
java
String testo = "Java";
System.out.println(testo.charAt(0));
Risultato
java
J
3. substring()
Cosa fa
Prende una parte della stringa.

Utilizzo
Usala quando ti serve solo un pezzo del testo, per esempio il nome file senza estensione o una parola dentro una frase.

Esempio
java
String testo = "Programmazione";
System.out.println(testo.substring(0, 7));
Risultato
java
Program
4. equals()
Cosa fa
Confronta due stringhe e controlla se sono uguali.

Utilizzo
Usala quando vuoi verificare se due testi sono identici, per esempio username, password o risposte.

Esempio
java
String a = "Ciao";
String b = "Ciao";
System.out.println(a.equals(b));
Risultato
java
true
5. equalsIgnoreCase()
Cosa fa
Confronta due stringhe senza considerare maiuscole e minuscole.

Utilizzo
Usala quando il testo deve essere uguale anche se scritto in modo diverso, per esempio "ciao" e "CIAO".

Esempio
java
String a = "Ciao";
String b = "ciao";
System.out.println(a.equalsIgnoreCase(b));
Risultato
java
true
6. contains()
Cosa fa
Controlla se una stringa contiene un certo testo.

Utilizzo
Usala quando vuoi cercare una parola dentro una frase o verificare se un testo è presente.

Esempio
java
String frase = "Java è bello";
System.out.println(frase.contains("bello"));
Risultato
java
true
7. startsWith()
Cosa fa
Controlla se la stringa inizia con un certo testo.

Utilizzo
Usala quando vuoi verificare l'inizio di un nome file, di un codice, di un indirizzo o di una parola.

Esempio
java
String file = "foto.jpg";
System.out.println(file.startsWith("foto"));
Risultato
java
true
8. endsWith()
Cosa fa
Controlla se la stringa finisce con un certo testo.

Utilizzo
Usala quando vuoi controllare il finale di una stringa, per esempio un'estensione file come .jpg o .txt.

Esempio
java
String file = "foto.jpg";
System.out.println(file.endsWith(".jpg"));
Risultato
java
true
9. toUpperCase()
Cosa fa
Trasforma tutti i caratteri in maiuscolo.

Utilizzo
Usala quando vuoi uniformare il testo o mostrarlo tutto in maiuscolo.

Esempio
java
String testo = "Ciao Java";
System.out.println(testo.toUpperCase());
Risultato
java
CIAO JAVA
10. toLowerCase()
Cosa fa
Trasforma tutti i caratteri in minuscolo.

Utilizzo
Usala quando vuoi confrontare testi senza problemi di maiuscole o minuscole, oppure quando vuoi renderli tutti uguali.

Esempio
java
String testo = "Ciao Java";
System.out.println(testo.toLowerCase());
Risultato
java
ciao java
11. trim()
Cosa fa
Elimina gli spazi all'inizio e alla fine della stringa.

Utilizzo
Usala quando l'utente inserisce spazi in più e vuoi pulire il testo.

Esempio
java
String nome = "   Marco   ";
System.out.println(nome.trim());
Risultato
java
Marco
12. replace()
Cosa fa
Sostituisce una parte della stringa con un'altra.

Utilizzo
Usala quando vuoi cambiare una parola, una lettera o un simbolo dentro il testo.

Esempio
java
String testo = "Ciao Java";
System.out.println(testo.replace("Java", "mondo"));
Risultato
java
Ciao mondo
13. split()
Cosa fa
Divide la stringa in più parti.

Utilizzo
Usala quando vuoi separare una frase in parole, oppure un testo usando un separatore come spazio, virgola o trattino.

Esempio
java
String frase = "Java è bello";
String[] parti = frase.split(" ");
Risultato
parti[0] = Java

parti[1] = è

parti[2] = bello

14. indexOf()
Cosa fa
Restituisce la posizione di un carattere o di una parola dentro la stringa.

Utilizzo
Usala quando vuoi cercare dove si trova qualcosa nel testo.

Esempio
java
String testo = "Java";
System.out.println(testo.indexOf("v"));
Risultato
java
2
15. isEmpty()
Cosa fa
Controlla se la stringa è vuota.

Utilizzo
Usala quando vuoi sapere se l'utente non ha scritto niente.

Esempio
java
String testo = "";
System.out.println(testo.isEmpty());
Risultato
java
true
16. Esempio completo
java
public class EsempioString {
    public static void main(String[] args) {
        String nome = "  Stefano  ";

        String pulito = nome.trim();
        System.out.println(pulito);
        System.out.println(pulito.length());
        System.out.println(pulito.toUpperCase());
        System.out.println(pulito.contains("Ste"));
        System.out.println(pulito.substring(0, 3));
    }
}
Cosa mostra
trim() pulisce il testo;

length() conta i caratteri;

toUpperCase() mette tutto in maiuscolo;

contains() controlla se una parte del testo c'è;

substring() prende solo una parte del testo.

17. Regola facile
Se lavori con parole o frasi, usi String.
Se vuoi controllarla o modificarla, usi i suoi metodi.
Se un metodo sembra cambiare la stringa, ricorda che spesso crea una nuova stringa invece di modificare l'originale.
		 */
	}

}
