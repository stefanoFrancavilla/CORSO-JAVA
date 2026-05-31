package appunti;

public class Appunti_queue_deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 1. Cos’è una Queue (coda)
Una Queue è una coda in cui gli elementi si mettono in fila e vengono prelevati nell’ordine in cui sono arrivati:

Primo arrivato, primo servito → si chiama FIFO (First In, First Out).

Immagina una fila alla cassa: chi entra prima, viene servito prima.

Implementazioni comuni di Queue
LinkedList → coda classica, molto usata.

PriorityQueue → elabora gli elementi in base alla priorità, non in ordine di arrivo.

2. Le funzioni principali di Queue
Tutti questi metodi fanno parte dell’interfaccia java.util.Queue.

A) Inserire un elemento
Metodo	Cosa fa	Se non riesce
add(e)	Inserisce l’elemento in coda	Lancia un’eccezione (IllegalStateException) se fallisce 
offer(e)| Inserisce l’elemento in coda	Restituisce false (nessuna eccezione) 
Esempio:

java
Queue<String> q = new LinkedList<>();
q.add("Mario");   // inserisce
q.offer("Luigi"); // inserisce
B) Leggere l’elemento in testa (senza rimuoverlo)
Metodo	Cosa fa	Se la coda è vuota
element()	Restituisce l’elemento in testa, non lo rimuove	Lancia NoSuchElementException 
peek()	Restituisce l’elemento in testa, non lo rimuove	Restituisce null 
Esempio:

java
String primo = q.peek();   // sicuro: se vuoto → null
String primo2 = q.element(); // se vuoto → eccezione
C) Rimuovere e restituire l’elemento in testa
Metodo	Cosa fa	Se la coda è vuota
remove()	Preleva e rimuove l’elemento in testa	Lancia NoSuchElementException 
poll()	Preleva e rimuove l’elemento in testa	Restituisce null 
Esempio:

java
String to = q.poll();      // sicuro: se vuoto → null
String to2 = q.remove();   // se vuoto → eccezione
D) Altre funzioni utili
size() → numero di elementi nella coda.

isEmpty() → true se la coda è vuota, false altrimenti.

clear() → svuota completamente la coda.

3. Cos’è una Deque (double-ended queue)
Deque (si legge “deck”) sta per Double-Ended Queue, cioè coda a due estremità.

In una Deque:

Puoi aggiungere elementi sia all’inizio che alla fine.

Puoi rimuovere elementi sia dall’inizio che dalla fine.

Una Deque è:

Una Queue potenziata: puoi usarla come coda normale (FIFO).

Un Stack (LIFO): se aggiungi e rimuovi solo da una parte.

Implementazioni comuni di Deque
ArrayDeque → molto veloce, consigliata per code e stack.

LinkedList → implementa anche Deque.

4. Le funzioni principali di Deque
Deque estende Queue, quindi ha tutti i metodi di Queue più metodi aggiuntivi.

A) Inserire elementi
Metodo	Dove inserisce	Se fallisce (coda piena)
add(e)	in fondo (come Queue)	eccezione
offer(e)	in fondo	false
addFirst(e)	all’inizio	eccezione
addLast(e)	in fondo	eccezione
offerFirst(e)	all’inizio	false se fallisce
offerLast(e)	in fondo	false se fallisce
Esempio:

java
Deque<String> d = new ArrayDeque<>();
d.addFirst("inizio");
d.addLast("fine");
B) Leggere l’elemento in testa / coda (senza rimuovere)
Metodo	Cosa restituisce	Se vuoto
peek()	primo elemento (testa)	null
peekFirst()	primo elemento (testa)	null
peekLast()	ultimo elemento (coda)	null
element()	primo elemento (testa)	eccezione
getFirst()	primo elemento (testa)	eccezione
getLast()	ultimo elemento (coda)	eccezione
C) Rimuovere elementi
Metodo	Cosa fa	Se vuoto
remove()	rimuove il primo (testa)	eccezione
poll()	rimuove il primo (testa)	null
removeFirst()	rimuove il primo (testa)	eccezione
removeLast()	rimuove l’ultimo (coda)	eccezione
pollFirst()	rimuove il primo (testa)	null
pollLast()	rimuove l’ultimo (coda)	null
D) Usare la Deque come Stack
Una Deque può funzionare come stack (LIFO: Last In, First Out) usando:

push(e) → inserisce in cima (come addFirst).

pop() → rimuove dalla cima (come removeFirst).

Esempio:

java
Deque<String> stack = new ArrayDeque<>();
stack.push("primo");
stack.push("secondo");
String top = stack.pop(); // "secondo"
5. Differenze principali tra Queue e Deque
Caratteristica	Queue	Deque
Significato	Coda semplice	Double-Ended Queue (coda a due estremità) 
Dove puoi aggiungere	Solo alla fine (back)	All’inizio e alla fine 
Dove puoi rimuovere	Solo dall’inizio (front)	Dall’inizio e dalla fine 
Ordine di accesso	Di solito FIFO	FIFO, ma può essere LIFO (stack) 
Metodi specifici	add, offer, poll, peek…	Metodi di Queue + addFirst, addLast, pollFirst, pollLast, push, pop 
Può essere usata come Queue?	Sì	Sì, ogni Deque può funzionare come Queue 
Può essere usata come Stack?	No (non è pensata per quello)	Sì, usando push/pop 
6. Quando conviene usare Queue e quando Deque
Usa una Queue quando:
Hai bisogno di una fila semplice (FIFO):
-task da elaborare in ordine di arrivo.

Messaggi in una coda di elaborazione.

Vuoi un codice più chiaro e limitato:

“Devo solo aggiungere in fondo e prelevare dall’inizio”.

Esempio:

java
Queue<Task> taskQueue = new LinkedList<>();
taskQueue.add(new Task());
Task t = taskQueue.poll();
Usa una Deque quando:
Hai bisogno di:

Aggiungere o rimuovere da entrambe le estremità.

Usare la stessa struttura come:

Coda (FIFO) oppure

Stack (LIFO).

Esempi:

Una lista in cui puoi:

aggiungere nuovi elementi in fondo,

ma anche inserire “urgenza” in testa.

Implementare uno stack.

Simulare una “pinza” o una lista scorrevole.

Esempio:

java
Deque<String> deque = new ArrayDeque<>();
deque.addLast("ordinario");
deque.addFirst("urgente"); // inserito all'inizio
String primo = deque.pollFirst(); // preleva da inizio
String ultimo = deque.pollLast(); // preleva da fine
Regola pratica per un principiante
Se ti basta una fila normale: usa Queue (LinkedList come implementazione).

Se vuoi più flessibilità (inizio + fine, o anche stack): usa Deque (ArrayDeque come implementazione).

In pratica:

Queue = “coda semplice, solo in fila”.

Deque = “coda aumentata, puoi lavorare da entrambe le parti”.
		 */
	}

}
