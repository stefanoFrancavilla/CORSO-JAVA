package Es_11;

public class ContoCorrente {

	//variabili
	private String intestatario;
	private int numeroConto;
	private double saldo;
	
	//costruttore
	public ContoCorrente()
	{
		
	}
	
	public ContoCorrente(String intestatario, int numeroConto, double saldo)
	{
		setIntestatario(intestatario);
		setNumeroConto(numeroConto);
		setSaldo(saldo);
	}

	
	//metodi getter / setter
	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		
		boolean isCorrect = true;

		for(int i = 0; i < intestatario.length(); i++)
		{
		    char c = intestatario.charAt(i);

		    if (!Character.isLetter(c) && c != ' ')
		    {
		        isCorrect = false;
		        System.out.println("Il nome non può contenere simboli o numeri");
		        break;
		    }
		}

		if (isCorrect)
		{
		    this.intestatario = intestatario;
		}
		
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(int numeroConto) {
		
	   String lunghezzaNumeroConto = Integer.toString(numeroConto);
	   
	   if (lunghezzaNumeroConto.length() == 4)
	   {
		   this.numeroConto = numeroConto;
	   }
	   else
	   {
		   System.out.println("Il numero del conto deve contenere un numero pari a 4 cifre");
	   }
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		
		if(saldo < 0)
		{
			System.out.println("Il saldo non può essere negativo");
		}
		else
		{
			this.saldo = saldo;
		}
		
		
	}
	
	//metodi
	
	public void versa(double versamento)
	{
		if (versamento < 0)
		{
			System.out.println("Versamento non valido");
		}
		else
		{
			saldo += versamento;
			System.out.println("Sono stati aggiunti al conto numero: " + this.numeroConto + " \n intestato a: " + this.intestatario + " \n la cifra di: " + versamento);
			System.out.println("Saldo aggiornato: " + saldo);
			System.out.println();
		}
	}
	
	public void preleva(double prelevamento)
	{
		if (prelevamento <= 0)
		{
			System.out.println("Il prelevamento non è consentito");
			System.out.println();
			return;
		}
		else
		{
			saldo -= prelevamento;
			System.out.println("Sono stati prelevati dal conto numero: " + this.numeroConto + " \n intestato a: " + this.intestatario + " \n la cifra di: " + prelevamento);
			System.out.println("Saldo aggiornato: " + saldo);
			System.out.println();
		}
	}
	
	public void infoConto()
	{
		System.out.println("nome intestatario: " + this.intestatario);
		System.out.println("numero conto: " + this.numeroConto);
		System.out.println("saldo aggiornato: " + saldo);
		System.out.println();
	}
	
	public static double  trasferimento(ContoCorrente cliente1, ContoCorrente cliente2, double trasferimento)
	{
		if(trasferimento < 0)
		{
			System.out.println("Operazione non consentita");
		}
		else if(cliente1.saldo < trasferimento)
		{
			System.out.println("Operazione non valida saldo insufficente");
		}
		else
		{
			cliente2.saldo += trasferimento;
			cliente1.saldo -= trasferimento;
			System.out.println("Sono stati trasferiti dal conto intestato a: " + cliente1.intestatario + " con numero di conto: " + cliente1.numeroConto +
					" \n al conto intestato a: " + cliente2.intestatario + " con numero di conto: " + cliente2.numeroConto + 
					" \n la somma di: " + trasferimento);
			
			System.out.println("Il saldo aggiornato è: " + cliente2.saldo);
			System.out.println();
		}
		
		return cliente2.saldo;
		
		
	}
	
	
	
	
	//voto 8.5/10
	
}
