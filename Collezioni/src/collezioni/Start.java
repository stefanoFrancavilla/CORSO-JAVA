package collezioni;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


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
		 *         // Creiamo un ArrayList con capacità iniziale di 10 (default)
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Capacità INIZIALE: 10 (default)");
        System.out.println("Elementi aggiunti uno alla volta...\n");
        
        // Aggiungiamo 25 elementi per vedere diverse espansioni
        for (int i = 1; i <= 25; i++) {
            lista.add("Elemento" + i);
            
            // Mostriamo le espansioni (quando la dimensione diventa 11, 17, 26, ecc.)
            if (i == 10 || i == 11) {
                System.out.println("⚠️  ESPANSIONE: da 10 a 16 elementi!");
            }
            else if (i == 16 || i == 17) {
                System.out.println("⚠️  ESPANSIONE: da 16 a 25 elementi!");
            }
            else if (i == 25) {
                System.out.println("⚠️  ESPANSIONE: da 25 a 38 elementi!");
            }
            
            // Mostriamo lo stato ogni 5 elementi
            if (i % 5 == 0 || i == 1) {
                System.out.println("Elemento " + i + " aggiunto | Size: " + lista.size());
            }
        }
        
        System.out.println("\n=== RIEPILOGO ===");
        System.out.println("Elementi totali: " + lista.size());
        System.out.println("Espansioni avvenute: 3 (da 10→16→25→38)");
        System.out.println("\nCome funziona dietro le quinte:");
        System.out.println("1. ArrayList ha un array interno Object[]");
        System.out.println("2. Quando size == capacity, crea NUOVO array più grande");
        System.out.println("3. Formula: nuova_capacità = vecchia_capacità × 1.5 + 1");
        System.out.println("4. Copia TUTTI gli elementi nel nuovo array (O(n))");
        System.out.println("5. Elimina il vecchio array (garbage collector)");
        
        System.out.println("\n=== SCHEMA VISIVO DEL PROCESSO ===");
        System.out.println("""
            
            INIZIO: ArrayList vuoto
                │
                ▼
            [ ][ ][ ][ ][ ][ ][ ][ ][ ]  ← Array interno, capacità = 10
                │
                ▼
            Aggiungo 10 elementi (size = 10)
                │
                ▼
            [1][2][3][4][5][6][7][8][9][10]  ← PIENO!
                │
                ▼
            Chiamo add() per l'elemento 11
                │
                ▼
            ⚠️ ESPANSIONE AUTOMATICA!
                │
                ├─► Crea NUOVO array: capacità = 10 × 1.5 + 1 = 16
                ├─► Copia 10 elementi dal vecchio al nuovo
                └─► Elimina vecchio array
                │
                ▼
            [1][2][3][4][5][6][7][8][9][10][ ][ ][ ][ ][ ][ ]  ← capacity = 16
                │
                ▼
            Aggiungo elemento 11
                │
                ▼
            [1][2][3][4][5][6][7][8][9][10][11][ ][ ][ ][ ][ ]  ← size = 11
                │
                ▼
            ...continua fino a size = 16 (PIENO di nuovo)
                │
                ▼
            [1][2][3][4][5][6][7][8][9][10][11][12][13][14][15][16]
                │
                ▼
            Chiamo add() per elemento 17
                │
                ▼
            ⚠️ ESPANSIONE AUTOMATICA!
                │
                ├─► Nuova capacità = 16 × 1.5 + 1 = 25
                ├─► Copia 16 elementi
                └─► Elimina vecchio array
                │
                ▼
            [1-16][ ][ ][ ][ ][ ][ ][ ]  ← capacity = 25 (spazio libero: 9)
            
            """
        );
        
        System.out.println("=== CONSIGLIO PER OTTIMIZZARE ===");
        System.out.println("Se sai quanti elementi userai, specifica la capacità iniziale:");
        System.out.println("   ArrayList<String> lista = new ArrayList<>(100);");
        System.out.println("Eviti espansioni costose e migliori le prestazioni!");
    }
}
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
		//Set<String> listaDiLuoghi = new HashSet<>();
		
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
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		//Queue<Auto> caselloAutostradale = new LinkedList<Auto>();
		Queue<Auto> caselloAutostradale = new ArrayDeque<Auto>();
		
		
		caselloAutostradale.add(new Auto("Volvo", "AAA", "Grigio")); //O(1) per LL o(1)* per AD
		caselloAutostradale.add(new Auto("Mercedes", "BBB", "Grigio"));
		caselloAutostradale.add(new Auto("BMW", "CCC", "Grigio"));
		caselloAutostradale.offer(new Auto("Alfa Romeo", "DDD", "Grigio"));//O(1) per LL o(1)* per AD
		caselloAutostradale.offer(new Auto("Ferrari", "EEE", "Grigio"));
		
		System.out.println(	"	caselloAutostradale" + caselloAutostradale);
		
		System.out.println(	"	L'auto al casello passa" + caselloAutostradale.remove());//o(1) per LL, o(1) AD _ rimuove il primo elemento dalla testa , se vuoto restituisce errore( più stringente)
		
		System.out.println(	"	L'auto attualmente al casello" + caselloAutostradale.element());//o(1) per LL, o(1) AD _ con element ci dice l'elemento che si trova in testa, cioè il prossimo ad uscire dalla coda ,se vuoto restituisce errore( più stringente)

		System.out.println(	"	L'auto al casello passa" + caselloAutostradale.poll());//o(1) per LL, o(1) AD _ rimuove il primo elemento dalla testa, se vuoto restituisce null( più sicuro)

		System.out.println(	"	L'auto attualmente al casello" + caselloAutostradale.peek());//o(1) per LL, o(1) AD _con element ci dice l'elemento che si trova in testa, cioè il prossimo ad uscire dalla coda ,se vuoto restituisce null( più stringente)
		
		System.out.println(	"	caselloAutostradale" + caselloAutostradale);
		
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		Queue<Integer> ns = new PriorityQueue<>();
		/*
		 * con questo esercizio stiamo creando una coda
		 * con la dicitura Queue<Integre> stiamo creando una coda di integer
		 * ns è la nostra variabile
		 * e con new priorityQueue<> stiamo dicendo essenzialmente che la coda sarà gestita da PriorityQueue, qquindi utilizzando il suo ragionamento sulla gestione della coda.
		 */
		ns.offer(3);
		ns.offer(5);
		ns.offer(9);
		ns.offer(12);
		ns.offer(6);
		ns.offer(10);
		//ns.offer(4);
		
		System.out.println("	ns: " + ns);
		
		ns.offer(4);
		
		System.out.println("	ns: " + ns);
		/*
		 * il sistema per capire la ramificazione della coda del priority Queueè:
		 * in output abbiamo ns: [3, 5, 9, 12, 6, 10]
		 * immaginiamo che l'indice 0 è riferito al primo numero(3)
		 * per capire la ramificazione del primo numero bisogna fare (2 * i + 1)
		 * cioè ha come indice 0 , quindi il calcolo sarà (2 * 0 + 1)
		 * con indice 1 troviamo il 5 ( prima ramificazione del 3 nodo di destra)
		 * 
		 * per capire la seconda ramificazione bisogna usare la formula (2 * i + 2)
		 * cioè partendo sempre dal 3 dobbiamo usare il calcolo  (2 * 0 + 2)
		 * e in questo caso troviamo il 9 ( seconda ramificazione della testa, 3 nodo di sinistra)
		 * 
		 * ora per capire la ramificazione del 5 bisogna usare la stessa formula precedente
		 * (2 * i + 1), che in questo secondo caso sarà (2 * 1 + 1) dove la i sta per l'indice del 5
		 * troviamo il numero 12 che sarà la ramificazione di sinistra del 5
		 * per trovare la seconda ramificazione del 5 , cioè quella di destra useremo la formula (2 * i + 2)
		 * in questo caso sara (2 * 1 + 2) e ci darà 12 come ramificazione di destra.
		 * 
		 */
		
		System.out.println("	ns.peek: " + ns.peek());
		System.out.println("	ns: " + ns);
		System.out.println("	ns.poll: " + ns.poll());
		System.out.println("	ns: " + ns);
		
		
		System.out.println();
		System.out.println("3.2--------------------------");
		System.out.println();
		
		Yogurt yogurt1 = new Yogurt (1, LocalDate.of(2023, Month.MAY, 1));
		Yogurt yogurt2 = new Yogurt (2, LocalDate.of(2023, Month.MARCH, 1));
		Yogurt yogurt3 = new Yogurt (3, LocalDate.of(2023, Month.APRIL, 1));
		Yogurt yogurt4 = new Yogurt (4, LocalDate.of(2023, Month.JANUARY, 1));
		Yogurt yogurt5 = new Yogurt (5, LocalDate.of(2023, Month.DECEMBER, 1));
		
		Queue<Yogurt> yogurts = new PriorityQueue<>();
		yogurts.offer(yogurt1);
		yogurts.offer(yogurt2);
		yogurts.offer(yogurt3);
		yogurts.offer(yogurt4);
		yogurts.offer(yogurt5);
		
		System.out.println("	yogurts: " + yogurts);
		System.out.println("	in scadenza: " + yogurts.poll());
		System.out.println("	yogurts: " + yogurts);
		
		System.out.println();
		System.out.println("3.3--------------------------");
		System.out.println();
		
		Frigo frigo = new Frigo();
		
		System.out.println("	in scadenza: " + frigo.getExpiringYogurt());
		System.out.println("	in scadenza: " + frigo.getExpiringYogurt());
		System.out.println("	in scadenza: " + frigo.getExpiringYogurt());
		System.out.println("	in scadenza: " + frigo.getExpiringYogurt());
		System.out.println("	in scadenza: " + frigo.getExpiringYogurt());
		
		System.out.println();
		System.out.println("3.4--------------------------");
		System.out.println();
		
		Deque<Integer> mazzoDiCarte = new ArrayDeque<>();
		//Deque<Integer> mazzoDiCarte = new LinkedList<>();
		
		mazzoDiCarte.push(5);
		mazzoDiCarte.push(1);
		mazzoDiCarte.push(3);
		mazzoDiCarte.push(9);
		mazzoDiCarte.push(7);
		
		System.out.println("	la catra in cima alla pila è: " + mazzoDiCarte.peekFirst());
		System.out.println("	la carta appena rimossa dalla pila è: " + mazzoDiCarte.pop());
		System.out.println("	la carta appena rimossa dalla pila è: " + mazzoDiCarte.pop());
		System.out.println("	la catra in cima alla pila è: " + mazzoDiCarte.peekFirst());
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		
		/*
		 * con la dicitura Map<String, Libro> stiamo creando una mappa in cui le chiavi sono di tipo String e i valori sono di tipo Libro.
		 * la variabile libri è una mappa che associa i titoli dei libri (String) agli oggetti Libro corrispondenti.
		 * con new HashMap<> stiamo creando un'istanza concreta di una mappa basata su una tabella hash, che implementa l'interfaccia Map.
		 */
		Map<String, Libro> libri = new HashMap<>();
		
		Libro ilSignoreDegliAnelli = new Libro("Il Signore degli Anelli", "Top", 50f, "1234567890");
		Libro ilCperTutti = new Libro("Il C per Tutti", "yeah", 30f, "234567890");
		
		/*
		 * libri.put significa che stiamo inserendo un elemento nella mappa libri, dove la chiave è il titolo del libro (ilSignoreDegliAnelli.getTitolo())
		 *  e il valore è l'oggetto Libro stesso (ilSignoreDegliAnelli).
		 *  con put stiamo associando la chiave al valore corrispondente nella mappa, 
		 *  in modo che possiamo successivamente recuperare il libro utilizzando il suo titolo come chiave.
		 */
		
		libri.put(ilSignoreDegliAnelli.getTitolo(), ilSignoreDegliAnelli);
		libri.put(ilCperTutti.getTitolo(), ilCperTutti);
		
		System.out.println("	libri è: " + libri);
		
		Libro libroPreso = libri.get("Il Signore degli Anelli");
		System.out.println("	Il libro preso è: " + libroPreso);
		
		libroPreso = libri.get("UU Il Signore degli Anelli");
		System.out.println("	Il libro preso è: " + libroPreso);
		
		Libro copia  = new Libro("Il Signore degli Anelli", "Copia Top", 50f, "1234567890");
		libri.put(copia.getTitolo(), copia);
		System.out.println(libri.get("Il Signore degli Anelli").getSinossi());
		
		Libro libroNull = new Libro("Il nulla ci sovrasta", "NULLA", 50f, "non c'è");
		libri.put(null,  libroNull);
		System.out.println(libri.get(null).getSinossi());
		
		libri.remove(null);
		System.out.println(libri.get(null));
		
		if (libri.containsKey("Il Signore degli Anelli")) {   //o(1)
			System.out.println("ci sono");
		} 
		if (libri.containsValue(copia)) {   //o(n)
			System.out.println("ci sono 2");
		}
		
		System.out.println();
		System.out.println("4.1--------------------------");
		System.out.println();
		
		Set<String> libriSet = libri.keySet();
		for (String key : libriSet) {
			Libro libro = libri.get(key);
			System.out.println("libro: " + libro.getTitolo());
		}
		System.out.println("	libri: " + libri);
	//	libriSet.remove("Il Signore degli Anelli"); // o(1) per HashMap
	//	System.out.println("	libri2: " + libri);
		
		Set<Map.Entry<String, Libro>> libriEntries = libri.entrySet();
		for(Map.Entry<String, Libro> entry : libriEntries) {
			String key = entry.getKey();
			Libro libro = entry.getValue();
			System.out.println("key: " + key);
			System.out.println("libro: " + libro);
		}
		
		System.out.println("	libriEntries " + libriEntries);
		
		//libriEntries.removeIf(entry -> entry.grtKey().equals(ilSignoreDegliAnelli));
		//System.out.println("	libriEntries " + libriEntries);
		//System.out.println("	libri: " + libri);
		
		Collection<Libro> libriCollection = libri.values();
		System.out.println("	libriCollection: " + libriCollection);
		
		List<Libro> libriLista = new ArrayList<>(libriCollection);
		System.out.println("	libriLista: " + libriLista);
		
		libriCollection.remove(libriLista.get(0));
		System.out.println("	libriLista: " + libriLista);
		System.out.println("	libri: " + libri);
		System.out.println("	libriCollection: " + libriCollection);
		//libriCollection.remove("Il Signore degli Anelli");
		//System.out.println("	libriCollection: " + libriCollection);
		//System.out.println("	libriLista: " + libriLista);
		
		libri.forEach((key, libro) -> {
			System.out.println("key: " + key + " libro: " + libro.getTitolo());
		});
		
		System.out.println();
		System.out.println("5.0--------------------------");
		System.out.println();
		/*
		 * il bitwise AND è un'operazione che confronta i bit di due numeri e restituisce un nuovo numero in cui ogni bit è impostato a 1 solo se entrambi i bit corrispondenti nei numeri originali sono 1,
		 *  altrimenti è impostato a 0.
		 *  
		 *  cioè in parole semplici, il bitwise AND prende due numeri binari e confronta ogni bit, 
		 *  restituendo un nuovo numero binario in cui ogni bit è 1 
		 *  solo se entrambi i bit corrispondenti nei numeri originali sono 1, altrimenti è 0.
		 */
		//https://en.wiipedia.org/wiki/Bitwise_operation
		// n hash     hash  n     (n -1)   & hash
		// 4 0   0 % 4 = 0   0 & 3 =	 000 & 011 = 000 = 0
		System.out.println("0 & 3: " + (0 & 3));
		// 4 1  1 % 4 = 1   1 & 3 = 	 001 & 011 = 001 = 1
		System.out.println("1 & 3: " + (1 & 3));
		// 4 2  2 % 4 = 2   2 & 3 = 	 010 & 011 = 010 = 2
		System.out.println("2 & 3: " + (2 & 3));
		// 4 3  3 % 4 = 3   3 & 3 =		 011 & 011 = 011 = 3
		System.out.println("3 & 3: " + (3 & 3));
		// 4 4  4 % 4 = 0   4 & 3 =		 100 & 011 = 000 = 0
		System.out.println("4 & 3: " + (4 & 3));
		// 4 5  5 % 4 = 1   5 & 3 =	 	 101 & 011 = 001 = 1
		System.out.println("5 & 3: " + (5 & 3));
		
		System.out.println("---------------------------------------------------------------------------------------");
		/*
		 * con lo xor esclusivo stiamo confrontando i bit di due numeri 
		 * e restituisce un nuovo numero in cui ogni bit è impostato a 1 solo se i bit corrispondenti nei numeri originali
		 *  sono diversi (uno è 1 e l'altro è 0), altrimenti è impostato a 0.
		 */
		int n_1 = 0b0000_0000_0000_0000_0000_0000_0001_1111; // (n - 1) = 31
		int h = 0b0000_0000_0001_0000_0000_000_0001; // h = 65.537
		System.out.println("n_1 & h:" + (n_1 & h)); // 0b0000_0000_0000_0000_0000_0000_000_0001 -> 1
		
		int hShift16 = h >>> 16; // 0b0000_0000_0000_0000_0000_0000_0000_0001 -> 1
		System.out.println("hShift16: " + Integer.toBinaryString(hShift16));
		//h                      0000_0000_0000_0001_0000_0000_0000_0001 ^    //valore originale di h
		//hShift16               0000_0000_0000_0000_0000_0000_0000_0001      //valore di h shiftato di 16
		
		//hXorHShift16 		     0000_0000_0000_0000_0000_0000_0000_0000 &    //risultato dello xor tra h e hShift16
		//n - 1					 0000_0000_0000_0000_0000_0000_0001_1111      //valore di n - 1
		//n_1 & hXorHShift16	 0000_0000_0000_0000_0000_0000_0000_0000      //risultato del bitwise AND tra n - 1 e hXorHShift16
		
		int hXorHShift16 = h ^ hShift16; // 0b0000_0000_0000_0000_0000_0000_0000_0000 
		System.out.println("hXorHShift16: " + Integer.toBinaryString(hXorHShift16));
		System.out.println("n_1 & hXorHShift16: " + (n_1 & hXorHShift16)); // 0b0000_0000_0000_0000_0000_0000_0000_0000 -> 0
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		n_1 = 0b0000_0000_0000_0000_0000_0000_0001_1111; // (n - 1) = 31
		h = 0b0000_0000_0000_0010_0000_0000_0000_0001; // h = 131.073
		System.out.println("n_1 & h:" + (n_1 & h)); // 0b0000_0000_0000_0000_0000_0000_0000_0001 -> 1
		
		hShift16 = h >>> 16; // 0b0000_0000_0000_0000_0000_0000_0000_0010 
		System.out.println("hShift16: " + Integer.toBinaryString(hShift16));
		//h					  0000_0000_0000_0010_0000_0000_0000_0001 ^
		//hShift16			  0000_0000_0000_0000_0000_0000_0000_0010
		
		//hXorHShift16		  0000_0000_0000_0010_0000_0000_0000_0011 &
		//n - 1				  0000_0000_0000_0000_0000_0000_0001_1111
		//n_1 & hXorHShift16  0000_0000_0000_0000_0000_0000_0000_0011 
		
		hXorHShift16 = h ^ hShift16; // 0b0000_0000_0000_0010_0000_0000_0000_0011
		System.out.println("hXorHShift16: " + Integer.toBinaryString(hXorHShift16));
		System.out.println("n_1 & hXorHShift16: " + (n_1 & hXorHShift16)); // 0b0000_0000_0000_0000_0000_0000_0000_0011 -> 3
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		n_1 = 0b0000_0000_0000_0000_0000_0000_0001_1111; // (n - 1) = 31
		h = 0b0000_0000_0000_0011_0000_0000_0000_0001; // h = 196.609
		System.out.println("n_1 & h:" + (n_1 & h)); // 0b0000_0000_0000_0000_0000_0000_0000_0001 -> 1
		
		hShift16 = h >>> 16; // 0b0000_0000_0000_0000_0000_0000_0000_0010
		System.out.println("hShift16: " + Integer.toBinaryString(hShift16));
		//h					  0000_0000_0000_0011_0000_0000_0000_0001 ^
		//hShift16			  0000_0000_0000_0000_0000_0000_0000_0011
		//hXorHShift16		  0000_0000_0000_0011_0000_0000_0000_0010 &
		//n - 1				  0000_0000_0000_0000_0000_0000_0001_1111
		//n_1 & h             0000_0000_0000_0000_0000_0000_0000_0010
		hXorHShift16 = h ^ hShift16; // 0b0000_0000_0000_0010_0000_0000_0000_0011
		System.out.println("hXorHShift16: " + Integer.toBinaryString(hXorHShift16));
		System.out.println("n_1 & hXorHShift16: " + (n_1 & hXorHShift16)); // 0b0000_0000_0000_0000_0000_0000_0000_0010 -> 2
		
		System.out.println();
		System.out.println("6.0--------------------------");
		System.out.println();
		/*
		 * gli insiemi non prevedono duplicati e non mantengono un ordine specifico degli elementi,
		 */
		//Operazioni sugli insiemi
		Set<String> nomi1 = new HashSet<>();
		nomi1.add("Luca");
		nomi1.add("Massimo");
		nomi1.add("Carlo");
		
		Set<String> nomi2 = new HashSet<>();
		nomi2.add("Luca");
		nomi2.add("Lucia");
		nomi2.add("Sara");
		
		Set<String> intersezioneDiNomi = new HashSet<>(nomi1);
		intersezioneDiNomi.retainAll(nomi2); // o(n) per HashSet
		System.out.println("	Intersezione di nomi: " + intersezioneDiNomi);
		/*
		 * con la porzione di codice retainAll stiamo creando un nuovo insieme chiamato intersezioneDiNomi, che inizialmente contiene tutti gli elementi di nomi1.
		 * poi, con il metodo retainAll(nomi2), stiamo modificando intersezioneDiNomi in modo che contenga solo gli elementi che sono presenti sia in nomi1 che in nomi2,
		 * in parole semplici ci mostra solo gli elementi in comuni tra i due insiemi, in questo caso sarà solo "Luca"
		 */
		Set<String> unioneDiNomi = new HashSet<>(nomi1);
		unioneDiNomi.addAll(nomi2); // o(n) per HashSet
		System.out.println("	Unione di nomi: " + unioneDiNomi);
		/*
		 * qui invece abbiamo usato il metodo addAll(nomi2) per creare un nuovo insieme chiamato unioneDiNomi, che inizialmente contiene tutti gli elementi di nomi1.
		 * poi, con addAll(nomi2), stiamo modificando unioneDiNomi in modo che contenga tutti gli elementi di nomi1 e tutti gli elementi di nomi2,
		 * in parole semplici ci mostra tutti gli elementi presenti in almeno uno dei due insiemi, in questo caso sarà "Luca", "Massimo", "Carlo", "Lucia" e "Sara"
		 * dove luca anche se presente in entrambi gli insiemi, viene inserito solo una volta nell'unione, in quanto gli insiemi non prevedono duplicati.
		 */
		Set<String> differenzaDiNomi = new HashSet<>(nomi1);
		differenzaDiNomi.removeAll(nomi2); // o(n) per HashSet
		System.out.println("	Differenza di nomi: " + differenzaDiNomi);
		
		/*
		 * con removeAll(nomi2) stiamo creando un nuovo insieme chiamato differenzaDiNomi, che inizialmente contiene tutti gli elementi di nomi1.
		 * poi, con removeAll(nomi2), stiamo modificando differenzaDiNomi in modo che contenga solo gli elementi che sono presenti in nomi1 ma non in nomi2,
		 * in parole semplici ci mostra solo gli elementi che sono presenti in nomi1 ma non in nomi2, in questo caso sarà "Massimo" e "Carlo"
		 * dove "Luca" non è presente in differenzaDiNomi, in quanto è presente in entrambi gli insiemi, e gli insiemi non prevedono duplicati.
		 */
		
		Set<String> differenzaDiNomi2 = new HashSet<>(nomi2);
		differenzaDiNomi2.removeAll(nomi1); // o(n) per HashSet
		System.out.println("	Differenza di nomi 2: " + differenzaDiNomi2);
	}

}
