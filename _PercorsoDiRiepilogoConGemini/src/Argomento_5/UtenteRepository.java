package Argomento_5;

public interface UtenteRepository {

	public void salva(String email, String password);
	boolean esistePerEmail(String email);
}
