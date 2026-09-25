package Argomento1_List;

public class EsercizioFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Test da inserire nel main
1. Lista vuota
Prima di aggiungere artisti, richiama:

stampa di tutti gli artisti;

ricerca dell’artista con un codice;

ricerca degli artisti per genere;

stampa degli artisti con durata minima;

stampa dell’artista con esibizione più lunga;

stampa della durata totale;

stampa degli indici primo e ultimo per un genere.

Lo scopo è verificare che la classe gestisca correttamente una lista ancora vuota.

2. Creazione degli artisti
Crea almeno sei oggetti Artista.

Usa:

codici tutti diversi;

almeno tre generi musicali;

almeno un genere presente in tre artisti;

durate diverse;

valori di pubblico diversi;

almeno un artista con pubblico previsto uguale a 0.

Per esempio, puoi scegliere liberamente generi come rock, pop, jazz, rap o elettronica. Non è necessario usare esattamente questi.

3. Inserimenti validi
Inserisci tutti gli artisti tramite:

text

aggiungiArtista
Dopo gli inserimenti, stampa la lista completa per verificare che gli artisti siano presenti.

4. Inserimento di null
Prova ad aggiungere:

text

null
Verifica che il metodo segnali l’errore e che il programma continui senza interrompersi.

5. Inserimento di un duplicato
Crea un nuovo artista con un codice già utilizzato, ma con dati diversi.

Prova ad aggiungerlo e verifica che venga rifiutato per codice duplicato.

Il controllo deve basarsi sul codice, non sul nome o sul genere.

6. Ricerca per codice
Esegui questi tre test:

codice di un artista esistente;

codice non presente nella lista;

codice non valido, per esempio 0 o un numero negativo.

Salva eventualmente il risultato della ricerca in una variabile Artista e stampalo solo se il risultato non è null.

7. Ricerca per genere
Esegui:

ricerca di un genere presente;

ricerca di un genere assente;

ricerca con una stringa composta solo da spazi;

ricerca usando lettere maiuscole e minuscole diverse rispetto al valore memorizzato.

Ricorda che il confronto deve ignorare maiuscole e minuscole.

8. Primo e ultimo indice
Scegli il genere che hai usato per tre artisti e richiama:

ricerca del primo indice;

ricerca dell’ultimo indice.

Poi prova anche:

un genere assente;

un genere non valido.

Controlla i valori restituiti.

9. Aggiornamento del pubblico
Esegui:

aggiornamento valido di un artista esistente;

aggiornamento con codice assente;

aggiornamento con codice non valido;

aggiornamento con pubblico negativo.

Dopo l’aggiornamento valido, stampa nuovamente l’artista oppure tutta la lista per verificare che il nuovo valore sia visibile.

10. Filtro per genere
Richiama il metodo che stampa gli artisti di un determinato genere.

Prova:

un genere presente;

un genere assente;

una stringa vuota o composta da spazi.

11. Filtro per durata minima
Esegui:

una soglia che produce risultati;

una soglia uguale alla durata di almeno un artista;

una soglia alta che non produce risultati;

una soglia non valida, come 0 o un numero negativo.

Ricorda che un artista con durata esattamente uguale alla soglia deve essere incluso.

12. Ordinamento
Prima dell’ordinamento, stampa la lista.

Poi richiama:

text

ordinaArtistiPerPubblicoDecrescente
Dopo il metodo, stampa di nuovo la lista.

Verifica che il primo artista abbia il pubblico previsto maggiore rispetto agli artisti successivi.

13. Esibizione più lunga
Richiama il metodo che stampa l’artista con la durata maggiore.

I dati scelti devono permettere di riconoscere chiaramente quale artista dovrebbe risultare il più lungo.

14. Durata totale
Richiama il metodo:

text

stampaDurataTotaleFestival
Se vuoi verificare il risultato, puoi calcolare manualmente la somma delle durate che hai assegnato agli artisti.

15. Rimozione per codice
Esegui:

rimozione con codice esistente;

rimozione con codice assente;

rimozione con codice 0 o negativo.

Dopo ogni operazione significativa, stampa la lista per verificare il risultato.

16. Rimozione per indice
Esegui:

rimozione con indice 0;

rimozione con indice negativo;

rimozione con indice maggiore o uguale a size().

Per il test dell’indice fuori intervallo puoi usare un valore come 50.

Ricorda che dopo una rimozione gli indici possono cambiare.

Ordine consigliato del main
Per mantenere il main leggibile, segui quest’ordine:

creazione del gestore;

test iniziali della lista vuota;

creazione dei sei artisti;

inserimenti validi;

test null e duplicato;

ricerche;

indici;

aggiornamento;

filtri;

ordinamento;

massimo;

durata totale;

rimozioni.

Puoi separare le sezioni con messaggi come:

text

System.out.println("\n--- TEST RICERCHE ---");
Questo non modifica la logica, ma ti aiuta a leggere la console.

Compito
Scrivi EsercizioFestival.java seguendo questi scenari e inviami il file completo.

Non è necessario calcolare manualmente ogni risultato nel main:
 è sufficiente richiamare correttamente i metodi e osservare la console in Eclipse.
		 */
		GestioneFestival gf = new GestioneFestival();
		gf.stampaTuttiArtisti();
		gf.rimuoviArtistaPerCodice(101);
		gf.cercaArtistiPerGenere("rock");
		gf.stampaArtistiConDurataMinima(30);
		gf.stampaArtistaConEsibizionePiuLunga();
		gf.stampaDurataTotaleFestival();
		gf.cercaIndicePrimoArtistaPerGenere("pop");
		gf.cercaIndiceUltimoArtistaPerGenere("pop");
		
		
	}

}
