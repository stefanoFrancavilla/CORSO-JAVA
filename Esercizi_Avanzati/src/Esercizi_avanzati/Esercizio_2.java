package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contenitore<String> contenitore = new Contenitore<>("Java");
		
		
		String s = contenitore.get();
		
		System.out.println("----------------------------------------");
		
		Coppia<String, Integer> coppia = new Coppia<>("Marco", 28);
		
		String nome = coppia.getKey();
		int eta = coppia.getValore();
		System.out.println(nome + " \n" + eta);
		
		System.out.println("----------------------------------------");
		
		mostra("Ciao");
		mostra(25);
		mostra(8.5);
		mostra(false);
		System.out.println("----------------------------------------");
		
		List<String> nomi = Arrays.asList("Anna", "Marco");
		List<Integer> numeri = Arrays.asList(1, 2, 3, 4);
		
		stampaLista(nomi);
		System.out.println("----------------------------------------");
		stampaLista(numeri);
		
		System.out.println("----------------------------------------");
		
		List<Integer> interi = Arrays.asList(10, 20, 30);
		List<Double> decimali = Arrays.asList(2.5, 3.5, 4.0);
		
		System.out.println(somma(interi));
		System.out.println(somma(decimali));
		

		System.out.println("----------------------------------------");
		
		List<Number> numeri1 = new ArrayList<>();
		aggiungi(numeri1);
		
		System.out.println(numeri1);
		
	}
	
	public static <T> void mostra(T valore)
	{
		System.out.println(valore);
	}
	
	public static void stampaLista(List<?> lista)
	{
	for( Object oggetto : lista)
	{
		System.out.println(oggetto);
	}
	}
	
	public static double somma(List<? extends Number> lista)
	{
		double totale = 0;
		
		for(Number numero : lista)
		{
			totale += numero.doubleValue();
		}
		
		return totale;
	}
	
	public static void aggiungi(List<? super Integer> lista)
	{
		lista.add(10);
		lista.add(20);
		lista.add(30);
	}

}
