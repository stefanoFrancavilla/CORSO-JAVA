package Esercizi_avanzati;

public class Archivio <T>{
	private T elemento;
	
	public Archivio(T elemento)
	{
		this.elemento = elemento;
	}

	public T get()
	{
		return elemento;
	}
	
	public void set()
	{
		this.elemento = elemento;
	}
}
