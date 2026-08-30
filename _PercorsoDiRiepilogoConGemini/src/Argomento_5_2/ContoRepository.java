package Argomento_5_2;

public interface ContoRepository {

	public void salva(String numeroConto, String titolare, double saldo);
	
	public boolean esistePerNumero(String numeroConto);
	
	public void aggiornaSaldo(String numeroConto, double nuovoSaldo);
	
	public double trovaSaldoPerNumero(String numeroConto);
	
}
