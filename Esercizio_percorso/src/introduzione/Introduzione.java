package introduzione;

public class Introduzione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Scrivi il codice Java per questi 3 esercizi:

Esercizio 1: Declara 3 variabili primitivi (int, double, char) e stampa i loro valori

Esercizio 2: Declara 2 String uguali ("Test"), usa == e .equals() per compararle, stampa il risultato

Esercizio 3: Crea un int con valore 100 e un double con valore 100.5, calcola la somma e stampa il risultato (con casting corretto)
 */
		
		
		
		//Esercizio 1 
		
		int x = 10;
		double d = 1.2;
		char c = 'A';
		System.out.println("	il valore di x è: " + x);
		System.out.println("	il valore di d è: " + d);
		System.out.println("	il valore di c è: " + c);
		
	/*
	 * commento di quello che ho fatto: ho creato tre variabili primitive
	 * un'int , un double e un char
	 */
		System.out.println("-----------------------");
	
		//Esercizio 2
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println("s1 == s2 " + (s1 == s2)); 
		//grazie allo string pool abbiamo dimostrato che con s1 == s2 stiamo puntando allo stesso oggetto
		//lo string pool controlla se l'oggetto è già esistente
		//quindi il risultato sarà true
		
		System.out.println("s1.equals(s2) " + s1.equals(s2));
		//qui invece stiamo mettendo a confronto il loro valore cioè "Test"
		//essendo uguale l'output sarà true
		
		/*
		 * conclusioni abbiamo creato due variabili di tipo String e li abbiamo messi a confronto.
		 * con == abbiamo confrontato il loro reference , e capito che anche se tutte due contengono lo stesso valore, sono due oggetti diversi
		 * mentre con equals abbiamo messo a contronto il loro valore che ci ha dato come risultato true
		 */
		System.out.println("-----------------------");
		
		//Esercizio 3
		
		int i = 100;
		double e = 100.5;
		double risultato = (double) i + e;
		System.out.println("Il risultato della loro somma è: " + risultato);
		
		/*
		 * qui abbiamo creato due variabili , una di tipo int e una di tipo double
		 * poi abbiamo sommato il loro valore.
		 * nella variabile risultato dichiarata come double abbiamo effettuato un cast per far si che la variabile i venga trattata come un double 
		 */
		
	}

}
