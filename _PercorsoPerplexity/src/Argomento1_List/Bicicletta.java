package Argomento1_List;

public class Bicicletta {

	private int codiceBicicletta;
	private String proprietario;
	private String tipoIntervento;
	private int giorniPrevisti;
	private double costoStimato;
	
	
	public Bicicletta(int codiceBicicletta, String proprietario, String tipoIntervento, int giorniPrevisti,
			double costoStimato) {
		
		setCodiceBicicletta(codiceBicicletta);
		setProprietario(proprietario);
		setTipoIntervento(tipoIntervento);
		setGiorniPrevisti(giorniPrevisti);
		setCostoStimato(costoStimato);
	}



	//metodi getter setter

	//codice bicicletta
	public int getCodiceBicicletta() {
		return codiceBicicletta;
	}



	public void setCodiceBicicletta(int codiceBicicletta) {
		
		if(codiceBicicletta <= 0)
		{
		
			System.out.println("Il codice della bicicletta non è valido");
			this.codiceBicicletta = 0;
		}
		else
		{
			this.codiceBicicletta = codiceBicicletta;
		}
	}

	//Proprietario

	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		if(proprietario == null || proprietario.isBlank())
		{
			System.out.println("Il proprietario non è valido");
			this.proprietario = "Sconosciuto";
		}
		else
		{
			this.proprietario = proprietario;
		}
		
	}


	//tipo di intervento
	public String getTipoIntervento() {
		return tipoIntervento;
	}


	public void setTipoIntervento(String tipoIntervento) {
		if(tipoIntervento == null || tipoIntervento.isBlank())
		{
			System.out.println("Il tipo di intervento inserito non è valido");
			this.tipoIntervento = "Sconosciuto";
		}
		else
		{
			this.tipoIntervento = tipoIntervento;
		}
		
		
	}

	//giorni previsti

	public int getGiorniPrevisti() {
		return giorniPrevisti;
	}


	public void setGiorniPrevisti(int giorniPrevisti) {
		if(giorniPrevisti <= 0)
		{
			System.out.println("Numero di giorni previsti non valido");
			this.giorniPrevisti = 0;
		}
		else
		{
			this.giorniPrevisti = giorniPrevisti;
		}
		
	
	}


	//costo stimato
	public double getCostoStimato() {
		return costoStimato;
	}


	public void setCostoStimato(double costoStimato) {
		if(costoStimato < 0)
		{
			System.out.println("Il costo stimato non può essere inferiore a 0");
			this.costoStimato = 0.0;
		}
		else
		{
			this.costoStimato = costoStimato;
		}
		
	}

    // metodo toString

	@Override
	public String toString() {
		return "Bicicletta [codiceBicicletta=" + codiceBicicletta + ", proprietario=" + proprietario
				+ ", tipoIntervento=" + tipoIntervento + ", giorniPrevisti=" + giorniPrevisti + ", costoStimato="
				+ costoStimato + "]";
	}
	
}
