package SistemaGestionePalestra;

public enum TipoAbbonamento {

	MENSILE (50),
	TRIMESTRALE (130),
	ANNUALE (450);
	
	private final double prezzoBase;
	
	TipoAbbonamento(double prezzoBase)
	{
		this.prezzoBase = prezzoBase;
	}

	public double getPrezzoBase() {
		return prezzoBase;
	}
	
}
