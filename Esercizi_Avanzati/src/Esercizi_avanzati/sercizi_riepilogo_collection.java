package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sercizi_riepilogo_collection {
	public static void main(String[] args) {
		
		
		ArrayList<String> frutti = new ArrayList<>();
		frutti.add("Mela");
		frutti.add("Banana");
		frutti.add("Arancia");
		
		System.out.println(frutti.get(0));
		System.out.println(frutti.get(1));
		System.out.println(frutti.get(2));
		
		System.out.println("-----------------------------");
		
		System.out.println(frutti.get(1));
		
		System.out.println("-----------------------------");
		
		frutti.set(1, "Pera");
		
		System.out.println(frutti.get(0));
		System.out.println(frutti.get(1));
		System.out.println(frutti.get(2));
		System.out.println(frutti.size());
		
		
		Set<String> nomi = new HashSet<>();
		
		nomi.add("Marco");
		nomi.add("Anna");
		nomi.add("Luca");
		nomi.add("Marco");
		
		
	}
}

