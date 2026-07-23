package GestioneBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	//variabili di istanza
	private List<Libro> libri;
	private List<Utente> utenti;
	
	//costruttore
	
	public Biblioteca()
	{
	    libri = new ArrayList<>();
	    utenti = new ArrayList<>();
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
	    for(int i = 0; i < libri.size(); i++)
	    {
	        if(libri.get(i).getIsbn().equals(isbn))
	        {
	            return libri.remove(i);
	        }
	    }

	    return null;
	}
	public Libro cercaLibroPerTitolo(String titolo)
	{
		Libro libroDaCercare = null;
		for(int i = 0;i < libri.size(); i++)
		{
			
			if (libri.get(i).getTitolo().equalsIgnoreCase(titolo) )
			{
				
				if (libri.get(i).isDisponibile() == true)
				{
					libroDaCercare = libri.get(i);
				}
				
			}
		}
		
		return libroDaCercare;
		
	}
	public Libro cercaLibroPerIsbn(String isbn)
	{
	    for(Libro libro : libri)
	    {
	        if(libro.getIsbn().equals(isbn))
	        {
	            return libro;
	        }
	    }

	    return null;
	}
	
	public void aggiungiUtente(Utente utente)
	{
		utenti.add(utente);
	}
	
	public void prestaLibro(String isbn, String id)
	{
	    for(int i = 0; i < libri.size(); i++)
	    {
	        if(libri.get(i).getIsbn().equals(isbn)
	                && libri.get(i).isDisponibile())
	        {
	            for(int j = 0; j < utenti.size(); j++)
	            {
	                if(utenti.get(j).getId().equals(id))
	                {
	                    libri.get(i).setDisponibile(false);
	                    utenti.get(j).prendiInPrestito(libri.get(i));
	                    return;
	                }
	            }
	        }
	    }
	}
	
	public void restituisciLibro(String isbn, String id)
	{
	    for(int i = 0; i < libri.size(); i++)
	    {
	        if(libri.get(i).getIsbn().equals(isbn))
	        {
	            for(int j = 0; j < utenti.size(); j++)
	            {
	                if(utenti.get(j).getId().equals(id))
	                {
	                    libri.get(i).setDisponibile(true);
	                    utenti.get(j).restituisciLibro(libri.get(i));
	                    return;
	                }
	            }
	        }
	    }
	}
	
	public void stampaLibri()
	{
		System.out.println("--------Libri biblioteca------------");
		for(Libro libro : libri)
		{
			System.out.println(libro.toString());
		}
	}
	
	public void stampaUtenti()
	{
		System.out.println("--------Lista Utenti Biblioteca------------");
		for(Utente utente : utenti)
		{
			System.out.println(utente.toString());
		}
	}
	
	
	public boolean accediMenuUtente(String id)
	{
		boolean accedi = false;
		for(int i = 0;i < utenti.size(); i++)
		{
			if (utenti.get(i).getId().equalsIgnoreCase(id))
			{
				accedi = true;
			}
		}
		return accedi;
	}
	
	public Utente controlloUtenteTramiteId (String id)
	{
		Utente utenteTrovato = null;
		for(int i = 0;i < utenti.size(); i++)
		{
			if (utenti.get(i).getId().equalsIgnoreCase(id))
			{
				utenteTrovato = utenti.get(i);
			}
		}
		return utenteTrovato;
	}
	
}
