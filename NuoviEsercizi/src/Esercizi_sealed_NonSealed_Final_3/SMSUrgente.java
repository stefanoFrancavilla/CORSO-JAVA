package Esercizi_sealed_NonSealed_Final_3;

public class SMSUrgente extends SMS {
	
	
	public SMSUrgente(String numeroDiTelefono) {
		super(numeroDiTelefono);
	}

	@Override
	
	public void invia() 
	{
		super.invia();
		System.out.println("Messaggio inviato con priorità alta");
	}

}
