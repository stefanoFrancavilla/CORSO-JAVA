package problemaDelDiamante;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rana rana = new Rana();
		rana.respira();
		
		Animale.stampa();
		//Rana.stampa(); // i metodi statici non si ereditano dalle interfacce
		/*
		 * quindi essendo stampa definita in un'interfaccia, non viene ereditata, e per chiamarla devo sempre fare Animale.stampa()
		 */
		
		Anfibio.stampaAnfibio();
		Rana.stampaAnfibio();
	}

}
