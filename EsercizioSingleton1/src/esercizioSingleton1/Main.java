package esercizioSingleton1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utente utente1 = new Utente("Documento1");
		Utente utente2 = new Utente("Documento2");
		Utente utente3 = new Utente("Documento3");
		Utente utente4 = new Utente("Documento4");
		Utente utente5 = new Utente("Documento5");
		
		utente1.run();
		System.out.println();
		utente2.run();
		System.out.println();
		utente3.run();
		System.out.println();
		utente4.run();
		System.out.println();
		utente5.run();
		
		
	}

}
