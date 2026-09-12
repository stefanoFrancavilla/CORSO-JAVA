package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestoreSquadra {

	private List<Giocatore> giocatori = new ArrayList<>();
	
	public void aggiungiGiocatore(Giocatore giocatore)
	{
		if(controlloLista(giocatori))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if (controlloGiocatore(giocatore))
		{
			System.out.println("Il giocatore non è valido");
			return;
		}
		else
		{
			boolean isPresente = false;
			for(Giocatore giocatoreCorrente : giocatori)
			{
				if(giocatoreCorrente.getNome().equals(giocatore.getNome()))
				{
					isPresente = true;
					break;
				}
			}
			if(isPresente == true)
			{
				System.out.println("Il giocatore è presente nella lista");
			}
			else
			{
				giocatori.add(giocatore);
				System.out.println("Giocatore aggiunto con successo");
			}
		}
	}
	
	public Giocatore cercaGiocatorePerNome(String nome)
	{
		if(controlloLista(giocatori))
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (nome == null || nome.isEmpty())
		{
			System.out.println("Il nome non è valido");
			return null;
		}
		else
		{
			Giocatore giocatoreDaCercare = null;
			for(int i = 0; i < giocatori.size(); i++)
			{
				if(giocatori.get(i).getNome().equals(nome))
			    {
					giocatoreDaCercare = giocatori.get(i);
				}
			}
			
			return giocatoreDaCercare;
		}
	}
	
	public List<Giocatore> cercaGiocatorePerRuolo(String ruolo)
	{
		if(controlloLista(giocatori))
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (ruolo == null || ruolo.isEmpty())
		{
			System.out.println("Il ruolo non è valido");
			return null;
		}
		else
		{
			List<Giocatore> giocatoriPerRuolo = new ArrayList<>();
			
			for(Giocatore giocatoreCorrente : giocatori)
			{
				if (giocatoreCorrente.getRuolo().equals(ruolo))
				{
					giocatoriPerRuolo.add(giocatoreCorrente);
				}
			}
			if (giocatoriPerRuolo.isEmpty())
			{
				System.out.println("Non ci sono giocatori con questo ruolo");
				return null;
			}
			else
			{
				System.out.println("Lista giocatori trovati per ruolo");
				return giocatoriPerRuolo;
			}
		}
	}
	
	public Giocatore cercaGiocatorePerNumeroDiMaglia(int numeroMaglia)
	{
		if(controlloLista(giocatori))
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if(numeroMaglia < 1 || numeroMaglia > 99)
		{
			System.out.println("Il numero della maglia non è valido ");
			return null;
		}
		else
		{
			Giocatore giocatoreDaTrovare = null;
			for(int i = 0; i < giocatori.size(); i++)
			{
				if(giocatori.get(i).getNumeroMaglia() == numeroMaglia)
				{
					giocatoreDaTrovare = giocatori.get(i);
				}
			}
			if(giocatoreDaTrovare == null)
			{
				System.out.println("Il giocatore con la maglia numero " + numeroMaglia + " non è presente nella lista");
				return null;
			}
			else
			{
				System.out.println("Il giocatore con la maglia numero " + numeroMaglia + "  è presente nella lista");
				return giocatoreDaTrovare;
			}
		}
	}
	
	public Giocatore cercaGiocatorePerIndice(int indice)
	{
		if(controlloLista(giocatori))
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if(indice < 0 || indice >= giocatori.size())
		{
			System.out.println("Indice inserito non valido");
			return null;
		}
		else
		{
			Giocatore giocatoredaTrovare = null;
			for(int i = 0; i < giocatori.size(); i++)
			{
				if(i == indice)
				{
					giocatoredaTrovare = giocatori.get(i);
				}
			}
			System.out.println("I giocatore all'indice " + indice + " è:");
			return giocatoredaTrovare;
		}
	}
	
	public void rimuoviGiocatorePerNome(String nome)
	{
		Giocatore giocatoreDaRimuovere = cercaGiocatorePerNome(nome);
		if(giocatoreDaRimuovere == null)
		{
			System.out.println("Il giocatore non è stato rimosso");
		}
		else
		{
			giocatori.remove(giocatoreDaRimuovere);
			System.out.println("Il giocatore è stato rimosso con successo");
		}
	}
	public void rimuoviGiocatorePerIndice(int indice)
	{
		if(cercaGiocatorePerIndice(indice) == null)
		{
			System.out.println("Il giocatore non è stato rimosso");
		}
		else
		{
			giocatori.remove(indice);
			System.out.println("Il giocatore all'indice " + indice + " è stato rimosso con sucesso");
		}
	}
	
	public void aggiornaGol(String nome, int nuoviGol)
	{
		Giocatore giocatore = cercaGiocatorePerNome(nome);
		if(giocatore == null)
		{
			System.out.println("Giocatore non trovato");
			return;
		}
		
		else
			
		{
			if(nuoviGol <= 0)
			{
				System.out.println("Errore, gol da aggiungere non validi");
				return;
			}
			else
			{
				giocatore.setGolSegnati(giocatore.getGolSegnati() + nuoviGol);
			}
		}
	}
	
	public void stampaTuttiGiocatori()
	{
		System.out.println("-----------Lista di tutti i giocatori-------------");
		if(controlloLista(giocatori))
		{
			System.out.println("Lista vuota");
		}
		else
		{
			for(Giocatore giocatoreCorrente : giocatori)
			{
				System.out.println(giocatoreCorrente.toString());
			}
		}
		System.out.println("--------------------------------------------------");
	}
	
	public void stampaGiocatoriPerRuolo(String ruolo)
	{
		if (ruolo == null || ruolo.isEmpty())
		{
			System.out.println("Il ruolo inserito non è valido");
		   
		}
	}
	
	
	
	
	
	
	
	
	//metodi controllo
	
	public boolean controlloLista(List giocatori)
	{
		return giocatori == null || giocatori.isEmpty();
	}
	
	public boolean controlloGiocatore(Giocatore giocatore)
	{
		return giocatore == null;
	}
}
