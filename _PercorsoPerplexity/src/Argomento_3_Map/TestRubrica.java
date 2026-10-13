package Argomento_3_Map;

public class TestRubrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rubrica rubrica = new Rubrica();
		
		Contatto contatto1 = new Contatto("Paolo", "Bianchi", "0774256123", "paolo@gmail.com");
		Contatto contatto2 = new Contatto("Giulio", "Verdi", "0775478632", "giulio@gmail.com");
		Contatto contatto3 = new Contatto("Marta", "Rossi", "0774512369", "marta@gmail.com");
		
		// aggiungo i contatti
		System.out.println(rubrica.aggiungiContatto(contatto1));
		System.out.println(rubrica.aggiungiContatto(contatto2));
		System.out.println(rubrica.aggiungiContatto(contatto3));
	
		
		// aggiungo contatto esistente
		System.out.println(rubrica.aggiungiContatto(contatto1));
		
		// cerca contatto per numero
		
		System.out.println(rubrica.cercaContattoPerNumero("0774256123"));
		
		// cerca numero inesistente
		System.out.println(rubrica.cercaContattoPerNumero("0777896541"));
		
		// conteggio contatti
		System.out.println(rubrica.contaContatti());
		
		// rimuovi contatto
		System.out.println(rubrica.rimuoviContatto("0774512369"));
		
		// conteggio contatti
		System.out.println(rubrica.contaContatti());
				
		// rimuovi contatto
		System.out.println(rubrica.rimuoviContatto("0774512369"));
		
		for(String numeri : rubrica.ottieniNumeriTelefono())
		{
			System.out.println(numeri);
		}
		
	
		
			System.out.println(rubrica.ottieniContatti());
		
		
	}

}
