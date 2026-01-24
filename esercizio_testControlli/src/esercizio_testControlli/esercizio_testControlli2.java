package esercizio_testControlli;

public class esercizio_testControlli2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		giochi gioco = giochi.MARIO_KART;
		String messaggio = verificaConsole(gioco);
		System.out.println("messaggio: " + messaggio);
		
	}

	public static String verificaConsole(giochi gioco)
	{
	String messaggio ="";
	
	switch (gioco)
	{
	case FIFA:
	case CRUSH:
	case MAFIA:
		
		messaggio = "Questo è un gioco della playstation";
		break;
		
	case SUPER_MARIO:
	case MARIO_KART:
	case YOSHI:
		
		messaggio = "questo è un gioco per la switch";
		break;
		
    default:
    	messaggio = "questo gioco non è nella lista";
    	break;
	
	}
	return messaggio;
}
}