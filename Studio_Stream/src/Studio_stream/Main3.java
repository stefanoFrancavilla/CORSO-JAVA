package Studio_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 * Sì.

E ti dirò una cosa: secondo me sei arrivato al punto in cui gli esercizi "trova i maggiorenni" non ti fanno più crescere.

Li risolvi ormai quasi automaticamente.

Adesso bisogna fare quello che fanno i programmatori quando imparano davvero una tecnologia:

ricevere una richiesta di business e progettare la pipeline.

Quindi ti propongo un mini-esame sugli Stream.

Non è un quiz.

È una simulazione di richieste reali.

Regole dell'esame

Hai sempre questa classe.

class Persona {

    private String nome;
    private int eta;
    private String reparto;
    private int stipendio;

    // getter
}

e sempre questa lista.

List<Persona> persone = List.of(
    new Persona("Marco",25,"IT",2500),
    new Persona("Luca",17,"HR",1200),
    new Persona("Anna",32,"IT",3200),
    new Persona("Sara",28,"Marketing",2700),
    new Persona("Paolo",45,"IT",4100),
    new Persona("Giulia",19,"HR",1800),
    new Persona("Marco",25,"IT",2500),
    new Persona("Elena",37,"Marketing",3500),
    new Persona("Davide",22,"IT",2100),
    new Persona("Francesca",29,"HR",2600)
);
Livello 1 (facile)
Esercizio 1

Il direttore vuole sapere

i nomi ordinati alfabeticamente dei dipendenti IT che guadagnano almeno 2500 euro.

Esercizio 2

Vuole sapere

quanti dipendenti ci sono per ogni reparto.

Esercizio 3

Vuole sapere

la media degli stipendi di ogni reparto.

Livello 2
Esercizio 4

Per ogni reparto vuole

il nome del dipendente più anziano.

Attenzione.

Non vuole la Persona.

Vuole il nome.

Esercizio 5

Per ogni reparto vuole

l'elenco alfabetico dei nomi separati da virgola.

Esempio

IT

Anna, Davide, Marco, Marco, Paolo
Esercizio 6

Vuole sapere

se esiste almeno un reparto in cui tutti guadagnano più di 2000 euro.

Qui non basta uno Stream lineare.

Devi ragionare.

Livello 3
Esercizio 7

Trova il reparto con lo stipendio medio più alto.

Il risultato deve essere

IT

oppure

Marketing

ecc.

Non il valore.

Il reparto.

Esercizio 8

Trova il reparto che ha il maggior numero di dipendenti.

Esercizio 9

Costruisci

Map<String,Integer>

dove

chiave = reparto

valore = somma stipendi

poi stampa il reparto con il valore più alto.

Livello 4

Qui inizia il ragionamento.

Esercizio 10

Il direttore dice:

Voglio tutti i nomi dei dipendenti che lavorano in reparti la cui media degli stipendi supera i 2500 euro.

Qui uno Stream solo non basta.

Devi progettare.

Esercizio 11

Voglio i tre stipendi più alti dell'intera azienda.

Poi voglio la loro somma.

Esercizio 12

Voglio il numero totale di maggiorenni per reparto.

Livello 5 (Senior)

Questi sono quelli che potresti trovare ad un colloquio.

Esercizio 13

Senza usare cicli.

Senza creare liste temporanee.

Costruisci

Map<Boolean,List<String>>

dove

true

↓

nomi dei maggiorenni

false

↓

nomi dei minorenni

Se durante il percorso hai pensato:

"Qui groupingBy() è un po' strano..."

sei sulla strada giusta.

Esercizio 14

Per ogni reparto costruisci

Map<String,Long>

contenente il numero di dipendenti.

Poi ordina la mappa per numero di dipendenti decrescente.

Esercizio 15 (Il più difficile)

Voglio ottenere questo.

IT

Numero dipendenti: 5

Media stipendio: ...

Stipendio massimo: ...

Nomi:

Marco

Anna

Davide

...

-------------------------

HR

...

Non serve un'unica pipeline.

Serve progettare.

Questo esercizio misura il ragionamento, non la memoria.
 */
		
		List<Persona> persone = List.of(
			    new Persona("Marco",25,"IT",2500),
			    new Persona("Luca",17,"HR",1200),
			    new Persona("Anna",32,"IT",3200),
			    new Persona("Sara",28,"Marketing",2700),
			    new Persona("Paolo",45,"IT",4100),
			    new Persona("Giulia",19,"HR",1800),
			    new Persona("Marco",25,"IT",2500),
			    new Persona("Elena",37,"Marketing",3500),
			    new Persona("Davide",22,"IT",2100),
			    new Persona("Francesca",29,"HR",2600)
			);
		
		//Esercizio 1
		
	
		List<Persona> esercizio1 =
				persone.stream()
				.filter(p -> "IT".equals(p.getReparto()))
				.filter(p -> p.getStipendio() >= 2500)
				.sorted(Comparator.comparing(Persona::getNome))
				.toList();
		        System.out.println(esercizio1); 
		        
				System.out.println("-----------------------------------------");
				
				
				//Esercizio 2
				
				Map<String, Long> esercizio2 =
						persone.stream()
						.collect(Collectors.groupingBy(Persona::getReparto,
								Collectors.counting()));
				System.out.println(esercizio2);
				System.out.println("-----------------------------------------");
				
				//Esercizio 3
				
				Map<String, Double> esercizio3 =
						persone.stream()
						.collect(Collectors.groupingBy(Persona::getReparto,
								Collectors.averagingDouble(Persona::getStipendio)));
				System.out.println(esercizio3);
				System.out.println("-----------------------------------------");
				
				//Esercizio 4
				
		
				
				
				
				
	}

}
