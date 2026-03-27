package EsercizioVeicoli;

public class Bicicletta extends Mezzo {
	//variabilidi istanza
	private int numroCambio;
	
	//costruttore
	public Bicicletta(String marca, String modello, int numroCambio) {
		super(marca, modello);
		this.numroCambio = numroCambio;
	}

	//metodi getter/setter
	
	
	public int getNumroCambio() {
		return numroCambio;
	}

	public void setNumroCambio(int numroCambio) {
		this.numroCambio = numroCambio;
	}

    //metodi
	@Override
	public void mostraInfo() {
		// TODO Auto-generated method stub
		System.out.println("marca bicicletta " + marca + " " + modello + " numero cambio " + numroCambio );
	}

	@Override
	public int getNumeroruote() {
		// TODO Auto-generated method stub
		return 2;
	}
	

}
