package Argomento2_Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestioneGiardino {

	private Set<Pianta> piante = new HashSet<>();
	
	// metodo aggiungi pianta
	public void aggiungiPianta(Pianta pianta)
	{
		
	     if (pianta == null)
		{
			System.out.println("La pianta che si vuole aggiungere è null");
			return;
		}
		else
		{
			boolean presente = false;
			for(Pianta piantaCorrente : piante)
			{
				if (piantaCorrente.getCodicePianta() == pianta.getCodicePianta())
				{
					presente = true;
					break;
				}
			}
			if (presente)
			{
				System.out.println("La pianta che si vuole inserire è presente nel set");
				return;
			}
			else
			{
				piante.add(pianta);
				System.out.println("La pianta è stata aggiunta correttamente");
			}
		}
	}
	
	// metodo stampa tutte le piante
	
	public void stampaTutteLePiante()
	{
		if (piante.isEmpty())
		{
			System.out.println("Il set principale è vuoto");
			return;
		}
		else
		{
			for (Pianta pianta : piante)
			{
				System.out.println(pianta);
			}
		}
	}
	
	// metodo contiene pianta per codice
	
	public boolean contienePiantaPerCodice (int codicePianta)
	{
		 if (codicePianta <= 0)
		{
			return false;
		}
		else
		{
			for(Pianta pianta : piante)
			{
				if (pianta.getCodicePianta() == codicePianta)
				{
					return true;
				}
			}
			return false;
		}
	}
	
	// metodo cerca pianta per codice
	
	public Pianta cercaPiantaPerCodice (int codicePianta)
	{
		 if (codicePianta <= 0)
			{
				return null;
			}
		 else
		 {
			 for(Pianta pianta : piante)
			 {
				 if (pianta.getCodicePianta() == codicePianta)
				 {
					  return pianta;
				 }
			 }
			 return null;
		 }
	}
	
	// metodo cerca piante per specie
	
	public Set<Pianta> cercaPiantePerSpecie (String specie)
	{
		Set<Pianta> piantePerSpecie = new HashSet<>();
		
		if (specie == null || specie.isBlank())
		{
			return piantePerSpecie;
		}
		else
		{
			for(Pianta pianta : piante)
			{
				if (pianta.getSpecie().equalsIgnoreCase(specie))
				{
					piantePerSpecie.add(pianta);				}
			}
			return piantePerSpecie;
		}
	}
	
	// metodo rimuovi pianta per codice
	
	public boolean rimuoviPiantaPerCodice (int codicePianta)
	{
		 if (codicePianta <= 0)
			{
				return false;
			}
		 else
		 {
			 Pianta piantaDaCercare = cercaPiantaPerCodice(codicePianta);
			 if(piantaDaCercare == null)
			 {
				 return false;
			 }
			 else
			 {
				 piante.remove(piantaDaCercare);
				 return true;
			 }
		 }
	}
	
	// metodo aggiorna specie pianta
	
	public boolean aggiornaSpeciePianta (int codicePianta, String nuovaSpecie)
	{
		 if (codicePianta <= 0)
			{
				return false;
			}
		 else if (nuovaSpecie == null || nuovaSpecie.isBlank())
		 {
			 return false;
		 }
		 else
		 {
			 Pianta piantaDaCercare = cercaPiantaPerCodice(codicePianta);
			 if(piantaDaCercare == null)
			 {
				 return false;
			 }
			 else
			 {
				 piantaDaCercare.setSpecie(nuovaSpecie);
				 return true;
			 }
		 }
	}
	
	// metodo stampa piante sempreVerdi
	
	public void stampaPianteSempreVerdi ()
	{
		if ( piante.isEmpty())
		{
			System.out.println("Il set principale è vuoto");
			return;
		}
		else
		{
			boolean trovato = false;
			for(Pianta pianta : piante)
			{
				if(pianta.isSempreVerde())
				{
					System.out.println(pianta);
					trovato = true;
				}
			}
			if(!trovato)
			{
				System.out.println("Non ci sono piante sempreVerdi nel set");
			}
		}
	}
	
	//metodo conta piante per specie
	
	public int contaPiantePerSpecie (String specie)
	{
		if (specie == null || specie.isBlank())
		{
			return 0;
		}
		else
		{
			int contatorePiante = 0;
			for(Pianta pianta : piante)
			{
				if(pianta.getSpecie().equalsIgnoreCase(specie))
				{
					contatorePiante++;
				}
			}
			return contatorePiante;
		}
	}
	
	//metodo stampa piante ordinate per nome
	
	public void stampaPianteOrdinatePerNome()
	{
		if ( piante.isEmpty())
		{
			System.out.println("Il set principale è vuoto");
			return;
		}
		else
		{
			List<Pianta> listaOrdinata = new ArrayList<>();
			listaOrdinata.addAll(piante);
			
			listaOrdinata.sort(Comparator.comparing(Pianta::getNome));
			for(Pianta pianta : listaOrdinata)
			{
				System.out.println(pianta);
			}
		}
	}
	
}
