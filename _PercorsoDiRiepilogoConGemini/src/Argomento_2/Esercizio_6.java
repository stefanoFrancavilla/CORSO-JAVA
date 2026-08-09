package Argomento_2;

public class Esercizio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3 (Difficile) — Ordinamento (Bubble Sort Corretto)
Dato un array disordinato int[] dati = {5, 2, 8, 1, 9};, implementa l'algoritmo Bubble Sort per ordinarlo in ordine crescente
 modificando l'array originale (in-place).

Suggerimento per la logica Bubble Sort:

Usa un ciclo interno che confronta dati[j] con dati[j+1].

Se dati[j] > dati[j+1], scambiali usando una variabile temporanea int temp.

Ripeti questo confronto per tutti gli elementi con un ciclo esterno.

Stampa l'array dati ormai ordinato alla fine.
		 */
		
		int[] dati = {5, 2, 8, 1, 9};
		
		for (int i = 0; i < dati.length -1  ; i++)
		{
			
			
			
			for (int j = 0; j < dati.length -1 - i ; j++)
			{
			      if (dati[j] > dati[j + 1]) {

	                    int temp = dati[j];
	                    dati[j] = dati[j + 1];
	                    dati[j + 1] = temp;
	                }
			}
		}
		
		for(int n: dati)
		{
			System.out.println(n);
		}
	}

}
