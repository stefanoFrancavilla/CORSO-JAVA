package EsercizioVeicoli;

public class Moto extends Mezzo {
	
	//variabili di istanza

	private int cilindrata;
	private boolean sidecar;
	
	//costruttore
	
	public Moto(String marca, String modello, int cilindrata, boolean sidecar)
	{
		super(marca, modello);
		this.cilindrata = cilindrata;
		this.sidecar = sidecar;
	}
	
	//metodi getter/setter
	
	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public void mostraInfo() {
		
		System.out.println("marca moto " + marca + " " + modello + " cilidrata " + cilindrata + " sidecar " + sidecar);
	}

	@Override
	public int getNumeroruote() {
		
		int numeroRuote = 2;
		if (sidecar == true)
		{
			numeroRuote = 3;
		}
		
		return numeroRuote;
	}
	
	//metodi
	
	
	
	
	
	
	
}
