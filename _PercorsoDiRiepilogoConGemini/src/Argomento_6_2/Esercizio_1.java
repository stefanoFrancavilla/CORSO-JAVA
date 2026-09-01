package Argomento_6_2;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Una Map in Java memorizza dati come coppie chiave/valore, e il valore può essere anche una List,
		 *  quindi una stessa chiave può avere più elementi associati.
prgrmmng
+2

Traccia
Crea un programma per gestire una playlist musicale usando questa struttura:

java

Map<String, List<Integer>> playlist = new HashMap<>();
Significato:

String = nome della playlist

List<Integer> = durata in secondi delle canzoni contenute in quella playlist.
w3schools
+1

Classe da creare
Crea la classe:

java

public class GestorePlaylist
All’interno della classe dichiara questo attributo:

java

private Map<String, List<Integer>> playlist = new HashMap<>();
Metodi da implementare
Implementa questi metodi:

java

public void aggiungiDurata(String nomePlaylist, int durata)
java

public int calcolaDurataTotale(String nomePlaylist)
java

public double calcolaDurataMedia(String nomePlaylist)
java

public void stampaPlaylist()
Comportamento richiesto
Il metodo aggiungiDurata(String nomePlaylist, int durata) deve:

creare la lista se la playlist non esiste ancora;

aggiungere la durata della canzone alla lista associata.
medium
+1

Il metodo calcolaDurataTotale(String nomePlaylist) deve:

recuperare la lista delle durate;

sommare tutti i valori;

restituire il totale.

Il metodo calcolaDurataMedia(String nomePlaylist) deve:

recuperare la lista delle durate;

calcolare la media;

restituire un double.

Il metodo stampaPlaylist() deve mostrare, per ogni playlist:

nome playlist;

elenco durate;

durata totale;

durata media.
geeksforgeeks
+1

Main
Nel main devi:

creare un oggetto GestorePlaylist;

inserire almeno 3 playlist;

inserire almeno 3 durate per ogni playlist;

chiamare il metodo stampaPlaylist().

Parametri
Usa questi parametri:

String nomePlaylist

int durata

Dati minimi da inserire
Nel main inserisci almeno:

"Workout" con 3 durate

"Relax" con 3 durate

"Viaggio" con 3 durate



Obiettivo
Con questo esercizio ti alleni a usare:

HashMap per associare una chiave a un valore.
w3schools

List come valore della mappa per memorizzare più dati collegati alla stessa chiave.
prgrmmng
+1

cicli per scorrere liste e mappa.
geeksforgeeks

metodi tipici di Map come put(), get() e approcci come computeIfAbsent()
 o equivalenti per inizializzare i valori quando la chiave non esiste ancora.
medium
+1



Sfida extra
Se vuoi, puoi aggiungere anche uno di questi metodi:

java

public String trovaPlaylistPiuLunga()
java

public void stampaPlaylistSopraDurata(int soglia)
java

public boolean esistePlaylist(String nomePlaylist)

		 */
		
		GestorePlaylist gestore = new GestorePlaylist();
		
		gestore.aggiungiDurate("Workout", 250);
		gestore.aggiungiDurate("Workout", 180);
		gestore.aggiungiDurate("Workout", 220);
		
		gestore.aggiungiDurate("Relax", 230);
		gestore.aggiungiDurate("Relax", 215);
		gestore.aggiungiDurate("Relax", 195);
		
		gestore.aggiungiDurate("Viaggio", 314);
		gestore.aggiungiDurate("Viaggio", 198);
		gestore.aggiungiDurate("Viaggio", 350);
		
		System.out.println(gestore.playlistPiuLunga());
		System.out.println("-----------------------------");
		System.out.println(gestore.durataTotale("Relax"));
		System.out.println("-----------------------------");
		System.out.println(gestore.durataMedia("Relax"));
		System.out.println("-----------------------------");
		
		gestore.stampaPlaylistSopraDurata(700);
		System.out.println("-----------------------------");
		
		gestore.stampaPlaylist();
	}

}
