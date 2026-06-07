package Esercizi_sealed_NonSealed_Final;

public final class Email implements Notifica{
//variabili di istanza
	private final String indirizzo;
	private final String testo;
	
	//costruttore
	public Email(String indirizzo, String testo)
	{
		this.indirizzo = indirizzo;
		this.testo = testo;
	}
	
	//metodi
	@Override
	public void invia() {
		// TODO Auto-generated method stub
		System.out.println("Invio Email");
	}

	@Override
	public String toString() {
		return "Email [indirizzo = " + this.indirizzo + ", testo = " + this.testo + "]";
	}

}
