package Argomento_4;

public class ContoPaypal extends MetodoPagamento {
	private double saldoDisponibile;
	
	public ContoPaypal(String titolare, double saldoDisponibile) {
		super(titolare);
		this.saldoDisponibile = saldoDisponibile;
	}
	
	
	public double getSaldoDisponibile() {
		return saldoDisponibile;
	}


	@Override
	public void eseguiPagamento(double importo) {
		// TODO Auto-generated method stub

		if(importo <= saldoDisponibile)
		{
			saldoDisponibile -= importo;
			System.out.println("Operazione riuscita");
		}
		else
		{
			System.out.println("Operazione fallita");
		}
	}

}
