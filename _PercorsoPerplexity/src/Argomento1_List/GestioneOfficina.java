package Argomento1_List;

import java.util.ArrayList;
import java.util.Comparator;
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
	
	public Bicicletta cercaBiciclettePerCodice(int codiceBicicletta)
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
	
	public List<Bicicletta> cercaBiciclettePerIntervento (String tipoIntervento)
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
	
	
	public int cercaIndicePrimaBiciclettaPerIntervento(String tipoIntervento)
	{
		if(biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return -1;
		}
		else if(tipoIntervento == null || tipoIntervento.isBlank())
		{
			System.out.println("Il tipo di intervento inserito non è valido");
			return -1;
		}
		else
		{
			int trovato = -1;
			for(int i = 0;i < biciclette.size();i++)
			{
				if(biciclette.get(i).getTipoIntervento().equalsIgnoreCase(tipoIntervento))
				{
					trovato = i;
					break;
				}
			}
			if(trovato == -1)
			{
				System.out.println("Non è stata trovata alcuna corrispondenza");
			}
			return trovato;
		}
	}
	
	public int cercaIndiceUltimaBiciclettaPerIntervento(String tipoIntervento)
	{
		if(biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return -1;
		}
		else if(tipoIntervento == null || tipoIntervento.isBlank())
		{
			System.out.println("Il tipo di intervento inserito non è valido");
			return -1;
		}
		else
		{
			int trovato = -1;
			for(int i = biciclette.size()-1; i >= 0; i--)
			{
				if(biciclette.get(i).getTipoIntervento().equalsIgnoreCase(tipoIntervento))
				{
					trovato = i;
					break;
				}
			}
			if(trovato == -1)
			{
				System.out.println("Non è stata trovata alcuna corrispondenza");
			}
			return trovato;
		}
	}
	
	public void rimuoviBiciclettaPerCodice(int codiceBicicletta)
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if(codiceBicicletta <= 0)
		{
			System.out.println("Il codice bicicletta inserito non è valido");
			return;
		}
		else
		{
			Bicicletta biciclettaDaRimuovere = cercaBiciclettePerCodice(codiceBicicletta);
			if(biciclettaDaRimuovere != null)
			{
				biciclette.remove(biciclettaDaRimuovere);
				System.out.println("La bicicletta è stata rimossa con successo");
			}
			else
			{
				System.out.println("Non è stata trovata nessuna corrispondenza");
			}
		}
	}
	
	public void rimuoviBiciclettaPerIndice(int indice)
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if(indice >= 0 && indice < biciclette.size())
		{
			Bicicletta biciclettaRimossa = biciclette.remove(indice);
			System.out.println("La bicicletta " + biciclettaRimossa + "  è stata rimossa con successo");
			return;
		}
		else
		{
			System.out.println("L'indice inserito non è valido");
		}
	}
	
	public void aggiornaCostoStimato(int codiceBicicletta, double nuovoCosto)
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if(codiceBicicletta <= 0)
		{
			System.out.println("Il codice bicicletta inserito non è valido");
			return;
		}
		else if(nuovoCosto < 0)
		{
			System.out.println("Nuovo costo inserito non valido");
			return;
		}
		else
		{
			Bicicletta biciclettaDaAggiornare = cercaBiciclettePerCodice(codiceBicicletta);
			if (biciclettaDaAggiornare == null)
			{
				System.out.println("Non è stata trovata nessuna bicicletta con questo codice");
				return;
			}
			else
			{
				biciclettaDaAggiornare.setCostoStimato(nuovoCosto);
				System.out.println("Il costo è stato aggiornato a: "
				        + biciclettaDaAggiornare.getCostoStimato() + " CHF");
			}
		}
	}
	
	public void stampaTutteBiciclette()
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			for(Bicicletta bici : biciclette)
			{
				System.out.println(bici.toString());
			}
		}
	}
	
	public void stampaBicicletteConGiorniMinimi(int giorniMinimi)
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else if (giorniMinimi <= 0)
		{
			System.out.println("I giorni minimi inseriti non sono validi");
			return;
		}
		else
		{
			List<Bicicletta> bicicletteConGiorniMinimi = new ArrayList<>();
			
			for(Bicicletta bici : biciclette)
			{
				if(bici.getGiorniPrevisti() >= giorniMinimi)
				{
					bicicletteConGiorniMinimi.add(bici);
				}
			}
			
			if(bicicletteConGiorniMinimi.isEmpty())
			{
				System.out.println("Non sono stati trovate biciclette con giorni minimi");
			}
			else
			{
				for(Bicicletta biciTrovate : bicicletteConGiorniMinimi)
				{
					System.out.println(biciTrovate.toString());
				}
			}
		}
	}
	public void ordinaBiciclettePerCostoCrescente()
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			biciclette.sort(Comparator.comparingDouble(Bicicletta::getCostoStimato));
		}
	}
	
	public void stampaBiciclettaConInterventoPiuLungo()
	{

		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			Bicicletta biciclettaConInterventoPiuLungo = biciclette.get(0);
			for(Bicicletta bici : biciclette)
			{
				if (bici.getGiorniPrevisti()
				        > biciclettaConInterventoPiuLungo.getGiorniPrevisti()) {
				    biciclettaConInterventoPiuLungo = bici;
				}
			}
			System.out.println("Bicicletta con intervento più lungo:");
			System.out.println(biciclettaConInterventoPiuLungo.toString());
		}
	}
	
	public void stampaCostoTotaleStimato()
	{
		if (biciclette.isEmpty())
		{
			System.out.println("La lista è vuota");
			return;
		}
		else
		{
			double somma = 0;
			for(Bicicletta bici : biciclette)
			{
				somma += bici.getCostoStimato();
			}
			System.out.println("Costo totale stimato: " + somma + " CHF");
		}
	}
}
