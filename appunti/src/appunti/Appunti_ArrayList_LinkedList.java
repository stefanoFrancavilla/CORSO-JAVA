package appunti;

public class Appunti_ArrayList_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *    // Creiamo una LinkedList
        LinkedList<String> lista = new LinkedList<>();
        
        System.out.println("LINKEDLIST NON HA ESPANSIONE AUTOMATICA!");
        System.out.println("Perché ogni elemento è un NODE indipendente\\n");
        
        System.out.println("Aggiungo 5 elementi uno alla volta...\\n");
        
        // Aggiungiamo 5 elementi
        for (int i = 1; i <= 5; i++) {
            lista.add("Elemento" + i);
            System.out.println("Elemento " + i + " aggiunto: \"" + lista.get(i-1) + "\"");
            System.out.println("Size attuale: " + lista.size());
            
            if (i < 5) {
                System.out.println("-".repeat(50));
            }
        }
        
        System.out.println("\\n=== RIEPILOGO ===");
        System.out.println("Elementi totali: " + lista.size());
        System.out.println("Espansioni avvenute: 0 (NON NE FA!)");
        System.out.println("\\nCome funziona dietro le quinte:");
        System.out.println("1. LinkedList NON usa un array interno");
        System.out.println("2. Ogni elemento è un NODE (nodo) indipendente");
        System.out.println("3. Ogni nodo contiene: [dato][riferimento al prossimo nodo]");
        System.out.println("4. I nodi sono collegati tramite riferimenti (punteri)");
        System.out.println("5. NON serve copiare elementi quando si aggiunge!");
        
        System.out.println("\\n=== SCHEMA VISIVO DELLA STRUTTURA ===");
        System.out.println("""
            
            INIZIO: LinkedList vuota
                │
                ▼
            head = null, tail = null
                │
                ▼
            Aggiungo Elemento1
                │
                ▼
            head ──► [Elemento1 | next=null] ◄── tail
                     ↑
                     nodo1 (creato al volo, memoria dinamica)
                │
                ▼
            Aggiungo Elemento2
                │
                ▼
            head ──► [Elemento1 | next─┐] ──► [Elemento2 | next=null] ◄── tail
                     ↑                      ↑
                     nodo1                  nodo2 (NUOVO nodo creato)
                                            (collegato al precedente)
                │
                ▼
            Aggiungo Elemento3
                │
                ▼
            head ──► [E1 | next─┐] ──► [E2 | next─┐] ──► [E3 | next=null] ◄── tail
                     ↑              ↑                  ↑
                     nodo1         nodo2              nodo3 (NUOVO nodo)
                │
                ▼
            ...continua aggiungendo NUOVI nodi indipendenti
                │
                ▼
            head ──► [E1] ──► [E2] ──► [E3] ──► [E4] ──► [E5] ◄── tail
            
            
            DIFFERENZA CHIAVE RISPETTO AD ARRAYLIST:
            
            ARRAYLIST:                          LINKEDLIST:
            [E1][E2][E3][ ][ ]        head ──► [E1] ──► [E2] ──► [E3]
            │                                  ↑         ↑         ↑
            Quando si espande:                nodo1     nodo2     nodo3
            [E1][E2][E3][E4][E5]              (ogni nodo
            ↑                                 è in MEMORIA
            Copia TUTTI gli elementi          INDIPENDENTE)
            in un NUOVO array
                
            
            """
        );
        
        System.out.println("=== CONFRONTO ARRAYLIST vs LINKEDLIST ===");
        System.out.println("""
            
            ARRAYLIST:                          LINKEDLIST:
            ─────────────────                   ─────────────────
            ✓ Accesso veloce (get(i))           ✗ Accesso lento (deve scorrere)
            ✓ Array continuo in memoria         ✓ Inserimento/rimozione veloce
            ✗ Espansione costosa (copia O(n))   ✓ NON si espande (nodi indipendenti)
            ✗ Inserimento lento in mezzo        ✓ Memoria utilizzata al bisogno
            Occupa memoria fissa (capacity)     ✓ Aggiunge solo quando serve
            
            """
        );
        
        System.out.println("=== WHEN TO USE LINKEDLIST ===");
        System.out.println("Usa LinkedList quando:");
        System.out.println("• Aggiungi/rimuovi spesso elementi INIZIO/FINE lista");
        System.out.println("• Non sai quanti elementi userai (memoria dinamica)");
        System.out.println("• Non ti serve accesso casuale veloce (get(i))");
        System.out.println("\\nUsa ArrayList quando:");
        System.out.println("• Devi accedere rapidamente agli elementi per indice");
        System.out.println("• Fai molte letture, poche modifiche");
        System.out.println("• Vuoi prestazioni migliori nella maggior parte dei casi");
        
        System.out.println("\\n=== ESEMPIO DI INSERIMENTO VELOCE IN INIZIO ===");
        System.out.println("Prima (ArrayList):");
        System.out.println("   ArrayList<String> lista = new ArrayList<>();");
        System.out.println("   lista.add(0, \"Primo\");  // Sposta TUTTI gli elementi!");
        System.out.println("\\nDopo (LinkedList):");
        System.out.println("   LinkedList<String> lista = new LinkedList<>();");
        System.out.println("   lista.add(0, \"Primo\");  // Cambia solo 2 riferimenti! Velocissimo!");
    }
}
📌 Differenze chiave tra ArrayList e LinkedList:
Aspetto	ArrayList	LinkedList
Struttura interna	Array continuo Object[] 
Nodi collegati tramite riferimenti 
Espansione	Automatica (10→16→25→38...) 
NON esiste (nodi indipendenti) 
Aggiungi elemento	Lento quando si espande (copia O(n)) 
Sempre veloce (crea 1 nodo) 
Accesso per indice	Velocissimo O(1) 
Lento O(n) deve scorrere 
Memoria	Fissa (capacity)	Dinamica (solo nodi usati) 
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
		
		/*
		 *  System.out.println("=== DEMO DOUBLY LINKED LIST (LINKEDLIST IN JAVA) ===\n");
        
        System.out.println("LINKEDLIST IN JOBGY è una DOUBLY LINKED LIST!");
        System.out.println("Ogni nodo ha 3 parti: [PREV][DATA][NEXT]\\n");
        
        // Creiamo una LinkedList
        LinkedList<String> lista = new LinkedList<>();
        
        System.out.println("Aggiungo 4 elementi: A, B, C, D\\n");
        
        // Aggiungiamo elementi
        lista.add("A");
        System.out.println("Aggiunto A:");
        printStructure("A", 1, lista.size());
        
        lista.add("B");
        System.out.println("\\nAggiunto B:");
        printStructure("A-B", 2, lista.size());
        
        lista.add("C");
        System.out.println("\\nAggiunto C:");
        printStructure("A-B-C", 3, lista.size());
        
        lista.add("D");
        System.out.println("\\nAggiunto D:");
        printStructure("A-B-C-D", 4, lista.size());
        
        System.out.println("\\n" + "=".repeat(70));
        System.out.println("=== RIEPILOGO ===");
        System.out.println("Elementi totali: " + lista.size());
        System.out.println("Espansioni avvenute: 0 (nodi indipendenti)");
        System.out.println("\\nCome funziona DOUBLY LINKED LIST dietro le quinte:");
        System.out.println("1. Ogni nodo ha 3 campi: PREV + DATA + NEXT");
        System.out.println("2. PREV = riferimento al nodo precedente (null se è il primo)");
        System.out.println("3. NEXT = riferimento al nodo successivo (null se è l'ultimo)");
        System.out.println("4. Si può scorrere in ENTRAMBE le direzioni (prima/dopo)");
        System.out.println("5. head punta al primo nodo, tail all'ultimo");
        
        System.out.println("\\n" + "=".repeat(70));
        System.out.println("=== SCHEMA VISIVO COMPLETO DOUBLY LINKED LIST ===");
        System.out.println("""
            
            ╔════════════════════════════════════════════════════════════════════╗
            ║            STRUTTURA DI UN SINGOLO NODO DOUBLY LINKED              ║
            ╚════════════════════════════════════════════════════════════════════╝
            
            ┌───────────┬──────────────┬───────────┐
            │   PREV    │    DATA      │   NEXT    │
            │ (precedente) │  (valore)  │ (successivo)│
            └───────────┴──────────────┴───────────┘
                  ↑            ↑            ↑
              riferimento  l'elemento   riferimento
              al nodo      vero e       al nodo
              precedente   proprio      successivo
            
            
            ╔════════════════════════════════════════════════════════════════════╗
            ║              ESEMPIO: Lista con A, B, C, D                         ║
            ╚════════════════════════════════════════════════════════════════════╝
            
            head                                                            tail
              │                                                               │
              ▼                                                               ▼
            ┌─────┐   ┌───────────┬─────────┬───────────┐   ┌───────────┬───────────┐
            │null │──►│    A      │    B    │    C      │──►│    D      │   null    │
            └─────┘   └───────────┴─────────┴───────────┘   └───────────┴───────────┘
              │           ↑           ↑           ↑             ↑           │
              │           │           │           │             │           │
              │      ┌────┴────┐ ┌───┴────┐ ┌───┴────┐   ┌─────┴─────┐   ┌─┴─┐
              │      │  null   │ │   A    │ │   B    │   │    C      │ │null│
              │      └─────────┘ └────────┘ └────────┘   └───────────┘ └────┘
              │            (PREV)  (PREV)   (PREV)        (PREV)      (NEXT)
              │
              └──► head = primo elemento
                   tail = ultimo elemento
            
            
            ╔════════════════════════════════════════════════════════════════════╗
            ║           CONNESSIONI BIDIREZIONALI (FLECHE DOPPIE)                ║
            ╚════════════════════════════════════════════════════════════════════╝
            
            head ──► [null│ A │B] ◄────► [A│ B │C] ◄────► [B│ C │D] ◄────► [C│ D │null] ◄── tail
                      nodo1              nodo2              nodo3              nodo4
            
            Scorrimento in AVANTI (NEXT):
            head → nodo1 → nodo2 → nodo3 → nodo4 → tail
            
            Scorrimento all INDIETRO (PREV):
            tail → nodo4 → nodo3 → nodo2 → nodo1 → head
            
            
            ╔════════════════════════════════════════════════════════════════════╗
            ║              COSA SUCCEDE QUANDO AGGIUNGO "E" ALLA FINE            ║
            ╚════════════════════════════════════════════════════════════════════╝
            
            PRIMA di aggiungere E:
            ┌─────┐   ┌───────────┬─────────┬───────────┐   ┌───────────┬───────────┐
            │null │──►│    A      │    B    │    C      │──►│    D      │   null    │◄── tail
            └─────┘   └───────────┴─────────┴───────────┘   └───────────┴───────────┘
              │                                                        ▲
              └────────────────────────────────────────────────────────┘
                                    head
            
            AGGIOUNGO "E":
            1. Creo NUOVO nodo E nella memoria
            2. nodoE.PREV = nodoD (l'ultimo attuale)
            3. nodoE.NEXT = null (sarà il nuovo ultimo)
            4. nodoD.NEXT = nodoE (collego D a E)
            5. tail = nodoE (aggiorno tail)
            
            DOPO aver aggiunto E:
            ┌─────┐   ┌───────────┬─────────┬───────────┐   ┌───────────┬───────────┐   ┌───────────┬───────────┐
            │null │──►│    A      │    B    │    C      │──►│    D      │    E      │──►│    null   │   null    │◄── tail
            └─────┘   └───────────┴─────────┴───────────┘   └───────────┴───────────┘   └───────────┴───────────┘
              │                                                        ▲                    ▲
              │                                           nodoD.NEXT    │           nodoE.PREV
              │                                           = nodoE       │           = nodoD
              └─────────────────────────────────────────────────────────┴──────────────────┘
                                    head
            
            VANTAGGIO: Aggiungo solo cambi
</parameter>
</function>
<parameter=code>

</parameter>
</function>
<parameter=file_name>
DoublyLinkedListDemo.java
</parameter>
<parameter=input_ids>
[]
</parameter>
<parameter=prompt>
Create a professional educational diagram showing the structure of a Doubly Linked List in Java. The diagram should show:

1. A single node structure with three parts: PREV (previous pointer), DATA (value), and NEXT (next pointer)
2. An example doubly linked list with 4 elements: A, B, C, D
3. Show head pointing to the first node and tail pointing to the last node
4. Show bidirectional arrows (both forward and backward connections) between nodes
5. Clear labels showing null pointers at the ends

Use a clean, technical diagram style with ASCII art or labeled boxes and arrows. The diagram should be educational and easy to understand for Java programming students. Use colors: blue for PREV pointers, green for NEXT pointers, orange for DATA values. Make it look like a professional textbook illustration.

Prompt in Italian: "Crea uno schema educativo professionista che mostra la struttura di una Doubly Linked List in Java. Lo schema deve mostrare un nodo con PREV, DATA, NEXT, e una lista con elementi A, B, C, D, con head e tail, e frecce bidirezionali."
</parameter>
</function>
</function>
<parameter=queries>
["doubly linked list java LinkedList bidirezionale schema"]
</parameter>
<parameter=user_description>
Cerco informazioni su Doubly Linked List in Java
</parameter>
</function>
		 */
	}

}
