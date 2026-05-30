package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Iterable
└── Collection
    ├── List
    │   ├── ArrayList
    │   ├── LinkedList
    │   └── Vector
    │       └── Stack
    │
    ├── Set
    │   ├── HashSet
    │   ├── LinkedHashSet
    │   └── TreeSet
    │
    └── Queue
        ├── PriorityQueue
        └── Deque
            ├── ArrayDeque
            └── LinkedList
		 */

		/*
		 * le collezioni sono strutture dati che permettono di memorizzare e gestire insiemi di elementi.
		 * 
		 * si divide in (set (insiemi) e sortedSet (insiemiOrdinati)) list (liste) queue (code) deque (code doppie) , poi map (mappe),  sortedMap (mappe Ordinate)
		 * per set intediamo un insieme di elementi unici, senza un ordine specifico.
		 * 
		 * per sortedSet intediamo un insieme di elementi unici, ordinati secondo un criterio specifico (ad esempio, ordine naturale o un comparatore personalizzato).
		 * 
		 * per list intediamo una collezione ordinata di elementi, che può contenere duplicati.
		 *  Gli elementi in una lista sono indicizzati, il che significa che è possibile accedere a un elemento specifico utilizzando la sua posizione (indice) nella lista.
		 *  
		 *  per queue intediamo una collezione che segue il principio FIFO (First In, First Out), in cui gli elementi vengono aggiunti alla fine della coda e rimossi dalla testa della coda.
		 *  esempio di una coda al casello, le auto entrano in coda e vengono servite in ordine di arrivo.
		 *  
		 *  per deque intediamo una collezione che supporta l'aggiunta e la rimozione di elementi sia dalla testa che dalla coda, consentendo una maggiore flessibilità rispetto a una coda tradizionale.
		 *  esempio di doppia coda si può rappresentare come un secondo sportello alle poste, in cui i clienti possono essere serviti sia dalla coda principale che da una coda secondaria, 
		 *  a seconda delle esigenze.
		 *  
		 *  per map intediamo una collezione che associa chiavi a valori, in cui ogni chiave è univoca e viene utilizzata per accedere al valore corrispondente.
		 *  
		 *  per sortedMap intediamo una collezione che associa chiavi a valori, in cui le chiavi sono ordinate secondo un criterio specifico (ad esempio, ordine naturale o un comparatore personalizzato).
		 *  
		 *  il concetto di stack è tipo una sequenza di elementi in cui l'ultimo elemento inserito è il primo ad essere rimosso (LIFO - Last In, First Out).
		 *  esempio la pila di piatti, l'ultimo piatto che viene messo sulla pila è il primo che viene rimosso quando si prende un piatto dalla pila.
		 *  stesso procedimento lo possiamo comparare alla gestione delle funzioni di un programma,
		 *  nel momento in cui chiamiamo una funzione , e se viene chiamata un'altra funzione all'interno della prima, la seconda funzione viene messa sopra la prima nella pila delle funzioni,
		 *   e quando la seconda funzione termina, viene rimossa dalla pila e si torna alla prima funzione.
		 */
		
		
		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		/*
		 * la sintassi di questa riga di codice è la seguente:
		 * Collection<String> list = new ArrayList<>();
		 * - Collection<String> è un'interfaccia generica che rappresenta una collezione di elementi di tipo String.
		 * - list è il nome della variabile che rappresenta la collezione.
		 * - new ArrayList<>() è l'istanza concreta della collezione, in questo caso una lista (ArrayList) che implementa l'interfaccia Collection.
		 * 
		 * in parole semplici, questa riga di codice crea una nuova collezione di stringhe utilizzando la classe ArrayList e assegna questa collezione alla variabile list.
		 */
		//Collection<String> listaDiLuoghi = new ArrayList<>();
		
		/*
		 * con la dicitura arrayList l'output sarà ordinato secondo l'ordine di inserimento, con la dicitura priorityQueue l'output sarà ordinato secondo l'ordine naturale
		 *  (alfabetico per le stringhe), con la dicitura linkedList l'output sarà ordinato secondo l'ordine di inserimento, con la dicitura hashSet l'output non sarà ordinato e non conterrà duplicati.
		 */
		
		/*
		 * con la dicitura PriorityQueue l'output sarà ordinato secondo l'ordine naturale (alfabetico per le stringhe), 
		 * 
		 * con la dicitura linkedList l'output sarà ordinato secondo l'ordine di inserimento, 
		 * 
		 * con la dicitura hashSet l'output non sarà ordinato e non conterrà duplicati.
		 */
		List<String> listaDiLuoghi = new ArrayList<>(); // l'interfaccia list è un tipo di collezione che rappresenta una sequenza ordinata di elementi,
		//in cui ogni elemento ha una posizione specifica (indice) e può essere duplicato.
		
		
		//Collection<String> listaDiLuoghi = new ArrayList<>();
		//Collection<String> listaDiLuoghi = new PriorityQueue<>();
		//List<String> listaDiLuoghi = new LinkedList<>();
		//Collection<String> listaDiLuoghi = new HashSet<>();
		
		listaDiLuoghi.add("Aosta");
		listaDiLuoghi.add("Bari");
		listaDiLuoghi.add("Cuneo");
		listaDiLuoghi.add("Domodossola");
		listaDiLuoghi.add("Enna");
		
		System.out.println("	Lista di luoghi: " + listaDiLuoghi);
		System.out.println("	Domodossola è nella lista di luoghi? " + listaDiLuoghi.contains("Domodossola"));
		
		listaDiLuoghi.remove("Domodossola");
		System.out.println("	Lista di luoghi: " + listaDiLuoghi);
		System.out.println("	Domodossola è nella lista di luoghi? " + listaDiLuoghi.contains("Domodossola"));
		
		listaDiLuoghi.add("Bologna");
		listaDiLuoghi.add(1, "L'Aquila"); // mettiamo all'indice 1 (seconda posizione) la città di L'Aquila, spostando di conseguenza le altre città a destra.
	//	listaDiLuoghi.sort(null); // ordina la lista in ordine naturale (alfabetico per le stringhe)
		//questa funzione sort non è disponibile per tutte le collezioni, ad esempio non è disponibile per hashSet, in quanto non è ordinato, o set in generale o collezioni che non mantengono un ordine specifico.
		System.out.println("	Lista di luoghi: " + listaDiLuoghi);
		
		System.out.println("	listaDiLuoghi.get(2): " + listaDiLuoghi.get(2)); // restituisce l'elemento all'indice 2 (terza posizione) della lista
		/*
		 * l'arrayList funziona come una lista dinamica
		 * dove o(1) inserisce il nuovo elemento alla fine della lista
		 * o(n) inserisce un elemento in una posizione specifica, in quanto è necessario spostare gli elementi successivi per fare spazio al nuovo elemento.
		 * e infine con 0(1)* rimuove un elemento specifico, in quanto è necessario cercare l'elemento da rimuovere e spostare gli elementi successivi per colmare il vuoto lasciato dall'elemento rimosso.
		 * 
		 */
		
		listaDiLuoghi.set(1, "Taranto"); // sostituisce l'elemento all'indice 2 (seconda posizione) 
		System.out.println("	Lista di luoghi: " + listaDiLuoghi);
		
		
		
	}

}
