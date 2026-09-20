package Argomento1_List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestioneOrdini {

	
	private List<Ordine> ordini = new ArrayList<>();
	
	//metodi 
	public void aggiungiOrdine(Ordine ordine)
	{
		if(controlloOrdine(ordine))
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
			
			
			for(Ordine ordineCorrente : ordini)
			{
				if(numeroOrdine == ordineCorrente.getNumeroOrdine())
				{
					return ordineCorrente;	
				}
			}
			
			return null;
		}
	}
	
	public List<Ordine> cercaOrdiniPerCliente(String cliente) {
	    List<Ordine> ordiniPerCliente = new ArrayList<>();

	    if (cliente == null || cliente.isBlank()) {
	        System.out.println("Il cliente inserito non è valido");
	        return ordiniPerCliente;
	    }

	    for (Ordine ordine : ordini) {
	        if (ordine.getCliente().equalsIgnoreCase(cliente)) {
	            ordiniPerCliente.add(ordine);
	        }
	    }

	    return ordiniPerCliente;
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
					if (ordini.get(i).getCliente().equalsIgnoreCase(cliente))
					{
						indicePrimoOrdine = i;
						break;
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
					if (ordini.get(i).getCliente().equalsIgnoreCase(cliente)) {
					    indiceUltimoOrdine = i;
					    break;
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
			   Ordine ordineRimosso = ordini.remove(indice);
			   System.out.println("L'ordine è stato eliminato con successo: " + ordineRimosso);
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
		   else if (nuovoStato == null) {
			    System.out.println("Il nuovo stato non può essere null");
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
	
	   public void stampaOrdiniPerStato(StatoOrdine stato) {
		    if (stato == null) {
		        System.out.println("Lo stato inserito non è valido");
		        return;
		    }

		    boolean trovato = false;

		    for (Ordine ordine : ordini) {
		        if (ordine.getStato() == stato) {
		            System.out.println(ordine);
		            trovato = true;
		        }
		    }

		    if (!trovato) {
		        System.out.println("Non ci sono ordini con stato: " + stato);
		    }
		}
	
	public void stampaOrdiniConTotaleMinimo ( double minimo)
	{
		if(controllaLista(ordini))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if (minimo < 0)
		{
			System.out.println("Il valore minimo inserito non è valido");
			return;
		}
		else
		{
			List<Ordine>  ordiniConTotaleMinimo = new ArrayList<>();
			
			for(Ordine ordine : ordini)
			{
				if(ordine.getTotale() >= minimo) 
				{
					 ordiniConTotaleMinimo.add(ordine);
				}
			}
			if( ordiniConTotaleMinimo.isEmpty())
			{
				System.out.println("Non ci sono ordini con valore sopra il minimo");
				return;
			}
			else
			{
			  for(Ordine ordineCorrente :  ordiniConTotaleMinimo)
			  {
				  System.out.println(ordineCorrente.toString());
			  }
			}
		}
	}
	
	public void ordinaOrdiniPerTotaleCrescente()
	{
		if(controllaLista(ordini))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			ordini.sort(Comparator.comparingDouble(Ordine::getTotale));
		}
	}
	
	public void stampaOrdineConTotaleMassimo() {
	    if (controllaLista(ordini)) {
	        System.out.println("La lista è vuota");
	        return;
	    }

	    Ordine ordineMassimo = ordini.get(0);

	    for (Ordine ordine : ordini) {
	        if (ordine.getTotale() > ordineMassimo.getTotale()) {
	            ordineMassimo = ordine;
	        }
	    }

	    System.out.println("Ordine con totale massimo:");
	    System.out.println(ordineMassimo);
	}
	public void stampaTotaleIncassiPerCliente(String cliente)
	{
		if(controllaLista(ordini))
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if (cliente == null || cliente.isEmpty())
		{
			System.out.println("Il cliente inserito non è valido");
			return;
		}
		else
		{
			List<Ordine> listaOrdiniCliente = cercaOrdiniPerCliente(cliente);
			if(listaOrdiniCliente == null || listaOrdiniCliente.isEmpty())
			{
				System.out.println("Non ci sono ordini per il cliente");
			}
			else
			{
				double somma = 0;
				for(Ordine ordine : listaOrdiniCliente)
				{
					somma += ordine.getTotale();
				}
				
				System.out.println("L'incasso totale per il cliente " + cliente + " è: " + somma + " CHF");
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
