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
		else
		{
			Libro libroDaCercare = null;
			
			
		}
	}
	
	

	
	
	
	
	
    //metodi di controllo
	
	public boolean controlloListaIfVuota(List libri)
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
