package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Verifica dati utente con operatore ternario

Scrivi un programma Java che:

Chieda all’utente (tramite Scanner) di inserire:

il suo nome

la sua età

la sua lettera preferita

Utilizza operatori ternari per determinare:

Se il nome inserito è uguale a "Marco" → stampa "Nome valido" altrimenti "Nome non valido".

Se l’età è maggiore o uguale a 18 → "Puoi entrare" altrimenti "Sei minorenne".

Se la lettera preferita è 'a' → "Lettera OK" altrimenti "Lettera non OK".

Crea due stringhe:

String x = "Java";
String y = new String("Java");


Usa due ternari:

uno con ==

uno con .equals()

e mostra la differenza.

📌 Output atteso (esempio)
Inserisci il tuo nome: Marco
Inserisci la tua età: 22
Inserisci la tua lettera preferita: a

Nome valido
Puoi entrare
Lettera OK

Confronto con == : KO
Confronto con equals : OK
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Inserisci la tua età: ");
		int eta = scanner.nextInt();
		scanner.nextLine(); 
		
		System.out.print("Inserisci la tua lettera preferita: ");
		char lettera = scanner.nextLine().charAt(0);
		System.out.println();
		
		System.out.println( (nome.equals("Marco")) ? "Nome valido" : "Nome non valido");
		System.out.println((eta >= 18) ? "Puoi entrare" : "Sei minorenne");
		System.out.println((lettera == 'a') ? "Lettera OK" : "Lettera non OK");
		
		
		String x = "Java";
		String y = new String("Java");
		
		System.out.println((x == y) ? "Confronto con == : OK" : "Confronto con == : KO");
		System.out.println((x.equals(y)) ? "Confronto con equals : OK" : "Confronto con equals : KO");
		
		scanner.close();
		
	}

}
