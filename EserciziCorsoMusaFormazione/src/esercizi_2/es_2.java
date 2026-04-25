package esercizi_2;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma che calcoli il prezzo scontato di un prodotto in base al costo e al tasso di sconto.
		 */
		
		double costoProdotto = 50;
		double tassoDiSconto = 20;
		
		double scontoProdotto = (tassoDiSconto * costoProdotto) / 100;
		double totalePrezzoScontato = costoProdotto - scontoProdotto;
		
		System.out.println("Il prodotto con il costo iniziale di: " + costoProdotto + " è scontato al " + tassoDiSconto + "% , quindi il prezzo finale è: " + totalePrezzoScontato );
	}
/*
 * voto 9/10
 */
}
