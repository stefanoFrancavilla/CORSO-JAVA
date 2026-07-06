package Esercizi_avanzati;

public class Esercizio_riepilogo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 🟡 Esercizio 2 - Medio (Generics)

Crea una classe generica:

Archivio<T>

con:

variabile elemento
costruttore
getter
setter

Poi crea un metodo generico:

public static <T> void stampaElemento(T elemento)

Nel main crea:

Archivio<String>
Archivio<Integer>
Archivio<Double>

contenenti rispettivamente:

Java
100
25.5

Recupera i valori con il getter e stampali usando il metodo generico.

Output atteso
Java
100
25.5
		 */
		
		Archivio<String> archivioString = new Archivio<>("Java");
		Archivio<Integer> archivioInteger = new Archivio<>(100);
		Archivio<Double> archivioDouble = new Archivio<>(25.5);
		
		
		stampaElemento(archivioString.get());
		stampaElemento(archivioInteger.get());
		stampaElemento(archivioDouble.get());
		
	}

	
	public static <T> void stampaElemento(T elemento)
	{
		System.out.println(elemento);
		
	}
}
