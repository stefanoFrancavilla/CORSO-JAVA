package appunti;

public class AppuntiCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Guida base alle Collections in Java
Le Collections in Java sono un insieme di interfacce e classi del pacchetto java.util usate per memorizzare, organizzare e manipolare gruppi di oggetti in modo uniforme.
 Il Java Collections Framework fornisce una struttura comune basata su interfacce, implementazioni e algoritmi, così da poter lavorare con i dati senza dipendere troppo dai dettagli interni della struttura scelta.

Che cosa sono
Una collection è un oggetto che rappresenta un gruppo di altri oggetti.
 Questo framework aiuta a ridurre lo sforzo di programmazione, favorisce il riuso del codice e rende più semplice imparare nuove API che seguono la stessa logica.

Per chi inizia, il punto più importante è questo:

se serve una sequenza ordinata di elementi, spesso si usa List.

se servono elementi unici, si usa Set.

se serve una coda, si usa Queue o Deque.

se servono coppie chiave-valore, si usa Map.

Schema generale
text
Iterable
└── Collection
    ├── List
    │   ├── ArrayList
    │   ├── LinkedList
    │   ├── Vector
    │   └── Stack
    ├── Set
    │   ├── HashSet
    │   ├── LinkedHashSet
    │   └── TreeSet
    └── Queue
        ├── PriorityQueue
        └── Deque
            ├── ArrayDeque
            └── LinkedList

Map
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable
Map appartiene al framework delle collections, ma non estende l’interfaccia Collection.
 Le implementazioni più usate in generale sono ArrayList per List, HashSet per Set, HashMap per Map, LinkedList per Queue e ArrayDeque per Deque.

Le interfacce principali
Interfaccia	A cosa serve	Duplicati	Ordine	Accesso per indice
Collection	Base comune per gruppi di elementi	Dipende dall'implementazione	Dipende	No
List	Sequenza ordinata di elementi	Sì	Sì	Sì
Set	Insieme di elementi unici	No	Dipende dall'implementazione	No
Queue	Gestione tipo coda	Sì, in genere	Dipende dalla coda	No
Deque	Coda doppia, da entrambe le estremità	Sì, in genere	Sì/logico	No
Map	Coppie chiave-valore	Chiavi uniche	Dipende dall'implementazione	No
Le interfacce rappresentano il “contratto”, cioè definiscono quali operazioni si possono fare; le classi concrete, come ArrayList o HashMap, realizzano quel contratto.

Metodi principali di Collection
L’interfaccia Collection eredita da Iterable, quindi può essere percorsa con il ciclo for-each.
 I metodi più importanti sono questi:

add(E e): aggiunge un elemento.

remove(Object o): rimuove un elemento.

contains(Object o): controlla se l’elemento è presente.

size(): restituisce il numero di elementi.

isEmpty(): controlla se la collection è vuota.

clear(): elimina tutti gli elementi.

iterator(): restituisce un iteratore.

Esempio
java
Collection<String> nomi = new ArrayList<>();
nomi.add("Luca");
nomi.add("Anna");

System.out.println(nomi.contains("Anna")); // true
System.out.println(nomi.size());             // 2
List: quando conta la posizione
Una List mantiene l’ordine di inserimento e permette elementi duplicati.
 È la scelta più comune quando serve trattare i dati come una sequenza in cui la posizione ha importanza.

Metodi aggiuntivi di List
Oltre ai metodi di Collection, List aggiunge operazioni legate alla posizione:

get(int index): legge l’elemento in una posizione.

set(int index, E element): sostituisce l’elemento in una posizione.

add(int index, E element): inserisce un elemento in una posizione specifica.

remove(int index): rimuove l’elemento in una posizione.

indexOf(Object o): trova la prima posizione di un elemento.

lastIndexOf(Object o): trova l’ultima posizione.

Implementazioni più usate
Classe	Caratteristiche principali
ArrayList	Array ridimensionabile, accesso rapido per indice.
LinkedList	Basata su collegamenti, utile anche come Queue o Deque.
Vector	Classe legacy sincronizzata, oggi meno usata.
Stack	Estende Vector, rappresenta una pila LIFO, ma oggi spesso si preferisce Deque.
Esempio con List
java
List<String> frutti = new ArrayList<>();
frutti.add("Mela");
frutti.add("Pera");
frutti.add("Mela");

System.out.println(frutti.get(1));      // Pera
System.out.println(frutti.indexOf("Mela")); // 0
Set: niente duplicati
Un Set non permette duplicati.
 Se si prova ad aggiungere un elemento già presente, l’inserimento non modifica l’insieme.

Implementazioni più usate
Classe	Caratteristiche principali
HashSet	Non garantisce un ordine particolare, molto usato.
LinkedHashSet	Mantiene l’ordine di inserimento.
TreeSet	Mantiene gli elementi ordinati secondo l’ordine naturale o un comparatore.
Esempio con Set
java
Set<String> corsi = new HashSet<>();
corsi.add("Java");
corsi.add("SQL");
corsi.add("Java");

System.out.println(corsi.size()); // 2
Queue e Deque: gestione a coda
Una Queue è pensata per inserire elementi e recuperarli secondo una logica di coda, spesso FIFO, cioè il primo che entra è il primo che esce.
 Una Deque permette invece di lavorare da entrambe le estremità e può comportarsi sia come coda sia come pila.

Metodi tipici di Queue
offer(E e): inserisce un elemento senza lanciare eccezioni in alcuni casi limite.

poll(): estrae e rimuove la testa della coda.

peek(): legge la testa senza rimuoverla.

remove(): rimuove la testa della coda.

Implementazioni comuni
Classe	Caratteristiche principali
LinkedList	Può essere usata come Queue e Deque.
PriorityQueue	Restituisce gli elementi secondo priorità, non in puro ordine di inserimento.
ArrayDeque	Molto usata per code e pile, generalmente preferita a Stack.
Esempio con Queue
java
Queue<String> coda = new LinkedList<>();
coda.offer("Primo");
coda.offer("Secondo");

System.out.println(coda.peek()); // Primo
System.out.println(coda.poll()); // Primo
Map: chiave e valore
Map memorizza coppie chiave-valore e non estende Collection.
 Le chiavi devono essere uniche, mentre i valori possono dipendere dall’implementazione scelta.

Metodi principali di Map
put(K key, V value): inserisce o aggiorna una coppia chiave-valore.

get(Object key): restituisce il valore associato a una chiave.

remove(Object key): rimuove una chiave con il suo valore.

containsKey(Object key): controlla se la chiave esiste.

size(): numero di coppie presenti.

keySet(): restituisce l’insieme delle chiavi.

values(): restituisce la collezione dei valori.

entrySet(): restituisce l’insieme delle associazioni chiave-valore.

Implementazioni più usate
Classe	Caratteristiche principali
HashMap	Nessun ordine particolare, è la scelta più comune.
LinkedHashMap	Mantiene l’ordine di inserimento delle chiavi.
TreeMap	Mantiene le chiavi ordinate.
Hashtable	Legacy e sincronizzata, oggi meno comune.
Esempio con Map
java
Map<String, Integer> voti = new HashMap<>();
voti.put("Marco", 28);
voti.put("Anna", 30);

System.out.println(voti.get("Anna"));        // 30
System.out.println(voti.containsKey("Marco")); // true
La classe Collections
La classe Collections non è l’interfaccia Collection: è una classe di utilità con metodi statici che lavorano sulle collection.
 Tra gli algoritmi forniti dal framework ci sono operazioni come l’ordinamento delle liste.

Metodi utili di Collections
Collections.sort(lista): ordina una lista.

Collections.reverse(lista): inverte l’ordine degli elementi.

Collections.max(collection): restituisce l’elemento massimo.

Collections.min(collection): restituisce l’elemento minimo.

Collections.shuffle(lista): mescola gli elementi.

Esempio
java
List<Integer> numeri = new ArrayList<>();
numeri.add(5);
numeri.add(2);
numeri.add(9);

Collections.sort(numeri);
System.out.println(numeri); // [2, 5, 9]
Come scegliere la collection giusta
Situazione	Scelta consigliata	Motivo
Serve una lista semplice con accesso per indice	ArrayList	È la lista generica più usata.
Servono valori unici	HashSet	Evita duplicati in modo semplice.
Serve ordine di inserimento senza duplicati	LinkedHashSet	Mantiene l’ordine e non accetta doppioni.
Serve una coda classica	LinkedList o ArrayDeque	Sono adatte alla logica FIFO o doppia coda.
Servono coppie chiave-valore	HashMap	È la mappa più usata.
Serve ordinamento automatico	TreeSet o TreeMap	Mantengono elementi o chiavi ordinati.
Errori comuni dei principianti
Confondere Collection con Collections: la prima è un’interfaccia, la seconda è una classe di utilità.

Pensare che Map sia una Collection: fa parte del framework, ma è separata dalla gerarchia Collection.

Usare Set aspettandosi duplicati: un Set li elimina o impedisce di inserirli.

Usare Stack per abitudine: nelle API moderne spesso Deque è la scelta preferita per comportamenti da pila.

Esempio completo per ripasso
java
import java.util.*;

public class EsempioCollections {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("A");

        Set<String> insieme = new HashSet<>();
        insieme.add("A");
        insieme.add("B");
        insieme.add("A");

        Queue<String> coda = new LinkedList<>();
        coda.offer("uno");
        coda.offer("due");

        Map<String, Integer> mappa = new HashMap<>();
        mappa.put("Luca", 10);
        mappa.put("Anna", 20);

        System.out.println(lista);        // [A, B, A]
        System.out.println(insieme);      // [A, B] (ordine non garantito)
        System.out.println(coda.poll());  // uno
        System.out.println(mappa.get("Anna")); // 20
    }
}
Questo esempio mostra le differenze fondamentali: la List conserva ordine e duplicati, il Set conserva solo valori unici, la Queue gestisce una sequenza di uscita, e la Map collega una chiave a un valore.

Nozioni da ricordare
List = ordine + duplicati.

Set = niente duplicati.

Queue = gestione a coda.

Deque = coda doppia o pila moderna.

Map = chiave + valore.

ArrayList, HashSet e HashMap sono spesso i punti di partenza migliori per chi inizia.
 */
	}

}
