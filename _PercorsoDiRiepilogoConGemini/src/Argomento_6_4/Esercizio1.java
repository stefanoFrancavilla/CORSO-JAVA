package Argomento_6_4;

public class Esercizio1 {
public static void main(String[] args){

	
	/*
	 * Esercizio Test: Gestione biblioteca
Aumentiamo la difficoltà usando una mappa con liste di oggetti.

Obiettivo
Crea un programma per gestire i prestiti di una biblioteca.

Ogni utente può prendere in prestito più libri. Per questo userai:

java

Map<String, List<Libro>> prestiti = new HashMap<>();
La chiave sarà il nome dell’utente, mentre il valore sarà la lista dei libri presi in prestito.

Classe Libro
Crea una classe:

java

public class Libro
Attributi
java

private String titolo;
private String autore;
private int pagine;
private boolean restituito;
Costruttore
java

public Libro(String titolo, String autore, int pagine)
Quando viene creato un libro, restituito deve iniziare a false.

Metodi
Implementa:

java

public String getTitolo()
java

public String getAutore()
java

public int getPagine()
java

public boolean isRestituito()
java

public void restituisciLibro()
java

public String toString()
Il metodo toString() deve restituire almeno:

titolo;

autore;

numero di pagine;

stato del libro.

Classe GestoreBiblioteca
Crea la classe:

java

public class GestoreBiblioteca
Attributo
java

private Map<String, List<Libro>> prestiti = new HashMap<>();
Metodi obbligatori
Implementa:

java

public void aggiungiPrestito(String utente, Libro libro)
Il metodo deve aggiungere un libro alla lista dell’utente. Se l’utente non esiste, deve creare la lista.

java

public void restituisciLibro(String utente, String titolo)
Il metodo deve cercare il libro dell’utente tramite il titolo e marcarlo come restituito.

java

public int calcolaPaginePrestate(String utente)
Deve restituire il totale delle pagine dei libri ancora non restituiti.

java

public int contaLibriNonRestituiti(String utente)
Deve restituire il numero dei libri ancora in prestito.

java

public void stampaPrestiti()
Deve stampare, per ogni utente:

nome dell’utente;

lista dei libri;

numero dei libri non restituiti;

totale delle pagine ancora prestate.

Metodi extra
Implementa, se riesci:

java

public String trovaUtenteConPiuLibri()
Deve restituire l’utente con il maggior numero di libri non restituiti.

java

public Libro trovaLibro(String utente, String titolo)
Deve restituire il libro trovato oppure null se non esiste.

java

public boolean esisteUtente(String utente)
Deve controllare se l’utente è presente nella mappa.

java

public void stampaLibriDiAutore(String utente, String autore)
Deve stampare soltanto i libri dell’utente scritti dall’autore indicato.

Gestione dei casi particolari
Il programma deve gestire correttamente:

utente inesistente;

utente senza libri;

titolo non trovato;

restituzione di un libro già restituito;

lista vuota;

pagine con valore minore o uguale a zero.

Puoi decidere tu se ignorare i dati non validi oppure stampare un messaggio.

Classe Main
Crea una classe:

java

public class Main
Nel metodo main devi:

creare almeno 4 oggetti Libro;

creare almeno 3 utenti;

assegnare almeno 2 libri a ogni utente;

restituire almeno un libro;

stampare i prestiti;

testare i metodi extra.

Struttura dei file
Organizza il progetto in questo modo:

text

Libro.java
GestoreBiblioteca.java
Main.java
Vincoli
Non usare ancora:

database;

ereditarietà;

stream obbligatori;

classi anonime;

framework esterni.

Puoi usare:

java

Map
HashMap
List
ArrayList
for
for-each
if
Suggerimento logico
Per lavorare sui libri di un utente dovrai:

recuperare la lista dalla mappa;

controllare se la lista esiste;

scorrere i libri;

confrontare il titolo usando equals();

controllare lo stato restituito;

aggiornare o calcolare il risultato richiesto.
	 */
	
	
	
	
	
 }
}