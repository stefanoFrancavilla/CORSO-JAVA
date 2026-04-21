package esercizioSingleton1;

public class StampanteDiRete  {
// variabili d'istanza
	
	private static int contatoreDocumenti = 0;
	private static int contatoreDocumentiTotali = 0;
	private static boolean inManutenzione = false;
	private static boolean aggiungiCarta = false;
	private static boolean aggiungiInchiostro = false;
	//costruttore
	private StampanteDiRete()
	{
	
		marchio = "X20";
	    azienda = "HP";
	    
	}
	public static StampanteDiRete getInstance() {
		return StampanteBuilder.INSTANCE;
	}
	
	private static class StampanteBuilder
	{
		private static final StampanteDiRete INSTANCE = new StampanteDiRete();
	}
	
	private String marchio;
	private String azienda;
	
	
	//metodi getter e setter
	public String getMarchio() {
		return marchio;
	}

	public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public int getContatoreDocumenti() {
		return contatoreDocumenti;
	}
	public void setContatoreDocumenti(int contatoreDocumenti) {
		this.contatoreDocumenti = contatoreDocumenti;
	}
	
	//metodi
	
	
	private void riceveFileDaStampare()
	{
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha ricevuto un file da stampare.");
	}
	
	private void prendeFoglio()
	{
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " prende un foglio.");
	}
	private void impostaInchiostro()
	{
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " imposta gli inchiostri per stampare.");
	}
	private void stampa()
	{
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta stampando.");
	}
	private void restituisceIlFoglio()
	{
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " restituisce il foglio stampato.");
	}
	public synchronized void controlloStampante() {
	    if (contatoreDocumenti < 3) {
	        inManutenzione = false;
	        StampaDocumento();
	    } else {
	        inManutenzione = true;
	        System.out.println(this.marchio + " dell'azienda " + this.azienda + " è in manutenzione, non può stampare altri documenti.");

	        aggiungiCarta = true;
	        aggiungiInchiostro = true;
	        contatoreDocumenti = 0;

	        System.out.println(this.marchio + " dell'azienda " + this.azienda + " è stato rifornito di carta e inchiostro, ora può stampare altri documenti.");

	        inManutenzione = false;
	        aggiungiCarta = false;
	        aggiungiInchiostro = false;
	        StampaDocumento();
	    }
	}
	
	public synchronized void StampaDocumento()
	{
		this.riceveFileDaStampare();
		this.prendeFoglio();
		this.impostaInchiostro();
		this.stampa();
		this.restituisceIlFoglio();
		StampanteDiRete.contatoreDocumenti++;
		StampanteDiRete.contatoreDocumentiTotali++;
		System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato il documento numero: " + contatoreDocumentiTotali );
	}
	
}
