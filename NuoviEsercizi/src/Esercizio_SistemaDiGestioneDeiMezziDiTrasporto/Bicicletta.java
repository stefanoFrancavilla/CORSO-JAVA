package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public final class Bicicletta extends Veicolo implements MezzoTrasporto {

	//variabili
	
	private final String elettrica;
	private static Integer contatoreBici = 0;
	//costruttore
	
	public Bicicletta(String modello, int anno, String elettrica) {
		super(modello, anno);
		this.elettrica = elettrica;
		contatoreBici++;
	}

	//metodi getter setter
	
	public static Integer getContatoreBici()
	{
		return contatoreBici;
	}
	
	
	//metodi
	@Override
	public void utilizza() {
		System.out.println("Biciletta " + this.getModello() + " utilizzata");

	}

	@Override
	public double costoUtilizzo() {
		// TODO Auto-generated method stub
		return 0;
	}


}
