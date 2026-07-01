package Esame2;

import java.util.ArrayList;

public class Esame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Visto il risultato che hai ottenuto (93/100), ha senso alzare l'asticella. Ti proporrò una simulazione che considero di livello Musa Formazione "difficile", cioè quella che un docente potrebbe assegnare agli studenti più preparati o come prova finale impegnativa.

Questa volta non valuterò solo se il codice funziona, ma anche:

qualità del codice;
utilizzo corretto dell'OOP;
pulizia della progettazione;
gestione degli errori;
scelta delle strutture dati;
leggibilità e naming.
SIMULAZIONE ESAME JAVA - LIVELLO AVANZATO
Durata

3 ore (180 minuti)

Durante la prova puoi utilizzare solo la documentazione ufficiale Java.

Sistema di valutazione
Sezione	Punti
Teoria avanzata	25
Analisi del codice	20
Programmazione	55
Totale	100
Penalità
errore di sintassi importante → -2
codice non compilabile → fino a -10
soluzione inefficiente → -5
mancato uso dell'OOP → -10
mancata gestione delle eccezioni → -5
codice duplicato → -3
uso scorretto dell'ereditarietà → -5
Promozione
Punteggio	Esito
90-100	Ottimo (A)
80-89	Distinto
70-79	Buono
60-69	Sufficiente
0-59	Bocciato
PARTE 1 - TEORIA (25 punti)
Domanda 1 (5 punti)

Spiega dettagliatamente:

Heap
Stack
Garbage Collector

Descrivi cosa accade in memoria quando viene eseguito:

Studente s = new Studente("Marco");
Domanda 2 (5 punti)

Spiega la differenza tra:

Overloading
Overriding

Scrivi un esempio pratico di entrambi.

Domanda 3 (5 punti)

Differenze tra:

classe astratta
interfaccia

Quando useresti una invece dell'altra?

Domanda 4 (5 punti)

Spiega:

throw
throws
try
catch
finally

Con un esempio.

Domanda 5 (5 punti)

Quali caratteristiche deve rispettare una classe per essere ben incapsulata?

PARTE 2 - ANALISI DEL CODICE (20 punti)
Esercizio 1 (10 punti)

Analizza.

ArrayList<Integer> lista = new ArrayList<>();

lista.add(5);
lista.add(10);
lista.add(15);

for(int numero : lista){

    if(numero == 10){

        lista.remove(Integer.valueOf(10));

    }

}

Rispondi:

compila?
cosa succede a runtime?
perché?
come correggeresti il codice?
Esercizio 2 (10 punti)
class Padre{

    public void saluta(){

        System.out.println("Ciao");

    }

}

class Figlio extends Padre{

    public void saluta(){

        System.out.println("Buongiorno");

    }

}

Padre p = new Figlio();

p.saluta();

Spiega:

output
binding dinamico
polimorfismo
overriding
PARTE 3 - PROGRAMMAZIONE (55 punti)
ESERCIZIO 1 (20 punti)

Realizza una gestione dipendenti.

Classe

Dipendente

Attributi:

nome
cognome
stipendio

Metodi:

aumentaStipendio(percentuale)
toString()

Successivamente crea

Manager

che eredita da Dipendente.

Il Manager possiede anche:

bonus

Override di

toString()

Nel main:

crea almeno 5 dipendenti
di cui almeno 2 manager
inseriscili in un unico array
stampa tutti usando il polimorfismo
ESERCIZIO 2 (20 punti)

Realizza una classe

Biblioteca

che gestisce una

ArrayList<Libro>

Classe Libro:

titolo
autore
anno

Metodi richiesti:

aggiungiLibro()

rimuoviLibro()

cercaLibro()

stampaCatalogo()

Gestire i casi in cui il libro non esiste.

ESERCIZIO 3 (15 punti)

Scrivi un metodo

public static int trovaMassimo(int[] numeri)

che:

controlla che l'array non sia nullo
controlla che non sia vuoto
in caso contrario lancia una eccezione appropriata
restituisce il numero più grande

Nel main prova il metodo usando il blocco

try{
...
}catch(...)
BONUS (+10)

Realizza un piccolo gestionale bancario.

Menu:

1 Deposita

2 Preleva

3 Visualizza saldo

4 Visualizza storico operazioni

5 Esci

Requisiti:

ArrayList<String> per lo storico
switch
while
Scanner
gestione input errati
nessun saldo negativo
codice diviso in metodi
OOP corretta
Criteri di correzione

Questa volta la valutazione sarà molto più severa rispetto alla simulazione precedente. Oltre alla correttezza del codice, assegnerò un punteggio anche per:

Progettazione: scelta delle classi, responsabilità e organizzazione del codice.
Qualità dell'OOP: uso appropriato di incapsulamento, ereditarietà e polimorfismo.
Robustezza: gestione di input non validi ed eccezioni.
Leggibilità: nomi significativi, indentazione e codice non duplicato.
Efficienza: evitare soluzioni inutilmente complesse.
 */
		
		/*
		 * domanda 1
		 * la heap è una porzione di memoria dove vengono salvate gli oggetti creati con new, è più lenta rispetto alla stack 
		 * la stack è anch'essa una porzione di memoria ma più veloce rispetto alla heap, vengono salvate le variabili locali e le chiamate ai metodi
		 * il garbage collector invece è una procedura che java fornisce per la cancellazione automatica di tutti gli elementi non usati.
		 * lavora con la heap ed ha il compito di gestire eliminando gli oggetti creati e mai utilizzati, mantenedo pulito il progetto.
		 */
		
		/*
		 * domanda 2
		 * l'overloading: java ci permette di creare più metodi con lo stesso nome, a patto che i parametri siano di numero diverso, o di tipo diverso.
		 * questo processo si chiama overloading , cioè poter creare più metodi chiamati allo stesso modo.
		 * 	public int somma(int x, int y)
	{
		int totale = x + y;
		return totale;
	}
	public int somma(int x, int y, int z)
	{
		int totale = x + y + z;
		return totale;
	}
		 * 
		 * l'override:
		 * con override intendiamo la possibilità di ridefinire un metodo della superclasse a patto che la firma sia uguale
		 * 
		 * supponiamo di avere una superclasse Animale e una sottoclasse Cane:
		 * Classe animale:
		 * 
		 * public void verso()
		 * {
		 * System.out.println("L'animale fa un verso);
		 * }
		 * 
		 * Classe cane:
		 * 
		 * @Override
		 * public void verso()
		 * {
		 * System.out.println("Bau");
		 * }
		 */
		
		/*
		 * domanda 3
		 * 
		 * la classe astratta è un classe che non può essere istanziata, ma può avere metodi astratti e concreti.
		 * 
		 * l'interfaccia è un contratto di un comportamento, può essere implementata da più classi , facendo risparmiare la ripetizione di codice in scrittura.
		 * con l'interfaccia si ha la possibilità di gestire il codice in maniera ordinata e senza dover riscrivere porzioni di codice.
		 * 
		 */
		
		/*
		 * domanda 4
		 * con throw è l'operatore a gestire un'eccezione.
		 * 
		 * throws viene usato quando un metodo potrebbe dare un'eccezione.
		 * 
		 * try: fa parte del blocco try/catch che serve per la gestione delle eccezioni,
		 * nella parte di codice try scriviamo il codice chè potrebbe generare l'eccezione.
		 * 
		 * catch:
		 * anche catch fa parte del blocco try/catch per la gestione delle eccezioni.
		 * nel blocco catch stiamo intercettando l'eccezione, se dovessimo intercettare più eccezioni prima scriviamo la parte di codice specifico e poi quello generico
		 * 
		 * finally è la conclusione delle eccezioni, generealmente si usa sia che sia stata intercettata un'eccezione sia che non sia stata trovata.
		 * serve a dichiarare la chiusura dell'operazione di gestione dell'eccezione
		 * 
		 */
		
		/*
		 * domanda 5
		 * 
		 * con l'incapsulamento stiamo definedo una barriera che protegge i norstri dati di una classe da manomissioni esterne.
		 * per un buon incapsulamento è buona regola rendere private tutte le variabili di istanza di una classe e fornire dei metodi pubblici controllati,(getter/setter)
		 * che consentono la lettura e scrittura dei nostri dati.
		 * facendo questo stiamo proteggendo il nostro codice del progetto.
		 */
		
		
		//PARTE 2
		//Esercizio 1
		
		/*
		 * 	ArrayList<Integer> lista = new ArrayList<>();

		lista.add(5);
		lista.add(10);
		lista.add(15);

		for(int numero : lista){

		    if(numero == 10){

		        lista.remove(Integer.valueOf(10));
		        
		    }
		}
		
		si compila, ma c'è la possibilità che si venga a creare un'errore poichè stiamo rimuovendo un'oggetto durante un'iterazione
		per risolvere l'eventuale problema basta semplicemente rimuovere l'oggetto o prima del ciclo for-each o dopo il ciclo.
		cosi da evitare l'eventuale errore 
		 */
		
		//Esercizio 2
		
		/*
		 * class Padre{

    public void saluta(){

        System.out.println("Ciao");

    }

}

class Figlio extends Padre{

    public void saluta(){

        System.out.println("Buongiorno");

    }

}

Padre p = new Figlio();

p.saluta();


l'outup 

qui abbiamo una classe padre e una classe figlio che la estende.
in output avremo il saluta della classe figlio.
questo per via del poliformismo 
Padre p = new Figlio(); 
p.saluta(); // il saluta preso in questione è quello della classe figlio , perchè figlio è l'oggetto specifico e padre è il tipo.

con l'overriding il figlio sta ridefinendo un comportamento della classe padre ( il metodo saluta ) , facendolo diventare un comportamento specifico della classe figlio
		 */
	
		//PARTE 3
		//Esercizio 3
		
		/*
		 * 
		 */
		
		try {
			int[] numeri = {10, 4, 5 , 6 , 2};
			
			System.out.println(trovaMassimo(numeri));
		}
		catch(NullPointerException e)
		{
			System.out.println("Larray è null");
		}
		finally
		{
			System.out.println("Fine controllo");
		}
	
	}
	
	public static int trovaMassimo(int[] numeri)
	{
		int numeroCorrente = 0;
		
		if(numeri.length == 0)
		{
			System.out.println("l'array è vuoto");
		}
		else
		{
		for (int numero : numeri)
		{
			if (numero < 0)
				{
					System.out.println("Il numero deve essere superiore a 0");
				}
				else
				{
					if(numero > numeroCorrente)
					{
						numeroCorrente = numero;
					}
				}
			
		}
		
	}
		return numeroCorrente;
}
}
