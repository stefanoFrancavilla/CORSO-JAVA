package esame1;

public class Ordine {

	private StatoOrdine stato;
	
	
	public Ordine(StatoOrdine stato)
	{
		this.stato = stato;
	}
	
	
	public StatoOrdine getStato() {
		return stato;
	}


	public void setStato(StatoOrdine stato) {
		this.stato = stato;
	}

	public void avanzaStato()
	{
		if (stato.equals(stato.IN_ATTESA))
		{
		  stato = stato.SPEDITO;
		}
		else if(stato.equals(stato.SPEDITO))
		{
			  stato = stato.DELIVERED;
		}
		
	}
}
