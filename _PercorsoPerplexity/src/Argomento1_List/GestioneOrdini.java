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
