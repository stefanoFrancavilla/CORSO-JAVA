package Esercizio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendente dipendente1 = new Dipendente("Angelo", "Bianchi", 800 );
		Dipendente dipendente2 = new Dipendente("Marco", "Verdi", 800 );
		Dipendente dipendente3 = new Dipendente("Sara", "Neri", 800);
		Dipendente manager1 = new Manager("Filippo", "Gialli", 1500);
		Dipendente manager2 = new Manager("Viola", "Azzurri", 1500);
		
		Dipendente[] azienda = {dipendente1, dipendente2, dipendente3, manager1, manager2};
		
		for(Dipendente dipendenti : azienda)
		{
			System.out.println(dipendenti.toString());
		}
		
		}
	}


