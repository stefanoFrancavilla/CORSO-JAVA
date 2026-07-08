package esame1;

public class ContoBancario {
	
	//variabili di istanza
	
	private String titolare;
	private double saldo;
	
	//costruttore
	public ContoBancario(String titolare, double saldo)
	{
		this.titolare = titolare;
		this.saldo = saldo;
	}

	//metodi getter setter
	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodi
	public void deposita(double soldiAggiunti)
	{
		if(soldiAggiunti > 0) {
			saldo += soldiAggiunti;
		}
		else
		{
			System.out.println("il numero dei soldi da aggiungere deve essere maggiore di 0");
		}
			
	}
	
	public void preleva(double soldiDaTogliere)
	{
		if(soldiDaTogliere > 0 & saldo <= 0)
		{
			saldo -= soldiDaTogliere;
		}
		else
		{
			System.out.println("Operazione non consentita");
		}
	}
	
	
	
	

}
