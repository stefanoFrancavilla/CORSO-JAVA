package Esercizi_1;

import java.util.ArrayList;
import java.util.List;

public class Esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO 1: Ordina la lista per lunghezza della stringa (dalla più corta alla più lunga)
        // usando citta.sort(...) passando una LAMBDA che riceve due stringhe (s1, s2).
        

        // TODO 2: Rimuovi dalla lista tutte le città che finiscono con la lettera "i"
        // usando il metodo citta.removeIf(...) passando una LAMBDA (Predicate).
        

        // TODO 3: Stampa ciascuna città rimasta su una riga separata
        // usando citta.forEach(...) con una LAMBDA.

		List<String> citta = 
	new ArrayList<>(List.of("Roma", "Milano", "Napoli", "Torino", "Bari"));
		
		citta.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		citta.removeIf(cittaCorrente -> cittaCorrente.endsWith("i"));
		
		citta.forEach(cittaCorrente -> System.out.println(cittaCorrente));
		
	}

}
