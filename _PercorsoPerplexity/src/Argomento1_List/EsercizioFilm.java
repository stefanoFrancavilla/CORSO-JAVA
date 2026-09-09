package Argomento1_List;

public class EsercizioFilm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2/5 — Gestione film
Crea un piccolo programma per gestire una lista di film.

File richiesti
Crea questi 3 file:

text

Film.java
GestoreFilm.java
EsercizioFilm.java
Classe Film
La classe Film deve contenere questi attributi:

java

private String titolo;
private String regista;
private int durata;
private boolean visto;
Costruttore richiesto
java

public Film(String titolo, String regista, int durata)
Regola:

visto deve partire da false.

Metodi richiesti
java

getTitolo()
setTitolo(String titolo)

getRegista()
setRegista(String regista)

getDurata()
setDurata(int durata)

isVisto()
setVisto(boolean visto)

segnaComeVisto()
toString()
Controlli consigliati
durata deve essere maggiore di 0;

titolo e regista non dovrebbero essere null o vuoti.

Non è obbligatorio fare tutto perfetto al primo colpo, ma prova già a ragionare su questi casi.

Classe GestoreFilm
Deve contenere:

java

private List<Film> film = new ArrayList<>();
Metodi richiesti
Implementa questi metodi:

java

aggiungiFilm(Film film)
segnaFilmComeVisto(String titolo)
cercaFilm(String titolo)
calcolaDurataTotale()
trovaFilmPiuLungo()
trovaFilmPiuCorto()
contaFilmVisti()
stampaFilm()
stampaFilmVisti()
stampaFilmNonVisti()
Cosa devono fare i metodi
aggiungiFilm(Film film)
Deve:

aggiungere un film alla lista;

controllare se l’oggetto è null;

evitare di aggiungere due film con lo stesso titolo, se vuoi introdurre questo controllo.

segnaFilmComeVisto(String titolo)
Deve:

cercare il film dal titolo;

se lo trova, impostare visto = true;

se non lo trova, stampare un messaggio adatto;

se è già visto, gestire anche quel caso.

cercaFilm(String titolo)
Puoi farlo restituire:

boolean, se vuoi solo sapere se esiste;

oppure Film, se vuoi restituire direttamente l’oggetto trovato.

Per questo esercizio ti consiglio:

java

public Film cercaFilm(String titolo)
Così ti alleni anche con null.

calcolaDurataTotale()
Deve sommare la durata di tutti i film nella lista.

trovaFilmPiuLungo()
Deve restituire il film con durata massima.

trovaFilmPiuCorto()
Deve restituire il film con durata minima.

contaFilmVisti()
Deve restituire quanti film hanno visto == true.

stampaFilm()
Deve stampare tutti i film, uno per riga.
Qui toString() sarà molto utile, perché senza ridefinirlo Java stamperebbe una rappresentazione poco leggibile dell’oggetto.
docs.oracle
+1

stampaFilmVisti()
Deve stampare solo i film già visti.

stampaFilmNonVisti()
Deve stampare solo i film non ancora visti.

Dati obbligatori nel main



Nel main crea almeno 6 film, per esempio:

uno di durata breve;

uno di durata molto lunga;

almeno 2 film dello stesso regista;

almeno 2 film inizialmente non visti;

almeno 1 film che poi segnerai come visto.

Test obbligatori nel main
Nel main devi provare almeno queste operazioni:

java

stampaFilm();

calcolaDurataTotale();

trovaFilmPiuLungo();

trovaFilmPiuCorto();

cercaFilm("titolo esistente");

cercaFilm("titolo inesistente");

segnaFilmComeVisto("titolo esistente");

segnaFilmComeVisto("titolo già visto");

segnaFilmComeVisto("titolo inesistente");

contaFilmVisti();

stampaFilmVisti();

stampaFilmNonVisti();
Casi da controllare
Durante la scrittura, fai attenzione a questi punti:

lista vuota;

oggetto Film nullo in aggiungiFilm;

titolo non trovato;

film già visto;

massimo e minimo inizializzati col primo elemento della lista;

toString() scritto bene.

Piccola sfida extra
Se vuoi aumentare un po’ la difficoltà, aggiungi anche:

java

stampaFilmDiRegista(String regista)
Deve stampare solo i film di quel regista.

Obiettivo didattico
Con questo esercizio alleni insieme:

List<Oggetto>;

classi separate;

costruttore;

getter e setter;

metodo toString();

ricerca nella lista;

confronto tra stringhe con equals();

gestione di null;

massimo e minimo su oggetti;

logica più vicina a progetti reali.
		 */
		
		Film film1 = new Film("Cuore", "Marco", 19);
		Film film2 = new Film("Tempersta", "Marco", 60);
		Film film3 = new Film("Pioggia", "Anna", 47);
		Film film4 = new Film("Sole", "Luca", 90);
		Film film5 = new Film("Mare", "Vito", 120);
		Film film6 = new Film("Neve", "Marco", 200);
		
		film6.setVisto(true);
		
		GestoreFilm film = new GestoreFilm();
		
		film.aggiungiFilm(film1);
		film.aggiungiFilm(film2);
		film.aggiungiFilm(film3);
		film.aggiungiFilm(film4);
		film.aggiungiFilm(film5);
		film.aggiungiFilm(film6);
		
		film.stampaFilm();
		System.out.println("La durata totale è: " + film.calcolaDurataTotale());
		System.out.println("Il film più lungo è: " + film.trovaFilmPiuLungo());
		System.out.println("Il film più corto è: " + film.trovaFilmPiuCorto());
		
		String titoloEsistente = "Sole";
		String titoloInesistente = "Luna";
		String filmVisto = "Neve";
		
		System.out.println(film.cercaFilm(titoloEsistente));
		System.out.println(film.cercaFilm(titoloInesistente));
		
		film.segnaComeFilmVisto(titoloEsistente);
		film.segnaComeFilmVisto(titoloInesistente);
		film.segnaComeFilmVisto(filmVisto);
		
		
	}

}
