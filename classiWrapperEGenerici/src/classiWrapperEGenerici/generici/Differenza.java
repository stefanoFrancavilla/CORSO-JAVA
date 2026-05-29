package classiWrapperEGenerici.generici;

import java.io.Serializable;

public class Differenza <T extends Comparable <T> & Serializable> implements Serializable{
// public class Differenza<T extends Comparable<? super T> & Serializable> implements Serializable{	
	 
	 /*
	  * con  public class Differenza<T extends Comparable<? super T> & Serializable> implements Serializable stiamo
	  * dichiarando che la classe Differenza è una classe generica che accetta un tipo T che deve essere un sottotipo di Comparable<? super T> e Serializable,
	  * nello specifico la dicitura <? super T> indica che il tipo T deve essere un sottotipo di Comparable che accetta un tipo che è un supertipo di T,
	  * cioè in parole semplici, T deve essere un sottotipo di Comparable che accetta un tipo che è un supertipo di T.
	  * 
	  * la differenza con la riga di codice precedente è che adesso T deve essere anche un tipo Comparable , ma che accetta anche un tipo che è un superTipo di t
	  * 
	  * esempio il localdate come tipo , con il codice precedente non sarebbe stato possibile utilizzarlo come tipo generico per la classe Differenza,
	  * questo perchè la classe localDate implementa l'interfaccia Camperable<ChronoLocalDate>, 
	  * cioè localDate è un sottotipo di CronoLocalDate,
	  * quindi con la dicitura <T extends Comparable<? super T> & Serializable> stiamo dichiarando che 
	  * T deve essere un sottotipo di Comparable che accetta un tipo che è un supertipo di T,
	  * 
	  * T , nel nostro caso localDate estende si camperable a patto che sia un qualunque tipo di localDate.
	  * il ? sta per wildcard, e indica che il tipo generico T deve essere un sottotipo di Comparable che accetta un tipo che è un supertipo di T.
	  */
	private static final long serialVersionUID = 1L;
	
	//variabili d'istanza
	private T inizio;
	private T fine;
	
	//costruttori
	public Differenza(T inizio, T fine)
	{
		 //0 se i 2 oggetti sono equivalenti
		 //- quandol'oggetto attuale è minore dell'oggetto in input
		 //+ quando l'oggetto attuale è maggiore dell'oggetto in input
		
		if (inizio.compareTo(fine) > 0)
		{
			this.inizio = fine;
			this.fine = inizio;
		}
		else 
		{
			this.inizio = inizio;
			this.fine = fine;
		}
	}
	
	/*
	 * la sintassi dell'if è: se inizio è maggiore di fine, allora inizio diventa fine e fine diventa inizio, 
	 * altrimenti inizio e fine rimangono invariati.
	 */
	//metodi getters setters
	public T getInizio() {
		return inizio;
	}
	
	public void setInizio(T inizio) {
		this.inizio = inizio;
	}
	
	public T getFine() {
		return fine;
	}
	
	public void setFine(T fine) {
		this.fine = fine;
	}
	
	// raw type ottenuto dalla type erasure (operata dal compilatore).
	
	/*
	 * public class Differenza implements Serializable{
	 * 
	 * private static final long serialVersionUID = 1L;
	 * 
	 // variabili d'istanza
	 *
	 *private Comparable inizio;
	 * private Comparable fine;
	 * 
	 // costruttori
	 * public Differenza(Comparable inizio, Comparable fine)
	 * {
	 * 	 //0 se i 2 oggetti sono equivalenti
	 * 	 //- quandol'oggetto attuale è minore dell'oggetto in input	
	 * 	 //+ quando l'oggetto attuale è maggiore dell'oggetto in input
	 * * 	if (inizio.compareTo(fine) > 0)
	 * 	{
	 * 		this.inizio = fine;
	 * 		this.fine = inizio;
	 * 	}
	 * 	else
	 * 	{
	 * 		this.inizio = inizio;
	 * 		this.fine = fine;
	 * 	}
	 * }
	 * 
	 
	 
	 * 
	 */

}
