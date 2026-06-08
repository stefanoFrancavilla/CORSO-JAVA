package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public abstract class Veicolo  {

	//variabili di istanza
	private final String modello;
	private final int anno;
	
	//cotruttore
	public Veicolo(String modello, int anno) {
		super();
		this.modello = modello;
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + ", anno=" + anno + "]";
	}
	
	

	
}
