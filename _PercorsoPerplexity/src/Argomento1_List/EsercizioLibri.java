package Argomento1_List;

public class EsercizioLibri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3/5 — Gestione libri in una biblioteca
Crea un programma per gestire una lista di libri in una piccola biblioteca.

File richiesti
Crea questi 3 file:

text

Libro.java
GestoreLibri.java
EsercizioLibri.java
Classe Libro
La classe Libro deve contenere:

java

private String titolo;
private String autore;
private int annoPubblicazione;
private int copieDisponibili;
Costruttore richiesto
java

public Libro(String titolo, String autore, int annoPubblicazione, int copieDisponibili)
Metodi richiesti
java

getTitolo()
setTitolo(String titolo)

getAutore()
setAutore(String autore)

getAnnoPubblicazione()
setAnnoPubblicazione(int annoPubblicazione)

getCopieDisponibili()
setCopieDisponibili(int copieDisponibili)

prestaCopia()
restituisciCopia()
toString()
Controlli consigliati
annoPubblicazione deve essere maggiore di 0;

copieDisponibili deve essere maggiore o uguale a 0;

titolo e autore non dovrebbero essere null o vuoti.

prestaCopia()
Deve:

diminuire di 1 le copie disponibili;

controllare che ci siano copie disponibili;

se non ce ne sono, stampare un messaggio adatto e non modificare il valore.

restituisciCopia()
Deve:

aumentare di 1 le copie disponibili;

opzionalmente puoi controllare che non superi un massimo ragionevole.

toString()
Deve restituire una stringa leggibile con titolo, autore, anno e copie disponibili.

Classe GestoreLibri
Deve contenere:

java

private List<Libro> libri = new ArrayList<>();
Metodi richiesti
Implementa questi metodi:

java

aggiungiLibro(Libro libro)
cercaLibroPerTitolo(String titolo)
cercaLibroPerAutore(String autore)
cercaLibroPerIndice(int indice)
rimuoviLibroPerTitolo(String titolo)
rimuoviLibroPerIndice(int indice)
aggiornaCopie(String titolo, int nuoveCopie)
stampaTuttiLibri()
stampaLibriDisponibili()
stampaLibriEsauriti()
Cosa devono fare i metodi
aggiungiLibro(Libro libro)
Deve:

controllare se l’oggetto è null;

controllare se esiste già un libro con lo stesso titolo;

aggiungere il libro solo se non esiste;

stampare messaggi adatti.

cercaLibroPerTitolo(String titolo)
Deve restituire il primo libro trovato con quel titolo, oppure null se non esiste.

cercaLibroPerAutore(String autore)
Deve restituire una List<Libro> con tutti i libri di quell’autore.

cercaLibroPerIndice(int indice)
Deve restituire il libro all’indice specificato, oppure null se l’indice non è valido.

List.get(int index) restituisce l’elemento nella posizione indicata, ma lancia IndexOutOfBoundsException se l’indice è fuori intervallo, quindi devi controllare prima.
oracle
+1

rimuoviLibroPerTitolo(String titolo)
Deve:

cercare il libro con quel titolo;

rimuoverlo dalla lista se esiste;

stampare messaggi adatti.

Ricorda: remove(Object o) rimuove la prima occorrenza dell’elemento specificato.
oracle
+1

rimuoviLibroPerIndice(int indice)
Deve:

controllare se l’indice è valido;

rimuovere il libro a quell’indice;

stampare messaggi adatti.

Qui userai remove(int index), che rimuove l’elemento in quella posizione e sposta a sinistra gli elementi successivi.
oracle
+1

aggiornaCopie(String titolo, int nuoveCopie)
Deve:

cercare il libro per titolo;

se esiste, aggiornare copieDisponibili;

se non esiste, stampare un messaggio adatto.

stampaTuttiLibri()
Deve stampare tutti i libri, uno per riga.

stampaLibriDisponibili()
Deve stampare solo i libri con copieDisponibili > 0.

stampaLibriEsauriti()
Deve stampare solo i libri con copieDisponibili == 0.

Dati obbligatori nel main
Nel main crea almeno 6 libri, per esempio:

almeno 2 libri dello stesso autore;

almeno 1 libro con copieDisponibili == 0;

almeno 1 libro con molte copie;

almeno 1 libro che poi rimuoverai per titolo;

almeno 1 libro che poi rimuoverai per indice.

Test obbligatori nel main
Nel main devi provare almeno queste operazioni:

java

stampaTuttiLibri();

cercaLibroPerTitolo("titolo esistente");

cercaLibroPerTitolo("titolo inesistente");

cercaLibroPerAutore("nome autore");

cercaLibroPerIndice(0);

cercaLibroPerIndice(100);

rimuoviLibroPerTitolo("titolo esistente");

rimuoviLibroPerTitolo("titolo inesistente");

rimuoviLibroPerIndice(0);

rimuoviLibroPerIndice(100);

aggiornaCopie("titolo esistente", 5);

stampaLibriDisponibili();

stampaLibriEsauriti();
Casi da controllare
Durante la scrittura, fai attenzione a questi punti:

lista vuota;

oggetto Libro nullo in aggiungiLibro;

titolo duplicato;

indice negativo o fuori intervallo;

prestaCopia() con zero copie;

restituisciCopia() con copie che aumentano;

toString() scritto bene.

Piccola sfida extra
Se vuoi aumentare un po’ la difficoltà, aggiungi anche:

java

stampaLibriDiAutoreConAnnoMinimo(String autore, int annoMinimo)
Deve stampare solo i libri di quell’autore pubblicati da un certo anno in poi.

Obiettivo didattico
Con questo esercizio alleni insieme:

List<Oggetto>;

classi separate;

costruttore;

getter e setter;

metodo toString();

ricerca per titolo, autore e indice;

rimozione per oggetto e per indice;

gestione di null e indici non validi;

logica più vicina a progetti reali.
		 */
	}

}
