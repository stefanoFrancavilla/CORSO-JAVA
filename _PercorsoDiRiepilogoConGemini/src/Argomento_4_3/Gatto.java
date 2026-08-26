package Argomento_4_3;

public class Gatto extends Animale {
	
	private double costoBase;
    private boolean necessitaMedicine;
    
	public Gatto(String nome, int eta, double costoBase, boolean necessitaMedicine) {
		super(nome, eta);
		this.costoBase = costoBase;
		this.necessitaMedicine = necessitaMedicine;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}

	public boolean isNecessitaMedicine() {
		return necessitaMedicine;
	}

	public void setNecessitaMedicine(boolean necessitaMedicine) {
		this.necessitaMedicine = necessitaMedicine;
	}

	@Override
	public double calcoloCostoGiornaliero() {
		
		
		if(necessitaMedicine)
		{
			costoBase += 3.0;
		}
		return costoBase;
	}
    
    

}
