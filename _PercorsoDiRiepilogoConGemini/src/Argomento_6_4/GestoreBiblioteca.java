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
			return 0;
		}
		
		int totalePagine = 0;
		
		for(Libro libro : listaLibri )
		{
			totalePagine += libro.getPagine();
		
		}
		
		return totalePagine;
	}
	
	public int contaLibriNonRestituiti(String utente)
	{
		List<Libro> libriNonRestituiti = prestiti.get(utente);
		
		int totaleLibri = libriNonRestituiti.size();
		
		return totaleLibri;
	}
	
	public void  stampaPrestiti()
	{
		for(String nomeUtente : prestiti.keySet())
		{
			System.out.println("NomeUtente : " + nomeUtente );
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
		
		return utenteConPiuLibri;
	}
	
	
}
