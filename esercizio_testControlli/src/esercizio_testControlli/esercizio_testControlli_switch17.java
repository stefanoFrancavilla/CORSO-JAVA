package esercizio_testControlli;

public class esercizio_testControlli_switch17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ruolo ruolo = Ruolo.ADMIN;
		
		System.out.println(verificaAccesso(ruolo));
		
	}

	public static String verificaAccesso(Ruolo r)
	{
		String messaggio = switch (r)
				{
		case ADMIN -> "Accesso consentito";
		case UTENTE -> "Accesso consentito";
		case OSPITE -> "Accesso negato";
		default -> "Errore scelta";
				};
		
		
		return messaggio;
	}

}
