package incapsulamentoDeiDati.utilities;

public final class Verifica {
	
	//Costruttori
	private Verifica() {
	}

	
	public static boolean verificaCratteri(String caratteri, String s) {
		boolean presente = false;
		for (int i = 0; i < caratteri.length(); i++) 
		{
			char carattereCorrente = caratteri.charAt(i);
			//System.out.println("carattereCorrente" +  carattereCorrente);
			if (s.indexOf(caratteri.charAt(i)) != -1)
			{
				presente = true;
				break;
			}
	}
		return presente;
}
	public static boolean verificaLunghezza(String s, int  limit)
	{
		boolean troppoLunga = false;
		
		if (s.length() > limit) 
		    troppoLunga = true;
		return troppoLunga;
	}
}
