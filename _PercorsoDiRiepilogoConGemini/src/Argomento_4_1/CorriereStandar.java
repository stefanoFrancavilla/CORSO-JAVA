package Argomento_4_1;

public class CorriereStandar extends MetodoSpedizione {

	private double pesoMassimo;
	private double pesoSpedito;
	
	
	public CorriereStandar(String destinatario, double pesoMassimo) {
		super(destinatario);
		this.pesoMassimo = pesoMassimo;
		this.pesoSpedito = 0;
	}


	public double getPesoSpedito() {
		return pesoSpedito;
	}


	public void setPesoSpedito(double pesoSpedito) {
		this.pesoSpedito = pesoSpedito;
	}


	public double getPesoMassimo() {
		return pesoMassimo;
	}
	
	@Override
	public boolean inviaPacco(double peso) {
		if (pesoSpedito + peso <= pesoMassimo) {
			pesoSpedito += peso;
			return true;
		} else {
			return false;
		}
	}
	

	
	
}
