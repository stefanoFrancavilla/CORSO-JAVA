package Esercizi_sealed_NonSealed_Final;

public non-sealed class SMS implements Notifica {
	//variabili di istanza
	private final String numero;
	private final String testo;

	//costruttori
	
	public SMS( String numero, String testo)
	{
		this.numero = numero;
		this.testo = testo;
	}
	
	
	
	
	@Override
	public void invia() {
		// TODO Auto-generated method stub
		System.out.println("Invio SMS");
	}

}
