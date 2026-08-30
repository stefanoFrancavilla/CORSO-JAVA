package Argomento_5_2;

public class ContoRepositoryImpl implements ContoRepository {
	
	private String[] numeriConto = new String[10];
	private String[] titolari = new String[10];
	private double[] saldi = new double[10];
	
	private int posizione = 0;
	
	
	

	@Override
	public void salva(String numeroConto, String titolare, double saldo) {
		if(posizione >= numeriConto.length)
		{
			System.out.println("Errore, la memoria è piena");
			return;
		}
		else
		{
			numeriConto[posizione] = numeroConto;
			titolari[posizione] = titolare;
			saldi[posizione] = saldo;
			
			posizione ++;
		}
		
		
	}

	@Override
	public boolean esistePerNumero(String numeroConto) {
		
		for(int i = 0; i < posizione; i++)
		{
			if(numeriConto[i].equals(numeroConto))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void aggiornaSaldo(String numeroConto, double nuovoSaldo) {
		    for (int i = 0; i < posizione; i++) {

		        if (numeroConto.equals(numeriConto[i])) {
		            saldi[i] =  nuovoSaldo;
		            return;
		        }
		    }

		    System.out.println("Errore: conto non trovato");
	}

	@Override
	public double trovaSaldoPerNumero(String numeroConto) {
		for (int i = 0; i < posizione; i++)
		{
			if(numeroConto.equals(numeriConto[i]))
			{
				return saldi[i];
			}			
				
		}
		return -1;
		
	}
	
	


}
