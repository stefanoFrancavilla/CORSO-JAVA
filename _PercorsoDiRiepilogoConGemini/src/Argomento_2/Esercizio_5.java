package Argomento_2;

public class Esercizio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dato un array di numeri int[] valori = {4, 2, 4, 7, 4, 9, 2}; e un numero target int target = 4;,
		 *  scrivi un programma che conti quante volte il valore target compare nell'array e stampi il risultato
		 *   (es. "Il numero 4 compare 3 volte").
		 */
		
		int[] valori = {4, 2, 4, 7, 4, 9, 2};
		
		int target = 4;
		int counter = 0;
		for (int n : valori)
		{
			if (n == 4)
			{
				counter ++;
			}
		}
		
		System.out.println("Il numero " + target + " compare " + counter + " volte");
		
	}

}
