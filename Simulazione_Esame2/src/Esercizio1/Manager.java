package Esercizio1;

public class Manager extends Dipendente {

	//costruttore
	
	public Manager(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	
	
	//metodi
	@Override
	public double aumentaStipendio(int percentuale)
	{
		
		if (percentuale == 0 || percentuale > 100)
		{
			System.out.println("Percentuale inserita non rientra nei parametri");
			return getStipendio();
		}
		else
		{
			double aumento = (getStipendio() * percentuale) / 100;
		
			System.out.println("Grazie al buon operato lo stipendio ha avuto un'aumento del " + percentuale + " % con un'aumento pari a: " + aumento);
			
		  return getStipendio() + aumento;
		}
	}
	
	public double bonus(double cifra)
	{
		
		
		if (cifra <= 0)
		{
			System.out.println("La cifra inserita non può essere uguale o inferiore a 0 ");
			return getStipendio();
		}
		else
			
		{
			System.out.println("Il manager ha ottenuto un bonus per il suo operto, pari a : " + cifra);	
			
			return getStipendio() + cifra;
		}
		
		
		
	}



	@Override
	public String toString() {
		return super.toString();
	}



	
	

	

	
	
	
}
