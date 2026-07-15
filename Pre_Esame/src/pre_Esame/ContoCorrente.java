package pre_Esame;

public class ContoCorrente {

	private double saldo;

	public ContoCorrente(double saldo) {
		
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposita(double n)
	{
		if (n < 0)
		{
			return saldo;
		}
		else
		{
			return saldo += n;
		}
	}
	
	public double preleva(double n)
	{
		
		if (saldo < n )
		{
			System.out.println("Il saldo è inferiore alla somma da prelevare");
			return saldo;
		}
		else
		{
			if(n < 0)
			{
				System.out.println("la somma non può essere negativa");
				return saldo;
			}
			else
			{
				return saldo -= n;
			}
		}
			
		
	}
}
