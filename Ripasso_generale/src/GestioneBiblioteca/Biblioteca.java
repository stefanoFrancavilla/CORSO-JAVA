package GestioneBiblioteca;

import java.util.List;

public class Biblioteca {

	//variabili di istanza
	private List<Libro> libri;
	private List<Utente> utenti;
	
	//costruttore
	public Biblioteca()
	{
		
	}
	
	public Biblioteca(List<Libro> libri, List<Utente> utenti) {
		super();
		this.libri = libri;
		this.utenti = utenti;
	}

	//metodi getter/setter
	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}
	

	//metodi
	
	public void aggiungiLibro(Libro libro)
	{
		libri.add(libro);
	}
	
	public Libro rimuoviLibro(String isbn)
	{
		Libro libroDaEliminare = null;
		for(int i = 0; i < libri.size(); i ++)
		{
			if(libri.get(i).getIsbn().equals(isbn) == true)
			{
				libroDaEliminare = libri.get(i);
			}
		}
		return libroDaEliminare;
	}
	
	public Boolean cercaLibroPerTitolo(String titolo)
	{
		boolean trovato = false;
		for(int i = 0;i < libri.size(); i++)
		{
			if (libri.get(i).getTitolo().equals(titolo) == true)
			{
				trovato = true;
			}
		}
		
		return trovato;
	}
	
	public void aggiungiUtente(Utente utente)
	{
		utenti.add(utente);
	}
	
	public void prestaLibro(String isbn, String id)
	{
		
	}
	
	
}
