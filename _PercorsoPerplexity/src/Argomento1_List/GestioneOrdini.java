package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestioneOrdini {

	
	private List<Ordine> ordini = new ArrayList<>();
	
	//metodi 
	public void aggiungiOrdine(Ordine ordine)
	{
		if(ordini.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if(controlloOrdine(ordine))
		{
			System.out.println("L'ordine è null");
			return;
		}
		else
		{
			boolean isPresente = false;
			for(Ordine ordineCorrente : ordini)
			{
				if(ordine.getNumeroOrdine() == ordineCorrente.getNumeroOrdine())
				{
					isPresente = true;
					break;
				}
			}
			if (isPresente == true)
			{
				System.out.println("L'ordine è già presente nella lista");
			}
			else
			{
				System.out.println("Ordine aggiunto correttamente");
				ordini.add(ordine);
			}
		}
    }
	
	public Ordine cercaOrdinePerNumero(int numeroOrdine)
	{
		if(controllaLista(ordini))
		{
			System.out.println("Lista vuota");
			return null;
		}
		else if (numeroOrdine <= 0)
		{
			System.out.println("Numero ordine non valido");
			return null;
		}
		else
		{
			Ordine ordineDaCercare = null;
			
			for(Ordine ordineCorrente : ordini)
			{
				if(numeroOrdine == ordineCorrente.getNumeroOrdine())
				{
				ordineDaCercare = ordineCorrente;	
				}
			}
			return ordineDaCercare;
		}
	}
	
	public List<Ordine> cercaOrdinePerCliente(String cliente)
	{
		if(controllaLista(ordini))
		{
		System.out.println("La lista è vuota");	
		return null;
		}
		else if (cliente == null || cliente.isEmpty())
		{
			System.out.println("Il cliente inserito non è valido");
			return null;
		}
		else
		{
			List<Ordine> ordiniPerCliente = null;
			for(Ordine ordine : ordini)
			{
				if(cliente.equals(ordine.getCliente()))
				{
					ordiniPerCliente.add(ordine);
				}
			}
			
			if(ordiniPerCliente.isEmpty())
			{
				System.out.println("La lista è vuota");	
				return ordiniPerCliente;
			}
			else
			{
				return ordiniPerCliente;
			}
		}
	}
	
	  public int cercaIndicePrimoOrdine(String cliente) 
	    {
			if(controllaLista(ordini))
			{
			System.out.println("La lista è vuota");	
			return -1;
			}
			else if (cliente == null || cliente.isEmpty())
			{
				System.out.println("Il cliente inserito non è valido");
				return -1;
			}
			else
			{
				int indicePrimoOrdine = -1;
				for (int i = 0;i <ordini.size(); i++)
				{
					if(cliente.equals(ordini.get(i)))
					{
						indicePrimoOrdine = i;
					}
				}
				if(indicePrimoOrdine == -1)
				{
					System.out.println("Non ci sono indici per questo cliente nella lista");
					return indicePrimoOrdine;
				}
				else
				{
					System.out.println("L'indice del cliente: " + cliente + " è: " + indicePrimoOrdine);
					return indicePrimoOrdine;
				}
				
			}
	    }
	  
	   public int cercaIndiceUltimoOrdine(String cliente)
	   {
		   if(controllaLista(ordini))
			{
			System.out.println("La lista è vuota");	
			return -1;
			}
			else if (cliente == null || cliente.isEmpty())
			{
				System.out.println("Il cliente inserito non è valido");
				return -1;
			}
			else
			{
				int indiceUltimoOrdine = -1;
				for(int i = ordini.size() -1; i >= 0; i--)
				{
					if(cliente.equals(ordini.get(i)))
					{
						indiceUltimoOrdine = i;
					}
				}
				
				if(indiceUltimoOrdine == -1)
				{
					System.out.println("Non ci sono indici per questo cliente nella lista");
					return indiceUltimoOrdine;
				}
				else
					System.out.println("L'indice del cliente: " + cliente + " è: " + indiceUltimoOrdine);	
				    return indiceUltimoOrdine;
			}
	   }
	  
	
	   public void rimuoviOrdinePerNumero(int numeroOrdine)
	   {
	     if(controllaLista(ordini))
	     {
	    	 System.out.println("La lista è vuota");
	    	 return;
	     }
	     else if (numeroOrdine <= 0)
	     {
	    	 System.out.println("Il numero dell'ordine inserito non è valido");
	    	 return;
	     }
	     else
	     {
	    	 Ordine ordineDaEliminare = cercaOrdinePerNumero(numeroOrdine);
	    	 
	    	 if(ordineDaEliminare != null)
	    	 {
	    		 System.out.println("Ordine eliminato con successo");
	    		 ordini.remove(ordineDaEliminare);
	    		 return;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("L'ordine non è presente nella lista");
	    	 }
	     }
	   }
	   
	   public void rimuoviOrdinePerIndice(int indice) 
	   {
		   if(controllaLista(ordini))
		     {
		    	 System.out.println("La lista è vuota");
		    	 return;
		     } 
		   else if (indice < 0 || indice >= ordini.size())
		   {
			   System.out.println("L'indice inserito non è valido");
			   return;
		   }
		   else
		   {
			   Ordine ordineDaEliminare = ordini.get(indice);
			   ordini.remove(ordineDaEliminare);
			   System.out.println("L'ordine è stato eliminato con successo");
		   }
	   }
	   
	   public void aggiornaStatoOrdine(int numeroOrdine, StatoOrdine nuovoStato)
	   {
		   if(controllaLista(ordini))
		     {
		    	 System.out.println("La lista è vuota");
		    	 return;
		     } 
		   else if (numeroOrdine <= 0)
		     {
		    	 System.out.println("Il numero dell'ordine inserito non è valido");
		    	 return;
		     }
		   else
		   {
			   Ordine ordineDaAggiornare = cercaOrdinePerNumero(numeroOrdine);
			   
			   if(ordineDaAggiornare == null)
			   {
				   System.out.println("L'ordine da aggiornare non è stato trovato");
				   return;
			   }
			   else
			   {
				   ordineDaAggiornare.setStato(nuovoStato);
				   System.out.println("L'ordine è stato aggiornato al nuovo stato: " + nuovoStato);
			   }
		   }
	   }
	
	   public void stampaTuttiOrdini() 
	   {
		   if(controllaLista(ordini))
		   {
			 System.out.println("La lista è vuota");
			 return;
		   }
		   else 
		   {
			   for(Ordine ordineCorrente : ordini)
			   {
				   System.out.println(ordineCorrente.toString());
			   }
		   }
	   }
	
	   public void stampaOrdinePerStato()
	   {
		   if(controllaLista(ordini))
		   {
			 System.out.println("La lista è vuota");
			 return;
		   }
		   else
		   {
			   
			   List<Ordine> inPreparazione = new ArrayList<>();
			   List<Ordine> spedito = new ArrayList<>();
			   List<Ordine> consegnato = new ArrayList<>();
			   
			   for(Ordine ordineCorrente : ordini)
			   {
				   if(ordineCorrente.getStato() == StatoOrdine.IN_PREPARAZIONE)
				   {
					   inPreparazione.add(ordineCorrente);
				   }
				   else if (ordineCorrente.getStato() == StatoOrdine.SPEDITO)
				   {
					  spedito.add(ordineCorrente);
				   }
				   else
				   {
					   consegnato.add(ordineCorrente);
				   }
			   }
			   
			   if(inPreparazione.isEmpty())
			   {
				   
				   System.out.println("---------Lista ordini in Preparazione---------");
				   System.out.println("Non ci sono ordini in preparazione");
				   System.out.println("------------------------------------------");
				   System.out.println();
			   }
			   else
			   {
				   System.out.println("---------Lista ordini in Preparazione---------");
				   for(Ordine ordineInPreparazione : inPreparazione)
				   {
					   System.out.println(ordineInPreparazione.toString());
					   System.out.println("------------------------------------------");
					   System.out.println();
				   }
			   }
			   
			   if(spedito.isEmpty())
			   {
				   System.out.println("---------Lista ordini spediti---------");
				   System.out.println("Non ci sono ordini spediti");
				   System.out.println("------------------------------------------");
				   System.out.println();
			   }
			   System.out.println("---------Lista ordini spediti---------");
			   for(Ordine ordineSpedito : spedito)
			   {
				   System.out.println(ordineSpedito.toString());
				   System.out.println("------------------------------------------");
				   System.out.println();
			   }
			   
			   
			   if(consegnato.isEmpty())
			   {
				   System.out.println("---------Lista ordini consegnati---------");
				   System.out.println("Non ci sono ordini consegnati");
				   System.out.println("------------------------------------------");
				   System.out.println();
			   }
			   System.out.println("---------Lista ordini consegnati---------");
			   for(Ordine ordineConsegnato : spedito)
			   {
				   System.out.println(ordineConsegnato.toString());
				   System.out.println("------------------------------------------");
				   System.out.println();
			   }
		  }
	   }
	
	public void stampaOrdiniConTotaleMinimo ( double minimo)
	{
		if(controllaLista(ordini))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if (minimo <= 0)
		{
			System.out.println("Il valore minimo inserito non è valido");
			return;
		}
		else
		{
			List<Ordine> ordiniSottoMinimo = new ArrayList<>();
			
			for(Ordine ordine : ordini)
			{
				if(minimo >= ordine.getTotale())
				{
					 ordiniSottoMinimo.add(ordine);
				}
			}
			if(ordiniSottoMinimo.isEmpty())
			{
				System.out.println("Non ci sono ordini con valore sopra il minimo");
				return;
			}
			else
			{
			  for(Ordine ordineCorrente : ordiniSottoMinimo)
			  {
				  System.out.println(ordineCorrente.toString());
			  }
			}
		}
	}
	
	
	
	
	
	
	
	//metodi di controllo
	 
	public boolean controllaLista(List<Ordine> ordini)
	{
		return ordini == null || ordini.isEmpty();
	}
	
	public boolean controlloOrdine(Ordine ordine)
	{
		return ordine == null;
	}
	 
}
