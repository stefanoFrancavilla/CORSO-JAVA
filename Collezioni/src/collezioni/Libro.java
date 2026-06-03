package collezioni;

import java.util.Objects;

public class Libro {
	
	//variabili d'istanza
	private String titolo;
	
	private String sinossi;
	
	private Float prezzo;
	
	private String isbn;
	
	//private List<String> n;
	
	//costruttore
	
	public Libro(String t, String s, Float f, String i) {
	
		this.titolo = t;
		this.sinossi = s;
		this.prezzo = f;
		this.isbn = i;
	}

	//metodi get e set
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getSinossi() {
		return sinossi;
	}

	public void setSinossi(String sinossi) {
		this.sinossi = sinossi;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	// per tipi da usare come chiavei delle mappe.
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
		return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		Libro libro = (Libro) o;
		return Objects.equals(titolo,  libro.titolo) &&
				Objects.equals(isbn, libro.isbn);
	
	}

	@Override
	public String toString() {
		return "Libro(" +
				"titolo='" + titolo + '\'' +
				", sinossi='" + sinossi + '\'' +
				", prezzo=" + prezzo +
				", isbn='" + isbn + '\'' +
				')';
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(titolo, isbn);
	}
	
}
