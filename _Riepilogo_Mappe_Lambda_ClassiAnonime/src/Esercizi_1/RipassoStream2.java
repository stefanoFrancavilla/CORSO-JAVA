package Esercizi_1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RipassoStream2 {

	public static void main(String[] args) {
	
		List<Integer> numeri = List.of(4, 8, 15, 16, 23, 42);
		int somma =
		numeri.stream()
		.reduce(0, (a, b) -> a + b);
		
		System.out.println(somma);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		int sommaPari =
				numeri.stream()
				.filter(n -> n % 2 == 0)
				.reduce(0, (a, b) -> a + b);
		
        System.out.println(sommaPari);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<Integer> numeri2 = List.of(3, 9, 18, 27, 36);
		
		boolean maggiore30 = 
				numeri2.stream()
				.anyMatch(n -> n > 30);
		
	     System.out.println(maggiore30);
			
			System.out.println();
			System.out.println("----------------------------------");
		
			
			List<Integer> numeri3 = List.of(3, 9, -18, 27, 36);
			
			boolean tuttiPositivi =
					numeri3.stream()
					.allMatch(n -> n > 0);
			
			 System.out.println(tuttiPositivi);
				
				System.out.println();
				System.out.println("----------------------------------");
				
		 List<String> nomi = List.of("Anna", "Luca", "Alessandra", "Marco", "Beatrice");
		 
		Optional<String> nome = 
				 nomi.stream()
				 .filter(n -> n.length() > 5)
				 .findFirst();
		
		 System.out.println(nome);
			
			System.out.println();
			System.out.println("----------------------------------");
			
			List<String> codici = List.of("A123", "B45", "C678", "D9", "E012");
			
			codici.stream()
			.filter(c -> c.matches("[A-Z]\\d{2,}"))
			.forEach(c -> System.out.println(c));
			
			System.out.println();
			System.out.println("----------------------------------");
			
			List<String> parole = List.of("albero", "casa", "isola", "mare", "ombra", "sole");
			
			List<String> risultato = 
					parole.stream()
					.filter(p -> p.startsWith("a") || p.startsWith("e") || p.startsWith("i")||
							p.startsWith("o") || p.startsWith("u"))
					.map(n -> n.toUpperCase())
					.sorted()
					.collect(Collectors.toList());
			
			 System.out.println(risultato);
				
				System.out.println();
				System.out.println("----------------------------------");
					
				
				List<Integer> numeri4 = List.of(7, 3, 7, 10, 3, 5, 10, 1);
				
				List<Integer> risultato2 = numeri4.stream()
						.distinct()
						.sorted()
						.filter(r -> r > 2)
						.collect(Collectors.toList());
				
				 System.out.println(risultato2);
					
					System.out.println();
					System.out.println("----------------------------------");
					
					List<String> prodotti = List.of(
					        "Mouse:25.50",
					        "Tastiera:45.00",
					        "Cuffie:60.00",
					        "Cavo:12.00"
					);
					
				Double prezzo =	prodotti.stream()
					.mapToDouble(String::Duoble)
					.reduce(0, (a, b) -> a + b);
				System.out.println(prezzo);
				
				System.out.println();
				System.out.println("----------------------------------");
				
				
			
		
			
	}

}
