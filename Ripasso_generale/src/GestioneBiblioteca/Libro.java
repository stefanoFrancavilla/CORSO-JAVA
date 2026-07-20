package GestioneBiblioteca;

import java.util.Objects;

public class Libro {

	//variabili di istanza
	
	private String titolo;
	private String autore;
	private String isbn;
	private boolean disponibile;
	
	
	//costruttore
	
	public Libro()
	{
		
	}


	public Libro(String titolo, String autore, String isbn, boolean disponibile) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.isbn = isbn;
		this.disponibile = disponibile;
	}


	//metodi getter e setter
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


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isDisponibile() {
		return disponibile;
	}


	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	//metodi


	@Override
	public String toString() {
		return "Libro "
				+ "\n Titolo = " + titolo
				+ "\n Autore = " + autore
				+ "\n ISBN = " + isbn
				+ "\n Disponibile = " + disponibile;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autore, disponibile, isbn, titolo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autore, other.autore) && disponibile == other.disponibile && isbn == other.isbn
				&& Objects.equals(titolo, other.titolo);
	}

	

	
	

	
	
	
}
