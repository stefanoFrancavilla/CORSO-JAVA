package Argomento_3_Map;

public class TestContatto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contatto contatto1 = new Contatto("Paolo", "Bianchi", "0774256123", "paolo@gmail.com");
		Contatto contatto2 = new Contatto("Giulio", "Verdi", "0775478632", "giulio@gmail.com");
		Contatto contatto3 = new Contatto("Marta", "Rossi", "0774512369", "marta@gmail.com");
		Contatto contatto4 = new Contatto("", " ", "", "paolo.gmail.com");
		
		System.out.println(contatto1);
		System.out.println(contatto2);
		System.out.println(contatto3);
		
		System.out.println(contatto4);
		
		contatto1.setEmail("paolo.bianchi@gmail.com");
		System.out.println("Email aggiornata");
		System.out.println(contatto1);
	}

}
