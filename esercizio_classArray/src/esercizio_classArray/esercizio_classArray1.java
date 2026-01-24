package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Esercizio 1 — Stampa solo i numeri pari

Richiesta:

Crea un array di 6 numeri interi a tua scelta.

Stampa solo quelli pari, usando un ciclo for.

Obiettivo didattico:

uso dell’indice

controllo delle condizioni (if)

lettura di array

Output atteso (esempio):

Numero pari trovato: 8
Numero pari trovato: 12
Numero pari trovato: 4

✅ Esercizio 2 — Trova il numero più grande dell’array

Richiesta:

Crea un array di 7 numeri interi.

Usa un ciclo for per trovare il numero più grande contenuto nell’array.

Stampalo.

Obiettivo didattico:

aggiornare una variabile (max)

confrontare valori

scorrere tutto l’array

Output atteso (esempio):

Il numero più grande è: 99

✅ Esercizio 3 — Stampa l’array al contrario SENZA usare un secondo array

Richiesta:

Crea un array di 5 numeri.

Stampa gli elementi dal primo all’ultimo.

Poi stampali dal più grande indice (length - 1) fino a 0.

È simile a ciò che hai già fatto, ma voglio che tu lo faccia da zero.

Output atteso:

Stampa normale:
6
15
2
9
10

Stampa al contrario:
10
9
2
15
6
 */
		
		Scanner scanner = new Scanner(System.in);
	/*	int[] numeri = new int[6];
		
		System.out.println("inserisci 6 numeri, premi start per inziare");
		scanner.nextLine();
	
		System.out.println("inserisci un numero 1/6");
	    numeri[0] = scanner.nextInt();
	    
	    System.out.println("inserisci un numero 2/6");
	    numeri[1] = scanner.nextInt();
	    
	    System.out.println("inserisci un numero 3/6");
	    numeri[2] = scanner.nextInt();
	    
	    System.out.println("inserisci un numero 4/6");
	    numeri[3] = scanner.nextInt();
	    
	    System.out.println("inserisci un numero 5/6");
	    numeri[4] = scanner.nextInt();
	    
	    System.out.println("inserisci un numero 6/6");
	    numeri[5] = scanner.nextInt();
		
	    
	    for (int c = 0; c < numeri.length; c++) {
	    	if ( numeri[c] % 2 == 0) {
	    		System.out.println("numero pari trovato: " + numeri[c]);
	    	}
	    }
	    scanner.close();*/
		
		//----------------ESERCZIO 2------------------
		
	/*	int[] num = new int[7];
		
		System.out.println("Inserisci 7 numeri. Premi invio per iniziare.");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Inserisci un numero " + (i + 1) + "/7");
			num[i] = scanner.nextInt();
			
			}
		int max = 0;
		
		for (int c = 0; c < num.length; c++) {
			if (num[c] > max) {
				max = num[c];
			}
		}
		System.out.println("Il numero più grande è: " + max);
		*/
		
		int[] numeri2 = new int[5];
		System.out.println("Inserisci 5 numeri. Premi invio per iniziare");
		
		for (int a = 0; a < numeri2.length; a++ ) {
			System.out.println("Inserisci un numero " + (a + 1) + "/5");
			numeri2[a] = scanner.nextInt(); 
			}
			
		System.out.println("Stampa normale");
			for (int b = 0; b < numeri2.length; b++) {
			System.out.println(numeri2[b] );
			}
			
		System.out.println("Stampa al contrario");
		    for(int c = numeri2.length; numeri2.length >= c; c--) {
		    System.out.println(numeri2[c]);}
		
	}

}
