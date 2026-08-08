package Argomento_2;

public class Esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Dato un array disordinato int[] dati = {5, 2, 8, 1, 9};,
		 *  implementa l'algoritmo Bubble Sort (utilizzando due cicli for annidati e uno scambio di variabili)
		 *   per ordinare l'array dal numero più piccolo al più grande. Stampa l'array finale ordinato.
		 */
		
		int[] disordinato = {5, 2, 8, 1, 9};
		
		int[] ordinato = new int[disordinato.length];
		
		int numeroDaAggiungere = 0;
		
		for ( int i = 0; i < disordinato.length; i++)
		{
			int numeroCorrente = disordinato[i];
			
			for (int j = 1; j < disordinato.length; i++)
			{
				int numeroSuccessivo = disordinato[j];
				
				if (numeroCorrente < numeroSuccessivo && numeroCorrente > numeroDaAggiungere)
				{
					numeroDaAggiungere = numeroCorrente;
				}
				else
				{
					numeroDaAggiungere = numeroSuccessivo;
				}
			}
			
			ordinato[i] = numeroDaAggiungere;
			
		}
		
		for(int n : ordinato)
		{
			System.out.println(n);
		}
		
	}

}
