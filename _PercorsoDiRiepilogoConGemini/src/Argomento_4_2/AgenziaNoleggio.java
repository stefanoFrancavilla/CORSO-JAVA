package Argomento_4_2;

public class AgenziaNoleggio {
	
	public void  gestisciNoleggio ( Veicolo veicolo, int giorni)
	{
		if (veicolo.noleggia(giorni))
		{
			System.out.println("noleggio di: " + veicolo.getCliente() + " avvenuto con successo");
		}
		else
		{
			System.out.println("noleggio di: " + veicolo.getCliente() + " fallito");
		}
	}

}
