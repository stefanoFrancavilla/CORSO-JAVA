package appunti;

public class Appunti_Singleton_MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * # Guida base a Singleton e Multi-threading in Java

Il **singleton** è un pattern di progettazione che garantisce che una classe abbia **una sola istanza** e fornisca un punto di accesso globale a quell'istanza.[web:116][web:118] Il **multi-threading** è la capacità di Java di eseguire più thread contemporaneamente, cioè più “filamenti di esecuzione” nello stesso processo.[web:119][web:128]

Quando si usa un singleton in un ambiente multi-thread, bisogna fare attenzione: se non è implementato correttamente, possono essere create più istanze, rompendo il principio del singleton.[web:118][web:120]

## 1. Che cos'è il Singleton

Il singleton si usa quando:
- serve un solo oggetto per coordinare azioni nel sistema;[web:116][web:118]
- vuoi evitare di creare più oggetti che rappresentano la stessa entità (configurazione, gestione sessioni, connessioni al database, logger, controllo dispositivi, ecc.).[web:118]

### Struttura base

Un singleton tipico ha:
- costruttore **private**;
- una variabile **static** che contiene l’unica istanza;
- un metodo **public static** che restituisce l’istanza.[web:116][web:118]

### Esempio base (non thread-safe)

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // costruttore privato
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

Questo codice funziona in ambienti single-thread, ma in multi-thread può creare più istanze.[web:118][web:120]

## 2. Perché il Singleton può fallire in multi-thread

In un ambiente multi-thread, due thread possono entrare contemporaneamente in `getInstance()` quando `instance` è `null`:
- entrambi vedono `instance == null`;
- entrambi creano un nuovo oggetto;
- il risultato sono due istanze diverse, violando il singleton.[web:118][web:120]

Questo è un tipico **race condition**: l’esito dipende dall’ordine di esecuzione dei thread.[web:128]

## 3. Singleton thread-safe: tre approcci principali

### Approccio 1: metodo sincronizzato

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

`public static synchronized` garantisce che solo un thread alla volta possa eseguire il metodo.[web:118][web:120]

- **Vantaggio**: semplice e sicuro.
- **Svantaggio**: sincronizza anche dopo che l’istanza è creata, con piccolo impatto sulle prestazioni se il metodo è molto usato.[web:118]

### Approccio 2: inizializzazione statica (eager initialization)

```java
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

L’istanza viene creata al caricamento della classe, non al primo utilizzo.[web:118]

- **Vantaggio**: molto semplice e thread-safe senza `synchronized`.
- **Svantaggio**: l’istanza è creata anche se non viene mai usata (lazy vs eager).

### Approccio 3: double-checked locking con `volatile`

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

Qui si controlla due volte se `instance` è `null`:
- prima senza sincronizzare;
- poi dentro il blocco sincronizzato.[web:118][web:121]

- `volatile` assicura che la scrittura dell’istanza sia visibile immediatamente a tutti i thread.[web:121]

### Approccio 4: Singleton con `enum` (consigliato)

```java
public enum SingletonEnum {
    INSTANCE;

    public void operativa() {
        System.out.println("Operazione eseguita");
    }
}
```

Dall’enum si ottiene l’istanza con:

```java
SingletonEnum singleton = SingletonEnum.INSTANCE;
singleton.operativa();
```

- garantito thread-safe dalla JVM;[web:118]
- resistente a serializzazione e reflection;[web:118]
- molto semplice.

## 4. Multi-threading in Java: concetti base

Il **multi-threading** permette a un programma di eseguire più attività in parallelo o in modo intercalato, migliorando:
- prestazioni su CPU multi-core;
- reattività delle interfacce grafiche;
- utilizzo efficiente delle risorse.[web:119][web:128]

### Thread vs processo

- Un **processo** è un programma in esecuzione con memoria separata.
- Un **thread** è un “sotto-processo” che condivide la memoria con altri thread dello stesso processo.[web:128]

## 5. Ciclo di vita di un thread

Stati principali di un thread Java:[web:128]

- **New**: creato, non ancora avviato.
- **Runnable**: pronto o in esecuzione.
- **Running**: sta eseguendo codice (concettuale).
- **Blocked/Waiting/Timed Waiting**: in attesa di una risorsa o di tempo.
- **Terminated**: ha finito.

## 6. Creare thread in Java

### Metodo 1: estendere `Thread`

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread in esecuzione");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // non chiamare run() direttamente
    }
}
```

`start()` avvia un nuovo thread; `run()` è il codice eseguito.[web:125][web:128]

### Metodo 2: implementare `Runnable`

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable in esecuzione");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

Più flessibile, perché non vincola l’ereditarietà.[web:125][web:128]

### Metodo 3: lambda (Java 8+)

```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread con lambda");
        });
        t.start();
    }
}
```

Più breve e conciso per task semplici.[web:128]

## 7. Race condition: esempio pratico

```java
public class CounterExample {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + count); // spesso < 20000
    }
}
```

Due thread incrementano `count` senza sincronizzazione, creando una **race condition**.[web:128]

## 8. Sincronizzazione per thread-safety

### synchronized su metodo

```java
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

Solo un thread alla volta può eseguire metodi `synchronized` sullo stesso oggetto.[web:119][web:128]

### synchronized su blocco

```java
public void increment() {
    synchronized (this) {
        count++;
    }
}
```

Sincronizza solo la parte critica del codice.[web:128]

## 9. Singleton thread-safe e multi-threading

Se un singleton è:
- **senza stato** (immutabile, senza campi modificabili), è quasi sempre thread-safe;
- **con stato modificabile**, i metodi che modificano lo stato devono essere sincronizzati o usare strutture thread-safe.[web:123]

Esempio di singleton con stato thread-safe:

```java
public class ConfigManager {
    private static final ConfigManager INSTANCE = new ConfigManager();

    private String config;

    private ConfigManager() {
        this.config = "default";
    }

    public static ConfigManager getInstance() {
        return INSTANCE;
    }

    public synchronized void setConfig(String config) {
        this.config = config;
    }

    public synchronized String getConfig() {
        return config;
    }
}
```

## 10. Errori comuni

### Singleton

- Implementare un singleton non thread-safe in ambiente multi-thread.[web:118][web:120]
- Usare il singleton per “nascondere” dipendenze globali, rendendo difficile il testing.[web:118]
- Dimenticare che un singleton è unico per **JVM**, non per sistema distribuito.[web:118]

### Multi-threading

- Chiamare `run()` invece di `start()`, eseguendo il task nel thread principale.[web:125][web:128]
- Ignorare `InterruptedException` senza ripristinare lo stato di interrupt.[web:128]
- Creare troppi thread, causando problemi di memoria e prestazioni.[web:128]
- Non sincronizzare l’accesso a risorse condivise, causando race condition.[web:128]
- Dimenticare di chiudere `ExecutorService`, lasciando thread attivi.[web:128]

## 11. Da ricordare

- Singleton = una sola istanza per JVM, con accesso globale.[web:116][web:118]
- In multi-thread, il singleton “semplice” può creare più istanze.[web:118][web:120]
- Per thread-safety: usa `synchronized`, inizializzazione statica, double-checked locking o enum.[web:118][web:121]
- Enum è la soluzione più sicura e semplice per singleton thread-safe.[web:118]
- Multi-threading = più thread nello stesso processo che condividono memoria.[web:119][web:128]
- Race condition = risultato dipende dall’ordine di esecuzione dei thread.[web:128]
- `synchronized` protegge le risorse condivise, permettendo a un solo thread di accedere alla sezione critica.[web:119][web:128]

"""

with open("output/thread_safe_singleton_multithreading.md", "w", encoding="utf-8") as f:
    f.write(code)
python
# Assicuriamo che la cartella esista (già creata in precedenza, ma per sicurezza)
!mkdir -p output

# Eseguiamo il codice di scrittura
code = """
# Guida base a Singleton e Multi-threading in Java

Il **singleton** è un pattern di progettazione che garantisce che una classe abbia **una sola istanza** e fornisca un punto di accesso globale a quell'istanza.[web:116][web:118] Il **multi-threading** è la capacità di Java di eseguire più thread contemporaneamente, cioè più "filamenti di esecuzione" nello stesso processo.[web:119][web:128]

Quando si usa un singleton in un ambiente multi-thread, bisogna fare attenzione: se non è implementato correttamente, possono essere create più istanze, rompendo il principio del singleton.[web:118][web:120]

## 1. Che cos'è il Singleton

Il singleton si usa quando:
- serve un solo oggetto per coordinare azioni nel sistema;[web:116][web:118]
- vuoi evitare di creare più oggetti che rappresentano la stessa entità (configurazione, gestione sessioni, connessioni al database, logger, controllo dispositivi, ecc.).[web:118]

### Struttura base

Un singleton tipico ha:
- costruttore **private**;
- una variabile **static** che contiene l'unica istanza;
- un metodo **public static** che restituisce l'istanza.[web:116][web:118]

### Esempio base (non thread-safe)

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // costruttore privato
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

Questo codice funziona in ambienti single-thread, ma in multi-thread può creare più istanze.[web:118][web:120]

## 2. Perché il Singleton può fallire in multi-thread

In un ambiente multi-thread, due thread possono entrare contemporaneamente in `getInstance()` quando `instance` è `null`:
- entrambi vedono `instance == null`;
- entrambi creano un nuovo oggetto;
- il risultato sono due istanze diverse, violando il singleton.[web:118][web:120]

Questo è un tipico **race condition**: l'esito dipende dall'ordine di esecuzione dei thread.[web:128]

## 3. Singleton thread-safe: tre approcci principali

### Approccio 1: metodo sincronizzato

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

`public static synchronized` garantisce che solo un thread alla volta possa eseguire il metodo.[web:118][web:120]

- **Vantaggio**: semplice e sicuro.
- **Svantaggio**: sincronizza anche dopo che l'istanza è creata, con piccolo impatto sulle prestazioni se il metodo è molto usato.[web:118]

### Approccio 2: inizializzazione statica (eager initialization)

```java
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

L'istanza viene creata al caricamento della classe, non al primo utilizzo.[web:118]

- **Vantaggio**: molto semplice e thread-safe senza `synchronized`.
- **Svantaggio**: l'istanza è creata anche se non viene mai usata (lazy vs eager).

### Approccio 3: double-checked locking con `volatile`

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

Qui si controlla due volte se `instance` è `null`:
- prima senza sincronizzare;
- poi dentro il blocco sincronizzato.[web:118][web:121]

- `volatile` assicura che la scrittura dell'istanza sia visibile immediatamente a tutti i thread.[web:121]

### Approccio 4: Singleton con `enum` (consigliato)

```java
public enum SingletonEnum {
    INSTANCE;

    public void operativa() {
        System.out.println("Operazione eseguita");
    }
}
```

Dall'enum si ottiene l'istanza con:

```java
SingletonEnum singleton = SingletonEnum.INSTANCE;
singleton.operativa();
```

- garantito thread-safe dalla JVM;[web:118]
- resistente a serializzazione e reflection;[web:118]
- molto semplice.

## 4. Multi-threading in Java: concetti base

Il **multi-threading** permette a un programma di eseguire più attività in parallelo o in modo intercalato, migliorando:
- prestazioni su CPU multi-core;
- reattività delle interfacce grafiche;
- utilizzo efficiente delle risorse.[web:119][web:128]

### Thread vs processo

- Un **processo** è un programma in esecuzione con memoria separata.
- Un **thread** è un "sotto-processo" che condivide la memoria con altri thread dello stesso processo.[web:128]

## 5. Ciclo di vita di un thread

Stati principali di un thread Java:[web:128]

- **New**: creato, non ancora avviato.
- **Runnable**: pronto o in esecuzione.
- **Running**: sta eseguendo codice (concettuale).
- **Blocked/Waiting/Timed Waiting**: in attesa di una risorsa o di tempo.
- **Terminated**: ha finito.

## 6. Creare thread in Java

### Metodo 1: estendere `Thread`

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread in esecuzione");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // non chiamare run() direttamente
    }
}
```

`start()` avvia un nuovo thread; `run()` è il codice eseguito.[web:125][web:128]

### Metodo 2: implementare `Runnable`

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable in esecuzione");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

Più flessibile, perché non vincola l'ereditarietà.[web:125][web:128]

### Metodo 3: lambda (Java 8+)

```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread con lambda");
        });
        t.start();
    }
}
```

Più breve e conciso per task semplici.[web:128]

## 7. Race condition: esempio pratico

```java
public class CounterExample {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + count); // spesso < 20000
    }
}
```

Due thread incrementano `count` senza sincronizzazione, creando una **race condition**.[web:128]

## 8. Sincronizzazione per thread-safety

### synchronized su metodo

```java
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

Solo un thread alla volta può eseguire metodi `synchronized` sullo stesso oggetto.[web:119][web:128]

### synchronized su blocco

```java
public void increment() {
    synchronized (this) {
        count++;
    }
}
```

Sincronizza solo la parte critica del codice.[web:128]

## 9. Singleton thread-safe e multi-threading

Se un singleton è:
- **senza stato** (immutabile, senza campi modificabili), è quasi sempre thread-safe;
- **con stato modificabile**, i metodi che modificano lo stato devono essere sincronizzati o usare strutture thread-safe.[web:123]

Esempio di singleton con stato thread-safe:

```java
public class ConfigManager {
    private static final ConfigManager INSTANCE = new ConfigManager();

    private String config;

    private ConfigManager() {
        this.config = "default";
    }

    public static ConfigManager getInstance() {
        return INSTANCE;
    }

    public synchronized void setConfig(String config) {
        this.config = config;
    }

    public synchronized String getConfig() {
        return config;
    }
}
```

## 10. Errori comuni

### Singleton

- Implementare un singleton non thread-safe in ambiente multi-thread.[web:118][web:120]
- Usare il singleton per "nascondere" dipendenze globali, rendendo difficile il testing.[web:118]
- Dimenticare che un singleton è unico per **JVM**, non per sistema distribuito.[web:118]

### Multi-threading

- Chiamare `run()` invece di `start()`, eseguendo il task nel thread principale.[web:125][web:128]
- Ignorare `InterruptedException` senza ripristinare lo stato di interrupt.[web:128]
- Creare troppi thread, causando problemi di memoria e prestazioni.[web:128]
- Non sincronizzare l'accesso a risorse condivise, causando race condition.[web:128]
- Dimenticare di chiudere `ExecutorService`, lasciando thread attivi.[web:128]

## 11. Da ricordare

- Singleton = una sola istanza per JVM, con accesso globale.[web:116][web:118]
- In multi-thread, il singleton "semplice" può creare più istanze.[web:118][web:120]
- Per thread-safety: usa `synchronized`, inizializzazione statica, double-checked locking o enum.[web:118][web:121]
- Enum è la soluzione più sicura e semplice per singleton thread-safe.[web:118]
- Multi-threading = più thread nello stesso processo che condividono memoria.[web:119][web:128]
- Race condition = risultato dipende dall'ordine di esecuzione dei thread.[web:128]
- `synchronized` protegge le risorse condivise, permettendo a un solo thread di accedere alla sezione critica.[web:119][web:128]
"""

with open("output/thread_safe_singleton_multithreading.md", "w", encoding="utf-8") as f:
    f.write(code)
		 */
	}

}
