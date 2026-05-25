package incapsulamentoDeiDati.utilities;

public final class Calcolo {
	
	// con il costrutto final stiamo dich8iarando che la classe Calcolo non è estendibile.

	//costruttori
	private Calcolo()
	{
		
	}
	public static double somma(double... ns)
	{
		double somma = 0;
		
		for( int i = 0; i < ns.length; i++)
			
			somma = somma + ns[i];
		return somma;
	}
	
	// abbiamo impostato static perchè non è necessario creare un oggetto per poter utilizzare i metodi della classe Calcolo,
	// e abbiamo impostato il metodo come public perchè vogliamo che sia accessibile da qualsiasi altra classe.
	public static double moltiplica(double... ns)
	{
		double prodotto = 1;
		
		for( int i = 0; i < ns.length; i++)
		
			prodotto = prodotto * ns[i];
		
		return prodotto;
		
	}
	
	//Stesso problema delle Array
	@SafeVarargs //static, final e private
	public static <T> T estraeNelMezzo(T... ns)
	{
		System.out.println("--------------------------");
		System.out.println("Calcolo -> estraeNelMezzo(T... ns)");
		
		if(ns == null)
			return null;
		
		if(ns.length == 0)
			return null;
		
		int index = ns.length / 2;
		
		System.out.println("	index: " + index);
		
		T elementoNelMezzo = ns[index];
		
		return elementoNelMezzo;
		
		/*
		 * con questo metodo stiamo estraendo l'elemento che si trova nel mezzo dell'array di elementi di tipo T passato come parametro.
		 * stiamo usando il costrutto varargs (T... ns) per permettere di passare un numero variabile di argomenti di tipo T al metodo.
		 * il metodo calcola l'indice dell'elemento centrale dividendo la lunghezza dell'array per 2,
		 *  e poi restituisce l'elemento che si trova in quella posizione.
		 *  
		 *  questo metodo è utile quando vogliamo estrarre l'elemento centrale da un array di elementi di qualsiasi tipo,
		 *  
		 *  nello specifico la <T> rappresenta un parametro di tipo generico, che permette al metodo di essere utilizzato con qualsiasi tipo di dato.
		 *  la T che viene subito dopo il public static indica che il metodo restituirà un valore di tipo T, 
		 *  che sarà determinato al momento della chiamata del metodo in base al tipo degli argomenti passati.
		 *  con la porzione di codice(T... ns) stiamo dichiarando un parametro varargs, 
		 *  che permette di passare un numero variabile di argomenti di tipo T al metodo.
		 *  
		 *  con la porzione di codice T elementoNelMezzo = ns[index];
		 *   stiamo assegnando alla variabile elementoNelMezzo l'elemento che si trova nella posizione index dell'array ns,
		 *   
		 *   infine con il codice @SafeVarargs stiamo indicando al compilatore che il metodo estraeNelMezzo è sicuro per l'uso con varargs di tipo generico,
		 *   se viene a mancare questa annotazione, il compilatore potrebbe generare un warning quando si utilizza il metodo con varargs di tipo generico,
		 *   quindi la sua presenza rassicura che il metodo è stato progettato per essere utilizzato in modo sicuro con varargs di tipo generico,
		 *    e che non ci sono rischi di problemi di sicurezza o di compatibilità quando si utilizza il metodo in questo modo.
		 *   
		 *   quindi con questa sintassi possiamo adattare il metodo estraeNelMezzo per lavorare con qualsiasi tipo di dato, 
		 *   senza dover scrivere un metodo specifico per ogni tipo di dato che vogliamo utilizzare.
		 *   poiche bisogna immaginare al posto della T un qualsiasi tipo di dato, ad esempio Integer, String, Double, ecc.
		 */
	}
}
	
