package esercizio_riepilogo_classString;

public class isEmpty_isBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * IsEmpty e IsBlank
           Crea Stringhe: vuota "", con spazio " ", con \t. Stampa isEmpty(), isBlank(), length() per ciascuna.
		 */
		
		String vuota = "";
		String spazio = " ";
		String t = "\t";
		
		System.out.println("vuota is blank " + vuota.isBlank());
		// isBlank restituisce true se la stringa è vuota o contiene solo spazi bianchi, quindi in questo caso è true
		System.out.println("vuota is empty " + vuota.isEmpty());
		// isEmpty restituisce true se la stringa è vuota, quindi in questo caso è true
		System.out.println("vuota  .length " + vuota.length());
		// length restituisce la lunghezza della stringa, quindi in questo caso è 0
		System.out.println();
		
		System.out.println("spazio is blank " + spazio.isBlank());
		// isBlank restituisce true se la stringa è vuota o contiene solo spazi bianchi, quindi in questo caso è true
		System.out.println("spazio is empty " + spazio.isEmpty());
		// isEmpty restituisce true se la stringa è vuota, quindi in questo caso è false
		System.out.println("spazio  .length " + spazio.length());
		// length restituisce la lunghezza della stringa, quindi in questo caso è 1
		System.out.println();
		
		System.out.println("t is blank " + t.isBlank());
		// isBlank restituisce true se la stringa è vuota o contiene solo spazi bianchi, quindi in questo caso è true
		System.out.println("t is empty " + t.isEmpty());
		// isEmpty restituisce true se la stringa è vuota, quindi in questo caso è false
		System.out.println("t  .length " + t.length());
		// length restituisce la lunghezza della stringa, quindi in questo caso è 1
		
		/*
		 * con is blank intendiamo verificare se la stringa è vuota o contiene solo spazi bianchi,
		 *  
		 *  con is empty intendiamo verificare se la stringa è vuota, quindi se non contiene alcun carattere
		 */
		
		
		
	}

}
