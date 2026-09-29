package Argomento2_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;
public class GestioneSentieri {

	private Set<String> sentieri = new HashSet<>();
	
	
	
	//metodo aggiungi sentiero
	public void aggiungiSentiero (String sentiero)
	{
		if ( sentieri == null )
		{
			System.out.println("Il Set principale è null");
			return;
		}
		else if (sentiero == null || sentiero.isBlank())
		{
			System.out.println("Il sentiero che si vuole aggiungere è null o vuoto");
			return;
		}
		else
		{
			boolean aggiunto = sentieri.add(sentiero);
			if ( !aggiunto )
			{
				System.out.println("Nel Set principale è già presente questo sentiero");
				return;
			}
			else
			{
				System.out.println("Il sentiero è stato aggiunto correttamente");
			}
		}
	}
	
	//metodo stampa tutti i sentieri
	
	public void stampaTuttiSentieri ()
	{
		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return;
		}
		else
		{
			System.out.println("-------------Set di tutti i sentieri---------------------");
			for (String sentiero : sentieri)
			{
				System.out.println(sentiero.toString());
			}
			System.out.println("-----------------------------------------------------------");
		}
	}
	
	//metodo contiene sentiero
	
	public boolean contieneSentiero ( String sentiero)
	{
		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return false;
		}
		else if (sentiero == null || sentiero.isBlank())
		{
			System.out.println("Il sentiero che si vuole aggiungere è null o vuoto");
			return false;
		}
		else
		{
			boolean presente = sentieri.contains(sentiero);
			
			if (presente)
			{
				System.out.println("Il sentiero è presente nella Set");
			}
			else
			{
				System.out.println("Il sentiero non è presente nella Set");
			}
			
			return presente;
		}
	}
	
	// metodo rimuovi sentiero
	
	public void rimuoviSentiero ( String sentiero)
	{
		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return;
		}
		else if (sentiero == null || sentiero.isBlank())
		{
			System.out.println("Il sentiero che si vuole rimuovere è null o vuoto");
			return;
		}
		else
		{
			boolean rimosso = sentieri.remove(sentiero);
			
			if (rimosso)
			{
				System.out.println("Il sentiero è stato rimosso dal Set principale correttamente");
			}
			else
			{
				System.out.println("Il sentiero non è presente nel Set");
			}
		}
	}
	
	//metodo conta sentieri
	
	public int contaSentieri()
	{
		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return 0;
		}
		else
		{
			int numeroSentieri = sentieri.size();
			return numeroSentieri;
		}
	}
	
	
	//metodo stampa sentieri ordinati
	
	public void stampaSentieriOrdinati()
	{
		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return;
		}
		else
		{
			System.out.println("-------------Set di tutti i sentieri ordinati---------------------");
			List<String> listaOrdinata = new ArrayList<>();
			listaOrdinata.addAll(sentieri);
			
			Collections.sort(listaOrdinata);
			
			for (String sentiero : listaOrdinata)
			{
				System.out.println(sentiero.toString());
			}
			System.out.println("-----------------------------------------------------------");
		}
	}
	
	//conta sentieri con iniziale
	
	public int contaSentieriConIniziale (char iniziale)
	{

		if ( sentieri == null || sentieri.isEmpty())
		{
			System.out.println("Il Set principale è null o vuoto");
			return 0;
		}
		else if (Character.isLetter(iniziale))
		{
			int numeroSentieri = 0;
			iniziale = Character.toUpperCase(iniziale);
			
			for (String sentiero : sentieri)
			{
				
				if(Character.toUpperCase(sentiero.charAt(0)) == iniziale)
				{
					numeroSentieri ++;
				}
			}
			return numeroSentieri;
		}
		else
		{
			System.out.println("Il carattere non è una lettera");
			return 0;
		}
	}
	
	
}
