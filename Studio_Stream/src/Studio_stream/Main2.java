package Studio_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Mi piace questa idea, e penso che sia il momento giusto.

Fino ad ora abbiamo costruito il perché degli Stream.

Adesso dobbiamo costruire quella che io chiamo memoria muscolare.

Uno sviluppatore che usa bene gli Stream non pensa:

"Come si scrive filter()?"

Pensa:

"Mi serve filtrare."

E le dita scrivono quasi da sole.

Quindi cambiamo completamente approccio.

Niente più classi nuove ogni esercizio.

Useremo sempre la stessa lista, aumentando gradualmente la difficoltà.

Dataset unico

Userai sempre questo.

List<Persona> persone = List.of(
    new Persona("Marco", 25, "IT", 2500),
    new Persona("Luca", 17, "HR", 1200),
    new Persona("Anna", 32, "IT", 3200),
    new Persona("Sara", 28, "Marketing", 2700),
    new Persona("Paolo", 45, "IT", 4100),
    new Persona("Giulia", 19, "HR", 1800),
    new Persona("Marco", 25, "IT", 2500),
    new Persona("Elena", 37, "Marketing", 3500),
    new Persona("Davide", 22, "IT", 2100),
    new Persona("Francesca", 29, "HR", 2600)
);

Supponiamo che Persona abbia:

nome
eta
reparto
stipendio
BLOCCO 1 — Filter
Esercizio 1

Stampa tutti i maggiorenni.

Esercizio 2

Stampa tutti quelli del reparto IT.

Esercizio 3

Stampa i dipendenti IT con stipendio superiore a 3000.

Esercizio 4

Stampa tutti quelli che NON lavorano in HR.

Esercizio 5

Stampa i maggiorenni del Marketing.

BLOCCO 2 — Map
Esercizio 6

Stampa solo i nomi.

Esercizio 7

Stampa solo gli stipendi.

Esercizio 8

Ottieni una lista con tutti i reparti.

Esercizio 9

Stampa nome ed età come

Marco - 25
BLOCCO 3 — Distinct
Esercizio 10

Stampa tutti i nomi senza duplicati.

Esercizio 11

Stampa tutti i reparti senza duplicati.

BLOCCO 4 — Sorted
Esercizio 12

Ordina i nomi alfabeticamente.

Esercizio 13

Ordina per età crescente.

Esercizio 14

Ordina per età decrescente.

Esercizio 15

Ordina per stipendio.

Esercizio 16

Ordina prima per reparto e poi per nome.

(Qui scoprirai una cosa nuova su Comparator.)

BLOCCO 5 — Limit e Skip
Esercizio 17

Stampa i primi tre.

Esercizio 18

Salta i primi cinque.

Esercizio 19

Ordina per età e stampa solo i tre più anziani.

Esercizio 20

Ordina alfabeticamente e stampa dal quarto nome in poi.

BLOCCO 6 — Count
Esercizio 21

Quanti lavorano in IT?

Esercizio 22

Quanti sono maggiorenni?

Esercizio 23

Quanti guadagnano almeno 3000?

BLOCCO 7 — Match
Esercizio 24

Esiste qualcuno minorenne?

Esercizio 25

Sono tutti maggiorenni?

Esercizio 26

Nessuno lavora in Amministrazione?

Esercizio 27

Esiste qualcuno che guadagna più di 5000?

BLOCCO 8 — FindFirst
Esercizio 28

Trova il primo dipendente IT.

Esercizio 29

Trova il primo maggiorenne.

Esercizio 30

Trova il primo che guadagna almeno 3000.

BLOCCO 9 — Max e Min
Esercizio 31

Trova il più anziano.

Esercizio 32

Trova il più giovane.

Esercizio 33

Trova lo stipendio massimo.

(Non la Persona. Lo stipendio.)

Esercizio 34

Trova il nome alfabeticamente più piccolo.

BLOCCO 10 — Reduce
Esercizio 35

Somma di tutti gli stipendi.

Esercizio 36

Somma di tutte le età.

Esercizio 37

Concatena tutti i nomi.

Esercizio 38

Trova lo stipendio totale del reparto IT.

BLOCCO 11 — Pipeline complete

Qui inizia il vero allenamento.

Esercizio 39

Maggiorenni

↓

nomi

↓

senza duplicati

↓

ordinati

↓

lista finale.

Esercizio 40

Reparto IT

↓

stipendio >2500

↓

nomi

↓

ordinati

↓

primi due.

Esercizio 41

Marketing

↓

ordina per stipendio decrescente

↓

estrai i nomi

↓

stampa.

Esercizio 42

Maggiorenni

↓

ordina per età

↓

salta i primi due

↓

prendi i successivi tre

↓

stampa.

Esercizio 43

Tutti i reparti

↓

senza duplicati

↓

ordinati.

Esercizio 44

Tutti gli stipendi

↓

ordina

↓

prendi i cinque più alti

↓

somma.

BLOCCO 12 — Per iniziare a ragionare da senior

Questi sono gli esercizi che, secondo me, ti faranno fare il salto di qualità.

Esercizio 45

Scrivi la pipeline nel modo più leggibile possibile.

Non la più corta.

La più leggibile.

Esercizio 46

Prendi una pipeline funzionante e prova a migliorarla.

Meno codice.

Stesso risultato.

Esercizio 47

Guarda una pipeline e dimmi:

dove cambia il tipo dello Stream?

Ad esempio:

Stream<Persona>

↓

Stream<String>

↓

Stream<Integer>

Questo esercizio ti renderà molto forte con map().

Esercizio 48

Per ogni esercizio chiediti:

Questa operazione è intermedia o terminale?

Deve diventare automatico.
 */
		

List<Persona> persone = List.of(
    new Persona("Marco", 25, "IT", 2500),
    new Persona("Luca", 17, "HR", 1200),
    new Persona("Anna", 32, "IT", 3200),
    new Persona("Sara", 28, "Marketing", 2700),
    new Persona("Paolo", 45, "IT", 4100),
    new Persona("Giulia", 19, "HR", 1800),
    new Persona("Marco", 25, "IT", 2500),
    new Persona("Elena", 37, "Marketing", 3500),
    new Persona("Davide", 22, "IT", 2100),
    new Persona("Francesca", 29, "HR", 2600)
);

//Blocco 1
//Esercizio 1

persone.stream()
.filter(p -> p.getEta() >= 18)
.forEach(System.out::println);

System.out.println("-----------------------------------------");
//Esercizio 2

persone.stream()
.filter(p -> p.getReparto().equalsIgnoreCase("IT"))
.forEach(System.out::println);

System.out.println("-----------------------------------------");

//Esercizio 3

persone.stream()
.filter(p -> p.getReparto().equalsIgnoreCase("IT"))
.filter(p -> p.getStipendio() > 3000)
.forEach(System.out::println);

System.out.println("-----------------------------------------");
//Esercizio 4

String repartoEscluso = "HR";

persone.stream()
.filter(p -> !repartoEscluso.equalsIgnoreCase(p.getReparto()))
.forEach(System.out::println);
System.out.println("-----------------------------------------");

//Esercizio 5

persone.stream()
.filter(p -> p.getReparto().equalsIgnoreCase("Marketing"))
.filter(p -> p.getEta() >= 18)
.forEach(System.out::println);

System.out.println("-----------------------------------------");

//BLOCCO 2
//Esercizio 6

persone.stream()
.map(Persona::getNome)
.forEach(nome -> System.out.println(nome));
System.out.println("-----------------------------------------");

//Esercizio 7

persone.stream()
.map(Persona::getStipendio)
.forEach(stipendio -> System.out.println(stipendio));
System.out.println("-----------------------------------------");

//Esercizio 8

persone.stream()
.map(Persona::getReparto)
.toList();
System.out.println("-----------------------------------------");
//Esercizio 9

persone.stream()
.forEach(p -> System.out.println(p.getNome() + " - " + p.getEta()));
System.out.println("-----------------------------------------");
//BLOCCO 3
//Esercizio 10

persone.stream()
.distinct()
.forEach(p -> System.out.println(p.getNome()));
System.out.println("-----------------------------------------");

//Esercizio 11
persone.stream()
.map(Persona::getReparto)
.distinct()
.forEach(reparto -> System.out.println(reparto));

System.out.println("-----------------------------------------");

//BLOCCO 4
//Esercizio 12
persone.stream()
.map(Persona::getNome)
.sorted()
.forEach(nome -> System.out.println(nome));

System.out.println("-----------------------------------------");

//Esercizio 13

persone.stream()
.map(Persona::getEta)
.sorted()
.forEach(eta -> System.out.println(eta));
System.out.println("-----------------------------------------");

//Esercizio 14
persone.stream()
.sorted(Comparator.comparingInt(Persona::getEta).reversed())
.forEach(p -> System.out.println( p.getEta()));
System.out.println("-----------------------------------------");
//Esercizio 15

persone.stream()
.map(Persona::getStipendio)
.sorted()
.forEach(stipendio -> System.out.println(stipendio));
System.out.println("-----------------------------------------");

 //Esercizio 16
persone.stream()
.sorted(Comparator.comparing(Persona::getReparto).thenComparing(Persona::getNome))
.forEach(p -> System.out.println(p.getReparto() + " " + p.getNome()));
System.out.println("-----------------------------------------");

//Blocco 5
// Esercizio 17

persone.stream()
.limit(3)
.forEach(System.out::println);
System.out.println("-----------------------------------------");
// Esercizio 18

persone.stream()
.skip(5)
.forEach(System.out::println);
System.out.println("-----------------------------------------");

//Esercizio 19

persone.stream()
.sorted(Comparator.comparing(Persona::getEta).reversed())
.limit(3)
.forEach(p -> System.out.println(p.getEta()));
System.out.println("-----------------------------------------");

//Esercizio 20

persone.stream()
.sorted(Comparator.comparing(Persona::getNome))
.skip(4)
.forEach(System.out::println);
System.out.println("-----------------------------------------");


//Blocco 6
//Esercizio 21

long personeCheLavoranoInIt =
persone.stream()
.filter(p -> "IT".equals(p.getReparto()))
.count();

System.out.println(personeCheLavoranoInIt);
System.out.println("-----------------------------------------");

//Esercizio 22

long numeroMaggiorenni = 
persone.stream()
.filter(p-> p.getEta() >= 18)
.count();
System.out.println(numeroMaggiorenni);
System.out.println("-----------------------------------------");

//Esercizio 23

long numeroPersoneCon3000Euro = 
persone.stream()
.filter(p -> p.getStipendio() >= 3000)
.count();
System.out.println(numeroPersoneCon3000Euro);
System.out.println("-----------------------------------------");

//BLOCCO 7
//Esercizio 24

boolean esisteMinorenne =
persone.stream()
.anyMatch(p -> p.getEta() < 18);
System.out.println(esisteMinorenne);
System.out.println("-----------------------------------------");

//Esercizio 25

boolean tuttiMaggiorenni = 
persone.stream()
.allMatch(p -> p.getEta() >= 18);
System.out.println(tuttiMaggiorenni);
System.out.println("-----------------------------------------");
//Esercizio 26

boolean nessunoLavoranoInAmministrazione = 
persone.stream()
.noneMatch(p -> "Amministrazione".equals(p.getReparto()));
System.out.println(nessunoLavoranoInAmministrazione);
System.out.println("-----------------------------------------");

// Esercizio 27


boolean esistePiu5000 = 
persone.stream()
.allMatch(p -> p.getStipendio() > 5000);
System.out.println(esistePiu5000);
System.out.println("-----------------------------------------");


//BLOCCO 8
//Esercizio 28

Optional<Persona> primoDipendenteIT = 
persone.stream()
.filter(p -> "IT".equals(p.getReparto()))
.findFirst();
System.out.println(primoDipendenteIT);
System.out.println("-----------------------------------------");

//Esercizio 29
Optional<Persona> primoMaggiorenne =
persone.stream()
.filter(p -> p.getEta() >= 18)
.findFirst();

System.out.println(primoMaggiorenne);
System.out.println("-----------------------------------------");

//Esercizio 30

Optional<Persona> primoAlmeno3000 =

persone.stream()
.filter(p -> p.getStipendio() >= 3000)
.findFirst();
System.out.println(primoAlmeno3000);
System.out.println("-----------------------------------------");

//BLOCCO 9
//Esercizio 31

Optional<Persona> primopiuAnziano =
persone.stream()
.max(Comparator.comparing(Persona::getEta));
System.out.println(primopiuAnziano);
System.out.println("-----------------------------------------");


//Esercizio 32

Optional<Persona> piuGiovane =
persone.stream()
.min(Comparator.comparing(Persona::getEta));
System.out.println(piuGiovane);
System.out.println("-----------------------------------------");


//Esercizio 33

int stipendioMassimo =
persone.stream()
.map(Persona::getStipendio)
.max(Integer::compareTo)
.orElse(0);

System.out.println(stipendioMassimo);
System.out.println("-----------------------------------------");

//Esercizio 34

Optional<Persona> nomePiuPiccolo =
persone.stream()
.min(Comparator.comparing(Persona::getNome));
System.out.println(nomePiuPiccolo);
System.out.println("-----------------------------------------");

//Blocco 10

//Esercizio 35

int sommaStipendi = 
persone.stream()
.map(Persona::getStipendio)
.reduce(0, Integer::sum);
System.out.println(sommaStipendi);
System.out.println("-----------------------------------------");

//Esercizio 36

int sommaEta = 
persone.stream()
.map(Persona::getEta)
.reduce(0, Integer::sum);
System.out.println(sommaEta);
System.out.println("-----------------------------------------");

//Esercizio 37








	}

}
