package Argomento_5;

public interface UtenteRepository {

	void salva(String email, String password);
	boolean esistePerEmail(String email);
}
