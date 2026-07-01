package Esercizio2;

import java.util.ArrayList;

public class BIblioteca {
	//variabili di istanza
	
	ArrayList<Libro> biblioteca = new ArrayList<>();

	//costruttore
	public BIblioteca() {
		super();
	}
	
	//metodi
	
	public void aggiungiLibro(Libro libri)
	{
		biblioteca.add(libri);
	}

	public void rimuoviLibro(Libro libri)
	{
		if ( !biblioteca.contains(libri))
		{
			System.out.println("Questo libro non è contunuto nella biblioteca");
		}
		else
		{
			biblioteca.remove(libri);
			System.out.println("Il libro è stato rimosso");
		}
	}
	
	public String cercaLibro(Libro libri)
	{
		if (biblioteca.contains(libri))
		{
			return "Il libro è presente nella biblioteca";
		
		}
		else
		{
			return "Il libro non è presente nella biblioteca";
		}
		
		
	}
	
	public void stampaCatalogo()
	{
		for (Libro libri : biblioteca)
		{
			System.out.println(libri.toString());
		}
	}

}
