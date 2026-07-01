package Esercizio2;

public class Libro extends BIblioteca {
	
	//variabili di istanza
	
	private String titolo;
	private String autore;
	private String anno;
	
	//Costruttore
	public Libro(String titolo, String autore, String anno) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
	}
	
	//metodi getter / setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", anno=" + anno + "]";
	}
	
	
	
	
	

	
	
	

}
