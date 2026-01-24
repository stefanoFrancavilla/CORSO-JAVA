package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Chiedi all’utente di inserire un testo (frase lunga)

Esempio:
Programmare è divertente, e programmare bene è ancora più divertente.

Chiedi all’utente una parola da cercare nel testo

Usa:

indexOf(String)

indexOf(String, fromIndex)

e stampa:

Se la parola è presente

La posizione della prima occorrenza

Tutte le posizioni successive

📌 Esempio output:

La parola "PROGRAMMARE" è presente.
Prima posizione: 0
Altre posizioni trovate: 22

Conteggio delle vocali nel testo

Chiedi una vocale all’utente (a, e, i, o, u)
e trova quante volte compare usando:

✔ indexOf(char)
✔ indexOf(char, fromIndex)

📌 Esempio:

Quante volte compare la vocale "E"?  
Trovata 5 volte.

Trova la parola più lunga della frase

Suggerimento:

dividi il testo con .split(" ")

confronta le lunghezze con .length()

📌 Output:

La parola più lunga è: "DIVERTENTE"
Lunghezza: 10 caratteri

Cerca una sottostringa di 2–3 caratteri

Chiedi una stringa breve (es: "ram", "be", "te").
Trova tutte le occorrenze nel testo usando:

indexOf(String)

ciclo while con offset
Bonus (Facoltativo): trova la frase invertita

Crea una nuova stringa con il testo al contrario usando:

charAt()

un ciclo for decrescente

📌 Output:

Testo invertito:
.etnetrevid ùip arcont ié enob erammargorP
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una frase");
		String frase = scanner.nextLine();
		System.out.println();
		
		System.out.println("inserisci una parola , un carattere o una portzione di parola da ricercare nella frase");
		String parola = scanner.nextLine();
		System.out.println();
		
		if (frase.indexOf(parola) > -1) {
			System.out.println(  parola + " è presente");
	    }
		else
		{
			System.out.println(  parola + " non è presente ");
		}
		
		System.out.println();
		System.out.println("prima posizione " + frase.indexOf(parola));
		
		int posizioni = 0;
		int i4 = 0;
	
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int consonanti = 0;
		
		while ((posizioni = frase.indexOf(parola , i4)) > -1) {
			
			
				
			  System.out.println();
			  System.out.println("altre posizioni trovate" + posizioni + " ");
              i4 = posizioni + parola.length();
		}
		
		System.out.println();
		
		String[] parole = frase.split(" "); 

		String parolaPiuLunga = "";
		
		for (int i2 = 0; i2 < parole.length; i2++) {
		    if (parole[i2].length() > parolaPiuLunga.length()) {
		        parolaPiuLunga = parole[i2];
		    }
		}

		System.out.println("La parola più lunga è: " + parolaPiuLunga);
		System.out.println();
		System.out.println("La lunghezza della parola più lunga è: " + parolaPiuLunga.length());
		
		String fraseAlContrario = "";
		char carattere;
		
		for (int i3 = frase.length() -1; i3 >= 0; i3--) {
			
			carattere = frase.charAt(i3);
			
			fraseAlContrario += carattere;
			
		}
		System.out.println();
		System.out.println("la frase inserita al contrario è: " + fraseAlContrario);
		
		for(int i5 = 0; i5 < frase.length(); i5++) {
			char c = Character.toLowerCase(frase.charAt(i5));
			
			if(c == 'a') {
				a++;
			}
			else if(c == 'e') {
				e++;
			}
			else if(c =='i') {
				i++;
			}
			else if(c == 'o') {
				o++;
			}
			else if(c == 'u') {
				u++;
			}
			else if (Character.isLetter(c)) 
			{
				consonanti++;
			}
		}
		System.out.println();
		System.out.println("le vocali contenute nel testo sono: \n" +
		           "la 'a' è contenuta: " + a + "\n" + 
		           "la 'e' è contenuta: " + e + " \n" +
		           "la 'i' è contenuta: " + i + "\n" +
		           "la 'o' è contenuta: " + o + "\n" +
		           "la 'u' è contenuta: " + u );
		System.out.println();
		System.out.println("le consonanti nel testo sono: " + consonanti);
		
		scanner.close();
		
		
		/*
		 * import java.util.Scanner;

public class AnalisiTesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Chiedi all’utente una frase
        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();
        System.out.println();

        // 2) Chiedi una parola da cercare nel testo
        System.out.println("Inserisci una parola da cercare nel testo:");
        String parola = scanner.nextLine();
        System.out.println();

        // Per ricerche case-insensitive
        String fraseUpper = frase.toUpperCase();
        String parolaUpper = parola.toUpperCase();

        int primaPosizione = fraseUpper.indexOf(parolaUpper);

        if (primaPosizione > -1) {
            System.out.println("La parola \"" + parola.toUpperCase() + "\" è presente.");
            System.out.println("Prima posizione: " + primaPosizione);

            int fromIndex = primaPosizione + parolaUpper.length();
            int pos;

            boolean trovateAltre = false;
            while ((pos = fraseUpper.indexOf(parolaUpper, fromIndex)) > -1) {
                if (!trovateAltre) {
                    System.out.println("Altre posizioni trovate:");
                    trovateAltre = true;
                }
                System.out.println(pos);
                fromIndex = pos + parolaUpper.length();
            }

            if (!trovateAltre) {
                System.out.println("Nessun'altra occorrenza trovata.");
            }

        } else {
            System.out.println("La parola \"" + parola.toUpperCase() + "\" NON è presente nel testo.");
        }

        System.out.println();

        // 3) Conteggio delle vocali nel testo per UNA vocale scelta dall'utente
        System.out.println("Inserisci una vocale da cercare nel testo (a, e, i, o, u):");
        char vocale = Character.toLowerCase(scanner.next().charAt(0));
        System.out.println();

        String fraseLower = frase.toLowerCase();

        int countVocale = 0;
        int posizioneVocale = fraseLower.indexOf(vocale);

        while (posizioneVocale > -1) {
            countVocale++;
            posizioneVocale = fraseLower.indexOf(vocale, posizioneVocale + 1);
        }

        System.out.println("La vocale \"" + Character.toUpperCase(vocale) + "\" è stata trovata " + countVocale + " volte.");
        System.out.println();

        // 4) Trova la parola più lunga della frase
        String[] parole = frase.split(" ");
        String parolaPiuLunga = "";

        for (int i = 0; i < parole.length; i++) {
            // Rimuovo eventuale punteggiatura attaccata (es: "divertente," -> "divertente")
            String pulita = parole[i].replaceAll("\\p{Punct}", "");
            if (pulita.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = pulita;
            }
        }

        System.out.println("La parola più lunga è: \"" + parolaPiuLunga.toUpperCase() + "\"");
        System.out.println("Lunghezza: " + parolaPiuLunga.length() + " caratteri");
        System.out.println();

        // 5) Cerca una sottostringa di 2–3 caratteri
        scanner.nextLine(); // consumo il newline rimasto
        System.out.println("Inserisci una sottostringa di 2–3 caratteri da cercare (es: \"ram\", \"be\", \"te\"):");
        String sotto = scanner.nextLine();
        System.out.println();

        String sottoUpper = sotto.toUpperCase();
        int posSotto = fraseUpper.indexOf(sottoUpper);
        boolean trovataSotto = false;

        while (posSotto > -1) {
            if (!trovataSotto) {
                System.out.println("Occorrenze della sottostringa \"" + sotto + "\":");
                trovataSotto = true;
            }
            System.out.println("Posizione: " + posSotto);
            posSotto = fraseUpper.indexOf(sottoUpper, posSotto + 1);
        }

        if (!trovataSotto) {
            System.out.println("La sottostringa \"" + sotto + "\" non è stata trovata nel testo.");
        }

        System.out.println();

        // 6) Bonus: frase invertita
        String fraseAlContrario = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseAlContrario += frase.charAt(i);
        }

        System.out.println("Testo invertito:");
        System.out.println(fraseAlContrario);

        scanner.close();
    }
}
		 */
		
		
		
		
		
	}

}

