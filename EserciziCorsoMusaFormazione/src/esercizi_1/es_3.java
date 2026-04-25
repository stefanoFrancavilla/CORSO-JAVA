package esercizi_1;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma che verifichi se un numero sia compreso tra due valori.
		 */
		
		int numeroVerifica = 5;
		
		int limiteInferiore = 0;
		int limiteSuperiore = 10;
		
		boolean compreso = false;
		
		if (numeroVerifica > limiteInferiore && numeroVerifica < limiteSuperiore)
		{
			compreso = true;
		}
		
		System.out.println("E' " + compreso + " che il numero da verificare " + numeroVerifica + " sia compreso tra: " + limiteInferiore + " e " + limiteSuperiore);
	}

	
	/*
	 * voto 8/10
	 */
}
