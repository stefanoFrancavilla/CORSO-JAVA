package appunti;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class Stack {

	
		// TODO Auto-generated method stub
		Ecco il contenuto completo per lo Stack pronto per essere copiato e incollato nella tua classe di appunti su Eclipse:

			java
			/**
			 * =============================================================================
			 *                        LO STACK IN JAVA - APPUNTI COMPLETI
			 * =============================================================================
			 * 
			 * COS'È LO STACK (PILA)?
			 * ----------------------
			 * Lo stack è una struttura di dati che opera con il principio LIFO 
			 * (Last-In-First-Out): l'ultimo elemento inserito è il primo a essere rimosso [web:19].
			 * 
			 * Analogia: come una pila di fascicoli - l'ultimo che metti sopra è quello 
			 * che prendi per primo [web:20].
			 * 
			 * Caratteristiche principali:
			 * - LIFO (Last-In-First-Out) [web:18][web:19]
			 * - Operazioni principali: PUSH (inserire) e POP (rimuovere) [web:18]
			 * - Utilizzato dal microprocessore per gestire chiamate di funzione [web:21]
			 * - Può causare "stack overflow" se troppo pieno [web:20]
			 * 
			 * =============================================================================
			 *                    FUNZIONAMENTO INTERNO (Dietro le quinte)
			 * =============================================================================
			 * 
			 * STRUTTURA: Pila con Stack Pointer (SP)
			 * ---------------------------------------
			 * 
			 * Lo stack utilizza un registro speciale chiamato Stack Pointer (SP) che 
			 * punta sempre alla cima della pila (top-of-the-stack) [web:21].
			 * 
			 * GRAFICO DEL FUNZIONAMENTO:
			 * --------------------------
			 * 
			 *  Memoria Stack (cresce verso indirizzi decrescenti):
			 *  ┌────────────────────────────────────────┐  ← Indirizzo alto (0xFFFF)
			 *  │                                        │
			 *  │         Variabili globali              │
			 *  │                                        │
			 *  ├────────────────────────────────────────┤
			 *  │  [0x1000]  Frame funzione main         │
			 *  │  [0x1004]  Parametri funzione          │
			 *  │  [0x1008]  Variabili locali main       │
			 *  ├────────────────────────────────────────┤
			 *  │  [0x1010]  Frame funzione foo()        │  ← SP (Stack Pointer)
			 *  │  [0x1014]  Indirizzo di ritorno        │      punta qui
			 *  │  [0x1018]  Variabili locali foo()      │
			 *  ├────────────────────────────────────────┤
			 *  │  [0x1020]  Frame funzione bar()        │  ← Top of Stack (cima)
			 *  │  [0x1024]  Indirizzo di ritorno        │
			 *  │  [0x1028]  Variabili locali bar()      │
			 *  ├────────────────────────────────────────┤
			 *  │         Spazio libero                  │
			 *  │                                        │
			 *  └────────────────────────────────────────┘  ← Indirizzo basso (0x0000)
			 * 
			 *  Sequenza PUSH (aggiunta elementi):
			 *  ----------------------------------
			 *  1. SP decrementa (o incrementa a seconda dell'architettura) [web:21]
			 *  2. Dato viene scritto alla posizione di SP
			 *  3. SP ora punta al nuovo elemento in cima
			 * 
			 *  Esempio PUSH:
			 *  ┌──────────────┐
			 *  │  PUSH 42     │  →  SP: 0x1020 → 0x101C
			 *  │  PUSH 100    │  →  SP: 0x101C → 0x1018
			 *  │  PUSH -5     │  →  SP: 0x1018 → 0x1014
			 *  └──────────────┘
			 *  
			 *  Dopo PUSH:
			 *  ┌────────────────────────┐
			 *  │  [0x1014]    -5        │  ← SP (cima)
			 *  │  [0x1018]    100       │
			 *  │  [0x101C]    42        │
			 *  └────────────────────────┘
			 * 
			 *  Sequenza POP (rimozione elementi):
			 *  ----------------------------------
			 *  1. Dato viene letto dalla posizione di SP
			 *  2. SP incrementa (o decrementa)
			 *  3. Elemento viene restituito
			 * 
			 *  Esempio POP:
			 *  ┌──────────────┐
			 *  │  POP x       │  →  x = -5, SP: 0x1014 → 0x1018
			 *  │  POP y       │  →  y = 100, SP: 0x1018 → 0x101C
			 *  │  POP z       │  →  z = 42, SP: 0x101C → 0x1020
			 *  └──────────────┘
			 * 
			 *  STACK OVERFLOW:
			 *  ---------------
			 *  Quando tutto lo spazio della call stack è occupato → errore "stack overflow" [web:20]
			 *  Causa comune: ricorsione infinita, troppi livelli di chiamate annidate
			 * 
			 * =============================================================================
			 *                    STACK IN JAVA (Classi e Implementazioni)
			 * =============================================================================
			 * 
			 * 1. CLASSE STACK (deprecated ma ancora usata)
			 * --------------------------------------------
			 * java.util.Stack<T> estende Vector (sincronizzato, thread-safe ma lento)
			 * 
			 * 2. ARRAYDEQUE (RACCOMANDATO)
			 * -----------------------------
			 * ArrayDeque è più veloce di Stack e LinkedList [web:3][web:8]
			 * Non sincronizzato (più veloce per uso singolo thread)
			 * 
			 * =============================================================================
			 *                    METODI PRINCIPALI DELLO STACK
			 * =============================================================================
			 * 
			 * METODI DI STACK (java.util.Stack):
			 * ----------------------------------
			 * Metodo              | Descrizione
			 * --------------------|--------------------------------------------------
			 * push(E item)        | Spinge un elemento sulla cima dello stack [web:18]
			 * pop()               | Rimuove e restituisce l'elemento in cima [web:18]
			 * peek()              | Restituisce l'elemento in cima senza rimuoverlo
			 * empty()             | Ritorna true se lo stack è vuoto
			 * search(Object o)    | Ritorna la posizione dell'elemento (1-based), -1 se non trovato
			 * 
			 * METODI DI ARRAYDEQUE come Stack (RACCOMANDATO):
			 * -----------------------------------------------
			 * Metodo              | Descrizione
			 * --------------------|--------------------------------------------------
			 * push(E e)           | Spinge elemento sulla cima (equivale a addFirst) [web:6]
			 * pop()               | Rimuove e restituisce elemento in cima (equivale a removeFirst) [web:6]
			 * peek()              | Restituisce elemento in cima senza rimuoverlo [web:6]
			 * peekFirst()         | Stesso di peek() [web:6]
			 * size()              | Numero di elementi nello stack [web:6]
			 * isEmpty()           | Ritorna true se vuoto [web:6]
			 * 
			 * =============================================================================
			 *                    USI PIÙ COMUNI CON ESEMPI
			 * =============================================================================
			 */
		

			
			    
			    public static void main(String[] args) {
			        
			        // ========== ESEMPIO 1: Stack con classe Stack (deprecated) ==========
			        Stack<String> stackClassico = new Stack<>();
			        
			        stackClassico.push("Primo");    // Push sulla cima
			        stackClassico.push("Secondo");
			        stackClassico.push("Terzo");
			        
			        System.out.println("Stack classico: " + stackClassico);  
			        // Output: [Primo, Secondo, Terzo] (Terzo è in cima)
			        
			        String top = stackClassico.pop();  // Rimuove dalla cima
			        System.out.println("Popped: " + top);  // Output: Terzo
			        System.out.println("Stack dopo pop: " + stackClassico);  // [Primo, Secondo]
			        
			        String peek = stackClassico.peek();  // Legge senza rimuovere
			        System.out.println("Peek: " + peek);  // Output: Secondo
			        System.out.println("Stack dopo peek: " + stackClassico);  // [Primo, Secondo] (non modificato)
			        
			        int posizione = stackClassico.search("Primo");  // Cerca elemento
			        System.out.println("Posizione di 'Primo': " + posizione);  // Output: 2 (1-based)
			        
			        
			        // ========== ESEMPIO 2: Stack con ArrayDeque (RACCOMANDATO) ==========
			        Deque<String> stackConsigliato = new ArrayDeque<>();
			        
			        stackConsigliato.push("A");    // Push
			        stackConsigliato.push("B");
			        stackConsigliato.push("C");
			        
			        System.out.println("\nStack con ArrayDeque: " + stackConsigliato);  
			        // Output: [C, B, A] (C è in cima)
			        
			        String topArrayDeque = stackConsigliato.pop();  // Pop
			        System.out.println("Popped: " + topArrayDeque);  // Output: C
			        System.out.println("Stack dopo pop: " + stackConsigliato);  // [B, A]
			        
			        String peekArrayDeque = stackConsigliato.peek();  // Peek
			        System.out.println("Peek: " + peekArrayDeque);  // Output: B
			        System.out.println("Stack dopo peek: " + stackConsigliato);  // [B, A] (non modificato)
			        
			        
			        // ========== ESEMPIO 3: Stack per validazione parentesi ==========
			        String espressione = "((()))";
			        boolean valida = isValidParentheses(espressione);
			        System.out.println("\nEspressione: " + espressione);
			        System.out.println("Valida: " + valida);  // Output: true
			        
			        String espressione2 = "(()";
			        boolean valida2 = isValidParentheses(espressione2);
			        System.out.println("\nEspressione: " + espressione2);
			        System.out.println("Valida: " + valida2);  // Output: false
			        
			        
			        // ========== ESEMPIO 4: Stack per undo/redo ==========
			        ArrayDeque<String> undoStack = new ArrayDeque<>();
			        
			        undoStack.push("Cancella testo");
			        undoStack.push("Scrivi testo");
			        undoStack.push("Copia testo");
			        
			        System.out.println("\nUndo Stack: " + undoStack);  // [Copia testo, Scrivi testo, Cancella testo]
			        
			        System.out.println("Azioni da undo:");
			        while (!undoStack.isEmpty()) {
			            System.out.println("  Undo: " + undoStack.pop());
			        }
			        // Output:
			        //   Undo: Copia testo
			        //   Undo: Scrivi testo
			        //   Undo: Cancella testo
			        
			        
			        // ========== ESEMPIO 5: Stack per percorso inverso ==========
			        ArrayDeque<String> percorso = new ArrayDeque<>();
			        percorso.push("Casa");
			        percorso.push("Stazione");
			        percorso.push("Ufficio");
			        
			        System.out.println("\nPercorso inverso (tornando indietro):");
			        while (!percorso.isEmpty()) {
			            System.out.println("  " + percorso.pop());
			        }
			        // Output:
			        //   Ufficio
			        //   Stazione
			        //   Casa
			    }
			    
			    // Metodo per validare parentesi usando stack
			    public static boolean isValidParentheses(String espressione) {
			        Deque<Character> stack = new ArrayDeque<>();
			        
			        for (char c : espressione.toCharArray()) {
			            if (c == '(') {
			                stack.push(c);  // PUSH per parentesi aperta
			            } else if (c == ')') {
			                if (stack.isEmpty()) {
			                    return false;  // Parentesi chiusa senza apertura
			                }
			                stack.pop();  // POP per parentesi chiusa
			            }
			        }
			        
			        return stack.isEmpty();  // true se tutte le parentesi sono bilanciate
			    
			

			/**
			 * =============================================================================
			 *                    CONFRONTO: STACK vs ARRAYDEQUE
			 * =============================================================================
			 * 
			 * Classe Stack (java.util.Stack):
			 * ✔️ Thread-safe (sincronizzata)
			 * ❌ Più lenta (overhead synchronized)
			 * ❌ Deprecated per nuovi sviluppi
			 * ❌ Eredita da Vector (design obsoleto)
			 * 
			 * ArrayDeque (raccomandato):
			 * ✔️ Più veloce (non sincronizzato)
			 * ✔️ Design moderno
			 * ✔️ Consigliato dalla documentazione Oracle [web:3]
			 * ❌ Non thread-safe (usare Collections.synchronizedDeque se necessario)
			 * 
			 * =============================================================================
			 *                    APPLICAZIONI DELLO STACK
			 * =============================================================================
			 * 
			 * Usi comuni dello stack:
			 * 1. Gestione chiamate a funzioni (call stack) [web:21][web:24]
			 *    - Salva indirizzi di ritorno
			 *    - Memorizza variabili locali
			 *    - Gestisce parametri di funzione
			 * 
			 * 2. Ricorsione [web:25]
			 *    - Ogni chiamata ricorsiva crea un nuovo frame nello stack
			 *    - La cancellazione avviene quando la funzione termina
			 * 
			 * 3. Undo/Redo in applicazioni [web:18]
			 *    - Stack per azioni undo
			 *    - Doppio stack per undo + redo
			 * 
			 * 4. Validazione espressioni [web:18]
			 *    - Parentesi bilanciate ((()))
			 *    - Espressioni matematiche
			 * 
			 * 5. DFS (Depth-First Search) su grafi [web:18]
			 *    - Esplorazione di alberi e grafi
			 *    - Trovare percorsi
			 * 
			 * 6. Conversione di espressioni matematiche
			 *    - Infix → Postfix (Reverse Polish Notation)
			 *    - Valutazione espressioni
			 * 
			 * =============================================================================
			 *                    NOTE IMPORTANTI
			 * =============================================================================
			 * 
			 * ⚠️ Stack overflow:
			 *    - Si verifica quando lo stack è pieno [web:20]
			 *    - Causa: ricorsione infinita, troppi livelli di chiamate
			 *    - Soluzione: ridurre profondità ricorsione, aumentare stack size
			 * 
			 * ⚠️ Stack nella memoria:
			 *    - Risiede in RAM [web:21]
			 *    - Cresce da indirizzi alti verso bassi (comune) [web:22]
			 *    - Frame di stack allineati a quadword [web:22]
			 * 
			 * ⚠️ Thread safety:
			 *    - Stack classico è synchronized (thread-safe)
			 *    - ArrayDeque non è thread-safe
			 *    - Per thread-safety con ArrayDeque: Collections.synchronizedDeque()
			 * 
			 * =============================================================================
			 *                    COMANDI ASSEMBLY (PUSH/POP)
			 * =============================================================================
			 * 
			 * In assembly ARM [web:21]:
			 * PUSH Rx  → STMDA R13!,{Rx}  (store Rx e decrementa dopo)
			 * POP Rx   → LDMIB R13!,{Rx}  (incrementa prima e load Rx)
			 * 
			 * Istruzione RET [web:21]:
			 * - Pop l'indirizzo di ritorno dallo stack
			 * - Assegna al Program Counter
			 * - Esecuzione riprende dall'istruzione successiva alla CALL
			 * 
			 * =============================================================================
			 */
	}

}
