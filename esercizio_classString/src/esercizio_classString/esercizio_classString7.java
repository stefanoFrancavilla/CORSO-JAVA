package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma Java che:

1️⃣ Acquisisce una frase dall’utente

Puoi usare uno Scanner, oppure la frase può essere scritta direttamente in una variabile.

2️⃣ Controlla:

Se la frase inizia con una parola scelta da te (usa startsWith)

Se la frase finisce con un punto esclamativo ! o un punto interrogativo ? (usa endsWith)

Se la frase è uguale a un’altra frase data (usa equals)

Verifica se le due frasi puntano allo stesso oggetto (usa ==)

3️⃣ Usa un text block

Crea un text block che contenga un paragrafo di testo multilinea, ad esempio una piccola descrizione o un messaggio.

Stampa il text block e verificane la lunghezza (con length() se vuoi).

4️⃣ Cerca del testo

Controlla se il messaggio contiene una parola specifica usando:

indexOf("parola")


e stampa:

"trovata" se indexOf restituisce un valore > -1

"non trovata" altrimenti
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci una frase");
		String frase1 = scanner.nextLine();
		frase1 = frase1.toUpperCase();
		
		String frase2 = """
				la mamma di alessio
				deve cucinare 
				solo cose
				buone
				""" ;
		frase2 = frase2.toUpperCase();
		
		System.out.println("la frase inserita comincia con la sequenza di caratteri le? " + frase1.startsWith("le"));
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("la frase inserita finisce con \"!\" " + frase1.endsWith("\"!\""));
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("la frase inserita finisce con \"?\" " + frase1.endsWith("\"?\""));
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("la lunghezza della frase inserita è: " + frase1.length());
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("la lunghezza della frase2 è: " + frase2.length());
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("la frase inserita , porta allo stesso indirizzo di frase2? " + frase1 == frase2);
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("il testo della frase inserita è uguale al testo della frase2? " + frase1.equals(frase2));
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		if (frase1.indexOf("mamma") == -1) {
			System.out.println("la parola da ricercare è presente nel testo");
			
		}
		else
		{
			System.out.println("la frase da ricercare non è presente nel testo");
		}
		scanner.close();
		
		/*
		 *         Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una frase:");
        String frase1 = scanner.nextLine();

        String frase2 = """
                la mamma di alessio
                deve cucinare 
                solo cose
                buone
                """;

        // 2) Controlli varie
        System.out.println("La frase inserita comincia con 'la'? " + frase1.startsWith("la"));
        System.out.println("Finisce con ! ? " + frase1.endsWith("!"));
        System.out.println("Finisce con ? ? " + frase1.endsWith("?"));

        System.out.println("La lunghezza della frase inserita è: " + frase1.length());
        System.out.println("La lunghezza della frase2 è: " + frase2.length());

        System.out.println("La frase inserita punta allo stesso oggetto di frase2? " + (frase1 == frase2));
        System.out.println("Il testo della frase inserita è uguale al testo della frase2? " + frase1.equals(frase2));

        // 3) Stampa del text block
        System.out.println("Contenuto di frase2:");
        System.out.println(frase2);

        // 4) Ricerca parola
        int indice = frase1.toLowerCase().indexOf("mamma");
        if (indice > -1) {
            System.out.println("trovata");
        } else {
            System.out.println("non trovata");
        }

        scanner.close();
		 */
	}

}
