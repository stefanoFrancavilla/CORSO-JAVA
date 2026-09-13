package Argomento1_List;

public class EsercizioSquadra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * File richiesti
Crea questi 3 file:

text

Giocatore.java
GestoreSquadra.java
EsercizioSquadra.java
Classe Giocatore
La classe Giocatore deve contenere:

java

private String nome;
private String ruolo;
private int numeroMaglia;
private int golSegnati;
Costruttore richiesto
java

public Giocatore(String nome, String ruolo, int numeroMaglia, int golSegnati)
Metodi richiesti
java

getNome()
setNome(String nome)

getRuolo()
setRuolo(String ruolo)

getNumeroMaglia()
setNumeroMaglia(int numeroMaglia)

getGolSegnati()
setGolSegnati(int golSegnati)

segnaGol()
toString()
Controlli richiesti
numeroMaglia deve essere compreso tra 1 e 99 (estremi inclusi);

golSegnati deve essere maggiore o uguale a 0;

nome e ruolo non dovrebbero essere null o vuoti.

segnaGol()
Deve aumentare di 1 i gol segnati.

toString()
Deve restituire una stringa leggibile con nome, ruolo, numero di maglia e gol segnati.

Classe GestoreSquadra
Deve contenere:

java

private List<Giocatore> giocatori = new ArrayList<>();
Metodi richiesti
Implementa questi metodi:

java

aggiungiGiocatore(Giocatore giocatore)
cercaGiocatorePerNome(String nome)
cercaGiocatorePerRuolo(String ruolo)
cercaGiocatorePerNumeroMaglia(int numeroMaglia)
cercaGiocatorePerIndice(int indice)
rimuoviGiocatorePerNome(String nome)
rimuoviGiocatorePerIndice(int indice)
aggiornaGol(String nome, int nuoviGol)
stampaTuttiGiocatori()
stampaGiocatoriPerRuolo(String ruolo)
stampaCapocannoniere()
Cosa devono fare i metodi
aggiungiGiocatore(Giocatore giocatore)
Deve:

controllare se l’oggetto è null;

controllare se esiste già un giocatore con lo stesso nome;

aggiungere il giocatore solo se non esiste;

stampare messaggi adatti.

cercaGiocatorePerNome(String nome)
Deve restituire il primo giocatore trovato con quel nome, oppure null se non esiste.

cercaGiocatorePerRuolo(String ruolo)
Deve restituire una List<Giocatore> con tutti i giocatori di quel ruolo.

cercaGiocatorePerNumeroMaglia(int numeroMaglia)
Deve restituire il primo giocatore trovato con quel numero di maglia, oppure null se non esiste.

cercaGiocatorePerIndice(int indice)
Deve restituire il giocatore all’indice specificato, oppure null se l’indice non è valido.

List.get(int index) restituisce l’elemento nella posizione indicata, ma lancia IndexOutOfBoundsException se l’indice è fuori intervallo, quindi devi controllare prima che indice >= 0 && indice < giocatori.size().
download.java
+1

rimuoviGiocatorePerNome(String nome)
Deve:

cercare il giocatore con quel nome;

rimuoverlo dalla lista se esiste;

stampare messaggi adatti.

Ricorda: remove(Object o) rimuove la prima occorrenza dell’elemento specificato.
download.java
+1

rimuoviGiocatorePerIndice(int indice)
Deve:

controllare se l’indice è valido;

rimuovere il giocatore a quell’indice;

stampare messaggi adatti.

Qui userai remove(int index), che rimuove l’elemento in quella posizione e sposta a sinistra gli elementi successivi.
download.java
+1

aggiornaGol(String nome, int nuoviGol)
Deve:

cercare il giocatore per nome;

se esiste, sommare nuoviGol ai gol già segnati;

se non esiste, stampare un messaggio adatto.

stampaTuttiGiocatori()
Deve stampare tutti i giocatori, uno per riga.

stampaGiocatoriPerRuolo(String ruolo)
Deve stampare solo i giocatori con quel ruolo.

stampaCapocannoniere()
Deve stampare il giocatore con più gol segnati. Se la lista è vuota, stampare un messaggio adatto.

Dati obbligatori nel main
Nel main crea almeno 6 giocatori, per esempio:

almeno 2 giocatori dello stesso ruolo;

almeno 1 giocatore con golSegnati == 0;

almeno 1 giocatore con molti gol;

almeno 1 giocatore che poi rimuoverai per nome;

almeno 1 giocatore che poi rimuoverai per indice.

Esempio di dati possibili:

text

nome: "Rossi", ruolo: "Attaccante", numeroMaglia: 9, golSegnati: 15
nome: "Bianchi", ruolo: "Attaccante", numeroMaglia: 10, golSegnati: 12
nome: "Verdi", ruolo: "Difensore", numeroMaglia: 4, golSegnati: 1
nome: "Neri", ruolo: "Centrocampista", numeroMaglia: 8, golSegnati: 5
nome: "Gialli", ruolo: "Portiere", numeroMaglia: 1, golSegnati: 0
nome: "Viola", ruolo: "Attaccante", numeroMaglia: 11, golSegnati: 8
Test obbligatori nel main
Nel main devi provare almeno queste operazioni:

java

stampaTuttiGiocatori();

cercaGiocatorePerNome("Rossi");

cercaGiocatorePerNome("Nome inesistente");

cercaGiocatorePerRuolo("Attaccante");

cercaGiocatorePerNumeroMaglia(10);

cercaGiocatorePerIndice(0);

cercaGiocatorePerIndice(100);

rimuoviGiocatorePerNome("Viola");

rimuoviGiocatorePerNome("Nome inesistente");

rimuoviGiocatorePerIndice(1);

rimuoviGiocatorePerIndice(100);

aggiornaGol("Rossi", 3);

aggiornaGol("Nome inesistente", 5);

stampaGiocatoriPerRuolo("Attaccante");

stampaCapocannoniere();
Casi da controllare
Durante la scrittura, fai attenzione a questi punti:

lista vuota;

oggetto Giocatore nullo in aggiungiGiocatore;

nome duplicato;

indice negativo o fuori intervallo;

numeroMaglia fuori range;

golSegnati negativi;

segnaGol() che aumenta correttamente;

toString() scritto bene.

Piccola sfida extra
Se vuoi aumentare un po’ la difficoltà, aggiungi anche:

java

stampaMediaGolPerRuolo(String ruolo)
Deve calcolare e stampare la media dei gol segnati dai giocatori di quel ruolo.

Obiettivo didattico
Con questo esercizio alleni insieme:

List<Oggetto>;

classi separate;

costruttore;

getter e setter con controlli;

metodo toString();

ricerca per nome, ruolo, numero maglia e indice;

rimozione per nome e per indice;

gestione di null e indici non validi;

logica più vicina a progetti reali.
download.java
+1


		 */
		
		Giocatore giocatore1 = new Giocatore("Rossi", "Attaccante", 9, 15);
		Giocatore giocatore2 = new Giocatore("Bianchi", "Attaccante", 10, 12);
		Giocatore giocatore3 = new Giocatore("Verdi", "Difensore", 4, 1);	
		Giocatore giocatore4 = new Giocatore("Neri", "Centrocampista", 8, 5);
		Giocatore giocatore5 = new Giocatore("Gialli", "Portiere", 1, 0);
		Giocatore giocatore6 = new Giocatore("Viola", "Attaccante", 11, 8);
		
		GestoreSquadra giocatori = new GestoreSquadra();
		
		giocatori.aggiungiGiocatore(giocatore1);
		giocatori.aggiungiGiocatore(giocatore2);
		giocatori.aggiungiGiocatore(giocatore3);
		giocatori.aggiungiGiocatore(giocatore4);
		giocatori.aggiungiGiocatore(giocatore5);
		giocatori.aggiungiGiocatore(giocatore6);
		
		
		giocatori.stampaTuttiGiocatori();
		
		System.out.println("=== Ricerca per nome (esistente) ===");
		giocatori.cercaGiocatorePerNome("Rossi");
		System.out.println();
		
		System.out.println("=== Ricerca per nome (inesistente) ===");
		giocatori.cercaGiocatorePerNome("Nome inesistente");
		System.out.println();
		
		System.out.println("=== Ricerca per ruolo ===");
		giocatori.cercaGiocatorePerRuolo("Attaccante");
		System.out.println();
		
		System.out.println("=== Ricerca per numero di maglia ===");
		giocatori.cercaGiocatorePerNumeroMaglia(10);
		System.out.println();
		
		System.out.println("=== Ricerca per indice (valido) ===");
		giocatori.cercaGiocatorePerIndice(0);
		System.out.println();
		
		System.out.println("=== Ricerca per indice (non valido) ===");
		giocatori.cercaGiocatorePerIndice(100);
		System.out.println();
		
		System.out.println("=== Rimozione per nome (esistente) ===");
		giocatori.rimuoviGiocatorePerNome("Viola");
		System.out.println();
		
		System.out.println("=== Rimozione per nome (inesistente) ===");
		giocatori.rimuoviGiocatorePerNome("Nome inesistente");
		System.out.println();
		
		System.out.println("=== Rimozione per indice (valido) ===");
		giocatori.rimuoviGiocatorePerIndice(1);
		System.out.println();
		
		System.out.println("=== Rimozione per indice (non valido) ===");
		giocatori.rimuoviGiocatorePerIndice(100);
		System.out.println();
		
		System.out.println("=== Aggiornamento gol (esistente) ===");
		giocatori.aggiornaGol("Rossi", 3);
		System.out.println();
		
		System.out.println("=== Aggiornamento gol (inesistente) ===");
		giocatori.aggiornaGol("Nome inesistente", 5);
		System.out.println();
		
		System.out.println("=== Stampa giocatori per ruolo ===");
		giocatori.stampaGiocatoriPerRuolo("Attaccante");
		System.out.println();
		
		System.out.println("=== Stampa capocannoniere ===");
		giocatori.stampaCapocannoniere();
		
		
		
		
		
		
	}

}
