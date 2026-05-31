package appunti;

public class Appunti_priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scusa per l'equivoco! Ecco il contenuto completo sulla PriorityQueue di Java, pronto per copiare-incollare negli appunti su Eclipse:

text
================================================================================
                    PRIORITY QUEUE IN JAVA - GUIDA PER PRINCIPIANTI
================================================================================

## 1. COS'È E COME FUNZIONA (rappresentazione grafica)

PRIORITY QUEUE = Coda prioritaria

Una PriorityQueue è una coda dove gli elementi NON seguono il principio FIFO 
(primo arrivato, primo servito) come una coda normale, ma vengono ordinati 
per PRIORITÀ.

RASSEM グRAFICA DI COME FUNZIONA:

┌─────────────────────────────────────────────────────────────┐
│                    INPUT: elementi arrivano                  │
│         5 → 2 → 8 → 1 → 9 → 3 → 7 → 4 → 6                   │
└─────────────────────┬───────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────────────┐
│              PRIORITY QUEUE (interno heap binario)           │
│                                                             │
│                    [1]  ← elemento con priorità più alta    │
│                   /  \                                      │
│                 [2]  [3]                                    │
│                 / \   / \                                   │
│               [4] [5] [6] [7]                               │
│               / \ / \                                       │
│             [8] [9]                                         │
│                                                             │
│  ✦ Ordinato come HEAP BINARIO (min-heap di default)        │
│  ✦ Il valore più piccolo è sempre in cima                   │
└─────────────────────┬───────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────────────┐
│              OUTPUT: rimessi in ordine crescente             │
│         1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9                   │
│         ✦ Estrai sempre il più piccolo!                     │
└─────────────────────────────────────────────────────────────┘

[web:31][web:33][web:35]

COME FUNZIONA DIETRO LE QUINTE:
1. Inserisci un elemento → la PriorityQueue lo piazza nell'heap
2. L'heap si riorganizza automaticamente per mantenere il più piccolo in cima
3. Quando estrai (poll/peek), prendi sempre l'elemento in cima (priorità più alta)
4. L'heap si riorganizza di nuovo [web:31][web:35]

IMPORTANTE: 
- Di default ordina in ORDINE CRESCENTE (il più piccolo ha priorità più alta)
- Puoi usare un Comparator per cambiare l'ordinamento (es: decrescente) [web:35]


================================================================================

## 2. I METODI PRINCIPALI E LE LORO FUNZIONI

### COSTRUTTORI

┌─────────────────────────────────────────────────────────────────────────┐
│ Costruttore                           │ Descrizione                     │
├─────────────────────────────────────────────────────────────────────────┤
│ new PriorityQueue()                   │ Coda vuota, capacità iniziale   │
│                                       │ = 11, ordinamento naturale      │
├─────────────────────────────────────────────────────────────────────────┤
│ new PriorityQueue(15)                 │ Coda vuota, capacità iniziale   │
│                                       │ = 15 (personalizzata)           │
├─────────────────────────────────────────────────────────────────────────┤
│ new PriorityQueue(comparator)         │ Coda vuota con ordinamento      │
│                                       │ personalizzato (es: decrescente)│
├─────────────────────────────────────────────────────────────────────────┤
│ new PriorityQueue(cap, comparator)    │ Coda con capacità E ordinamento │
│                                       │ personalizzati                  │
├─────────────────────────────────────────────────────────────────────────┤
│ new PriorityQueue(collezione)         │ Coda inizializzata con elementi │
│                                       │ di una collezione esistente     │
└─────────────────────────────────────────────────────────────────────────┘
[web:35]

### METODI PRINCIPALI

┌─────────────────────────────────────────────────────────────────────────┐
│ Metodo              │ Cosa fa                                           │
├─────────────────────────────────────────────────────────────────────────┤
│ add(elemento)       │ Inserisce l'elemento nella coda                   │
│                     │ Restituisce: true se inserito con successo        │
│                     │ Lancia: NullPointerException se elemento = null   │
├─────────────────────────────────────────────────────────────────────────┤
│ offer(elemento)     │ Stesso di add(), ma più sicuro (non lancia        │
│                     │ eccezioni, restituisce false se fallisce)         │
│                     │ PREFERITO per code con capacità limitata          │
├─────────────────────────────────────────────────────────────────────────┤
│ peek()              │ Guarda l'elemento in cima (priorità più alta)     │
│                     │ SENZA rimuoverlo                                  │
│                     │ Restituisce: null se coda vuota                   │
├─────────────────────────────────────────────────────────────────────────┤
│ poll()              │ Estrai e RESTITUISCI l'elemento in cima           │
│                     │ (rimuove effettivamente dalla coda)               │
│                     │ Restituisce: null se coda vuota                   │
├─────────────────────────────────────────────────────────────────────────┤
│ element()           │ Come peek(), ma lancia eccezione se coda vuota    │
├─────────────────────────────────────────────────────────────────────────┤
│ remove()            │ Rimuove l'elemento specificato (non il primo!)    │
│                     │ Restituisce: true se trovato e rimosso            │
├─────────────────────────────────────────────────────────────────────────┤
│ size()              │ Restituisce il numero di elementi nella coda      │
├─────────────────────────────────────────────────────────────────────────┤
│ isEmpty()           │ Restituisce true se la coda è vuota               │
├─────────────────────────────────────────────────────────────────────────┤
│ clear()             │ Rimuove tutti gli elementi dalla coda             │
├─────────────────────────────────────────────────────────────────────────┤
│ contains(elemento)  │ Restituisce true se la coda contiene l'elemento   │
├─────────────────────────────────────────────────────────────────────────┤
│ comparator()        │ Restituisce il Comparator usato (o null se        │
│                     │ usa ordinamento naturale)                         │
├─────────────────────────────────────────────────────────────────────────┤
│ toArray()           │ Converte la coda in un array                      │
└─────────────────────────────────────────────────────────────────────────┘
[web:31][web:32][web:35]


================================================================================

## 3. USI PIÙ COMUNI CON ESEMPI PRATICI

### ESEMPIO 1: Ordinare numeri automaticamente

import java.util.PriorityQueue;

public class Esempio1 {
    public static void main(String[] args) {
        // Crea una PriorityQueue di numeri
        PriorityQueue<Integer> coda = new PriorityQueue<>();
        
        // Aggiungi numeri in ordine casuale
        coda.add(50);
        coda.add(20);
        coda.add(80);
        coda.add(10);
        coda.add(30);
        
        // Estrai tutti gli elementi: verranno in ORDINE CRESCENTE!
        while (!coda.isEmpty()) {
            System.out.println(coda.poll());
        }
        
        // Output:
        // 10
        // 20
        // 30
        // 50
        // 80
    }
}
[web:31][web:35]

---

### ESEMPIO 2: Ordinare con priorità personalizzata (decrescente)

import java.util.PriorityQueue;
import java.util.Collections;

public class Esempio2 {
    public static void main(String[] args) {
        // Crea una PriorityQueue ordinata in senso DECRESCENTE
        PriorityQueue<Integer> coda = new PriorityQueue<>(Collections.reverseOrder());
        
        coda.add(10);
        coda.add(50);
        coda.add(30);
        
        // Ora l'estrazzione dà il PIÙ GRANDE per primo!
        System.out.println(coda.poll());  // 50
        System.out.println(coda.poll());  // 30
        System.out.println(coda.poll());  // 10
    }
}
[web:35]

---

### ESEMPIO 3: Usare con oggetti personalizzati (es: Task con priorità)

import java.util.PriorityQueue;

class Task {
    String nome;
    int priorita;
    
    Task(String nome, int priorita) {
        this.nome = nome;
        this.priorita = priorita;
    }
    
    public String toString() {
        return nome + " (pri=" + priorita + ")";
    }
}

public class Esempio3 {
    public static void main(String[] args) {
        // PriorityQueue che ordina per priorità (più basso = più urgente)
        PriorityQueue<Task> codaTask = new PriorityQueue<>((a, b) -> a.priorita - b.priorita);
        
        // Aggiungi task con priorità diversa
        codaTask.offer(new Task("Cucinare", 3));
        codaTask.offer(new Task("Lavare i piatti", 5));
        codaTask.offer(new Task("Fare esercizio Java", 1));  // Più urgente!
        codaTask.offer(new Task("Dormire", 4));
        
        // Elabora task in ordine di priorità
        while (!codaTask.isEmpty()) {
            Task t = codaTask.poll();
            System.out.println("Eseguo: " + t);
        }
        
        // Output (ordine: priorità più bassa prima):
        // Eseguo: Fare esercizio Java (pri=1)
        // Eseguo: Cucinare (pri=3)
        // Eseguo: Dormire (pri=4)
        // Eseguo: Lavare i piatti (pri=5)
    }
}
[web:31][web:35]

---

### ESEMPIO 4: Coda di emergenza (es: pronto soccorso)

import java.util.PriorityQueue;

class Paziente {
    String nome;
    int gravita;  // 1 = gravissimo, 5 = lieve
    
    Paziente(String nome, int gravita) {
        this.nome = nome;
        this.gravita = gravita;
    }
    
    public String toString() {
        return nome + " (gravità=" + gravita + ")";
    }
}

public class Esempio4 {
    public static void main(String[] args) {
        // Pazienti con priorità più grave prima (numero più basso = più grave)
        PriorityQueue<Paziente> prontoSoccorso = new PriorityQueue<>((a, b) -> a.gravita - b.gravita);
        
        prontoSoccorso.offer(new Paziente("Marco", 3));
        prontoSoccorso.offer(new Paziente("Giulia", 1));  // Gravissima!
        prontoSoccorso.offer(new Paziente("Luca", 4));
        prontoSoccorso.offer(new Paziente("Anna", 2));    // Molto grave
        
        System.out.println("Ordinamento pazienti per gravità:");
        while (!prontoSoccorso.isEmpty()) {
            System.out.println(prontoSoccorso.poll());
        }
        
        // Output:
        // Giuliani (gravità=1)  ← trattata per prima!
        // Anna (gravità=2)
        // Marco (gravità=3)
        // Luca (gravità=4)
    }
}
[web:35]


================================================================================

## 4. CONFRONTO: PriorityQueue vs LinkedList (coda normale)

┌─────────────────────────────────────────────────────────────────────────┐
│ Caratteristica     │ PriorityQueue         │ LinkedList (Queue)         │
├─────────────────────────────────────────────────────────────────────────┤
│ Ordine             │ Per priorità          │ FIFO (primo entra, primo   │
│                    │ (ordinamento)         │ esce)                      │
├─────────────────────────────────────────────────────────────────────────┤
│ Elemento in cima   │ Il più piccolo (o     │ Il primo arrivato          │
│                    │ quello con priorità   │                            │
│                    │ più alta)             │                            │
├─────────────────────────────────────────────────────────────────────────┤
│ Inserimento        │ O(log n) - riordina   │ O(1) - aggiunge in fondo   │
├─────────────────────────────────────────────────────────────────────────┤
│ Estrazione         │ O(log n) - riordina   │ O(1)- rimuove dall'inizio  │
├─────────────────────────────────────────────────────────────────────────┤
│ Quando usarlo      │ Quando serve ordinare │ Quando serve ordine        │
│                    │ automaticamente       │嚴ico FIFO                  │
└─────────────────────────────────────────────────────────────────────────┘
[web:31][web:35]


================================================================================

## 5. AVVERTENZE IMPORTANTI

✦ NON è thread-safe! Se più thread accedono alla stessa PriorityQueue, 
  usa PriorityBlockingQueue invece [web:37]

✦ L'iterazione con for-each NON è ordinata! Per vedere gli elementi in 
  ordine, usa poll() in un while [web:35]:
  
  // SBAGLIATO (ordine non garantito):
  for (Integer x : coda) { System.out.println(x); }
  
  // GIUSTO (ordine garantito):
  while (!coda.isEmpty()) { System.out.println(coda.poll()); }

✦ Non permette elementi null [web:37]

✦ La capacità cresce automaticamente (inizi→11, poi aumenta) [web:35]


================================================================================

## 6. COME RICORDARLO FACILMENTE

PriorityQueue = "Coda dei的任务"

Pensa a un ospedale:
- Non è chi arriva prima che viene curato prima
- È chi è più grave che viene curato prima
- Il medico (poll()) prende SEMPRE il paziente più grave

Oppure pensa a un sistema di ticket:
- PriorityQueue: i ticket urgenti salgono in cima
- LinkedList: i ticket si servono nell'ordine di arrivo


================================================================================

		 * 
		 * 
		 */
	}

}
