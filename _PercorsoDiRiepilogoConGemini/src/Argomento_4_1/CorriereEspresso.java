package Argomento_4_1;

public class CorriereEspresso extends MetodoSpedizione {

	private double budgetDisponibile;
	private double costoPerKg;
	
    public CorriereEspresso(String destinatario, double budgetDisponibile, double costoPerKg) {
		super(destinatario);
		this.budgetDisponibile = budgetDisponibile;
		this.costoPerKg = costoPerKg;
	}

	public double getBudgetDisponibile() {
		return budgetDisponibile;
	}

	public void setBudgetDisponibile(double budgetDisponibile) {
		this.budgetDisponibile = budgetDisponibile;
	}

	public double getCostoPerKg() {
		return costoPerKg;
	}

	public void setCostoPerKg(double costoPerKg) {
		this.costoPerKg = costoPerKg;
	}
	
	@Override
	public boolean inviaPacco(double peso) {
		double costo = peso * costoPerKg;
		if (costo <= budgetDisponibile) {
			budgetDisponibile -= costo;
			return true;
		} else {
			return false;
		}
	}
}
