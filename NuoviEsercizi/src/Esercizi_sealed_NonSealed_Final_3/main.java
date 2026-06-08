package Esercizi_sealed_NonSealed_Final_3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GestisciNotifiche gestore = new GestisciNotifiche();
		
		Notifica email = new Email("pastrullo@live.it");
		Notifica sms = new SMS ("3564585956");
		Notifica push = new PushNotification("samsung");
		Notifica smsUrgente = new SMSUrgente("3564585956");
		
		gestore.gestisci(push);
		System.out.println("---------------------------------");
		
		gestore.gestisci(sms);
		System.out.println("---------------------------------");

		gestore.gestisci(email);
		System.out.println("---------------------------------");
		
		gestore.gestisci(smsUrgente);
		System.out.println("---------------------------------");

	}

}
