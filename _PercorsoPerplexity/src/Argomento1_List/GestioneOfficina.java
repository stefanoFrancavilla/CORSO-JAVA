package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestioneOfficina {

	private List<Bicicletta> biciclette = new ArrayList<>();
	
	//aggiungi bicicletta
	public void aggiungiBicicletta(Bicicletta bicicletta)
	{
		if(bicicletta == null)
		{
			System.out.println("La bicicletta non può essere null");
			return;
		}
		else
		{
			for(Bicicletta bici : biciclette)
			{
				if(bici.getCodiceBicicletta() == bicicletta.getCodiceBicicletta())
				{
					System.out.println("La bicicletta è già presente nella lista");
					return;
				}
			}
			
			biciclette.add(bicicletta);
			System.out.println("Bicicletta aggiunta correttamente");
		}
	}
	
	public Bicicletta cercaBiciclettaPerCodice(int codiceBicicletta)
	{
		if(biciclette == null || biciclette.isEmpty())
		{
			System.out.println("La lista è vuota o null");
			return null;
		}
		else
		{
			if (codiceBicicletta <= 0)
			{
				System.out.println("Il codice inserito non è valido");
				return null;
			}
			else
			{
				for(Bicicletta bici : biciclette)
				{
					if(bici.getCodiceBicicletta() == codiceBicicletta)
					{
						return bici;
					}
				}
				
				System.out.println("La bici che si vuole cercare non è presente nella lista");
				return null;
			}
		}
	}
	
	public List<Bicicletta> cercaBiciclettaPerIntervento (String tipoIntervento)
	{
		List<Bicicletta> listaPerIntervento = new ArrayList<>();
		if(tipoIntervento == null || tipoIntervento.isBlank())
		{
			System.out.println("Il tipo di intevento inserito non è valido");
			return listaPerIntervento;
		}
		else
		{
			for(Bicicletta bici : biciclette)
			{
				if(bici.getTipoIntervento().equalsIgnoreCase(tipoIntervento))
				{
					listaPerIntervento.add(bici);
				}
			}
			
			if(listaPerIntervento.isEmpty())
			{
				System.out.println("Non sono state trovate bici per tipo di intervento");
				return listaPerIntervento;
			}
			else
			{
				return listaPerIntervento;
			}
			
		}
	}
	
	
	
	
	
}
