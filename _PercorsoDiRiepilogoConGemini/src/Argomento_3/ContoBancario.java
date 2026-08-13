package Argomento_3;

public class ContoBancario {

	private String numeroConto;
	private double saldo;
	
	public ContoBancario(String numeroConto, double saldo)
	{
		this.numeroConto = numeroConto;
		this.saldo = saldo;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposita (double importo)
	{
		if (importo > 0 )
		{
			this.saldo += importo;
			System.out.println("Deposito effettuato");
			
		}
		System.out.println("Saldo: " + saldo);
	}
	
	public void preleva ( double importo)
	{
		if ( (importo > 0) && (saldo > 0) && (importo < saldo))
		{
			this.saldo -= importo;
			System.out.println("Prelievo effettuato");
		
		}
		else
		{
			System.out.println("Saldo insufficente");
		}
		
		System.out.println("Saldo : " + saldo);
	}
	
}
