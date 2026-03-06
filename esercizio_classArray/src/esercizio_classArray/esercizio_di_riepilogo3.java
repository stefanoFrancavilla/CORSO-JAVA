package esercizio_classArray;

public class esercizio_di_riepilogo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
Esercizio 1: Stampa e Somma
Crea un array di 5 interi, stampali con un ciclo for-each e calcola la loro somma totale.
		 */
		
		int[] numeri = {12,41,21,32,4};
		int somma = 0;
		for(int num : numeri)
		{
			System.out.println(num);
			somma = somma + num;
		}
		System.out.println(somma);
	}
	//Voto 10/10. 

}
