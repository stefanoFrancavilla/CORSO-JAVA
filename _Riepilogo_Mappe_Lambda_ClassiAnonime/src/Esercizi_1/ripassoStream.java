package Esercizi_1;

import java.util.List;

public class ripassoStream {

	public static void main(String[] args) {

		// esercizio 1
		List<String> ids = List.of("T001", "T12", "X001", "T1234", "T00A", "T999");
		
		ids.stream()
		.filter(r -> r.matches("T\\d{3,}"))
		.forEach(r -> System.out.println(r));

		
		
		// esercizio 2
		List<Integer> numeri = List.of(3, 8, 12, 7, 20, 25, 30);
		
		numeri.stream()
		.filter(n -> n % 2 == 0)
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<String> nomi = List.of("Anna", "Luca", "Alice", "Marco", "Andrea");
		
		nomi.stream()
		.filter(n -> n.startsWith("A"))
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<Integer> numeri2 = List.of(5, 12, 9, 30, 18, 3, 25);
		numeri2.stream()
		.filter(n -> n >= 10)
		.forEach(r -> System.out.println(r));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<String> codici = List.of("P123", "P12", "A123", "P4567", "P1A3", "P789");
		
		codici.stream()
		.filter(c -> c.matches("P\\d{3,}") && c.length() == 4)
		.forEach(c -> System.out.println(c));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<Integer> numeri3 = List.of(1, 2, 3, 4, 5);
		
		numeri3.stream()
		.map(n -> n * 2)
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<String> nomi2 = List.of("anna", "luca", "marco");
		
		nomi2.stream()
		.map(n -> n.toUpperCase())
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<Integer> numeri4 = List.of(2, 5, 8, 11, 14, 17, 20);
		
		long conteggio = numeri4.stream()
		.filter(n -> n % 2 == 0)
		.count();
		System.out.println(conteggio);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<String> email = List.of(
		        "anna@gmail.com",
		        "luca@test",
		        "marco@yahoo.com",
		        "giulia@",
		        "paolo@libero.it"
		);
		
		email.stream()
		.filter(n -> n.contains("@"))
		.filter(n -> n.endsWith(".com") || n.endsWith(".it"))
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<String> parole = List.of("casa", "auto", "sole", "albero", "luna", "strada");
		
		parole.stream()
		.filter(n -> n.length() > 3)
		.map(n -> n.toUpperCase())
		.sorted((a, b) -> a.compareTo(b))
		.forEach(n -> System.out.println(n));
	}
}
