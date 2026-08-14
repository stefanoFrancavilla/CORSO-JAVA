package Argomento_4;

public class CartaDiCredito extends MetodoPagamento {

	private double limiteMassimo;
	private double saldoSpeso;
	
	public CartaDiCredito(String titolare, double limiteMassimo) {
		super(titolare);
		this.limiteMassimo = limiteMassimo;
		this.saldoSpeso = 0;
	}
	
	
	
	
	
	
	public double getLimiteMassimo() {
		return limiteMassimo;
	}






	public void setLimiteMassimo(double limiteMassimo) {
		this.limiteMassimo = limiteMassimo;
	}






	public double getSaldoSpeso() {
		return saldoSpeso;
	}






	public void setSaldoSpeso(double saldoSpeso) {
		this.saldoSpeso = saldoSpeso;
	}






	@Override
	public void eseguiPagamento(double importo) {
		// TODO Auto-generated method stub

	}

}
