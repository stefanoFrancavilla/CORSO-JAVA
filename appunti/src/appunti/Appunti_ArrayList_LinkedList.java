package appunti;

public class Appunti_ArrayList_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Guida base a ArrayList e LinkedList in Java
ArrayList e LinkedList sono due implementazioni generiche dell’interfaccia List nel Java Collections Framework.
 Entrambe mantengono l’ordine degli elementi e permettono duplicati, ma funzionano in modo diverso e conviene sceglierle in base al tipo di operazioni che il programma esegue più spesso.

Cosa hanno in comune
Sia ArrayList sia LinkedList implementano List, quindi supportano operazioni come inserire elementi, leggerli per posizione, modificarli e rimuoverli.
 In entrambi i casi si possono usare generics, ciclo for-each, iteratori e i metodi tipici di una lista Java.

Differenza principale
ArrayList è basata su un array ridimensionabile.
 LinkedList è basata su una lista doppiamente collegata, cioè ogni elemento è contenuto in un nodo che tiene riferimenti al nodo precedente e a quello successivo.

Questa differenza interna cambia molto il comportamento pratico:

ArrayList è molto veloce quando bisogna leggere un elemento tramite indice, come get(5).

LinkedList è più adatta quando si inseriscono o rimuovono spesso elementi all’inizio della lista o durante l’attraversamento con un iteratore.

Oracle segnala che nella maggior parte dei casi ArrayList è la scelta più comune e spesso anche la più veloce in pratica.

Metodi principali di ArrayList
ArrayList eredita i metodi di List e Collection, quindi offre le operazioni classiche di gestione di una lista.
 I metodi più usati sono:

add(E e): aggiunge un elemento in coda.

add(int index, E element): inserisce un elemento in una posizione precisa.

get(int index): restituisce l’elemento alla posizione indicata.

set(int index, E element): sostituisce un elemento.

remove(int index) e remove(Object o): rimuovono per posizione o per valore.

size(): restituisce il numero di elementi.

contains(Object o): controlla la presenza di un elemento.

clear(): svuota la lista.

ensureCapacity(int minCapacity): permette di aumentare preventivamente la capacità interna, utile quando si sa già che la lista crescerà molto.

trimToSize(): riduce la capacità alla dimensione effettiva della lista.

Esempio base con ArrayList
java
import java.util.ArrayList;

public class EsempioArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();

        nomi.add("Luca");
        nomi.add("Anna");
        nomi.add("Marco");

        System.out.println(nomi.get(1));   // Anna
        nomi.set(1, "Giulia");
        System.out.println(nomi);          // [Luca, Giulia, Marco]
    }
}
Metodi principali di LinkedList
LinkedList implementa sia List sia Deque, quindi oltre ai metodi classici di lista offre anche operazioni comode per lavorare da inizio e fine struttura.
 Questo la rende utile anche come coda o come pila moderna.

I metodi più importanti sono:

add(E e): aggiunge in coda.

add(int index, E element): inserisce in una posizione.

get(int index): legge l’elemento a una posizione, ma questa operazione è più costosa rispetto ad ArrayList.

remove(int index) e remove(Object o): rimuovono elementi.

addFirst(E e): inserisce all’inizio.

addLast(E e): inserisce alla fine.

getFirst(): legge il primo elemento.

getLast(): legge l’ultimo elemento.

removeFirst(): rimuove il primo elemento.

removeLast(): rimuove l’ultimo elemento.

offer(E e), peek(), poll(): utili quando la si usa come coda.

Esempio base con LinkedList
java
import java.util.LinkedList;

public class EsempioLinkedList {
    public static void main(String[] args) {
        LinkedList<String> citta = new LinkedList<>();

        citta.add("Roma");
        citta.addFirst("Milano");
        citta.addLast("Napoli");

        System.out.println(citta);         // [Milano, Roma, Napoli]
        System.out.println(citta.getFirst()); // Milano
        citta.removeLast();
        System.out.println(citta);         // [Milano, Roma]
    }
}
Confronto pratico
Aspetto	ArrayList	LinkedList
Struttura interna	Array ridimensionabile.
Lista doppiamente collegata.
Accesso con indice	Molto veloce, in tempo costante.
Più lento, in tempo lineare.
Inserimento in mezzo	Richiede spostamento di elementi.
Può essere vantaggioso se si è già nella posizione giusta tramite iteratore.
Inserimento all’inizio	Generalmente costoso.
Più adatto.
Memoria	Minore overhead in generale.
Maggiore overhead per via dei riferimenti tra nodi.
Uso come coda/deque	Meno naturale	Più naturale, perché implementa anche Deque.
Quando conviene usare ArrayList
Nella maggior parte dei programmi, conviene partire da ArrayList.
 Oracle afferma che nella pratica ArrayList è probabilmente la lista che si userà più spesso, perché offre accesso posizionale in tempo costante ed è semplicemente molto veloce.

Situazioni tipiche
Quando leggi spesso gli elementi tramite indice, per esempio lista.get(i) dentro un ciclo.

Quando fai molte letture e poche modifiche strutturali.

Quando la lista cresce soprattutto in fondo con add(e).

Quando vuoi una soluzione generica e semplice per quasi tutti i casi comuni.

Perché conviene
Con ArrayList, gli elementi sono gestiti in modo molto efficiente per l’accesso diretto e per molte operazioni comuni.
 Inoltre non serve creare un nodo separato per ogni elemento, e Oracle evidenzia che può sfruttare operazioni interne efficienti come System.arraycopy quando deve spostare più elementi insieme.

Esempio di situazione reale
Una rubrica di nomi mostrata a schermo, in cui l’utente consulta spesso gli elementi per posizione e li modifica raramente, è un caso tipico in cui ArrayList è quasi sempre una scelta migliore.

Quando conviene usare LinkedList
LinkedList conviene soprattutto quando si fanno molte aggiunte o rimozioni all’inizio della lista, oppure quando si usa la struttura come coda o deque.
 Oracle suggerisce di considerarla se si aggiungono spesso elementi all’inizio o se si itera la lista per cancellare elementi interni.

Situazioni tipiche
Quando servono spesso addFirst(), removeFirst(), getFirst().

Quando la struttura deve funzionare come coda, deque o pila.

Quando si modifica spesso la lista durante una scansione con iteratore.

Perché conviene
In queste situazioni la struttura a nodi facilita certe operazioni di collegamento e scollegamento.
 Però bisogna ricordare che leggere un elemento per indice è molto meno conveniente rispetto ad ArrayList.

Esempio di situazione reale
Una lista di operazioni da processare in ordine di arrivo, oppure una struttura in cui si aggiungono e rimuovono spesso elementi da inizio e fine, è un contesto in cui LinkedList può avere più senso.

Regola pratica per chi inizia
Per un principiante, la regola più utile è questa: usa ArrayList come scelta predefinita e passa a LinkedList solo se hai un motivo concreto legato a inserimenti/rimozioni frequenti alle estremità o all’uso come coda/deque.
 Oracle consiglia anche di misurare le prestazioni dell’applicazione con entrambe le strutture prima di decidere in casi dubbi, perché spesso ArrayList risulta comunque più veloce.

Errori comuni
Scegliere LinkedList pensando che sia sempre più veloce negli inserimenti: dipende dal punto in cui bisogna arrivare, perché trovare la posizione può comunque costare tempo.

Usare LinkedList quando si fanno molte chiamate a get(i): in questo caso ArrayList è in genere molto migliore.

Dimenticare che LinkedList occupa più memoria per via dei riferimenti tra nodi.

Non distinguere tra teoria e pratica: anche se alcune operazioni sembrano migliori sulla carta, Oracle sottolinea che ArrayList è spesso la scelta più rapida nella realtà.

Esempio finale di confronto
java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConfrontoListe {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        System.out.println(lista1.get(2)); // veloce

        LinkedList<String> lista2 = new LinkedList<>();
        lista2.addFirst("A");
        lista2.addLast("B");
        lista2.addLast("C");
        System.out.println(lista2.removeFirst()); // comodo e naturale
    }
}
In questo esempio ArrayList è adatta quando interessa l’accesso veloce per indice, mentre LinkedList è più naturale quando si lavora con l’inizio e la fine della struttura.

Da ricordare
ArrayList = scelta predefinita nella maggior parte dei casi.

ArrayList = più adatta per accesso veloce con indice.

LinkedList = utile per operazioni frequenti alle estremità.

LinkedList = utile anche come Queue o Deque.

Se il dubbio resta, conviene testare entrambe nella propria applicazione.
		 */
	}

}
