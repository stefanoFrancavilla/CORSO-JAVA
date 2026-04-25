package esercizi_2;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma che mostri il valore massimo tra tre numeri decimali e stampi il risultato.
           La funzione che si suggerisce utilizzare è Math.max(n1, n2) che restituisce il valore minimo tra due numeri.
		 */
		
		double n1 = 2.2;
		double n2 = 5.4;
		double n3 = 7.2;
		
		double valoreMassimo = Math.max(n2,(Math.max(n1, n3)));
		
		System.out.println("Il valore massimo tra: \n n1 = " + n1 + "\n n2 = " + n2 + "\n n3 = " + n3 + "\n è: " + valoreMassimo);
	}
	//voto 9/10
}
