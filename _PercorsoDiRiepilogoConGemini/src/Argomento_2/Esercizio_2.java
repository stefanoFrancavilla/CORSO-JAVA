package Argomento_2;



public class Esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dato un array int[] original = {1, 2, 3, 4, 5};,
		 *  crea un secondo array della stessa dimensione e riempilo con gli elementi di original in ordine inverso {5, 4, 3, 2, 1}. 
		 *  Stampa i valori del nuovo array.
		 */
		
		int[] original = {1, 2, 3, 4, 5};
		
		int[] ordineInverso = new int[original.length];
		
		for (int i = 0; i < ordineInverso.length; i ++)
		{
			ordineInverso[i] = original[original.length-1 -i];
		}
		
		for(int n : ordineInverso)
		{
			System.out.println(n);
		}
	}

}
