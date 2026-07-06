package Esercizi_avanzati;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Esercizio_riepilogo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 🟢 Esercizio 1 - Facile (Lambda + Functional Interfaces)

Crea una lista:

List<String> nomi = Arrays.asList("Anna", "Luca", "Federico", "Al");

Svolgi le seguenti operazioni:

Crea un Predicate<String> che verifichi se un nome ha almeno 5 caratteri.
Crea un Function<String, Integer> che restituisca la lunghezza del nome.
Crea un Consumer<String> che stampi il nome in maiuscolo.
Crea un Supplier<String> che restituisca la stringa "Fine elaborazione".

Infine:

usa il Predicate per filtrare i nomi;
sui nomi filtrati usa il Function per ottenere la lunghezza;>
stampa il nome in maiuscolo con il Consumer;
alla fine stampa il messaggio del Supplier.
Output atteso
FEDERICO -> 8
Fine elaborazione
		 */
		
		List<String> nomi = Arrays.asList("Anna", "Luca", "federico", "Al");
		
		Predicate<String> verificaNumeroCaratteri = s -> s.length() >= 5;
		Function <String, Integer> lunghezzaNome = s -> s.length();
		Consumer<String> stampaMaiuscolo = s -> System.out.println(s.toUpperCase());
		Supplier<String> stringaFinale = () -> "Fine elaborazione";
		
		for (String nome : nomi)
		{
			if(verificaNumeroCaratteri.test(nome))
			{
				
				stampaMaiuscolo.accept(nome);
				System.out.println(lunghezzaNome.apply(nome));
				System.out.println(stringaFinale.get());

				
				
			}
		}
	}

}
