package Argomento_6_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestoreBiblioteca {
	
	private Map<String, List<Libro>> prestiti = new HashMap<>();
	
	
	public void aggiungiPrestito(String utente, Libro libro)
	{
	   prestiti.putIfAbsent(utente, new ArrayList<Libro>());
	   
	   if(libro.isRestituito() == false)
	   {
		   prestiti.get(utente).add(libro);
		  
	   }
	   System.out.println("Il libro è stato già prestato");
	}
	
	public void restituisciLibro(String utente, String titolo)
	{
		List<Libro> listaLibri = prestiti.get(utente);
		
		Libro libroDaRestituire = null;
		for(Libro libro : listaLibri)
		{
			if (libro.getTitolo().equals(titolo))
				
			{
				libroDaRestituire = libro;
			}
		}
		libroDaRestituire.restituisciLibro();
		prestiti.get(utente).remove(libroDaRestituire);
		
		
	}
	
	public int calcolaPaginePrestate(String utente)
	{
		List<Libro> listaLibri = prestiti.get(utente);
		
		if (listaLibri == null || listaLibri.isEmpty())
		{
			System.out.println("La lista è vuota");
			return 0;
		}
		
		int totalePagine = 0;
		
		for(Libro libro : listaLibri )
		{
			totalePagine += libro.getPagine();
		
		}
		System.out.println("Il numero di pagine prestate sono: " + totalePagine);
		return totalePagine;
	}
	
	public int contaLibriNonRestituiti(String utente)
	{
		List<Libro> libriNonRestituiti = prestiti.get(utente);
		
		if (libriNonRestituiti == null || libriNonRestituiti.isEmpty())
		{
			System.out.println("La lista è vuota");
			return 0;
		}
		int totaleLibri = libriNonRestituiti.size();
		
		System.out.println("Il totale dei libri non restituiti sono: " + totaleLibri);
		return totaleLibri;
	}
	
	public void  stampaPrestiti()
	{
		for(String nomeUtente : prestiti.keySet())
		{
			System.out.println("Nome utente : " + nomeUtente );
			System.out.println("Lista dei libri");
			System.out.println(prestiti.get(nomeUtente).toString());
			System.out.println("-------------------");
			System.out.println("Numero dei libri non restituiti : " + prestiti.get(nomeUtente).size());
			System.out.println("Totale delle pagine ancora prestate : " + calcolaPaginePrestate(nomeUtente));
			System.out.println("-------------------");
			System.out.println("-------------------");
		}
	}
	
	public String trovaUtenteConPiuLibri()
	{
		String utenteConPiuLibri = "";
		
		int libriMax = 0;
		for(String nome : prestiti.keySet())
		{
			if (libriMax < contaLibriNonRestituiti(nome))
			{
				libriMax = contaLibriNonRestituiti(nome);
			}
			utenteConPiuLibri = nome;
		}
		System.out.println("Lutente con più libri è: " + utenteConPiuLibri );
		return utenteConPiuLibri;
	}
	
	public boolean esisteUtente(String nome)
	{
		if(prestiti.containsKey(nome))
		{
			System.out.println("L'utente " + nome + " è presente nella lista");
			return true;	
		}
		
		    System.out.println("L'utente " + nome + " non è presente nella lista");
		return false;
	}
	
	public void stampaLibriDiAutore(String utente, String autore)
	{
		
		
		
		if(esisteUtente(utente))
		{
			List<Libro> libriStessoAutore = new ArrayList<>();
		    
			List<Libro> listaDiLibriUtente = prestiti.get(utente);
			
			for (Libro libro : listaDiLibriUtente)
			{
				if(libro.getAutore().equals(autore))
				{
					libriStessoAutore.add(libro);
				}
			}
			
			System.out.println(libriStessoAutore.toString());
		   
		}
		
	}
	
}
