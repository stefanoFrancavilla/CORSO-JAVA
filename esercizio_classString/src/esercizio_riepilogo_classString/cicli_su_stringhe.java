package esercizio_riepilogo_classString;

public class cicli_su_stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Cicli su Stringhe
           Scrivi un programma che prende "Precipitevolissimevolmente", converte lettere in posizioni pari a maiuscole
           (usa if (i % 2 == 0) e -32 per maiuscole), concatena in nuova String e stampa. Ripeti ciclo for decrescente.
		 */
		
		String parola = "Precipitevolissimevolmente";
		String pariMaiuscole = "";
		String decrescente = "";
		for (int i = 0; i < parola.length(); i++ )
		{
			if (i % 2== 0 )
			{
				char carattereCorrente = parola.charAt(i);
				carattereCorrente = (char) (carattereCorrente - 32);
				pariMaiuscole = pariMaiuscole + carattereCorrente;	
			}
		}
		System.out.println(pariMaiuscole);
		
		for( int i = parola.length() -1; i >= 0; i-- )
		{
			char carattereCorrente = parola.charAt(i);
			carattereCorrente = (char) (carattereCorrente - 32);
			decrescente = decrescente + carattereCorrente;	
		}
		System.out.println(decrescente);
	}

}
