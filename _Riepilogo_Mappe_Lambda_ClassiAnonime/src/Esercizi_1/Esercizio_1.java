package Esercizi_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Esercizio_1 {
	
	 // TODO: Se la parola esiste già nella mappa, incrementa il suo contatore di 1.
    // Se non esiste, inseriscila con valore 1.
    // Suggerimento: puoi farlo con getOrDefault oppure con containsKey/put.

		    public static Map<String, Integer> contaFrequenze(List<String> parole) {
		        Map<String, Integer> mappaFrequenze = new HashMap<>();
		        
		        
		        for (String parola : parole) {
		            if (mappaFrequenze.containsKey(parola)) {
		                int counter = mappaFrequenze.get(parola);
		                counter++;
		                mappaFrequenze.put(parola, counter);
		            } else {
		                mappaFrequenze.put(parola, 1);
		            }
		        }
		        return mappaFrequenze;
		    }

		    public static void main(String[] args) {
		        List<String> dati = List.of("mela", "pera", "mela", "arancia", "mela", "pera");
		        System.out.println(contaFrequenze(dati));
		        // Output atteso: {mela=3, arancia=1, pera=2}
		    }
		
	}


