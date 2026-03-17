package incapsulamento_dati_biblioteca;

public final class ArchivioPubblicazioni {
//variabili d'istanza
	public String[] pubblicazioni;
	public int maxPubblicazioni;
	public byte contatorePubblicazioni;
//Costruttore
	
	public ArchivioPubblicazioni() {
		
		this.setMaxPubblicazioni(3);
		this.inizializzaArchivio();
		this.setContatorePubblicazioni((byte) 0);
		
	}

	public int getMaxPubblicazioni() {
		return maxPubblicazioni;
	}

	public void setMaxPubblicazioni(int maxPubblicazioni) {
		this.maxPubblicazioni = maxPubblicazioni;
	}

	public byte getContatorePubblicazioni() {
		return contatorePubblicazioni;
	}

	public void setContatorePubblicazioni(byte contatorePubblicazioni) {
		this.contatorePubblicazioni = contatorePubblicazioni;
	}
	
	
//metodi
	
	private void inizializzaArchivio() {
	pubblicazioni = new String[maxPubblicazioni];
	}
	
	public void aggiungiPubblicazione(Pubblicazione p) {
		if(contatorePubblicazioni < maxPubblicazioni) {
			pubblicazioni[contatorePubblicazioni] = p.getTitolo();
			contatorePubblicazioni++;
		}
		else
		{
			maxPubblicazioni = maxPubblicazioni + 3;
			String[] temp = new String[maxPubblicazioni];
			

			for(int i = 0; i < pubblicazioni.length; i++) {
				
				temp[i] = pubblicazioni[i];
			}
			pubblicazioni = temp;
			
			for(int i = 0; i < maxPubblicazioni; i++) {
				System.out.println("Pubblicazioi: " + pubblicazioni[i]);
			}
			
			System.out.println("Espando l'array delle pubblicazioni");
		}
		
	}
	public void stampaArchivio() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < pubblicazioni.length; i++) {
			sb.append("Pubblicazione: " + pubblicazioni[i] + "\n");
		}
		System.out.println(sb.toString());
	}
}
