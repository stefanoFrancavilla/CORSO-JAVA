package Argomento_2;

import java.util.Arrays;

public class Esercizio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeri = {7, 3, 9, 2, 4};
		
		for ( int i = 0; i < numeri.length -1; i++)
		{
			for (int j = 0; j < numeri.length -1 -i; j++)
			{
				
				if (numeri[j] > numeri[j + 1]) // se è vero che numeri[i] è maggiore di numeri[j]
				{
					int temp = numeri[j];  //creo una variabile temporanea che prende il valore di numeri[j]
					numeri[j] = numeri[j +1]; //numeri[j] diventa uguale a numeri[j +1]
					numeri[j +1] = temp; // e di conseguenza numeri[j+1] sarà uguale al valore della variabile tempooranea;
				}
			}
		}
		
		System.out.println(Arrays.toString(numeri));
	}

}
