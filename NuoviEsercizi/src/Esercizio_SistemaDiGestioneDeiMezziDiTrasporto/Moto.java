package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public non-sealed class Moto extends Veicolo implements MezzoTrasporto {

	//variabili
	
	private final String cilindata;
	
	// costruttore
	
	
	public Moto(String modello, int anno, String cilindata) {
		super(modello, anno);
		this.cilindata = cilindata;
	}

	
	@Override
	public void utilizza() {
		// TODO Auto-generated method stub

	}


}
