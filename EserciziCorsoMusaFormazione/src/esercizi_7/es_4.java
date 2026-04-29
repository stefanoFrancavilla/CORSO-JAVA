package esercizi_7;

import java.util.Arrays;

public class es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ottenere un array i cui elementi siano le somme degli elementi di pari indice di altri 3 array.
           Potete usare Arrays.toString() per l'output a video dell'array richiesto.
		 */
		
		int[] array1 = {15, 12, 10, 36, 2};
		int[] array2 = {9, 3, 22, 12, 4};
		int[] array3 = {14, 25, 32, 16, 7};
		
		int[] arraySomma = new int[array1.length];
		
		for(int i = 0; i < array1.length; i += 2 )
		{
			
			arraySomma[i] = array1[i] + array2[i] + array3[i];
			
		}
		System.out.println(Arrays.toString(arraySomma));
	}
//voto 10/10
}
