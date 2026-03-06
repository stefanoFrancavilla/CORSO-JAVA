package esercizio_classArray;

public class esercizio_di_riepilogo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Esercizio 2: Trova Minimo
Inizializza un array di 6 interi, trova il valore minimo con un ciclo for 
(inizializza con il primo elemento) e stampalo.
 */
		
		int[] numeri = {20, 14, 23, 47, 7, 10};
		int valoreMinimo = numeri[0];
		for(int i = 0; i < numeri.length; i++)
		{
			if(valoreMinimo > numeri[i] )
			{
				valoreMinimo = numeri[i];
			}
		}
		System.out.println(valoreMinimo);
	}
	//Voto 9/10
}
