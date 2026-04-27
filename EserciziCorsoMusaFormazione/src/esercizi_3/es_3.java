package esercizi_3;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcolare il prodotto dei numeri dispari da 1 a 30 utilizzando un ciclo "for".
		 */
		
		long prodottoDeiNumeriDispari = 1;
		
		
		for ( int i = 1; i <= 30; i++)
		{
			if (i % 2 != 0)
			{
				prodottoDeiNumeriDispari = prodottoDeiNumeriDispari * i;
			}
			
			
		}
		
		System.out.println("Il prodotto dei numeri dispari da 1 a 30 è: " + prodottoDeiNumeriDispari);
	}
/*
 * voto 9.5/10
 */
}
