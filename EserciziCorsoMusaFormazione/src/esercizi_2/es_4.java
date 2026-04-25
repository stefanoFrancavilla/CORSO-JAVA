package esercizi_2;

public class es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Si ripercorra il testo del test 3 ricercando il minimo tra tre numeri.
           La funzione che si suggerisce utilizzare è Math.min(n1, n2) che restituisce il valore minimo tra due numeri.
		 */
		
		double n1 = 2.2;
		double n2 = 5.4;
		double n3 = 7.2;
		
		double valoreMinimo = Math.min(n2,(Math.min(n1, n3)));
		
		System.out.println("Il valore minimo tra: \n n1 = " + n1 + "\n n2 = " + n2 + "\n n3 = " + n3 + "\n è: " + valoreMinimo);
	}
//  voto 10/10
}
