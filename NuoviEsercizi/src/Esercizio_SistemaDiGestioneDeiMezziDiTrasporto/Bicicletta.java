package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public final class Bicicletta extends Veicolo implements MezzoTrasporto {

	//variabili
	
	private final String elettrica;
	
	//costruttore
	
	public Bicicletta(String modello, int anno, String elettrica) {
		super(modello, anno);
		this.elettrica = elettrica;
	}

	//metodi
	@Override
	public void utilizza() {
		// TODO Auto-generated method stub

	}


}
