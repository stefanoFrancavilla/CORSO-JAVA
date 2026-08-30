package Argomento_6;

import java.util.HashSet;

public class Esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2 (Medio) — Filtro Univocità con Set (HashSet)
Dato un array di stringhe contenente nomi duplicati:

String[] partecipanti = {"Anna", "Luca", "Marco", "Anna", "Giulia", "Luca", "Sara"};

Inserisci tutti i nomi in un HashSet<String>.

Verifica se il nome "Marco" è presente nel Set.

Stampa il numero totale di partecipanti unici e l'elenco dei nomi senza duplicati.
		 */
		
		String[] partecipanti =  {"Anna", "Luca", "Marco", "Anna", "Giulia", "Luca", "Sara"};
		
		HashSet<String> nomiUnici = new HashSet<>();
		
		for(String partecipante : partecipanti)
		{
			nomiUnici.add(partecipante);
		}
		
		if (nomiUnici.contains("Marco"))
		{
			System.out.println("Il nome Marco è presente nell'HashSet" );
		}
		else
		{
			System.out.println("Il nome Marco non è presente nell'HashSet" );
		}
		
		System.out.println("Il numero totale dei partecipanti è: " + partecipanti.length);
		System.out.println("Il numero totale dei partecipanti unici è: " + nomiUnici.size());
		System.out.println(
				nomiUnici.stream().toList());
	}

}
