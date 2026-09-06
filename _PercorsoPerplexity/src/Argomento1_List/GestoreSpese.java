package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestoreSpese {

	List<Double> spese = new ArrayList<>();
	
	public void aggiungiSpesa(double importo)
	{
		if (spese.contains(importo))
		{
			System.out.println("Importo presente nella lista");
			return;
		}
		spese.add(importo);
		System.out.println("Spesa aggiunta correttamente");
	}
	
	public void rimuoviSpesa(double importo)
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			if (spese.contains(importo))
			{
				
			
			double importoDaRimuovere = 0;
			for (int i = 0; i < spese.size();i++)
			{
				if (spese.get(i) == importo)
				{
					importoDaRimuovere = spese.get(i);
					break;
				}
			}
			spese.remove(importoDaRimuovere);
			System.out.println("Spesa rimossa");
			}
			else 
			{
				System.out.println("L'importo non è presente nella lista");
			}
		}
	}
	
	public boolean cercaSpesa(double importo)
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return false;
		}
		else 
		{
			for(double spesa : spese)
			{
				if(spesa == importo)
				{
					return true;
				}
			}
			return false;
		}
	}
	
	public double calcolaTotale()
	{
		double totaleSomma = 0;
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return -1;
		}
		else
		{
			for(double spesa : spese)
			{
				totaleSomma += spesa;
			}
		}
		return totaleSomma;
	}
	
	public double calcolaMedia()
	{
		if(calcolaTotale() > 0)
		{
			double media = calcolaTotale() / spese.size();
			return media;
		}
		System.out.println("La lista è vuota");
		return -1;
	}
	
	public double trovaSpesaPiuAlta ()
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return -1;
		}
		else
		{
			double spesaMax = 0;
			for(double spesa : spese)
			{
				if (spesa > spesaMax)
				{
					spesaMax = spesa;
				}
			}
			return spesaMax;
		}
	}
	
	public double trovaSpesaPiuBassa()
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return -1;
		}
		else
		{
			double spesaMin = spese.get(0);
			for(int i = 1; i < spese.size(); i++)
			{
			
				if (spesaMin > spese.get(i))
				{
					spesaMin = spese.get(i);
				}
			}
			return spesaMin;
		}
		
	}
	
	public void stampaSpese()
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return ;
		}
		else
		{
		  for(int i = 0; i < spese.size();i++)
		  {
			  System.out.println("Il valore all'indice " + i + " è: " + spese.get(i));
		  }
		  System.out.println("--------------------");
		  System.out.println("--------------------");
		}
	}
	
	public void stampaSpeseSopraSoglia( double importo)
	{
		if(spese.isEmpty() || spese == null)
		{
			System.out.println("La lista è vuota");
			return ;
		}
		else
		{
			List<Double> listaSopraSoglia = new ArrayList<>();
			for (double spesa : spese)
			{
				if (spesa > importo)
				{
					listaSopraSoglia.add(spesa);
				}
			}
			if(listaSopraSoglia.isEmpty())
			{
				System.out.println("Non ci sono valori sopra la soglia");
				return;
			}
			else
			{
				System.out.println(listaSopraSoglia.stream().toList());
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
