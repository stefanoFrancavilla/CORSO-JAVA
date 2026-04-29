package esercizi_7;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcolare la media di numeri di tipo float contenuti in un array.
		 */
		
		float[] array = {1.2f, 4.5f, 3.6f, 8.7f};
		
		float somma = 0;
		float media = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			somma += array[i];
		}
		media = somma / array.length;
		
		System.out.println("La media dei numeri di tipo float di questo array è: " + media);
			
	}
// voto 10/10
}
