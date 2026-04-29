package Es_1;

import java.util.Arrays;
import java.util.Random;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1:
		 *  Somma Condizionata
           Crea array 10 int casuali (1-100). Usa ciclo per sommare solo numeri >50. Stampa array, somma e percentuale >50.
		 */
		
		Random random = new Random();
		int[] array = new int[10];
		
		int somma = 0;
		int contatore = 0;
		double percentuale;
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(100) + 1 ;
			if (array[i] > 50)
			{
				contatore++;
				somma += array[i];
			}
		}
		percentuale  = ((contatore * 100.0) / array.length);
		
		System.out.println("L'array con numeri casuali contiene i seguenti numeri: " + Arrays.toString(array));
		System.out.println("La somma dei numeri maggiori di 50 è: " + somma);
		System.out.println("La percentuale dei numeri maggiori di 50 è: " + percentuale + "%");
		
	}
// voto 9/10
}
