package Es_6;

import java.util.Arrays;
import java.util.Random;

public class es_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 6: Copia Array Filtrata
           Array originale 12 int. Crea copia solo con numeri pari. Usa due cicli distinti.
		 */
		
		Random random = new Random();

		int[] array1 =  new int[12];
		int pari = 0;
		
		for (int i = 0; i < array1.length; i++)
		{
			array1[i] = random.nextInt(100);
			
			if(array1[i] %2 ==0)
			{
			
				pari++;
			}
			
		}
		System.out.println("I numeri iniziali sono: " + Arrays.toString(array1));
		
		int [] array2 = new int[pari];
		int indiceArray2 = 0;
		
		for( int s = 0; s < array1.length; s++)
		{
			if (array1[s] % 2 == 0)
			{
				array2[indiceArray2] = array1[s];
				indiceArray2++;
			}
		
			
		}
		System.out.println("I numeri pari trovati sono: " + Arrays.toString(array2));
		
	}

	//voto 10/10
}
