package esercizio_testControlli;

public class Noleggio2 {
	String mezzo;
	int giorni;
	
	public Noleggio2(String mezzo, int giorni) {
		this.mezzo = mezzo;
		this.giorni = giorni;
	}
	
	final double costoFurgone = 45;
	final double costoScooter = 18;
	final double costoEBike = 15;
	final double costoSkate = 6;
	
	public String getMezzo() {
		return mezzo;
	}
	
	public void setMezzo(String mezzo) {
		this.mezzo = mezzo;
	}
	
	public int getGiorni() {
		return giorni;
	}
	
	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}
	
	public void calcolaCosto() {
		double costoBase = 0;
		double assicurazione = 0;
		double sconto = 0;
		
		switch (mezzo.toUpperCase()) {
			case "FURGONE":
				costoBase = costoFurgone * giorni;
				break;
			case "SCOOTER":
				costoBase = costoScooter * giorni;
				break;
			case "E-BIKE":
				costoBase = costoEBike * giorni;
				break;
			case "SKATE":
				costoBase = costoSkate * giorni;
				break;
			default:
				System.out.println("Errore: mezzo non disponibile");
				return;
		}
		
		if (giorni >= 1 && giorni <= 5) {
			assicurazione = 5;
		} else if (giorni > 5) {
			assicurazione = 10;
		}
		
		double totale = costoBase + assicurazione;
		
		if (giorni >= 3 && giorni <= 6) {
			sconto = totale * 0.07;
		} else if (giorni > 6) {
			sconto = totale * 0.12;
		}
		
		totale -= sconto;
		
		System.out.println("Mezzo scelto: " + mezzo);
		System.out.println("Giorni: " + giorni);
		System.out.println("Prezzo giornaliero: " + (costoBase / giorni) + "€");
		System.out.println("Costo base: " + costoBase + "€");
		System.out.println("Assicurazione: " + assicurazione + "€");
		System.out.println("Totale senza sconto: " + (costoBase + assicurazione) + "€");
		System.out.println("Sconto applicato: " + sconto + "€");
		System.out.println("Totale da pagare: " + totale + "€");
		
	
	}

	}


