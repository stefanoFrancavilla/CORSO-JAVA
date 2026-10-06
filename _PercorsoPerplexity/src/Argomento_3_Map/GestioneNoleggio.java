package Argomento_3_Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Argomento2_Set.Attrezzatura;

public class GestioneNoleggio {


	private	Set<Attrezzatura> attrezzature = new HashSet<>();

	private	List<Noleggio> noleggi = new ArrayList<>();
	
	// metodo aggiunto correttamente
	public void aggiungiNoleggio(Noleggio noleggio)
	{
		if (noleggio == null)
		{
			return;
		}
		else
		{
			noleggi.add(noleggio);
		}
	}
	
	//metodo stampa tutti i noleggi
	
	public void stampaTuttiINoleggi()
	{
		if (noleggi.isEmpty())
		{
			return;
		}
		else
		{
			System.out.println("--------stampa di tutti i noleggi-------");
			for(Noleggio noleggio : noleggi)
			{
				System.out.println(noleggio);
			}
			System.out.println("--------------------------");
		}
	}

	// metodo aggiungi attrezzatura
	public void aggiungiAttrezzatura(Attrezzatura attrezzatura)
	{

		if (attrezzatura == null)
		{
			return;
		}
		else
		{
			for(Attrezzatura attrezzaturaCorrente : attrezzature)
			{
				if(attrezzaturaCorrente.getCodiceAttrezzatura() == attrezzatura.getCodiceAttrezzatura())
				{
					return;			
				}
			}
			
			attrezzature.add(attrezzatura);
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
	
	
	
	// metodo crea noleggio
	
	public Noleggio creaNoleggio (int codiceNoleggio, int codiceAttrezzatura,
			String cliente, int giorni)
	{
		if (codiceNoleggio <= 0)
		{
			return null;
		}
		else if (codiceAttrezzatura <= 0)
		{
			return null;
		}
		else if (cliente == null || cliente.isBlank())
		{
			return null;
		}
		else if (giorni <= 0 )
		{
			return null;
		}
		else
		{
			  Attrezzatura attrezzaturaTrovata = cercaAttrezzaturaPerCodice(codiceAttrezzatura);

			    if (attrezzaturaTrovata == null) {
			        return null;
			    }

			    if (!attrezzaturaTrovata.isDisponibile()) {
			        return null;
			    }

			    Noleggio nuovoNoleggio = new Noleggio(codiceNoleggio, attrezzaturaTrovata, cliente, giorni);
			    noleggi.add(nuovoNoleggio);

			    attrezzaturaTrovata.setDisponibile(false);
			    attrezzaturaTrovata.setNumeroGiorniNoleggio(giorni);

			    return nuovoNoleggio;
					
		}
	}
	
	// metodo completo noleggio
	
	public boolean completaNoleggio(int codiceNoleggio)
	{
	    if (codiceNoleggio <= 0)
	    {
	        return false;
	    }

	    for (Noleggio noleggio : noleggi)
	    {
	        if (noleggio.getCodiceNoleggio() == codiceNoleggio)
	        {
	            if (noleggio.isCompletato())
	            {
	                return false;
	            }

	            Attrezzatura attrezzatura = noleggio.getAttrezzatura();

	            if (attrezzatura == null) 
	            {
	                return false;
	            }

	            noleggio.setCompletato(true);
	            attrezzatura.setDisponibile(true);
	            attrezzatura.setNumeroGiorniNoleggio(0);

	            return true;
	        }
	    }

	    return false;
	}
	
	// metodo conta noleggi attivi
	
	public int contaNoleggiAttivi()
	{
		int noleggiAttivi = 0;
		
		if (noleggi.isEmpty())
		{
			return noleggiAttivi;
		}
		else
		{
			for (Noleggio noleggio : noleggi)
			{
				if (noleggio.isCompletato() == false)
				{
					noleggiAttivi++;
				}
			}
			return noleggiAttivi;
		}
	}
	
	// metodo conta noleggi completati
	
	public int contaNoleggiCompletati()
	{
			int noleggiCompletati = 0;
			
			if (noleggi.isEmpty())
			{
				return noleggiCompletati;
			}
			else
			{
				for (Noleggio noleggio : noleggi)
				{
					if (noleggio.isCompletato())
					{
						noleggiCompletati++;
					}
				}
				return noleggiCompletati;
			}
	}
	
	
}
