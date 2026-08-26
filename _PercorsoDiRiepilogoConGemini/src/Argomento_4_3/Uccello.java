package Argomento_4_3;

public class Uccello extends Animale{
	
	private double costoBase;
	private boolean gabbiaGrande;
	
	public Uccello(String nome, int eta, double costoBase, boolean gabbiaGrande) {
		super(nome, eta);
		this.costoBase = costoBase;
		this.gabbiaGrande = gabbiaGrande;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}

	public boolean isGabbiaGrande() {
		return gabbiaGrande;
	}

	public void setGabbiaGrande(boolean gabbiaGrande) {
		this.gabbiaGrande = gabbiaGrande;
	}

	@Override
	public double calcoloCostoGiornaliero() {
		if (gabbiaGrande)
		{
			costoBase += 2.5;
		}
		return costoBase;
	}
	
	

}
