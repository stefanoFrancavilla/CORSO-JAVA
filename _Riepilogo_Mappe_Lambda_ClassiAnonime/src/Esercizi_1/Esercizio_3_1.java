package Esercizi_1;

import java.util.ArrayList;
import java.util.List;

public class Esercizio_3_1 {

	public static void main(String[] args) {

		
		List<String> citta = new ArrayList<>(
			    List.of("Roma", "Milano", "Napoli", "Torino", "Bari")
			);
		
		// Esercizio 1
		
		citta.forEach(cittaCorrente -> System.out.println(cittaCorrente));
		
		// Esercizio 2
		
		citta.removeIf(cittaCorrente -> cittaCorrente.length() < 6);
		System.out.println(citta);
		
		// Esrecizio 3
		
		citta.replaceAll(cittaCorrente -> cittaCorrente.toUpperCase());
		System.out.println(citta);
		// Esercizio 4
		
		citta.sort((a, b) -> b.compareTo(a) );
		System.out.println(citta);
		// Esercizio 5
		
		citta.removeIf(cittaCorrente -> cittaCorrente.contains("N") || cittaCorrente.contains("n"));
		System.out.println(citta);
	}

}
