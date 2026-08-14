package Argomento_4;

public abstract class MetodoPagamento {

	private String titolare;
	
	public MetodoPagamento(String titolare) {
		this.titolare = titolare;
	}
	
	public String getTitolare() {
		return titolare;
	}
	
    public abstract void eseguiPagamento(double importo);
}
