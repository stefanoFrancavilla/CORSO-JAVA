package Esercizi_sealed_NonSealed_Final;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Crea un’interfaccia Notificabile con un metodo invia().

Crea una sealed interface Notifica che permetta solo:

Email

SMS

Push

Fai in modo che:

Email sia final.

SMS sia non-sealed.

Push sia final.

Fai implementare a tutte le classi Notificabile.

Crea una classe SMSPromozionale che estende SMS.

Crea una classe GestoreNotifiche che riceve una Notifica e chiama invia().

Nel main, crea oggetti di tutti i tipi e testali.

Vincoli da rispettare
Notifica deve essere sealed.

Le classi permesse devono essere dichiarate con permits.

SMSPromozionale deve essere possibile solo perché SMS è non-sealed.

Prova anche a creare una classe non permessa da Notifica e osserva che il compilatore la blocca.


Notificabile è il contratto.

Notifica è una gerarchia chiusa.

SMS riapre la gerarchia grazie a non-sealed.

Email e Push chiudono il ramo con final.

La distinzione tra extends e implements diventa concreta nella pratica.

Variante più difficile
Aggiungi una nuova interfaccia Prioritaria con metodo getPriorita() e falla implementare solo da Email e Push. Poi modifica GestoreNotifiche per stampare prima le notifiche ad alta priorità.

Se vuoi, posso trasformare questo esercizio in:

versione facile con soluzione completa,

versione da svolgere da solo con tracce passo-passo,

oppure in un quiz di verifica.

 */
		Notifica email = new Email("ste@live.it", "ciao buongiorno");
		
		Notifica sms = new SMS("+41792565123", " ci vediamo domani");
		
		Notifica smsPromo = new SMSPromozionale("41792565123", "Offerta", "PROMO50" );
		
		Notifica push = new Push("device-123", "Notifica push importante");
		
		GestoreNotifiche gestore = new GestoreNotifiche();
		
		gestore.gestisci(email);
		
		gestore.gestisci(push);
		
		gestore.gestisci(sms);
		
		gestore.gestisci(smsPromo);
		
		System.out.println(email.toString());
		
	
		
	}

}
