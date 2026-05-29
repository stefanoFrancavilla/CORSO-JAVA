package incapsulamentoDeiDati.utilities;

import java.io.Serializable;

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
	
	//@SafeVarargs
	//public static <T extends Comparable<T> & Serializable> T estraeIlMinore(T...ns)
	
     @SafeVarargs
	public static <T extends Comparable<T>> T estraeIlMinore(T... ns)
	{
	
		System.out.println("--------------------------");
		System.out.println("Calcolo -> estraeIlMinore(T... ns)");
		
		if(ns == null)
			return null;
		
		if(ns.length == 0)
			return null;
		
		T minore = ns[0];
		T corrente = null;
		for(int i = 1; i < ns.length; i++)
		{
			 corrente = ns[i];
			 
			 //0 se i 2 oggetti sono equivalenti
			 //- quandol'oggetto attuale è minore dell'oggetto in input
			 //+ quando l'oggetto attuale è maggiore dell'oggetto in input
			
			if(minore.compareTo(corrente) > 0)
				minore = corrente;
		}
		
		return minore;
		
		/*
		 * Comparable
		 * cobn la dicitura di codice <T extends Comparable<T>> stiamo dichiarando un parametro di tipo generico T che deve implementare l'interfaccia Comparable<T>.
		 * solo se il tipo generico T che implementa l'interfaccia Comparable<T> è possibile utilizzare il metodo compareTo()
		 *  per confrontare gli oggetti di tipo T e determinare quale è il minore.
		 *  se dovessimo usare un tipo generico T che non implementa l'interfaccia Comparable<T>, il compilatore genererebbe un errore,
		 *  ecco spiegato l'aggiunta dell'extends Comparable<T> per garantire che il metodo estraeIlMinore 
		 *  possa essere utilizzato solo con tipi di dato che implementano l'interfaccia Comparable<T>.
		 *  
		 *  la dicitura extends in questo caso ha un significato diverso rispetto a quando viene utilizzata con le classi,
		 *   in questo caso stiamo dichiarando un vincolo sul tipo generico T,
		 *   
		 *   cioè : il generico dichiarato al posto di T, è un sottotipo di Comparable<T>, o in altre parole, T deve implementare l'interfaccia Comparable<T>.
		 *   cio che sta a destra di extends deve essere un tipo che può essere assegnato a T, e in questo caso è Comparable<T>.
		 */
		
		/*
		 * Serializable
		 * con la dicitura <T extends Comparable<T> & Serializable> stiamo dichiarando un parametro di tipo generico T che deve implementare sia 
		 * l'interfaccia Comparable<T> che l'interfaccia Serializable.
		 * l'aggiunta dell'interfaccia Serializable come vincolo per il tipo generico T, indica che il metodo estraeIlMinore 
		 * può essere utilizzato solo con tipi di dato che implementano sia l'interfaccia Comparable<T> che l'interfaccia Serializable.
		 * quindi stiamo aggiungento un'ulteriore restrizione sul tipo generico T, che deve implementare entrambe le interfacce
		 *  per poter essere utilizzato con il metodo estraeIlMinore.
		 *  
		 *  con serializable stiamo indicando che il tipo generico T deve essere serializzabile,
		 *   cioè deve essere in grado di essere convertito in un formato che può essere salvato su disco o trasmesso attraverso una rete.
		 *   in parole semplici, stiamo dicendo che il tipo generico T deve essere in grado di essere salvato e recuperato in modo efficiente,
		 *   e che deve essere compatibile con le operazioni di serializzazione e deserializzazione.
		 */
		
		
		//raw type ottenuto con la type erasure (operata dal compilatore).
		
	/*	public static Comparable estraeIlMinore(Comparable... ns)
		{
			System.out.println("--------------------------");
			System.out.println("Calcolo -> estraeIlMinore(Comparable... ns)");
			
			if(ns == null)
				return null;
			
			if(ns.length == 0)
				return null;
			
			Comparable minore = ns[0];
			Comparable corrente = null;
			for(int i = 1; i < ns.length; i++)
			{
				 corrente = ns[i];
				 
				 //0 se i 2 oggetti sono equivalenti
				 //- quandol'oggetto attuale è minore dell'oggetto in input
				 //+ quando l'oggetto attuale è maggiore dell'oggetto in input
				
				if(minore.compareTo(corrente) > 0)
					minore = corrente;
			}
			
			return minore;
		}*/
	}
}
	
