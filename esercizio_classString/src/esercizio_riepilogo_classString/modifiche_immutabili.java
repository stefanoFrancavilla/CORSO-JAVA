package esercizio_riepilogo_classString;

public class modifiche_immutabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Modifiche Immutabili
           In main, crea String nome = "luca"; String upper = nome.toUpperCase();. 
           Stampa nome, upper e nome == upper. Aggiungi final String costante = "test"; e prova a modificarla
		 */
		
		
		String nome = "luca";
		String upper = nome.toUpperCase();
		
		System.out.println("nome: " + nome);
		System.out.println("upper: " + upper);
		
		System.out.println(nome == upper);

		/*
		 * anche se in entrambi i casi è scritto Luca, hanno valore diverso.
		 * poichè nel secondo caso è scritto con i caratteri in maiuscolo , che hanno un valore diverso dai caratteri in minuscolo
		 * quindi nella console troveremo a stampa false.  
		 */
		
		final String costante = "test";
		
		//costante = "test 2";
		
		//anche se provassi a modificarla il sistema mi darebbe errore, poichè non è possibile modificare una costante.
	}

}
