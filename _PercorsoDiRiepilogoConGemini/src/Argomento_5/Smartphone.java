package Argomento_5;

public class Smartphone implements Ricaricabile, Connettibile {
	private int batteria = 0;
	
	

	@Override
	public void connettiWifi(String rete) {
		System.out.println("Connessione alla rete Wi-Fi: " + rete + " effettuata.");

	}

	@Override
	public void ricarica(int percentuale) {
		if (batteria > 100) {
			batteria = 100;
		}
		else if (batteria < 0) {
			batteria = 0;
		}
		else {
			if (batteria == 100) {
				System.out.println("Batteria completamente carica.");
			}
			else
			{
				 int statoDellaBatteriaDopoRicarica = batteria + percentuale;
				 if(statoDellaBatteriaDopoRicarica > 100) {
					 System.out.println("Batteria completamente carica.");
				 }
				 else {
					 System.out.println("Batteria al " + statoDellaBatteriaDopoRicarica + "% dopo la ricarica.");
					 batteria = statoDellaBatteriaDopoRicarica;
				 }
			}
		}

	}

	@Override
	public void disconnettiWifi() {
		System.out.println("Disconnessione dalla rete Wi-Fi effettuata.");
		
	}
	
	

}
