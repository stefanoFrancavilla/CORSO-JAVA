package Esercizio_Sistema_di_gestione_di_uno_zoo;

import java.util.ArrayList;
import java.util.List;

public class GestoreZoo {
	//variabili di istanza
	
	private List<Animale> animali = new ArrayList<Animale>();

	// costruttore
public GestoreZoo(List<Animale> animali) {
	super();
	this.animali = animali;
}
	
public void aggiungi(Animale animale)
{
	animali.add(animale);
}
	
	public void faiAgireTutti()
	{
	for(Animale agisciTutti : animali)
	{
		agisciTutti.agisci();
	}
	
	}
	
	public void stampaAnimali()
	{
		for(Animale stampaTutti : animali )
		{
			System.out.println(stampaTutti);
		}
	}
	
	public double costoTotale ()
	{
		double totale = 0;
		
		for(Animale costoAnimali : animali)
		{
			totale += costoAnimali.costo();
		}
		
		return totale;
		
	}
	
	public void nutriTutti()
	{
		for(Animale nutriAnimali : animali)
		{
			((Animale) nutriAnimali).mangia();
		}
	}
	
}
