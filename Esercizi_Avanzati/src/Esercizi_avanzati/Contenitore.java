package Esercizi_avanzati;

public class Contenitore<T> {
	//variabile di istanza
	private T valore;
	
	//costruttore
	
	public Contenitore(T valore)
	{
		this.valore = valore;
	}
	
	//metodi getter
	public T get()
	{
		return valore;
	}

}
