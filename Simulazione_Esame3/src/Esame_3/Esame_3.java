package Esame_3;

public class Esame_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Penso che questa sia la scelta migliore. Dalla correzione dell'ultimo esame ho notato una cosa precisa: la sintassi Java non è il tuo problema. Sai scrivere classi, costruttori, cicli, metodi, getter/setter e usare il polimorfismo. Quello che va consolidato è il ragionamento progettuale (ereditarietà vs composizione, eccezioni, modellazione delle classi).

Per questo motivo, invece di proporti un altro esame "difficile", ti preparerei un livello intermedio, cioè un gradino sopra il primo esame ma sotto il secondo. È esattamente il tipo di progressione che farebbe un buon docente.

SIMULAZIONE ESAME JAVA - LIVELLO INTERMEDIO
Durata

2 ore e 45 minuti (165 minuti)

Regolamento
Nessun aiuto esterno.
Puoi usare solo la documentazione Java.
Il codice deve compilare.
Verranno valutate sia la correttezza che la progettazione.
Sistema di valutazione
Sezione	Punti
Teoria	25
Analisi del codice	20
Programmazione	55
Totale	100
Promozione
90-100 → Ottimo
80-89 → Distinto
70-79 → Buono
60-69 → Sufficiente
0-59 → Bocciato
PARTE 1 - TEORIA (25 punti)
Domanda 1 (5 punti)

Spiega cosa sono:

classe
oggetto
costruttore

Utilizza un esempio con una classe Automobile.

Domanda 2 (5 punti)

Spiega la differenza tra:

String

e

StringBuilder

Quando useresti uno invece dell'altro?

Domanda 3 (5 punti)

Cos'è l'incapsulamento?

Perché è considerato una buona pratica?

Fornisci un esempio.

Domanda 4 (5 punti)

Qual è la differenza tra:

Array

e

ArrayList

Quando sceglieresti uno invece dell'altro?

Domanda 5 (5 punti)

Spiega il significato di:

extends
implements

Quando si utilizzano?

PARTE 2 - ANALISI DEL CODICE (20 punti)
Esercizio 1 (10 punti)

Analizza il codice.

String s = null;

System.out.println(s.length());

Rispondi:

Compila?
Cosa succede a runtime?
Quale eccezione viene generata?
Come potresti evitare il problema?
Esercizio 2 (10 punti)

Analizza.

int[] numeri = {4,7,2,9};

for(int i=0;i<=numeri.length;i++){

    System.out.println(numeri[i]);

}

Rispondi:

Quale sarà l'output?
Dove si verifica l'errore?
Quale eccezione viene lanciata?
Come correggeresti il codice?
PARTE 3 - PROGRAMMAZIONE (55 punti)
ESERCIZIO 1 (20 punti)

Realizza una classe

Prodotto

Attributi:

nome
prezzo
quantità

Metodi:

costruttore
getter
setter
valoreMagazzino()

che restituisce:

prezzo * quantità

Nel main:

crea almeno quattro prodotti
inseriscili in un array
stampa tutti
stampa il valore totale del magazzino.
ESERCIZIO 2 (20 punti)

Realizza una classe

Persona

con:

nome
cognome

Successivamente crea

Studente

che estende Persona.

Lo Studente possiede inoltre:

matricola
mediaVoti

Override di

toString()

Nel main:

crea almeno tre studenti
inseriscili in un array di Persona
stampa tutto usando il polimorfismo.

Attenzione: qui voglio verificare che tu utilizzi correttamente l'ereditarietà e l'override.

ESERCIZIO 3 (15 punti)

Realizza una classe

Calcolatrice

con i metodi:

somma()

sottrazione()

moltiplicazione()

divisione()

La divisione:

non deve permettere la divisione per zero;
deve lanciare una IllegalArgumentException con un messaggio significativo.

Nel main:

usa un blocco try/catch;
prova sia una divisione valida sia una divisione per zero.
BONUS (+10 punti)

Realizza una classe

RegistroStudenti

che utilizza una:

ArrayList<Studente>

Metodi richiesti:

aggiungiStudente()
cercaPerMatricola()
eliminaStudente()
stampaRegistro()

Nota: presta attenzione a come confronti gli oggetti e valuta se sia necessario ridefinire equals().
		 */
		
		//PARTE 1
		//Domanda 1
		/*
		 * la classe è essenziale per la creazione dell'oggetto, ha lo scopo di definire l'oggetto che sarà creato.
		 * nella classe stiamo creando l'oggetto, con eventuali parametri , metodi ecc...
		 * 
		 * l'oggetto non è altro che il risultato finale che abbiamo definito nella classe.
		 * 
		 * il costruttore è la parte di codice che consente all'oggetto di essere chiamato nel main.
		 * java può fornire un costruttore detto di default ( con parametri di default ) in assenza di uno, questo a patto che la classe non ne abbia nessuno,
		 * imposto dal programmatore.
		 * 
		 */
		
		//Domanda 2
	
		/*
		 * Le String sono reference immutabili e non possiamo cambiarli.
		 * con le String abbiamo la possibilità di lavorare con una sequenza di caratteri, formando parole e frasi.
		 * 
		 * Le StringBuilder ci vengono in soccorso sul campo dell'immutabilità.
		 * Hanno dei metodi che consentono la modifica delle String, possiamo aggiungere porzioni di testo all'inizio del testo, in una parte specifica del testo
		 * oppure alla fine del testo.
		 * eliminare porzioni di testo o modificarlo.
		 * 
		 * quindi quando non abbiamo bisogno di modificare il testo usaremo le String, in caso contrario useremo le StringBuilder.
		 */
		
		//Domanda 3
		
		/*
		 * L'incapsulamento consente di creare una barriera per i nostri dati inseriti nella classe.
		 * è una buona pratica perchè ci consente di avere un sistema di controllo per i nostri dati.
		 * per utilizzarlo bisogna impostare le variabili di istanza come private e usare i metodi getter e setter per lettura e scrittura.
		 * passando dai metodi getter e setter i dati li sottoponiamo a dei controlli. 
		 */
		
		//Domanda 4
		
		/*
		 * L'array ha una size definita che non può essere estesa.
		 * consente di lavorare con elementi dello stesso tipo.
		 * è più veloce di un'arrayList.
		 * 
		 * 
		 * LarrayList lavora solo con oggetti.
		 * ha dei metodi che sono di aiuto per il programmatore.
		 * ha una size dinamica che si espande autonomamente di una volta e mezza all'occorrenza.
		 * è più lento rispetto ad un array.
		 * 
		 */
		
		//Domanda 5
		
		/*
		 * extends si usa per estendere una classe con un'altra , creando una classe padre e una classe figlia.
		 * implements invece si usa per implementare un'interfaccia , facendo implementare alla classe un comportamento
		 */
		
		//PARTE 2
		//Esercizio 1
		
		/*
		 * String s = null;

System.out.println(s.length());
         *
         *il programma si blocca generando un'eccezione
         *con questo codice scritto in questo modo in runtime avremo un'eccezione
         *nello specifico avremo un'eccezione di NullPointerException.
         *per evitare il problema basta modificare il valore si s
         *String s ="";
         *impostandolo in questo modo l'output sarà 0 evitando l'eccezione.
         *all'occorrenza se necessario possiamo anche aprire un blocco try/catch gestendo l'eccezione evitando che il programma si blocchi
		 */
		
		//Esercizio 2
		
		/*
		 * 
		int[] numeri = {4,7,2,9};

		for(int i=0;i<=numeri.length;i++){

		    System.out.println(numeri[i]); }
		 *
		 * l'output sarà un'eccezione poichè c'è un'errore di fondo nel codice
		 * l'errore sta nella porzione di codice i <= numeri.length;
		 * perchè l'indici arrivano fino a 3 , mentre la lunghezza è 4, con = stiamo tenedo in considerazione l'indice 4 che non esite.
		 * l'eccezione che viene presa in considerazione è ArrayIndexOutOfBoundsException
		 * per correggere l'errore basta eliminare la porzione di codice = 
		 * la porzione di codice corretta è i < numeri.length;
		 */
		
		//PARTE 3
		
		//Esercizio 1
		
		Prodotto pasta = new Prodotto("Pennette", 0.50, 10);
		Prodotto maionese = new Prodotto("Maionese", 1 ,6);
		Prodotto sale = new Prodotto("Sale", 0.35, 7);
		Prodotto patatine = new Prodotto("Pringles", 1.5, 4);
		
		Prodotto[] magazzino = {pasta, maionese, sale, patatine};
		
		double totale = 0;
		for(Prodotto prodotto : magazzino)
		{
			totale = totale + (prodotto.valoreMagazzino());
			System.out.println(prodotto.toString());
			
		}
		
		System.out.println("valore totale del magazzino è: " + totale);
		System.out.println();
		
		//Esercizio 2
		
		Persona persona1 = new Studente("Marco", "Rossi", 45, 6.5);
		Persona persona2 = new Studente("Luca" , "Neri", 12, 7);
		Persona persona3 = new Studente("Marta" , "Verdi", 11, 8);
		
		Persona[] studenti = {persona1, persona2, persona3};
		
		for ( Persona persone : studenti )
		{
			System.out.println(persone.toString());
		}
	   
		System.out.println("-----------------------");
		
		Calcolatrice calcolatrice = new Calcolatrice();


		try {
			calcolatrice.divisione(10, 0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Errore non è possibile una divisione per 0");
		}
		finally
		{
			System.out.println("Fine controllo");
		}
		
		try {
			calcolatrice.divisione(10, 2);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Errore non è possibile una divisione per 0");
		}
		finally
		{
			System.out.println("Fine controllo");
		}
	}

}
