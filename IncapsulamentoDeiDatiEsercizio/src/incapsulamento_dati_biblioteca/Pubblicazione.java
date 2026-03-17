package incapsulamento_dati_biblioteca;

public sealed class Pubblicazione permits Libro, Rivista {
// variabili
	private String titolo;
	private int annoPubblicazione;
	
//Costruttore
	
	public Pubblicazione() {
		this("ND", 0);
	}
	
	public Pubblicazione(String titolo, int annoPubblicazione) {
		
	}
	
	//metodi getter/setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
//metodi
	public void stampaDettagli() {
		
	System.out.println("titolo: " + titolo);
	System.out.println("anno di pubblicazione: " + annoPubblicazione);
	}
}
