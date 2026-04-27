package esercizi_3;

public class es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Calcolare il prodotto dei numeri pari da 1 a 10 utilizzando un ciclo "while".
 */
		
		
		int prodottoNumeri = 1;
		int i = 1;
		
		while ( i <= 10)
		{
			if (i % 2 == 0)
			{
				prodottoNumeri = prodottoNumeri * i;
			}
			i++;
		}
		
		System.out.println("Il prodotto dei numeri pari da 1 a 10 è: " + prodottoNumeri);
		
	}
// voto 10/ 10
}
