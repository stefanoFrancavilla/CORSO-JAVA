package Argomento_5;

public class UtenteRepositoryImpl implements UtenteRepository {
	
	private String[] emailArray = new String[10];
	private String[] passwordArray = new String[10];
	private int posizione = 0;
	
	@Override
	public void salva(String email, String password) {
	
		if(posizione >= emailArray.length)
		{
			System.out.println("Errore memoria piena");
			return;
		}
		else
		{
			emailArray[posizione] = email;
			passwordArray[posizione] = password;
			
			posizione ++;
		}
		
		
	}
	@Override
	public boolean esistePerEmail(String email) {

		for(int i = 0;i < posizione; i++)
		{
			if(emailArray[i].equals(email))
			{
				return true;
			}
		}
		return false;
	}

	
	
}
