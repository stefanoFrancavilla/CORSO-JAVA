package gestoreVeicoli;

public class Auto extends Veicolo {

	//variabili
	
	private int numeroPorte;
	
	//Costruttore
	
	public Auto(String marca, String modello, int numeroPorte) {
		super(marca, modello);
		this.numeroPorte = numeroPorte;
	}
	
	//metodi
	
	public void apriBagagliaio() {
		 System.out.println("Bagagliaio dell'auto aperto");
	}
}
