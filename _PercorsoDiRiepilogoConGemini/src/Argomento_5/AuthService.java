package Argomento_5;

public class AuthService {
	
	private UtenteRepository utenteRepository;

	public AuthService(UtenteRepository utenteRepository) {
		
		this.utenteRepository = utenteRepository;
	}

	public UtenteRepository getUtenteRepository() {
		return utenteRepository;
	}

	public void setUtenteRepository(UtenteRepository utenteRepository) {
		this.utenteRepository = utenteRepository;
	}
	
	public void registraUtente(String email, String password)
	{
		if(utenteRepository.esistePerEmail(email))
		{
			System.out.println("Errore: email già registrata!");
		}
		else
		{
			utenteRepository.salva(email, password);
			System.out.println("Registrazione completata " + email);
		}
	}
	

}
