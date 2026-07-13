package Studio_stream;

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
	}

}
