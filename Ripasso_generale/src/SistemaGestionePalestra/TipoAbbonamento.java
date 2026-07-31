package SistemaGestionePalestra;

public enum TipoAbbonamento {

	MENSILE (50, 1),
	TRIMESTRALE (130, 3),
	ANNUALE (450, 12);
	
	private final double prezzoBase;
	private final int durataInMesi;
	
	TipoAbbonamento(double prezzoBase, int durataInMesi)
	{
		this.prezzoBase = prezzoBase;
		this.durataInMesi = durataInMesi;
	}

	public double getPrezzoBase() {
		return prezzoBase;
	}

	public int getDurataInMesi() {
		return durataInMesi;
	}
	
}
