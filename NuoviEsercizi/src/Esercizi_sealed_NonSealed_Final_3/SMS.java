package Esercizi_sealed_NonSealed_Final_3;

public non-sealed class SMS implements Notifica {
	private final String numeroDiTelefono;

	public SMS(String numeroDiTelefono) {
		super();
		this.numeroDiTelefono = numeroDiTelefono;
	}
	@Override
	public void invia() 
	{
		System.out.println("Invio SMS al numero " + numeroDiTelefono);
	}

}
