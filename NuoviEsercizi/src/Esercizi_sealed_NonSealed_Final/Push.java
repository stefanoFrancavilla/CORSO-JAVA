package Esercizi_sealed_NonSealed_Final;

public final class  Push implements Notifica {

	//variabili di istanza
	public final String deviceId;
	public final String testo;
	
	//costruttore
	
	public Push(String deviceId , String testo)
	{
		this.deviceId = deviceId;
		this.testo = testo;
	}
	
	
	
	
	@Override
	public void invia() {
		// TODO Auto-generated method stub
		System.out.println("Invio Push");
	}

}
