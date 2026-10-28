package Esercizi_1;

import java.util.List;
import java.util.Optional;

public class Esercizi_di_riepilogo_perplexity2 {
	public static void main(String[] args) {

	List<String> prodotti = List.of(
	        "Mouse:25.50",
	        "Tastiera:45.00",
	        "Monitor:180.00",
	        "Cuffie:60.00"
	);
	
	Double totale = prodotti.stream()
			.map(n -> n.split(":")[1])
			.mapToDouble(r -> Double.parseDouble(r))
			.sum();
	
	      System.out.println(totale);
	      
	      
	      
	      
	      System.out.println("----------------------------------");
	      List<String> movimenti = List.of(
	    		    "ENTRATA;1500.00",
	    		    "SPESA;42.50",
	    		    "SPESA;110.00",
	    		    "ENTRATA;200.00",
	    		    "SPESA;18.20"
	    		);
	      
	      Double totaleSpesa = movimenti.stream()
	    		  .filter(n -> n.startsWith("SPESA"))
	    		  .map(r -> r.split(";")[1])
	    		  .mapToDouble(s -> Double.parseDouble(s))
	    		  .sum();
	      
	      
	      System.out.println(totaleSpesa);	  
	      System.out.println("----------------------------------");	
	      
	      List<String> esami = List.of(
	    		    "Marco-28",
	    		    "Sara-15",
	    		    "Luca-30",
	    		    "Anna-17",
	    		    "Elena-24"
	    		);
	      
	      Double media = esami.stream()
	    		  .map(n -> n.split("-")[1])
	    		  .mapToInt(r -> Integer.parseInt(r))
	    		  .filter(n -> n >= 18)
	    		  .average()
	    		  .orElse(0.0);
	      
	      System.out.println(media);
	    		  
	      System.out.println("----------------------------------");	
	      
	      List<String> magazzino = List.of(
	    		    "ART01,10,5.50",   // Valore riga: 55.0
	    		    "ART02,3,120.00",  // Valore riga: 360.0
	    		    "ART03,50,1.20",   // Valore riga: 60.0
	    		    "ART04,2,85.00"    // Valore riga: 170.0
	    		);
	      
	      double valoreMassimo = magazzino.stream()
	              .mapToDouble(riga -> {
	                  String[] p = riga.split(",");
	                  double quantita = Double.parseDouble(p[1]);
	                  double prezzo = Double.parseDouble(p[2]);
	                  return quantita * prezzo;
	              })
	              .max()
	              .orElse(0.0);

	          System.out.println("Valore massimo riga: " + valoreMassimo); // 360.0
	      
	      
	      
 }
}