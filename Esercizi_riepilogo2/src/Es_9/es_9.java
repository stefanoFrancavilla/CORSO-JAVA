package Es_9;

public class es_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 9: Conto Banche
           Classe Conto con saldo double. Metodi: versa(), preleva() con controllo saldo. Main: operazioni su 2 conti.
		 */
		
		Conto conto1 = new Conto();
		Conto conto2 = new Conto();
		
		conto1.setSaldo(1000);
		conto1.preleva(200);
		conto1.versa(500);
		conto1.controlloSaldo();
		
		conto2.setSaldo(200); 
		conto2.preleva(200);
		conto2.preleva(50);
		conto2.controlloSaldo();
		conto2.versa(-20);
		conto2.versa(50);
		conto2.controlloSaldo();
		
	}

}
