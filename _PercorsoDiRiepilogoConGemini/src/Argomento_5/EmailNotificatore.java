package Argomento_5;

public class EmailNotificatore implements Notificatore {

	
	@Override
	public void inviaMessaggio(String destinatario, String testo) {
		
		System.out.println("Invio EMAIL a " + destinatario + ": " + testo);
	}

}
