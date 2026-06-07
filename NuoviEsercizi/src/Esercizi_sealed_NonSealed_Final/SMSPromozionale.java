package Esercizi_sealed_NonSealed_Final;

public class SMSPromozionale extends SMS {
	
	//variabili di istanza
	
	private final String codicePromo;
	
	//costruttore
	
	public SMSPromozionale ( String numero, String testo, String codicePromo)
	{
		super ( numero, testo);
		this.codicePromo = codicePromo;
	}
	
	
	@Override
	public void invia() {
		System.out.println("Invio SMS promozionale");
	}

}
