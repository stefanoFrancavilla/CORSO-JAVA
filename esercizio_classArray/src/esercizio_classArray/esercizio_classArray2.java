package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un array chiamato valori che possa contenere 6 numeri interi.

Chiedi all’utente di inserire uno alla volta i 6 numeri (usa Scanner).

Dopo aver riempito l’array:

Stampa tutti i valori nell’ordine in cui sono stati inseriti.

Stampa tutti i valori al contrario.

Calcola e mostra:

La somma di tutti i valori

Il valore massimo nell’array

Il valore minimo nell’array
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci 6 numeri , premi invio per cominciare");
		scanner.nextLine();
		int[] valori = new int[6];
		
		int somma = 0;
		int valoreMassimo = Integer.MIN_VALUE;
		int valoreMinimo = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < valori.length; i++)
		{
		
		System.out.println("inserisci un numero: " + (i + 1) + "/6");
		
		valori[i] = scanner.nextInt();
		}
		
		for (int a = 0; a < valori.length ; a++) 
		{
			System.out.println ("valori[" + a + "] = " + valori[a] );
		}
		
		System.out.println("--------------------------------------------");
		
		for (int c = valori.length -1; c >= 0 ; c--) 
		{
			System.out.println ("valori[" + c + "] = " + valori[c] );
		}
		
		
		for (int s = 0; s < valori.length; s++)
		{
			somma = somma + valori[s];
			if(valori[s] > valoreMassimo)
				{
				valoreMassimo = valori[s];
				}
			if(valori[s] < valoreMinimo)
			{
				valoreMinimo = valori[s];
			}
			
			}
		System.out.println("la somma dei valori è: " + somma);
		System.out.println("il valore massimo dell'array è: " + valoreMassimo);
		System.out.println("il valore minimo dell'array è: " + valoreMinimo);
	}

}
