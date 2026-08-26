package Argomento_5;

public class SmsNotificatore implements Notificatore {

	@Override
	public void inviaMessaggio(String destinatario, String testo) {
		
		System.out.println("Invio SMS al numero " + destinatario + ": " + testo);
	}

}
