package incapsulamento_dati_biblioteca;

public class TestBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Traccia: Sistema Biblioteca (Autore, Libro, Rivista)

Immagina un piccolo gestionale di biblioteca.

Crea un enum Genere con alcuni generi: ROMANZO, SAGGIO, FANTASY, SCONOSCIUTO.

Crea una classe sealed Pubblicazione con queste caratteristiche:

Variabili d’istanza protette:

String titolo

int annoPubblicazione

Costruttori:

costruttore vuoto che mette valori di default tipo "ND" e 0

costruttore con String titolo, int annoPubblicazione

Metodi:

getter/setter per i campi

public void stampaDettagli() che stampa titolo e anno (puoi usarlo come base per l’override).

La classe deve essere sealed e deve permit solo due sottoclassi: Libro e Rivista.

Crea la classe final Libro che estende Pubblicazione:

Variabili d’istanza:

String autore

Genere genere

Costruttori:

costruttore vuoto che richiama il costruttore a 3 parametri con valori "ND", "ND", Genere.SCONOSCIUTO

costruttore con String titolo, String autore, Genere genere

chiama super(titolo, anno) ma per ora l’anno puoi metterlo fisso o passarlo come ulteriore parametro se vuoi complicarlo.

Override di stampaDettagli():

stampa anche autore e genere.

Crea la classe final Rivista che estende Pubblicazione:

Variabili d’istanza:

int numero

String periodicita (es. "Settimanale", "Mensile")

Costruttori simili a Libro (uno vuoto e uno completo).

Override di stampaDettagli():

stampa anche numero e periodicità.

Traccia: ArchivioPubblicazioni con array espandibile
Crea una classe final ArchivioPubblicazioni:

Variabili d’istanza:

Pubblicazione[] pubblicazioni

int maxPubblicazioni

byte contatorePubblicazioni

Costruttori:

costruttore vuoto:

imposta ad esempio maxPubblicazioni = 3

inizializza l’array pubblicazioni = new Pubblicazione[maxPubblicazioni]

imposta contatorePubblicazioni = 0 (usa un setter se vuoi imitare il tuo stile).

Metodo privato di inizializzazione (simile al tuo):

private void inizializzaArchivio() che fa pubblicazioni = new Pubblicazione[maxPubblicazioni];

richiamalo dal costruttore dopo aver settato maxPubblicazioni.

Metodo per aggiungere una pubblicazione (logica simile al tuo aggiungiTitoloCanzoneScritta):

public void aggiungiPubblicazione(Pubblicazione p):

Se contatorePubblicazioni < maxPubblicazioni

inserisci nell’array alla posizione contatorePubblicazioni

incrementa contatorePubblicazioni

Altrimenti:

aumenta maxPubblicazioni di 3 (o raddoppia, come preferisci)

crea un array temporaneo Pubblicazione[] temp = new Pubblicazione[maxPubblicazioni];

copia tutti gli elementi dal vecchio array a temp

assegna pubblicazioni = temp

inserisci la nuova pubblicazione

incrementa contatorePubblicazioni

stampa un messaggio tipo "Espando l'array delle pubblicazioni".

Puoi creare un metodo privato private void aggiungiInCoda(Pubblicazione p) che fa solo:

java
pubblicazioni[contatorePubblicazioni] = p;
contatorePubblicazioni++;
e richiamarlo da dentro aggiungiPubblicazione, proprio come il tuo aggiungiTitolo.

Metodo per stampare tutte le pubblicazioni (usa StringBuilder, come hai fatto tu):

public void stampaPubblicazioni():

Usa StringBuilder sb = new StringBuilder();

Fai un for da 0 a pubblicazioni.length

se l’elemento è null fai break;

altrimenti chiama pubblicazioni[i].stampaDettagli();

oppure costruisci una sola riga con sb.append(...) e solo se la prossima posizione non è null aggiungi ", ".

Alla fine stampa sb.toString() o comunque mostra i dettagli a video.

Traccia: Classe di test
Crea una classe TestBiblioteca con main:

Crea un ArchivioPubblicazioni.

Aggiungi più di 3 oggetti (per forzare l’espansione), ad esempio:

3–4 Libro con titoli e generi diversi

2–3 Rivista con numero e periodicità diversa

Controlla in console:

i messaggi quando l’array viene espanso

il valore del contatore dopo ogni inserimento

l’output di stampaPubblicazioni().

Obiettivi didattici collegati a quello che hai appena fatto
Con questo esercizio alleni esattamente:

Uso di classi sealed con sottoclassi final.

Costruttori che chiamano altri costruttori (this) e il costruttore della superclasse (super).

Gestione di un array come “lista dinamica” con:

max...

contatore...

array temporaneo per copiare i dati.

Uso di StringBuilder e controllo != null per fermare il ciclo e gestire correttamente la virgola finale.

Separazione della logica in metodi privati di supporto (inizializzaArchivio, aggiungiInCoda), proprio come il tuo aggiungiTitolo.
		 */
	
	
	
	ArchivioPubblicazioni archivio = new ArchivioPubblicazioni();
	archivio.aggiungiPubblicazione(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", Genere.FANTASY, 1954));
	archivio.aggiungiPubblicazione(new Libro("Il Nome della Rosa", "Umberto Eco", Genere.ROMANZO, 1980));
	archivio.aggiungiPubblicazione(new Libro("Il Gattopardo", "Giuseppe Tomasi di Lampedusa", Genere.ROMANZO, 1958));
	archivio.stampaArchivio();
	
	
		
		//voto finale 8/10
		
	}

}
