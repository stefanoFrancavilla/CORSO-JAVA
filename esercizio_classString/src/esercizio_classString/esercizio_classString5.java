package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ESERCIZIO: Analizzatore di Testo con indexOf()

Scrivi un programma Java che:

1️⃣ Chiede all’utente di inserire una frase.
2️⃣ Chiede all’utente di inserire una parola da cercare nella frase.
3️⃣ Usa indexOf() per:

verificare se la parola è contenuta nella frase

trovare la prima posizione della parola

trovare tutte le posizioni in cui compare la parola (usando indexOf con offset)

4️⃣ Stampa i risultati:

Esempio di output:

Parola trovata!
Prima posizione: 10
La parola compare anche agli indici: 10, 25, 40

5️⃣ Se la parola non viene trovata:

Mostra:

La parola non è presente nel testo.

⭐ Sfida extra (facoltativa)

Aggiungi queste funzioni:

🔹 A) Controlla se la frase contiene una vocale specificata dall’utente

– l’utente inserisce una vocale
– usa indexOf('a'), indexOf('e') ecc.

🔹 B) Usa codici Unicode per cercare un carattere

Esempio:

indexOf('\u0041'); // Cerca 'A'

🔹 C) Cerca due caratteri consecutivi (come "NO")

Usa indexOf("NO").

🎯 Obiettivo dell’esercizio

Mettere in pratica:

✔ indexOf(char)
✔ indexOf(String)
✔ indexOf(char, fromIndex)
✔ ricerca con offset (loop per trovare più occorrenze)
✔ confronto del risultato con -1
✔ uso con Unicode \ uXXXX
 */
		  Scanner scanner = new Scanner(System.in);
		  
	    System.out.println("Inserisci un testo o una frase:");
        String frase = scanner.nextLine().toUpperCase();

        System.out.println("-------------------------");

        
        System.out.println("Inserisci una parola da ricercare nel testo:");
        String parolaRicerca = scanner.nextLine().toUpperCase();

       
        System.out.println("Inserisci due caratteri consecutivi da cercare:");
        String caratteri = scanner.nextLine().toUpperCase();

        System.out.println("-------------------------");

     
        int primaPosizione = frase.indexOf(parolaRicerca);
        if (primaPosizione > -1) {
            System.out.println("La parola \"" + parolaRicerca + "\" è contenuta nel testo.");
            System.out.println("Prima posizione: " + primaPosizione);

          
            int indice = 0;
            System.out.print("La parola compare anche agli indici: ");
            boolean trovato = false;
            while ((indice = frase.indexOf(parolaRicerca, indice)) > -1) {
                System.out.print(indice + " ");
                indice += parolaRicerca.length();
                trovato = true;
            }
            if (!trovato) {
                System.out.print("Nessuna altra occorrenza trovata.");
            }
            System.out.println();
        } else {
            System.out.println("La parola \"" + parolaRicerca + "\" non è presente nel testo.");
        }

        System.out.println("-------------------------");

        
        if (frase.indexOf(caratteri) > -1) {
            System.out.println("La sequenza \"" + caratteri + "\" è presente nel testo alla posizione: " + frase.indexOf(caratteri));
        } else {
            System.out.println("La sequenza \"" + caratteri + "\" non è presente nel testo.");
        }

        System.out.println("-------------------------");

        
        System.out.println("Inserisci un codice numerico Unicode (es. 65 per 'A') da cercare:");
        int codice = scanner.nextInt();
        char carattereUnicode = (char) codice;

        if (frase.indexOf(carattereUnicode) > -1) {
            System.out.println("Il carattere '" + carattereUnicode + "' è presente nel testo alla posizione: " + frase.indexOf(carattereUnicode));
        } else {
            System.out.println("Il carattere '" + carattereUnicode + "' non è presente nel testo.");
        }

        scanner.nextLine(); 

        System.out.println("-------------------------");

       
        System.out.println("Inserisci una vocale da cercare nella frase:");
        String vocale = scanner.nextLine().toUpperCase();

        if (vocale.length() == 1 && "AEIOU".contains(vocale)) {
            char vocaleChar = vocale.charAt(0);
            int posVocale = frase.indexOf(vocaleChar);
            if (posVocale > -1) {
                System.out.println("La vocale '" + vocaleChar + "' è presente alla posizione: " + posVocale);
            } else {
                System.out.println("La vocale '" + vocaleChar + "' non è presente nel testo.");
            }
        } else {
            System.out.println("Non hai inserito una vocale valida.");
        }

        System.out.println("-------------------------");
        System.out.println("Fine analisi.");
	}

}
