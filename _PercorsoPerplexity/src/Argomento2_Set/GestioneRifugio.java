package Argomento2_Set;

import java.util.HashSet;
import java.util.Set;

public class GestioneRifugio {

	private Set<Animale> animali = new HashSet<>();
	
	// metodo aggiungi animale
	
	public void aggiungiAnimale(Animale animale)
	{
		if (animale == null)
		{
			System.out.println("L'animale che si vuole inserire è null");
			return;
		}
		else
		{
			boolean presente = false;
			for(Animale animaleCorrente : animali)
			{
				if (animaleCorrente.getCodiceAnimale() == animale.getCodiceAnimale())
				{
					System.out.println("L'animale che si vuole aggiungere è presente nel rifugio");
					presente = true;
					return;
				}
			}
			if(!presente)
			{
				animali.add(animale);
				System.out.println("L'animale è stato aggiunto correttamente");
			}
		}
   }
	
	// metodo stampa tutti gli animali
	
	public void stampaTuttiGliAnimali()
	{
		if (animali.isEmpty())
		{
			System.out.println("Non ci sono animali nel rifugio");
			return;
		}
		else
		{
			for(Animale animale : animali)
			{
				System.out.println(animale);
			}
		}
	}
	
	//metodo cerca animale per codice
	
	public Animale cercaAnimalePerCodice (int codiceAnimale)
	{
		if (codiceAnimale <= 0)
		{
			return null;
		}
		else
		{
			for (Animale animale : animali)
			{
				if (animale.getCodiceAnimale() == codiceAnimale)
				{
					return animale;
				}
			}
			return null;
		}
	}
	
	// metodo cerca animali per specie
	
	public Set<Animale> cercaAnimaliPerSpecie (String specie)
	{
		Set<Animale> animaliPerSpecie = new HashSet<>();
		if(specie == null || specie.isBlank())
		{
			return animaliPerSpecie;
		}
		else
		{
			for(Animale animale : animali)
			{
				if (animale.getSpecie().equalsIgnoreCase(specie))
				{
					animaliPerSpecie.add(animale);
				}
			}
			return animaliPerSpecie;
		}
	}
	
	// metodo rimuovi animale per codice
	
	public boolean rimuoviAnimalePerCodice (int codiceAnimale)
	{
		if (codiceAnimale <= 0)
		{
			return false;
		}
		else
		{
			Animale animaleDaRimuovere = cercaAnimalePerCodice(codiceAnimale);
			if (animaleDaRimuovere == null)
			{
				return false;
			}
			animali.remove(animaleDaRimuovere);
			return true;
		}
	}
	
	//metodo aggiorna eta aniamle
	
	public boolean aggiornaEtaAnimale (int codiceAnimale, int nuovaEta)
	{
		if (codiceAnimale <= 0)
		{
			return false;
		}
		else if (nuovaEta < 0)
		{
			return false;
		}
		else
		{
			Animale animaleDaAggiornare = cercaAnimalePerCodice(codiceAnimale);
			if(animaleDaAggiornare == null)
			{
				return false;
			}
			animaleDaAggiornare.setEta(nuovaEta);
			return true;
		}
	}
	
	
	// metodo stampa animali adottabili
	
	public void stampaAnimaliAdottabili()
	{
		if (animali.isEmpty())
		{
			System.out.println("Non ci sono animali nel rifugio");
			return;
		}
		else
		{
			boolean trovato = false;
			for(Animale animale : animali)
			{
				if (animale.isAdottabile())
				{
					System.out.println(animale);
					trovato = true;
				}
			}
			if (!trovato)
			{
				System.out.println("Non ci sono animali adottabili nel rifugio");
			}
		}
	}
	
	//metodo conta animali con eta minima
	
}
