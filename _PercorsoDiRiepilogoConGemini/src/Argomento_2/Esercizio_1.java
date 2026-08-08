package Argomento_2;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un array di interi int[] numeri = {12, 45, 7, 23, 89, 34};.
		 *  Scrivi un programma che scorra l'array e trovi il valore massimo, stampandolo a schermo (es. Il valore massimo è: 89).
		 */
		
		int[] numeri = {12, 45, 7, 23, 89, 34};
		
		int valoreMassimo = 0;
		
		for (int i = 0; i < numeri.length; i++)
		{
			int valoreCorrente = numeri[i];
			 if (valoreCorrente > valoreMassimo)
			 {
				valoreMassimo = valoreCorrente; 
			 }
		}
		
		System.out.println("Il valore massimo è: " + valoreMassimo);
	}

}
