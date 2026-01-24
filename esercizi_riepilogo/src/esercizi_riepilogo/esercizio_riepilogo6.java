package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esercizio: Somma dei numeri da 1 a N

Traccia:
Scrivi un programma in Java che:

Chieda all’utente di inserire un numero intero positivo N.

Utilizzi un ciclo while per calcolare la somma di tutti i numeri da 1 fino a N.

Stampi a video il risultato finale.

💡 Esempio di esecuzione
Inserisci un numero: 5
La somma dei numeri da 1 a 5 è: 15

✏️ Suggerimento per la soluzione

Usa la classe Scanner per leggere l’input da tastiera.

Crea una variabile somma inizializzata a 0.

Crea una variabile i inizializzata a 1.

Finché i è minore o uguale a N, aggiungi i a somma e incrementa i di 1.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un numero intero");
		
		int numero = scanner.nextInt();
	    System.out.println();
	    
	    int sommaNumero = 0;
	    int i = 1;
	    
	    while (i <= numero) {
	    		sommaNumero = sommaNumero +i;
	    		i++;
	    	}
	    	
	    	System.out.println("la somma dei numeri è : " + sommaNumero);
	    	
	    	
	    }
		
	}


