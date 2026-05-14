package classiWrapperEGenerici.generici;

public class ScatolettaGenerica <T> {
	
	//variabili di istanza
	private T contenuto;
	
	//costruttori
	public ScatolettaGenerica()
	{
		
	}
	
	
	//metodi getter e setter
	public T getContenuto() {
		return contenuto;
	}

	public void setContenuto(T contenuto) {
		this.contenuto = contenuto;
	}
	
	/*
	 * con questa classe generica stiamo dicendo che il tipo di dato del contenuto della scatoletta è un tipo generico T,
	 *  che sarà specificato al momento dell'istanza della classe.
	 *   In questo modo, possiamo creare scatoletta di qualsiasi tipo di dato senza dover creare una classe specifica per ogni tipo di dato.
	 *   
	 *   in poche parole è una super classe che può contenere qualsiasi tipo di dato, 
	 *   e il tipo di dato specifico sarà determinato al momento dell'istanza della classe.
	 */

}
