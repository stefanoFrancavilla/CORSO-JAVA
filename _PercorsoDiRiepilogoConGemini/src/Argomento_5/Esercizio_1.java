package Argomento_5;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1 (Facile) — Interfaccia Notificatore
Crea un'interfaccia Notificatore con un singolo metodo: void inviaMessaggio(String destinatario, String testo);.

Crea due classi che implementano l'interfaccia:

EmailNotificatore (stampa "Invio EMAIL a [destinatario]: [testo]").

SmsNotificatore (stampa "Invio SMS al numero [destinatario]: [testo]").

Nel main, crea un'istanza di ciascun notificatore e testa l'invio dei messaggi.
		 */
		
		Notificatore emailNotificatore = new EmailNotificatore();
		Notificatore smsNotificatore = new SmsNotificatore();
		
		emailNotificatore.inviaMessaggio("Mario Rossi", "Ciao Mario, come stai?");
		smsNotificatore.inviaMessaggio("1234567890", "Ciao, questo è un messaggio SMS!");
		
	}

}
