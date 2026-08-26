package Argomento_4_3;

public class Cane extends Animale {

	private double costoBase;
	private boolean necessitaAddestramento;
	
	
	public Cane(String nome, int eta, double costoBase, boolean necessitaAddestramento) {
		super(nome, eta);
		this.costoBase = costoBase;
		this.necessitaAddestramento = necessitaAddestramento;
	}


	public double getCostoBase() {
		return costoBase;
	}


	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}


	public boolean isNecessitaAddestramento() {
		return necessitaAddestramento;
	}


	public void setNecessitaAddestramento(boolean necessitaAddestramento) {
		this.necessitaAddestramento = necessitaAddestramento;
	}


	@Override
	public double calcoloCostoGiornaliero() {
		
		if (necessitaAddestramento)
		{
			costoBase += 5;
		}
		return costoBase;
	}
	
	
	

	
}
