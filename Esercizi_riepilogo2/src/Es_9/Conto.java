package Es_9;

public class Conto {

	//variabili
	private double saldo;
	
	public Conto()
	{
		
	}
	public Conto(double saldo)
	{
		setSaldo(saldo);
	}

	
	//metodi getter / setter
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		
		
		if (saldo == 0)
		{
			System.out.println("Saldo insufficente prego effettuare versamento");
		}
		else if(saldo < 0)
		{
		    System.out.println("Non è possibile avere un conto con saldo inferiore a 0");
		    return;
		}
		
		this.saldo = saldo;
	}
	
	//metodi
	
	public double versa(double versamento)
	{
		if (versamento > 0)
		{
			this.saldo = this.saldo + versamento;
		}
		else if(versamento <= 0)
		{
			System.out.println("Versamento non consentito");
		}
		return this.saldo;
		
	}
	
	public double preleva(double prelevamento)
	{
		if (prelevamento <= 0)
		{
			System.out.println("Importo non valido");
			return saldo;
		}
		if((this.saldo - prelevamento) < 0)
		{
			System.out.println("Operazione non consentita saldo insufficente");
		}
		else
		{
			this.saldo -= prelevamento;
		}
		return this.saldo;
	}
	
	public void controlloSaldo()
	{
		System.out.println("Saldo attuale: " + saldo);
	}
	
	
	//voto 9/10
}
