package esercizio_riepilogo_classString;

public class equals_ignoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Equals e IgnoreCase
           Crea String a = "Ford"; String b = "ForD";. Stampa a.equals(b), a.equalsIgnoreCase(b).
           Testa con String diverse.

		 */
		
		String a = "Ford";
		String b = "ForD";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		/* nel primo caso il risultato in console sarà false poichè string a ha un valore dicverso da string b
		 * nel primo caso stiamo chieendo se il valore di a è uguale al valore di b, che non è così per via della maiuscola finale
		 * 
		 * nel secondo caso stiamo ignorando il case se maiuscolo o minuscolo, quindi il calore sarà uguale e quindi sarà true
		 */
		
	}

}
