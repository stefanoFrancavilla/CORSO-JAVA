package appunti;

public class ArrayDeque {

	/*
	 * =============================================================================
 *                    ARRAYDEQUE IN JAVA - APPUNTI COMPLETI
 * =============================================================================
 * 
 * COS'È ARRAYDEQUE?
 * -----------------
 * ArrayDeque è una realizzazione dell'interfaccia Deque (Double-Ended Queue) 
 * basata su un array ridimensionabile. Il nome "deque" si pronuncia "deck".
 * 
 * Caratteristiche principali:
 * - Permette di aggiungere/rimuovere elementi da ENTRAMBE le estremità (fronte e fondo)
 * - Più veloce di Stack e LinkedList per l'uso come coda o stack [web:3][web:5]
 * - Non ammette elementi null
 * - Permette duplicati
 * - Complessità O(1) per operazioni di inserimento/rimozione [web:1][web:8]
 * 
 * =============================================================================
 *                    FUNZIONAMENTO INTERNO (Dietro le quinte)
 * =============================================================================
 * 
 * STRUTTURA: Ring Buffer (Circular Array)
 * ----------------------------------------
 * 
 * ArrayDeque utilizza un array circolare (ring buffer) con due puntatori:
 *   - HEAD: punta all'elemento iniziale (inizio coda/top dello stack)
 *   - TAIL: punta alla posizione successivo all'ultimo elemento
 * 
 * GRAFICO DEL FUNZIONAMENTO:
 * --------------------------
 * 
 *  Stato iniziale (vuoto):
 *  ┌────────────────────────────────────────┐
 *  │  [0] [1] [2] [3] [4] [5] [6] [7] ...   │  ← Array di capacità 16 (default)
 *  │   ↑              ↑                     │
 *  │  head           tail                   │
 *  └────────────────────────────────────────┘
 * 
 *  Dopo addLast("A"), addLast("B"), addLast("C"):
 *  ┌────────────────────────────────────────┐
 *  │  [0]  [1]  [2]  [3] [4] [5] [6] [7]... │
 *  │   A    B    C   null ...               │
 *  │   ↑         ↑                          │
 *  │  head     tail                         │
 *  └────────────────────────────────────────┘
 * 
 *  Dopo addFirst("Start"):
 *  ┌────────────────────────────────────────┐
 *  │  [0]  [1]  [2]  [3] [4] [5] [6] [7]... │
 *  │  Start  A    B    C   null ...         │
 *  │         ↑    ↑                         │
 *  │        head tail                       │
 *  └────────────────────────────────────────┘
 * 
 *  Quando l'array si riempie, raddoppia automaticamente la capacità:
 *  ┌──────────────────────────────────────────────────────────┐
 *  │  Vecchio array (capacità 16) → Nuovo array (capacità 32) │
 *  │  Elementi copiati in ordine, head/tail riposizionati     │
 *  └──────────────────────────────────────────────────────────┘
 * 
 *  Funzionamento come STACK (LIFO):
 *  --------------------------------
 *  push("X") → inserisce all'inizio, head punta a "X"
 *  pop()     → rimuove da head, imposta null per garbage collection, sposta head indietro
 * 
 *  Funzionamento come QUEUE (FIFO):
 *  --------------------------------
 *  offer("X") → inserisce alla fine, sposta tail in avanti
 *  poll()     → rimuove da head, imposta null, sposta head in avanti
 * 
 *  VANTAGGI del Ring Buffer:
 *  - Non serve spostare elementi durante inserimento/rimozione [web:1]
 *  - Operazioni Enqueue/Dequeue sono O(1) costanti [web:1]
 *  - Head e tail possono girare circolarmente nell'array
 * 
 * =============================================================================
 *                    METODI PRINCIPALI E LORO FUNZIONI
 * =============================================================================
 * 
 * COSTRUTTORI:
 * ------------
 * ArrayDeque()                        → Crea deque vuoto (capacità iniziale 16) [web:6]
 * ArrayDeque(int numElements)         → Crea deque vuoto per n elementi [web:6]
 * ArrayDeque(Collection<?> c)         → Crea deque con elementi dalla collezione [web:3]
 * 
 * INSERIMENTO (aggiunge elementi):
 * --------------------------------
 * Metodo                    | Descrizione
 * --------------------------|--------------------------------------------------
 * add(E e)                  | Inserisce in fondo, lancia eccezione se fallisce [web:6]
 * addFirst(E e)             | Inserisce all'inizio [web:6][web:11]
 * addLast(E e)              | Inserisce in fondo [web:6]
 * offer(E e)                | Inserisce in fondo, ritorna true se successo [web:6]
 * offerFirst(E e)           | Inserisce all'inizio, ritorna true se successo [web:6]
 * offerLast(E e)            | Inserisce in fondo, ritorna true se successo [web:6]
 * push(E e)                 | Pusha sullo stack (equivale a addFirst) [web:6]
 * 
 * RIMOZIONE (rimuove elementi):
 * -----------------------------
 * Metodo                    | Descrizione
 * --------------------------|--------------------------------------------------
 * remove()                  | Rimuove e restituisce la testa, eccezione se vuoto [web:6]
 * removeFirst()             | Rimuove e restituisce primo elemento [web:6][web:11]
 * removeLast()              | Rimuove e restituisce ultimo elemento [web:6][web:11]
 * poll()                    | Rimuove e restituisce testa, null se vuoto [web:6]
 * pollFirst()               | Rimuove e restituisce primo, null se vuoto [web:6]
 * pollLast()                | Rimuove e restituisce ultimo, null se vuoto [web:6]
 * pop()                     | Pop dallo stack (equivale a removeFirst) [web:6]
 * 
 * ISPEZIONE (legge senza rimuovere):
 * ----------------------------------
 * Metodo                    | Descrizione
 * --------------------------|--------------------------------------------------
 * element()                 | Restituisce testa, eccezione se vuoto [web:6]
 * getFirst()                | Restituisce primo elemento senza rimuoverlo [web:6]
 * getLast()                 | Restituisce ultimo elemento senza rimuoverlo [web:6]
 * peek()                    | Restituisce testa, null se vuoto [web:6]
 * peekFirst()               | Restituisce primo, null se vuoto [web:6][web:11]
 * peekLast()                | Restituisce ultimo, null se vuoto [web:6][web:11]
 * 
 * ALTRE OPERAZIONI:
 * -----------------
 * Metodo                    | Descrizione
 * --------------------------|--------------------------------------------------
 * size()                    | Restituisce numero di elementi [web:6]
 * isEmpty()                 | Ritorna true se vuoto [web:6]
 * clear()                   | Rimuove tutti gli elementi [web:6]
 * contains(Object o)        | Ritorna true se contiene l'elemento [web:6]
 * iterator()                | Iteratore in ordine sequenziale [web:6]
 * descendingIterator()      | Iteratore in ordine inverso [web:11]
 * clone()                   | Restituisce copia del deque [web:6]
 * toArray()                 | Restituisce array con tutti gli elementi [web:6]
 * 
 * =============================================================================
 *                    USI PIÙ COMUNI CON ESEMPI
 * =============================================================================
 * 
 * USO 1: Come QUEUE (FIFO - First In First Out)
 * ----------------------------------------------
 */
	
	/*
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeAppunti {
    
    public static void main(String[] args) {
        // ========== ESEMPIO 1: Queue (FIFO) ==========
        Queue<String> coda = new ArrayDeque<>();
        
        coda.offer("Primo");    // Aggiungi in fondo
        coda.offer("Secondo");
        coda.offer("Terzo");
        
        System.out.println("Coda: " + coda);  
        // Output: [Primo, Secondo, Terzo]
        
        String primo = coda.poll();  // Rimuove e restituisce il primo
        System.out.println("Rimosso: " + primo);  // Output: Primo
        System.out.println("Coda dopo poll: " + coda);  // [Secondo, Terzo]
        
        
        // ========== ESEMPIO 2: Stack (LIFO) ==========
        ArrayDeque<String> stack = new ArrayDeque<>();
        
        stack.push("A");    // Push sullo stack
        stack.push("B");
        stack.push("C");
        
        System.out.println("\nStack: " + stack);  
        // Output: [C, B, A] (C è in cima)
        
        String top = stack.pop();  // Pop dalla cima
        System.out.println("Popped: " + top);  // Output: C
        System.out.println("Stack dopo pop: " + stack);  // [B, A]
        
        
        // ========== ESEMPIO 3: Deque (doppia estremità) ==========
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        deque.addFirst("Start");   // Aggiungi all'inizio
        deque.addLast("End");      // Aggiungi alla fine
        deque.addLast("Middle");
        
        System.out.println("\nDeque: " + deque);  
        // Output: [Start, End, Middle]
        
        String primoElem = deque.removeFirst();  // Rimuovi dall'inizio
        String ultimoElem = deque.removeLast();  // Rimuovi dalla fine
        
        System.out.println("Primo rimosso: " + primoElem);  // Start
        System.out.println("Ultimo rimosso: " + ultimoElem);  // Middle
        System.out.println("Deque rimanente: " + deque);  // [End]
        
        
        // ========== ESEMPIO 4: Iterazione inversa ==========
        ArrayDeque<Integer> numeri = new ArrayDeque<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        
        System.out.println("\nIterazione inversa:");
        for (int n : numeri.descendingIterator()) {
            System.out.print(n + " ");  // Output: 3 2 1
        }
    }
}*/

/**
 * =============================================================================
 *                    CONFRONTO VELOCITÀ
 * =============================================================================
 * 
 * ArrayDeque vs LinkedList:
 * - ArrayDeque è più veloce come coda o stack [web:3][web:8]
 * - LinkedList ha overhead di allocazione nodi e puntatori
 * - ArrayDeque ha località di memoria migliore (array contiguo)
 * 
 * ArrayDeque vs Stack (classe deprecated):
 * - ArrayDeque è raccomandato al posto di Stack [web:3]
 * - Stack è synchronized (più lento), ArrayDeque non è thread-safe
 * 
 * =============================================================================
 *                    NOTE IMPORTANTI
 * =============================================================================
 * 
 * ⚠️ ArrayDeque NON è thread-safe (non sincronizzato)
 * ⚠️ Non permette elementi null
 * ⚠️ L'array cresce automaticamente ma NON si rimpicciolisce [web:1]
 * ⚠️ Iterazione con ListIterator o Enumeration NON è supportata [web:11]
 * 
 * =============================================================================
	 */
	
	
}
