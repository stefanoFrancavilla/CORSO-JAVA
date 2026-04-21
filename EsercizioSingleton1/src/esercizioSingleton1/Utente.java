package esercizioSingleton1;

public class Utente extends Thread {

	//Variabili d'istanza
	
	private String nomeDocumento;
	
	//costruttore
	public Utente(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}
	
	//metodi getter e setter
	public String getNomeDocumento() {
		return nomeDocumento;
	}
	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}
	
	//metodi
	@Override
	public void run() {
		StampanteDiRete.getInstance().controlloStampante();
	}
	
	
	
	
}
