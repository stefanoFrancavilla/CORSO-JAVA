package appunti;

public class Appunti_Poliformismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Guida base al polimorfismo in Java
Il polimorfismo è uno dei concetti fondamentali della programmazione a oggetti e indica la possibilità di usare un riferimento di un tipo generale per gestire oggetti di tipi più specifici.
 In Java, questo significa che una variabile di tipo classe padre o interfaccia può riferirsi a oggetti di classi diverse, e la JVM invoca il metodo corretto in base al tipo reale dell’oggetto.

Che cosa significa davvero
La parola polimorfismo significa “molte forme”.
 In pratica, vuol dire che puoi scrivere codice generico e lasciare che sia Java a scegliere il comportamento giusto al momento dell’esecuzione.

Idea base
java
Animale a = new Cane();
Animale b = new Gatto();
In entrambi i casi il tipo del riferimento è Animale, ma l’oggetto reale è diverso.
 Quando chiami un metodo ridefinito, Java usa il metodo dell’oggetto vero, non quello del tipo della variabile.

Perché è utile
Il polimorfismo rende il codice più flessibile, riutilizzabile e facile da estendere.
 Permette di lavorare con un solo tipo generale invece di scrivere codice separato per ogni classe concreta.

Esempio intuitivo
Se hai un metodo che lavora con Animale, quel metodo può funzionare con Cane, Gatto, Uccello e altre sottoclassi, purché rispettino lo stesso contratto.

Polimorfismo con ereditarietà
Il caso più classico nasce con una classe padre e più classi figlie che ridefiniscono lo stesso metodo.
 Questo meccanismo si basa sull’overriding, cioè la ridefinizione di un metodo ereditato con la stessa firma.

Esempio pratico
java
class Animale {
    public void verso() {
        System.out.println("Verso generico");
    }
}

class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("Bau");
    }
}

class Gatto extends Animale {
    @Override
    public void verso() {
        System.out.println("Miao");
    }
}
Qui Cane e Gatto ridefiniscono verso() in modo diverso.
 Questo è il punto centrale del polimorfismo a runtime.

Polimorfismo in azione
Ora si vede davvero il vantaggio pratico.

java
public class TestAnimali {
    public static void main(String[] args) {
        Animale a1 = new Cane();
        Animale a2 = new Gatto();

        a1.verso();
        a2.verso();
    }
}
Anche se a1 e a2 sono dichiarati come Animale, Java esegue verso() di Cane e verso() di Gatto perché guarda il tipo reale dell’oggetto.
 Oracle chiama questo comportamento virtual method invocation.

Come riconoscere il polimorfismo
Di solito c’è polimorfismo quando vedi queste tre condizioni insieme:

una classe padre o un’interfaccia;

più classi figlie o implementazioni;

un riferimento generico che punta a oggetti concreti diversi.

Esempio da riconoscere al volo
java
Pagamento p;
p = new Carta();
p = new PayPal();
Questo è un tipico esempio polimorfico, perché p mantiene un tipo generale ma può assumere forme diverse durante il programma.

Polimorfismo con interfacce
Il polimorfismo non funziona solo con le classi, ma anche con le interfacce.
 Una variabile di tipo interfaccia può riferirsi a oggetti di classi diverse che implementano la stessa interfaccia.

Esempio pratico
java
interface Pagamento {
    void paga(double importo);
}

class Carta implements Pagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento con carta: " + importo);
    }
}

class PayPal implements Pagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento con PayPal: " + importo);
    }
}
Ora puoi scrivere codice generico che usa Pagamento senza sapere in anticipo quale implementazione concreta riceverà.

Uso pratico
java
public class Negozio {
    public static void eseguiPagamento(Pagamento p) {
        p.paga(50.0);
    }
}
Questo metodo funziona con qualsiasi classe che implementa Pagamento.
 È proprio qui che il polimorfismo rende il codice più modulare.

Differenza tra tipo del riferimento e tipo dell’oggetto
Questa è una delle nozioni più importanti da capire bene all’inizio.
 Il tipo del riferimento determina quali metodi puoi chiamare a compile time, mentre il tipo reale dell’oggetto determina quale versione del metodo ridefinito viene eseguita a runtime.

Esempio
java
Animale animale = new Cane();
animale.verso();
Il compilatore controlla il codice usando il tipo Animale, ma al momento dell’esecuzione parte il metodo verso() di Cane.

Polimorfismo e overriding
L’overriding è uno dei meccanismi principali con cui si realizza il polimorfismo a runtime.
 Una sottoclasse ridefinisce un metodo della superclasse con stessa firma, e Java sceglie quale versione eseguire in base all’oggetto reale.

Esempio
java
class Veicolo {
    public void avvia() {
        System.out.println("Veicolo avviato");
    }
}

class Auto extends Veicolo {
    @Override
    public void avvia() {
        System.out.println("Auto avviata");
    }
}
Se scrivi Veicolo v = new Auto();, la chiamata v.avvia() esegue il metodo di Auto.

Polimorfismo e overloading
L’overloading è un concetto diverso dal polimorfismo a runtime.
 Nell’overloading lo stesso metodo ha lo stesso nome ma parametri diversi, e la scelta viene fatta a compile time, non in base al tipo reale dell’oggetto.

Esempio di overloading
java
class Calcolatrice {
    public int somma(int a, int b) {
        return a + b;
    }

    public double somma(double a, double b) {
        return a + b;
    }
}
Questo è overloading, non il tipo di polimorfismo che si studia di solito parlando di ereditarietà e interfacce.

Vantaggi pratici
Il polimorfismo offre vantaggi molto concreti nello sviluppo di programmi reali.

Riduce il codice duplicato, perché si lavora con tipi generali.

Rende più facile aggiungere nuove classi senza riscrivere molta logica esistente.

Migliora la manutenibilità, perché il codice dipende meno dalle classi concrete.

Esempio realistico completo
java
interface Messaggio {
    void invia();
}

class Email implements Messaggio {
    @Override
    public void invia() {
        System.out.println("Invio email");
    }
}

class SMS implements Messaggio {
    @Override
    public void invia() {
        System.out.println("Invio SMS");
    }
}

class NotificaPush implements Messaggio {
    @Override
    public void invia() {
        System.out.println("Invio notifica push");
    }
}

public class ServizioMessaggi {
    public static void mandaMessaggio(Messaggio m) {
        m.invia();
    }
}
Con questa struttura puoi aggiungere in futuro nuove classi come MessaggioWhatsApp senza cambiare il metodo mandaMessaggio, purché implementino Messaggio.

Errori comuni dei principianti
Pensare che polimorfismo significhi solo ereditarietà: in realtà entra in gioco soprattutto quando usi un riferimento generale per oggetti diversi.

Confondere overriding con overloading.

Credere che Java esegua il metodo in base al tipo della variabile: per i metodi ridefiniti conta il tipo reale dell’oggetto.

Dimenticare che senza relazione tra tipi, il polimorfismo non esiste.

Da ricordare
Polimorfismo = un riferimento generale può puntare a oggetti di forme diverse.

Si vede soprattutto con classi figlie e interfacce.

Il metodo eseguito dipende dal tipo reale dell’oggetto.

Overriding realizza il polimorfismo a runtime.

Overloading è un concetto diverso.
		 */
	}

}
