package Es_2;

import java.util.Arrays;
import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2: Inversione Due Array
           Leggi due array 5 elementi ciascuno (Scanner). Crea terzo con primo invertito + secondo normale. Stampa tutti.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String [] array1 = new String[5];
		System.out.println("Aggiungi 5 elementi nel primo array.");
		
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("Inserisci l'elemento " + (i + 1) + " / 5");
			array1[i] = scanner.nextLine();
		}
		
		String [] array2 = new String[5];
		System.out.println("Aggiungi altri 5 elementi nel secondo array.");
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("Inserisci l'elemento " + (i + 1) + " / 5");
			array2[i] = scanner.nextLine();
		}
		
		String [] array3 = new String[array1.length + array2.length];
		
		 for(int i = 0; i < array1.length; i++) {
	            array3[i] = array1[array1.length - 1 - i];
		 }
			for(int c = 0; c < array2.length; c++)
			{
				array3[c + array1.length] = array2[c];
			}
			
			
			  System.out.println("\n--- RISULTATO ---");
		        System.out.println("Array1 originale: " + Arrays.toString(array1));
		        System.out.println("Array2 originale: " + Arrays.toString(array2));
		        System.out.println("Array3 (1° invertito + 2°): " + Arrays.toString(array3));
		        
		        scanner.close();
	}
//voto 9.5/10 con problemi.
}
