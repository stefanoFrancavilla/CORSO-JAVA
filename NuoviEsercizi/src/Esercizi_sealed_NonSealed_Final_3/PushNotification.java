package Esercizi_sealed_NonSealed_Final_3;

public final class PushNotification implements Notifica {

	private final String dispositivo;
	
	
	
	public PushNotification(String dispositivo) {
		super();
		this.dispositivo = dispositivo;
	}



	@Override
	public void invia() {
		// TODO Auto-generated method stub

		System.out.println("Invio notifica push al dispositivo " + dispositivo + " android");
	}

}
