package Es_4;

import java.util.Arrays;
import java.util.Random;

public class es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 4: Ricerca Valore Max
           Array 8 int. Trova posizione massimo con ciclo. Se multipli, stampa tutte le posizioni.
		 */
		Random random = new Random();
		int[] array = new int[8];
		
		   int max = 0;
	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(100);
	            max = Math.max(max, array[i]);
	        }

	        System.out.println("Massimo: " + max);
	        System.out.println(Arrays.toString(array));

	   
	        System.out.print("Posizioni del massimo: ");
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == max) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println(); 
	    }
	//voto 9/10
	}