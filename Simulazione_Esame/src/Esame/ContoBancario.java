package Esame;

public class ContoBancario {
	
	//variabili di istanza
	private String intestatario;
	private double saldo = 500;
	
	
	//costruttore
	public ContoBancario(String intestatario, double saldo) {
		this.intestatario = intestatario;
		this.saldo = saldo;
	}

//metodi getter/setter
	public String getIntestatario() {
		return intestatario;
	}


	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	//metodi
	
	public Double deposita(Double deposito)
	{
		if(deposito == 0)
		{
			System.out.println("Non puoi depositare 0 ");
			return saldo;
		}
		else 
		{
			saldo += deposito;
			System.out.println("Deposito avvenuto con successo");
			return saldo;
		}
		
	}
	
	public Double preleva(Double prelevamento)
	{
		if(prelevamento >= saldo)
		{
			System.out.println("La cifra da prelevare supera il saldo");
			return saldo;
		}
		else
		{
			saldo -= prelevamento;
			System.out.println("Il prelievo è avvenuto con successo");
			return saldo;
		}
	}
	
	public void mostraSaldo()
	{
		System.out.println("saldo attuale: " + saldo );
	}

	

}
