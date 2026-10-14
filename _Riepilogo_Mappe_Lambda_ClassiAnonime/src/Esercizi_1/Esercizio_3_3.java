package Esercizi_1;

import java.util.ArrayList;
import java.util.List;

public class Esercizio_3_3 {

	public static void main(String[] args) {
	
		
		
		List<Integer> voti = new ArrayList<>(
			    List.of(18, 27, 12, 30, 22, 9, 25, 15, 28, 20)
			);

		// Esercizio 1
		
		voti.forEach(v -> System.out.println(v));
		 System.out.println("----------------------------------");
		 
		// Esercizio 2
		 
		 voti.removeIf(n -> n < 18);
		 System.out.println(voti);
		 System.out.println("----------------------------------");
		
		 // Esercizio 3
		 
		 voti.replaceAll(n -> n + 2);
		 System.out.println(voti);
		 System.out.println("----------------------------------");
		 
		 // Esercizio 4
		 
		 voti.sort((a, b) -> a.compareTo(b));
		 System.out.println(voti);
		 System.out.println("----------------------------------");
		 
		 // Esercizio 5
		 
		 voti.removeIf(n -> n >= 30);
		 System.out.println(voti);
		 System.out.println("----------------------------------");
		 
		 
		 List<String> nomi = new ArrayList<>(
				    List.of("Luca", "Anna", "Marco", "Sara", "Paolo", "Elena"));
		 
		 // Esercizio 6
		 
		 nomi.forEach(n -> System.out.println(n));
		 System.out.println("----------------------------------");
		 
		 // Esercizio 7
		 
		 nomi.removeIf(n -> n.length() < 5);
		 System.out.println(nomi);
		 System.out.println("----------------------------------");
		 
		 // Esercizio 8
		 
		 nomi.replaceAll(n -> "Nome: " + n);
		 System.out.println(nomi);
		 System.out.println("----------------------------------");
		 
		 // Esercizio 9
		 
		 nomi.sort((a, b) -> Integer.compare(a.length(), b.length()));
		 System.out.println(nomi);
		 System.out.println("----------------------------------");
		 
		 // Esercizio 10
		 
		 nomi.removeIf(n -> n.contains("Paolo"));
		 System.out.println(nomi);
		 System.out.println("----------------------------------"); 
	}

}
