package esercizio_classArray;

import java.util.Scanner;

public class esercizi_di_riepilogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
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
		//ESRECIZIO 1
		
//		Scanner scanner = new Scanner(System.in);
//		int[] numeri = new int[6];
//		for (int i = 0; i < numeri.length; i++)
//		{
//			System.out.println("Inserisci 6 numeri " + (i + 1 )+ "/" + "6");
//			numeri[i] = scanner.nextInt();
//		}
//		
//		for (int s = 0; s < numeri.length; s++)
//		{
//			if (numeri[s] %2 == 0)
//			{System.out.println("Numero pari trovato: " + numeri[s]);
//			}
//		}
//		scanner.close();
//		//voto 9/10
		
		//ESERCIZIO 2
		
//		int[] numeri = {12, 43, 78, 54, 15, 6, 7};
//		int numeroMax = 0;
//		for (int i = 0; i < numeri.length; i++)
//		{
//			if(numeri[i] > numeroMax)
//			{
//				numeroMax = numeri[i];
//			}
//		}
//		System.out.println("il numero più grande è: " + numeroMax);
//		//Voto 9/10
		
		//ESERCIZIO 3
		
		int[] numeri = {45, 52, 32, 98, 74};
		System.out.println("Stampa normale");
		
		for (int i = 0; i < numeri.length; i++)
		{
			System.out.println(numeri[i]);
		}
		System.out.println();
		System.out.println("Stampa al contrario");
		
		for (int s = numeri.length -1 ; s >= 0; s--)
		{
			System.out.println(numeri[s]);
		}	
		//Voto 10/10
	}

}
