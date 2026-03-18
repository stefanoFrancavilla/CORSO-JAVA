package esercizio_riepilogo_classString;

public class indexOf_lastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * IndexOf e LastIndexOf
           Su "ABCDEFGHILMNOPQRSTUVZ", trova indexOf('B'), indexOf("NO", 12), lastIndexOf('A').
           Se indexOf("Rossi") > -1 in "Mario Rossi", stampa "Trovato".
		 */
		
		int caratteri = "ABCDEFGHILMNOPQRSTUVZ".indexOf('B');
		System.out.println("index carattere B " + caratteri);
		
		caratteri = "ABCDEFGHILMNOPQRSTUVZ".indexOf("NO", caratteri);
		System.out.println("index caratteri NO " + caratteri);
		
		caratteri = "ABCDEFGHILMNOPQRSTUVZ".lastIndexOf('A');
		System.out.println("index carattere A " + caratteri);
		
		String nome = "Mario Rossi";
		if (nome.indexOf("Rossi") > -1)
		{
			System.out.println("Trovato");
		}
	
	}

}
