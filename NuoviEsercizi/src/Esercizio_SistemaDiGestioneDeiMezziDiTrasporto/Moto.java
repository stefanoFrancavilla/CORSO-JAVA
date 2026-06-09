package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public non-sealed class Moto extends Veicolo implements MezzoTrasporto {

	//variabili
	
	private final String cilindrata;
	private static Integer contatoreMoto = 0;
	// costruttore
	
	
	public Moto(String modello, int anno, String cilindata) {
		super(modello, anno);
		this.cilindrata = cilindrata;
		
		contatoreMoto++;
	}
	
	

	public String getCilindrata() {
		return cilindrata;
	}



	public static Integer getContatoreMoto()
	{
		return contatoreMoto;
	}

	
	@Override
	public void utilizza() {
		System.out.println("Moto " + this.getModello() + " utilizzata");

	}


	@Override
	public double costoUtilizzo() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public  String toString() {
		return "Modello: " + this.getModello() + " anno: " + this.getAnno() + " porte: " + this.cilindrata;
	}

}
