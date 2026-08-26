package Argomento_4_2;

public class Moto extends Veicolo {

	private double budgetDisponibile;
	private double costoGiornaliero;
	
	public Moto(String cliente, double budgetDisponibile, double costoGiornaliero) {
		super(cliente);
		this.budgetDisponibile = budgetDisponibile;
		this.costoGiornaliero = costoGiornaliero;
	}

	public double getBudgetDisponibile() {
		return budgetDisponibile;
	}

	public void setBudgetDisponibile(double budgetDisponibile) {
		this.budgetDisponibile = budgetDisponibile;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	public void setCostoGiornaliero(double costoGiornaliero) {
		this.costoGiornaliero = costoGiornaliero;
	}

	@Override
	public boolean noleggia(int giorni) {
		double costo = giorni * costoGiornaliero;
		if(costo <= budgetDisponibile)
		{
			budgetDisponibile -= costo;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
}
