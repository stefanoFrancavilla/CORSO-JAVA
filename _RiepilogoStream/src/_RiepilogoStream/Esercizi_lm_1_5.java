package _RiepilogoStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esercizi_lm_1_5 {

	public static void main(String[] args) {

		
		
		List<String> lista1 = List.of("Banana", "Mele", "Pere", "Arance");
		List<String> lista2 = List.of("Cipolle", "Ricotta", "Carote", "Latte");

		
		List<String> risultato = Stream.concat(lista1.stream(), lista2.stream())
				.filter(n -> !"Latte".equals(n))
				.sorted()
				.collect(Collectors.toList());
				risultato.forEach(n -> System.out.println(n));
	}
	
	/*
	 * Contesto: Analisi dei dati di un magazzino.
Descrizione: Crea due liste di prodotti:

Lista 1: "Banana", "Mele", "Pere", "Arance"
Lista 2: "Cipolle", "Ricotta", "Carote", "Latte"
Requisiti:

Crea due stream da queste liste.
Concatena i due stream in un solo stream.
Filtra solo gli alimenti (escludendo "Latte").
Ordina gli alimenti alfabeticamente.
Stampa i risultati.
	 */

}
