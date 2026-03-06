package esercizio_classArray;

public class esercizio_di_riepilogo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Esercizio 3: Inverte Array
Crea un array di 5 numeri, copialo in uno nuovo e invertilo (senza modificare l'originale),
 poi stampa entrambi con Arrays.toString().
 */
		int[] numeri = {12, 42, 36, 54, 14};
		
		int [] numeriInvertiti = new int[numeri.length];
		
		for (int i = 0; i < numeri.length; i++)
		{ 
			numeriInvertiti[i] = numeri[numeri.length - 1 - i]; 
			
		}
		System.out.println(java.util.Arrays.toString(numeri));
		System.out.println(java.util.Arrays.toString(numeriInvertiti));
	}
//Voto 10/10 
}
