package Esercizi_avanzati;

public class Coppia< K, V> {
	
	//variabili di istanza
	
	private K key;
	private V valore;
	
	//costruttore
	public Coppia(K key, V valore)
	{
		this.key = key;
		this.valore = valore;
	}
	
	//metodo getter
	public K getKey()
	{
		return key;
	}
	
	public V getValore()
	{
		return valore;
	}

}
