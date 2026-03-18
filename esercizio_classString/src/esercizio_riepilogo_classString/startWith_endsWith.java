package esercizio_riepilogo_classString;

public class startWith_endsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * StartsWith e EndsWith
           Testa "gatto".endsWith("to"), "treno".startsWith("tr"),
           "gatto".startsWith("tr") e stampa risultati booleani.
		 */
		
		String gatto = "gatto";
		String treno = "treno";
		
		System.out.println("gatto ends with to " + gatto.endsWith("to"));
		System.out.println("treno starts with tr " + treno.startsWith("tr"));
		System.out.println("gatto starts with tr " + gatto.startsWith("tr"));
		
		//startsWith e endsWith sono metodi che restituiscono un valore booleano,
		//true se la stringa inizia o finisce con la sequenza di caratteri specificata, altrimenti false
	}

}
