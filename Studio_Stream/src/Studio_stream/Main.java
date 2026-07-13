package Studio_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * dipendenti.stream()
			.filter(d -> d.getStipendio() >= 2500)
			.filter(d -> d.getReparto().equals("IT"))
			.map(Dipendente::getNome)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		 */
//	List<Persona> persone = List.of(
//	        new Persona("Anna", 17),
//	        new Persona("Marco", 25),
//	        new Persona("Luca", 30),
//	        new Persona("Giulia", 15),
//	        new Persona("Sara", 40)
//	);
//	
//	List<Persona> personeMaggiorenni = new ArrayList<>();
//	
//	for(int i = 0; i < persone.size(); i ++)
//	{
//		if (persone.get(i).getEta() >= 18)
//		{
//			personeMaggiorenni.add(persone.get(i));
//		}	
//	}
//	
//	for(Persona persona : personeMaggiorenni)
//	{
//		System.out.println(persona);
//	}
		
		/*
		 * Parto dalla lista di Dipendenti

↓

Tengo solo quelli con stipendio ≥ 2500

↓

Tengo solo quelli del reparto IT

↓

Estraggo i nomi

↓

Elimino i nomi duplicati

↓

Ordino alfabeticamente

↓

Raccolgo il risultato in una List<String>
		 */

		
		List<Dipendente> dipendenti = List.of(
			    new Dipendente("Marco", "IT", 2500),
			    new Dipendente("Luca", "HR", 1800),
			    new Dipendente("Anna", "IT", 3200),
			    new Dipendente("Sara", "Marketing", 2700),
			    new Dipendente("Marco", "IT", 2500),
			    new Dipendente("Paolo", "IT", 1900),
			    new Dipendente("Giulia", "HR", 2600)
			);
		
		dipendenti.stream()
			.filter(d -> d.getStipendio() >= 2500)
			.filter(d -> d.getReparto().equals("IT"))
			.map(Dipendente::getNome)
			.distinct()
			.sorted()
			.forEach(System.out::println);
			
//"Voglio i titoli dei libri con almeno 400 pagine, senza duplicati e ordinati."
		List<Libro> libri = List.of(
			    new Libro("Clean Code", "Martin", 450),
			    new Libro("Effective Java", "Bloch", 380),
			    new Libro("Java Concurrency", "Goetz", 550),
			    new Libro("Clean Code", "Martin", 450),
			    new Libro("Design Patterns", "Gamma", 395),
			    new Libro("Refactoring", "Fowler", 470)
			);
		//Esercizio 2
		libri.stream()
		.filter(l -> l.getPagine() >= 400)
	    .map(Libro::getTitolo)
	    .distinct()
	    .sorted()
	    .forEach(System.out::println);
		
		//Esercizio 3
		
		List<Prodotto> prodotti = List.of(
				new Prodotto("PlayStation", "Elettronica", 850),
				new Prodotto("PC", "Elettronica", 1850),
				new Prodotto("Muta", "Sportivi", 350),
				new Prodotto("Canoa", "Sportivi", 1050),
				new Prodotto("Giacca", "Abbigliamento", 300),
				new Prodotto("Vestito", "Abbigliamento", 450));
		Boolean prodottoCostoso =
		prodotti.stream()
		.anyMatch(p -> p.getPrezzo() > 1000);
		System.out.println(prodottoCostoso);
		
		//Esercizio 4
		
		List<Studente>studenti = List.of(
				new Studente("Marco", 16),
				new Studente("Luca", 19),
				new Studente("Anna", 22),
				new Studente("Sara", 29),
				new Studente("Paolo", 16));
		
		Boolean studentiPromossi =
				studenti.stream()
				.allMatch(s -> s.getMedia() >= 18);
		System.out.println(studentiPromossi);
		
		//Esercizio 5

		List<Paziente> pazienti = List.of(
				new Paziente("Marco", 25 ),
				new Paziente("Luca", 30 ),
				new Paziente("Anna", 28 ),
				new Paziente("Sara", 35),
				new Paziente("Paolo", 45));
		
		Paziente paziente =
				pazienti.stream()
				.max(Comparator.comparing(Paziente::getEta))
				.get();
		System.out.println(paziente.getNome() + " " + paziente.getEta());
		
		//Esercizio 6
		
		Double prezzoTotale = 
				prodotti.stream()
				.map(p -> p.getPrezzo())
				.reduce(0.0, Double::sum);
		System.out.println(prezzoTotale);
		
		
		//Esercizio 7
		
		List<Studente> classe1A = 
				List.of(
						new Studente("Marco", 16),
						new Studente("Luca", 19),
						new Studente("Anna", 22)); 
		
		List<Studente> classe1B = 
				List.of(
						new Studente("Paolo", 17),
						new Studente("Nico", 15),
						new Studente("Anna", 25)); 
		
		List<Classe> scuola = List.of(
				new Classe("1A", classe1A),
				new Classe("1B", classe1B));
		
		
		
		scuola.stream()
		.map(s -> s.getStudenti().stream()
		.sorted()
		.toList());
		
		
		
		
		
}
}