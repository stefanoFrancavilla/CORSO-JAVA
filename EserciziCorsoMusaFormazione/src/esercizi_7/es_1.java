package esercizi_7;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcolare la somma di numeri interi contenuti in un array.
		 */
		
		int [] numeri = {10, 45, 74, 45};
		
		int somma = 0;
		
		for (int i = 0; i < numeri.length; i++)
		{
			somma += numeri[i];
		}
		System.out.println("La somma dei numeri contenuti nell'array è: " + somma);
	}

	//voto 10/10
}
