package esercizio_classString;

public class esercizio_classString15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Editor di Testo Semplificato con StringBuilder

Scrivi un programma che simuli un piccolo editor di testo usando StringBuilder.
Il programma deve:

✏️ 1. Creare uno StringBuilder con una frase iniziale

Esempio frase iniziale:

"Oggi è una splendida giornata"

➕ 2. Aggiungere (append) una seconda frase, ad esempio:
" e ho voglia di fare una passeggiata."

📌 3. Inserire (insert) una parola alla posizione corretta

Ad esempio, dopo la parola "splendida", inserire:

" e luminosa"

🔁 4. Sostituire (replace) una parte della frase

Sostituisci la parola:

"passeggiata"


con:

"corsa"

❌ 5. Eliminare (delete) una parte della frase

Elimina, ad esempio, i primi 5 caratteri (per togliere "Oggi ").

🔄 6. Stampare la frase al contrario usando reverse()
📏 7. Mostrare capacity() e length() dopo ogni operazione, per osservare come varia la capacità dello StringBuilder.
🎯 Obiettivi dell’esercizio

Devi riuscire a:

✔ capire quando la capacità aumenta
✔ usare append
✔ usare insert a indice corretto
✔ usare replace per sostituire parti di testo
✔ usare delete per eliminare caratteri
✔ invertire una stringa con reverse
✔ gestire length e capacity
		 */
		
		StringBuilder frase = new StringBuilder("Oggi è una splendida giornata");
		
		System.out.println("La frase iniziale è: " + frase );
		System.out.println("La lunghezza iniziale è: " + frase.length() );
		System.out.println("La capacity iniziale è: " + frase.capacity() );
		System.out.println("----------------------------------------------------------------------------------------");
		frase.append(" e ho voglia di fare una passeggiata.");

		System.out.println("La frase dopo l'append è: " + frase );
		System.out.println("La lunghezza dopo l'append è: " + frase.length() );
		System.out.println("La capacity dopo l'append è: " + frase.capacity() );
		System.out.println("----------------------------------------------------------------------------------------");

		frase.insert(20, " e luminosa");
	
		System.out.println("La frase dopo l'insert è: " + frase );
		System.out.println("La lunghezza dopo l'insert è: " + frase.length() );
		System.out.println("La capacity dopo l'insert è: " + frase.capacity() );
		System.out.println("----------------------------------------------------------------------------------------");
		
		frase.replace(65, 76, "corsa");
		
		System.out.println("La frase dopo il replace è: " + frase );
		System.out.println("La lunghezza dopo il replace è: " + frase.length() );
		System.out.println("La capacity dopo il replace è: " + frase.capacity() );
		System.out.println("----------------------------------------------------------------------------------------");
		
		frase.delete(0, 5);
		
		System.out.println("La frase dopo il delete è: " + frase );
		System.out.println("La lunghezza dopo il delete è: " + frase.length() );
		System.out.println("La capacity dopo il delete è: " + frase.capacity() );
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("la frase dopo il reverse è: " + frase.reverse());
		
		//voto finale 9/10
		
		/*
		 *---------------------------------------versione gpt------------------------------------------------- 
		 *
		 * StringBuilder frase = new StringBuilder("Oggi è una splendida giornata");
        
        System.out.println("La frase iniziale è: " + frase );
        System.out.println("La lunghezza iniziale è: " + frase.length() );
        System.out.println("La capacity iniziale è: " + frase.capacity() );
        System.out.println("----------------------------------------------------------------------------------------");

        // 2) append
        frase.append(" e ho voglia di fare una passeggiata.");

        System.out.println("La frase dopo l'append è: " + frase );
        System.out.println("La lunghezza dopo l'append è: " + frase.length() );
        System.out.println("La capacity dopo l'append è: " + frase.capacity() );
        System.out.println("----------------------------------------------------------------------------------------");

        // 3) insert dopo la parola "splendida"
        String parolaTarget = "splendida";
        int indiceSplendida = frase.indexOf(parolaTarget);
        int posizioneInsert = indiceSplendida + parolaTarget.length(); // subito dopo "splendida"

        frase.insert(posizioneInsert, " e luminosa");

        System.out.println("La frase dopo l'insert è: " + frase );
        System.out.println("La lunghezza dopo l'insert è: " + frase.length() );
        System.out.println("La capacity dopo l'insert è: " + frase.capacity() );
        System.out.println("----------------------------------------------------------------------------------------");

        // 4) replace di "passeggiata" con "corsa"
        String parolaDaSostituire = "passeggiata";
        int inizioPasseggiata = frase.indexOf(parolaDaSostituire);
        int finePasseggiata = inizioPasseggiata + parolaDaSostituire.length();

        frase.replace(inizioPasseggiata, finePasseggiata, "corsa");

        System.out.println("La frase dopo il replace è: " + frase );
        System.out.println("La lunghezza dopo il replace è: " + frase.length() );
        System.out.println("La capacity dopo il replace è: " + frase.capacity() );
        System.out.println("----------------------------------------------------------------------------------------");

        // 5) delete dei primi 5 caratteri ("Oggi ")
        frase.delete(0, 5);

        System.out.println("La frase dopo il delete è: " + frase );
        System.out.println("La lunghezza dopo il delete è: " + frase.length() );
        System.out.println("La capacity dopo il delete è: " + frase.capacity() );
        System.out.println("----------------------------------------------------------------------------------------");

        // 6) reverse
        frase.reverse();
        System.out.println("La frase dopo il reverse è: " + frase );
        System.out.println("La lunghezza dopo il reverse è: " + frase.length() );
        System.out.println("La capacity dopo il reverse è: " + frase.capacity() );
		 */
	}

}
