package Es_15;

public class Conto {

	
	//variabili di istanza
	
	private String intestatario;
	private double saldo;
	
	//costruttori
	
	public Conto()
	{
		
	}
	
	
	
	public Conto(String intestatario, double saldo)
	{
		setIntestatario(intestatario);
		setSaldo(saldo);
	}
	//metodi getter / setter
	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		
		if (intestatario.isBlank())
		{
			System.out.println("Il nome dell'intestatario non può essere vuoto");
		}
		this.intestatario = intestatario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo <= 0)
		{
			System.out.println("il saldo deve essere in positivo");
			return;
		}
		else
		{
			this.saldo = saldo;
		}
		
	}
	
	//metodi
	
	public void stampainfo()
	{
		System.out.println("Nome intestatario: " + this.intestatario);
		System.out.println("Saldo: " + this.saldo);
	}
	
	public double deposita (double importo)
	{
		if (importo <= 0)
		{
			System.out.println("Importo da depositare non può essere uguale o inferiore a 0");
		}
		else
		{
		this.saldo += importo;	
		System.out.println("Accredito di: " + importo + " \n " +  " intstatario: " + this.intestatario);
		System.out.println("---------------------");
		}
		return this.saldo;
	}
	
	public double preleva ( double importo)
	{
		if (saldo < importo)
		{
			System.out.println("Importo da prelevare superiore al saldo");
		}
		else if (importo <= 0)
		{
			System.out.println("Importo da prelevare non può essere uguale o inferiore a 0");
		}
		else 
		{
			this.saldo -= importo;
			System.out.println("Deposito di: " + importo + " \n " +  " intstatario: " + this.intestatario);
			System.out.println("---------------------");
		}
		
		return this.saldo;
	}
	
	
	
}
