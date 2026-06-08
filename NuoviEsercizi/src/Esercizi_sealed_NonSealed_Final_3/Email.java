package Esercizi_sealed_NonSealed_Final_3;

public final class Email implements Notifica{
	
	//variabili di istanza
	private final String destinatario;

	public Email(String destinatario) {
		super();
		this.destinatario = destinatario;
	}
	
	//metodi
	@Override
	public void invia() {
		System.out.println("Invio email a " + destinatario);
	}

}
