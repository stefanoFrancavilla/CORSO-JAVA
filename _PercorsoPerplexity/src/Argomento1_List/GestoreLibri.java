package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestoreLibri {
	
	private List<Libro> libri = new ArrayList<>();
	 
	
	public void aggiungiLibro(Libro libro)
	{
		if (controlloLibro(libro))
		{
			System.out.println("Il libro che si vuole aggiungere è uguale a null");
			return;
		}
		else 
		{
			boolean libroPresente = false;
			for (Libro libroCorrente : libri)
			{
				if(libroCorrente.getTitolo().equals(libro))
				{
					System.out.println("Il libro esiste già");
					libroPresente = true;
				}
				
			}
			if(libroPresente == false)
			{
				libri.add(libro);
				System.out.println("Il libro è stato aggiunto correttamente");
			}
		}
	}
	
	public Libro cercaLibroPerTitolo(String titolo)
	{
		if(controlloListaIfVuota(libri) == true)
		{
			System.out.println("Lista libri è vuota");
			return null;
		}
		else if (titolo == null || titolo.isEmpty())
		{
			System.out.println("Errore, titolo vuoto o null");
			return null;
		}
		else
		{
			Libro libroDaCercare = null;
			for (Libro libroCorrente : libri)
			{
				if(libroCorrente.getTitolo().equals(titolo))
				{
					libroDaCercare = libroCorrente;
					break;
				}
			}
			
			return libroDaCercare;
			
		}
	}
	
	public List<Libro> cercaLibroPerAutore(String autore)
	{
		if(controlloListaIfVuota(libri) == true)
		{
			System.out.println("Lista libri è vuota");
			return null;
		}
		else
		{
			List<Libro> libriPerAutore = new ArrayList<>();
			
			for(Libro libroCorrente : libri)
			{
				if(libroCorrente.getAutore().equals(autore))
				{
					libriPerAutore.add(libroCorrente);
					
				}
			}
			
			return libriPerAutore;
		}
	}
	
	public Libro cercaLibroPerIndice(int indice)
	{
		
		if(controlloListaIfVuota(libri) == true)
		{
			System.out.println("Lista libri è vuota");
			return null;
		}
		else if(indice < 0 || indice > libri.size())
		{
			System.out.println("Errore, inserire un'indice valido");
			return null;
		}
		else
		{
			Libro libroDaCercare = null;
			
			for(int i = 0;i < libri.size();i++)
			{
				if(i == indice)
				{
				  libroDaCercare = libri.get(i)	;
				}
			}
			return libroDaCercare;
		}
	}
	
	public void rimuoviLibroPerTitolo(String titolo)
	{
		Libro libroDaEliminare = cercaLibroPerTitolo(titolo);
		if(libroDaEliminare != null)
		{
			System.out.println("Libro eliminato con successo");
			libri.remove(libroDaEliminare);
		}
	}
	
	public void rimuoviLibroPerIndice ( int indice)
	{
		Libro libroDaEliminare = cercaLibroPerIndice(indice);
		if(libroDaEliminare != null)
		{
			System.out.println("Libro all'indice: " + indice + " eliminato con successo");
			libri.remove(libroDaEliminare);
		}
	}
	
	public void aggiornaCopie(String titolo, int copie)
	{
		Libro libroDaAggiornare = cercaLibroPerTitolo(titolo);
		
		if(libroDaAggiornare == null)
		{
			System.out.println("Errore , libro non trovato");
			return;
		}
		else if (copie <= 0)
		{
			System.out.println("Errore numero di copie non corretto");
			return;
		}
		else
		{
			int copieTotali = libroDaAggiornare.getCopieDisponibile() + copie;
			if(copieTotali > 10)
			{
				System.out.println("Limite massimo superato. il massimo di copie disponibili non può superare 10");
				System.out.println("Attualmente ci sono già: " + libroDaAggiornare.getCopieDisponibile() + " di copie");
			}
			else
			{
				libroDaAggiornare.setCopieDisponibile(copieTotali);
			}
		}
	}
	
	public void stampaTuttiiLibri()
	{
		if(controlloListaIfVuota( libri))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			System.out.println("------------Lista libri completa----------------");
			for(Libro libroCorrente : libri)
			{
				System.out.println(libroCorrente.toString());
			}
			System.out.println("-------------------------------------------------");
		}
	}
	
	public void stampaLibriDisponibili()
	{
		if(controlloListaIfVuota( libri))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			List<Libro> libriDisponibili = new ArrayList<>();
			for(Libro libroCorrente : libri)
			{
				if(libroCorrente.getCopieDisponibile() > 0)
				{
					libriDisponibili.add(libroCorrente);
				}
			}
			
			System.out.println("----------------Lista libri disponibili---------------------------------");
			if(libriDisponibili.isEmpty())
			{
				System.out.println("Non ci sono libri disponibili");
				System.out.println("-------------------------------------------------");
			}
			else
			{
				for(Libro libroDaStampare : libriDisponibili)
				{
					System.out.println(libroDaStampare.toString());
				}
				
				System.out.println("-------------------------------------------------");
			}
		}
	}
	
	public void stampaLibriEsauriti()
	{
		if(controlloListaIfVuota(libri))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			List<Libro> libriEsauriti = new ArrayList<>();
			for(Libro libroCorrente : libri)
			{
				if(libroCorrente.getCopieDisponibile() == 0)
				{
					libriEsauriti.add(libroCorrente);
				}
			}
			
			System.out.println("----------------Lista libri esauriti---------------------------------");
			if(libriEsauriti.isEmpty())
			{
				System.out.println("Non ci sono libri esauriti");
				System.out.println("-------------------------------------------------");
			}
			else
			{
				for(Libro libroDaStampare : libriEsauriti)
				{
					System.out.println(libroDaStampare.toString());
				}
				
				System.out.println("-------------------------------------------------");
			}
		}
	}

	
	
	
	
	
    //metodi di controllo
	
	public boolean controlloListaIfVuota(List<Libro> libri)
	{
		boolean isVuota = false;
		if(libri == null || libri.isEmpty())
		{
			isVuota = true;
			return isVuota;
		}
		else
		{
			return isVuota;
		}
	}
	
	public boolean controlloLibro(Libro libro)
	{
		boolean isValido = true;
		if(libro == null)
		{
			isValido = false;
			return isValido;
		}
		else
		{
			return isValido;
		}
	}
}
