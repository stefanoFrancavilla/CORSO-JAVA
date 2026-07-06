package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Esercizio_riepilogo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 🔴 Esercizio 3 - Complesso (Wildcard + Generics + Lambda)

Crea le seguenti liste:

List<Integer> interi = Arrays.asList(10, 20, 30);

List<Double> decimali = Arrays.asList(2.5, 3.5, 4.0);

Realizza i seguenti metodi.

1
public static double somma(List<? extends Number> lista)

Restituisce la somma degli elementi.

2
public static void aggiungi(List<? super Integer> lista)

Aggiunge:

100
200
300
3
public static void stampaLista(List<?> lista)

Stampa tutti gli elementi.

4

Crea una lambda:

Function<Number, Double>

che riceve un Number e restituisce il suo doppio.

Ad esempio:

10 -> 20.0

2.5 -> 5.0

Usala con un ciclo per stampare il doppio di tutti gli elementi della lista degli interi.

5

Nel main esegui questo ordine:

stampa la somma degli interi;
stampa la somma dei decimali;
crea una List<Number>;
usa aggiungi();
stampa la lista;
usa stampaLista() sia sugli interi che sui decimali;
usa la Function per stampare il doppio di ogni numero della lista degli interi.
		 */
		
		List<Integer> interi = Arrays.asList(10, 20, 30);
		List<Double> decimali = Arrays.asList(2.5, 3.5, 4.0);
		
		Function<Number, Double> doppio =  x -> x.doubleValue() * 2;
		
		System.out.println(somma(interi));
		System.out.println("-------------------------------");
		System.out.println(somma(decimali));
		System.out.println("-------------------------------");
		
		List<Number> lista = new ArrayList<>();
		aggiungi(lista);
		stampaLista(lista);
		System.out.println("-------------------------------");
		stampaLista(interi);
		stampaLista(decimali);
		
		System.out.println("-------------------------------");
		for (Integer intero : interi)
		{
			System.out.println(doppio.apply(intero));
		}
		
		
		
		
	}
	public static double somma(List<? extends Number> lista)
	{
	
		double totaleSomma = 0;
		
		for(Number n : lista)
		{
			totaleSomma += n.doubleValue();
		}
		
		return totaleSomma;
	}
	
	public static void aggiungi(List<? super Integer> lista)
	{
		lista.add(100);
		lista.add(200);
		lista.add(300);
	}
	
	public static void stampaLista(List<?> lista)
	{
		for(Object o : lista)
		{
			System.out.println(o);
		}
	}

}
