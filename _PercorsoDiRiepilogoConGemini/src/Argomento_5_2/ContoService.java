package Argomento_5_2;

public class ContoService {
	
	private ContoRepository contoRepository;

	public ContoService(ContoRepository contoRepository) {
		this.contoRepository = contoRepository;
	}

	public ContoRepository getContoRepository() {
		return contoRepository;
	}

	public void setContoRepository(ContoRepository contoRepository) {
		this.contoRepository = contoRepository;
	}
	
	public void apriConto(String numeroConto, String titolare, double saldoIniziale)
	{
		if(contoRepository.esistePerNumero(numeroConto))
		{
			System.out.println("Errore: conto già esistente");
			return;
		}
		
		if(saldoIniziale < 0)
		{
			System.out.println("Errore: saldo non valido");
			return;
		}
		else
		{
			contoRepository.salva(numeroConto, titolare, saldoIniziale);
			System.out.println("Conto aperto per: " + titolare);
		}
	}
	
	public void versa(String numeroConto, double importo)
	{
		if(importo <= 0)
		{
			System.out.println("Errore: importo non valido");
			return;
		}
		if(!contoRepository.esistePerNumero(numeroConto))
		{
			System.out.println("Errore: conto non trovato");
		}
		else
		{
			double saldoAttuale =
			        contoRepository.trovaSaldoPerNumero(numeroConto);

			double nuovoSaldo = saldoAttuale + importo;

			contoRepository.aggiornaSaldo(
			        numeroConto,
			        nuovoSaldo
			);
		System.out.println("Il nuovo saldo aggiornato è: " + nuovoSaldo);
		}
	}

}
