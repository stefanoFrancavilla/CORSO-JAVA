package Argomento2_Set;

import java.util.HashSet;
import java.util.Set;

public class GestioneNoleggio {

	private Set<Attrezzatura> attrezzature = new HashSet<>();
	
	// metodo aggiungi attrezzatura
	public void aggiungiAttrezzatura(Attrezzatura attrezzatura)
	{

		if (attrezzatura == null)
		{
			System.out.println("L'attrezzatura che si vuole aggiungere è null");
		}
		else
		{
			for(Attrezzatura attrezzaturaCorrente : attrezzature)
			{
				if(attrezzaturaCorrente.getCodiceAttrezzatura() == attrezzatura.getCodiceAttrezzatura())
				{
					System.out.println("L'attrezzatura che si vuole aggiungere esiste già nel set");
					return;
					
				}
			}
			
			attrezzature.add(attrezzatura);
			System.out.println("L'attrezzatura è stata aggiunta correttamente");
		}
	}
	
	// metodo stampa tutte le attrezzature
	
	public void stampaTutteLeAttrezzature()
	{
		if (attrezzature.isEmpty())
		{
			System.out.println("Il set delle attrezzature è vuoto");
			return;
		}
		else
		{
			for(Attrezzatura attrezzatura :attrezzature)
			{
				System.out.println(attrezzatura);
			}
		}
	}
	
	// metodo cerca attrezzatura per codice
	
	public Attrezzatura cercaAttrezzaturaPerCodice (int codiceAttrezzatura)
	{
		if (codiceAttrezzatura <= 0)
		{
			return null;
		}
		else
		{
			for(Attrezzatura attrezzatura : attrezzature)
			{
				if (attrezzatura.getCodiceAttrezzatura() == codiceAttrezzatura)
				{
					return attrezzatura;
				}
			}
			return null;
		}
	}
	
	// metodo cerca attrezzature per categoria
	
	public Set<Attrezzatura> cercaAttrezzaturePerCategoria (String categoria)
	{
		Set<Attrezzatura> attrezzaturePerCategoria = new HashSet<>();
		if (categoria == null || categoria.isBlank())
		{
			return attrezzaturePerCategoria;
		}
		else
		{
			for(Attrezzatura attrezzatura : attrezzature)
			{
				if (attrezzatura.getCategoria().equalsIgnoreCase(categoria))
				{
					attrezzaturePerCategoria.add(attrezzatura);
				}
			}
			return attrezzaturePerCategoria;
		}
	}
	
	// metodo rimuovi attrezzatura per codice
	
	public boolean rimuoviAttrezzaturaPerCodice( int codiceAttrezzatura)
	{
		if (codiceAttrezzatura <= 0)
		{
			return false;
		}
		else
		{
		  Attrezzatura attrezzaturaDaRimuovere = cercaAttrezzaturaPerCodice(codiceAttrezzatura);
		  if (attrezzaturaDaRimuovere == null)
		  {
			  return false;
		  }
		  attrezzature.remove(attrezzaturaDaRimuovere);
		  return true;
		}
	}
	
	// metodo conta attrezzature per categoria
	
	public int contaAttrezzaturaPerCategoria (String categoria)
	{
		int counter = 0;
		
		if (categoria == null || categoria.isBlank())
		{
			return counter;
		}
		else
		{
			counter = cercaAttrezzaturePerCategoria(categoria).size();
			return counter;
		}
	}
	
	// metodo conta attrezzature totali
	
	public int contaAttrezzatureTotali()
	{
		if (attrezzature.isEmpty())
		{
			return 0;
		}
		else
		{
			return attrezzature.size();
		}
	}
	
	// metodo noleggia attrezzatura
	
	public boolean noleggiaAttrezzatura (int codiceAttrezzatura, int numeroGiorni)
	{
		if (codiceAttrezzatura <= 0)
		{
			return false;
		}
		else if (numeroGiorni <= 0)
		{
			return false;
		}
		else
		{
			Attrezzatura attrezzaturaDaNoleggiare = cercaAttrezzaturaPerCodice(codiceAttrezzatura);
			if(attrezzaturaDaNoleggiare == null)
			{
				return false;
			}
			else if(!attrezzaturaDaNoleggiare.isDisponibile())
			{
				return false;
			}
			else
			{
				attrezzaturaDaNoleggiare.setDisponibile(false);
				attrezzaturaDaNoleggiare.setNumeroGiorniNoleggio(numeroGiorni);
				return true;
			}
		}
	}
	
	// metodo calcola costo noleggio
	
	public double calcolaCostoNoleggio (int codiceAttrezzatura)
	{
		double costoNoleggio = 0.0;
		if (codiceAttrezzatura <= 0)
		{
			return costoNoleggio;
		}
		else
		{
			Attrezzatura attrezzaturaDaCalcolare = cercaAttrezzaturaPerCodice(codiceAttrezzatura);
			if(attrezzaturaDaCalcolare == null)
			{
				return costoNoleggio;
			}
			else if (!attrezzaturaDaCalcolare.isDisponibile())
			{
				return costoNoleggio;
			}
			else
			{
				costoNoleggio = attrezzaturaDaCalcolare.getCostoGiornaliero() * attrezzaturaDaCalcolare.getNumeroGiorniNoleggio();
				return costoNoleggio;
			}
		}
	}
	
	// metodo restituisci attrezzatura
	
	public boolean restituisciAttrezzatura (int codiceAttrezzatura)
	{
		if (codiceAttrezzatura <= 0)
		{
			return false;
		}
		else
		{
			Attrezzatura attrezzaturaDaRestituire = cercaAttrezzaturaPerCodice(codiceAttrezzatura);
			
			if (attrezzaturaDaRestituire == null)
			{
				return false;
			}
			else if (attrezzaturaDaRestituire.isDisponibile())
			{
				return false;
			}
			else
			{
				attrezzaturaDaRestituire.setDisponibile(true);
				attrezzaturaDaRestituire.setNumeroGiorniNoleggio(0);
				return true;
			}
		}
	}
}
