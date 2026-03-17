package incapsulamento_dati_biblioteca;

public final class Libro extends Pubblicazione {
//variabili d'istanza
	private String autore;
	private Genere genere;
	
	
//Costruttore
	public Libro() {
		this("ND", "ND", Genere.SCONOSCIUTO, 0);
	}
	
	public Libro(String titolo, String autore, Genere genere, int annoPubblicazione) {
		super(titolo, annoPubblicazione);
	}
	
	// metodi getter / setter
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	
//metodi
	
	@Override
	public void stampaDettagli() {
		super.stampaDettagli();
		System.out.println("autore: " + autore);
		System.out.println("genere: " + genere);
		
	}
}
