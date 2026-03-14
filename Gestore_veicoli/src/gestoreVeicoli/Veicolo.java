package gestoreVeicoli;

public abstract class Veicolo {
	
	//variabili di istanza
	
	private String marca;
	private String modello;
	
	//costruttori
	
	public Veicolo(String marca, String modello) {
		
		this.marca = marca;
		this.modello = modello;
		
	}
	
	//metodi setter/getter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	
	//metodi

	public void avvia() {
		 System.out.println("Veicolo " + marca + " " + modello + " avviato");
	}

	public void ferma() {
		   System.out.println("Veicolo " + marca + " " + modello + " fermato");
	}
	
}
