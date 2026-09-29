package Argomento2_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionePlaylist {

	private Set<Brano> brani = new HashSet<>();
	
	//metodo aggiungi brano
	
	public void aggiungiBrano(Brano brano)
	{
		if(brani == null)
		{
			System.out.println("Il set principale è null");
			return;
		}
		else if(brano == null)
		{
			System.out.println("Il brano inserito è null");
			return;
		}
		else
		{
			if (brani.isEmpty())
			{
				brani.add(brano);
				System.out.println("Il brano è stato aggiunto correttamente");
			}
			else
			{
				boolean presente = false;
				for(Brano branoCorrente : brani)
				{
					if (branoCorrente.getCodiceBrano() == brano.getCodiceBrano())
					{
						System.out.println("Il brano è presente nel Set");
						presente = true;
						return;
					}
				}
				if(presente == false)
				{
					brani.add(brano);
					System.out.println("Il brano è stato aggiunto correttamente");
				}
			}
		}
	}
	
	//metodo stampa tutti i brani
	
	public void stampaTuttiBrani()
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else
		{
			System.out.println("-----------Stampa di tutti i brani-----------------");
			for(Brano brano : brani)
			{
				System.out.println(brano.toString());
			}
			System.out.println("----------------------------------------------");
		}
	}
	
	//metodo contiene codice brano (boolean)
	public boolean contieneBranoPerCodice (int codiceBrano)
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return false;
		}
		else if(codiceBrano <= 0)
		{
			System.out.println("Il codice brano inserito è minore o uguale a 0");
			return false;
		}
		else
		{
			boolean presente = false;
			
			for(Brano brano : brani)
			{
				if (brano.getCodiceBrano() == codiceBrano)
				{
					presente = true;
					break;
				}
			}
				
			return presente;
		}
	}
	
	//metodo cerca brano per codice
	public Brano cercaBranoPerCodice (int codiceBrano)
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return null;
		}
		else if(codiceBrano <= 0)
		{
			System.out.println("Il codice brano inserito è minore o uguale a 0");
			return null;
		}
		else
		{
			Brano brano = null;
			
			for(Brano branoCorrente : brani)
			{
				if (branoCorrente.getCodiceBrano() == codiceBrano)
				{
					brano = branoCorrente;
					break;
				}
			}
			if (brano == null)
			{
				System.out.println("Il brano non è presente nel Set");
				return brano;
			}
			else
			{
				return brano;
			}
			
		}
	}
	
	//metodo cerca brani per genere
	public List<Brano> cercaBraniPerGenere (String genere)
	{
		List<Brano> braniPerGenere = new ArrayList<>();
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return braniPerGenere;
		}
		else if ( genere == null || genere.isBlank())
		{
			System.out.println("Il genere inserito è null o vuoto");
			return braniPerGenere;
		}
		else
		{
			for(Brano brano : brani)
			{
				if (brano.getGenere().equalsIgnoreCase(genere))
				{
					braniPerGenere.add(brano);
				}
			}
			if (braniPerGenere.isEmpty())
			{
				System.out.println("Non ci sono brani per questo genere");
				return braniPerGenere;
			}
			else
			{
				return braniPerGenere;
			}
		}
	}
	
	//metodo stampa brani per genere
	
	public void stampaBraniPerGenere( String genere)
	{
		List<Brano> braniDaStampare = cercaBraniPerGenere(genere);
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else if ( genere == null || genere.isBlank())
		{
			System.out.println("Il genere inserito è null o vuoto");
			return;
		}
		else if (braniDaStampare.isEmpty())
		{
			System.out.println("Non ci sono brani da stampare");
			return;
		}
		else
		{
			System.out.println("--------------Stampa di tutti i brani per genere---------------");
			
			for(Brano brano : braniDaStampare)
			{
				System.out.println(brano);
			}
			System.out.println("----------------------------------------------------");
		}
	}
	
	//metodo rimuovi brano per codice
	
	public void rimuoviBranoPerCodice(int codiceBrano)
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else if(codiceBrano <= 0)
		{
			System.out.println("Il codice brano inserito è minore o uguale a 0");
			return;
		}
		else
		{
			Brano brano = cercaBranoPerCodice(codiceBrano);
			
			if (brano == null)
			{
				System.out.println("Il codice brano non corrisponde a nessun brano");
				return;
			}
			else
			{
				brani.remove(brano);
				System.out.println("Il brano è stato rimosso con successo");
			}
		}
	}
	
	//metodo aggiorna genera brano
	
	public void aggiornaGenereBrano(int codiceBrano, String nuovoGenere)
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else if(codiceBrano <= 0)
		{
			System.out.println("Il codice brano inserito è minore o uguale a 0");
			return;
		}
		else if ( nuovoGenere == null || nuovoGenere.isBlank())
		{
			System.out.println("Il genere inserito è null o vuoto");
			return;
		}
		else
		{
			Brano branoDaAggiornare = cercaBranoPerCodice(codiceBrano);
			if(branoDaAggiornare == null)
			{
				System.out.println("Non ci sono brani con questo codice");
				return;
			}
			else
			{
			     branoDaAggiornare.setGenere(nuovoGenere);
			     System.out.println("Il genere è stato aggiornato con successo");
			}
		}
	}
	
	//stampa brani con durata minima
	
	public void stampaBraniConDurataMinima(int durata)
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else if(durata <= 0)
		{
			System.out.println("La durata del brano inserito è minore o uguale a 0");
			return;
		}
		else
		{
			System.out.println("-------------------stampa dei brani per durata minima----------------------");
			List<Brano> braniPerDurata = new ArrayList<>();
			
			for(Brano brano : brani)
			{
				if (brano.getDurataSecondi() >= durata)
				{
					braniPerDurata.add(brano);
				}
			}
			if(braniPerDurata.isEmpty())
			{
				System.out.println("Non ci sono brani con questi parametri di durata");
				return;
			}
			else
			{
			for(Brano branoDaStampare : braniPerDurata)
			{
				System.out.println(branoDaStampare);
			}
			System.out.println("---------------------------------------------------------");
		  }
		}
	}
	
	//metodo ordina brano per durata crescente
	
	public void ordinaBraniPerDurataCrescente()
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else
		{
			System.out.println("-------------stampa di tutti i brani in ordine crescente-----------");
			List<Brano> braniInOrdineCrescente = new ArrayList<>();
			
			braniInOrdineCrescente.addAll(brani);
			
			braniInOrdineCrescente.sort(Comparator.comparing(Brano :: getDurataSecondi));
			
			for(Brano brano : braniInOrdineCrescente)
			{
				System.out.println(brano);
			}
			
			System.out.println("---------------------------------------------------------");
		}
	}
	
	
	//metodo stampa brano di durata massima
	public void stampaBranoDiDurataMassima()
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else
		{
			Brano branoPiuLungo = null;
			int durata = 0;
			for(Brano brano : brani)
			{
				if(brano.getDurataSecondi() > durata)
				{
					durata = brano.getDurataSecondi();
					branoPiuLungo = brano;
				}
			}
			System.out.println(branoPiuLungo);
		}
	}
	
	//metodo stampa durata totale
	public void stampaDurataTotale()
	{
		if(brani == null || brani.isEmpty())
		{
			System.out.println("Il set principale è null o vuoto");
			return;
		}
		else
		{
			int durataTotale = 0;
			for(Brano brano : brani)
			{
				durataTotale += brano.getDurataSecondi();
			}
			System.out.println("La durata totale dei brani è: " + durataTotale);
		}
	}
	
	
}
