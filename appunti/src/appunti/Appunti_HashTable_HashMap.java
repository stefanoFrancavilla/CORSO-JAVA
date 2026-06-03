package appunti;

public class Appunti_HashTable_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Certo: ti preparo degli appunti chiari e copiabili in Eclipse su hash table e HashMap, con spiegazione semplice ma concreta. In Java, HashMap è la versione più usata per memorizzare coppie chiave-valore, mentre la logica di base delle tabelle hash è quella di trasformare una chiave in un indice per trovare i dati velocemente.

Idea di base
Una tabella hash funziona come un armadietto con tanti cassetti.
Tu dai una chiave, la struttura la trasforma in un numero, e quel numero decide in quale cassetto mettere il valore associato.

In pratica:

chiave = ciò che usi per cercare.

valore = il dato salvato.

hash = numero calcolato dalla chiave.

bucket = posizione della tabella dove finisce l’elemento.

Come ragiona internamente
HashMap non salva i dati “in fila” come un array normale.
Usa un array interno di posizioni chiamate bucket, e ogni bucket può contenere uno o più elementi quando ci sono collisioni.

Il flusso è questo:

prendi la chiave;

calcoli hashCode();

trasformi quel numero in un indice valido dell’array;

salvi la coppia chiave-valore nel bucket corrispondente.

Quando fai get(key), succede il contrario:

la HashMap ricalcola l’hash della chiave;

va nel bucket giusto;

confronta le chiavi con equals() fino a trovare quella esatta.

Collisioni
Una collisione succede quando due chiavi diverse finiscono nello stesso bucket.
Questo è normale, non è un errore: la struttura è progettata anche per questo caso.

Quando accade:

se le chiavi sono uguali secondo equals(), il vecchio valore viene sostituito;

se le chiavi sono diverse, entrambi gli elementi restano nello stesso bucket.

Questa è una delle cose più importanti da capire: hash uguale non significa per forza chiave uguale. Per questo HashMap usa sia hashCode() sia equals().

HashMap vs Hashtable
HashMap e Hashtable sono simili, ma non identiche.
HashMap è più moderna e in genere si preferisce quando non serve sincronizzazione, mentre Hashtable è una classe più vecchia e sincronizzata.

Differenze pratiche:

HashMap permette una chiave null, Hashtable no.

HashMap non è sincronizzata, Hashtable sì.

HashMap è più usata nel Java moderno.

Cose da sapere bene
Per usare bene una HashMap, devi ricordare queste regole:

le chiavi devono avere hashCode() e equals() coerenti;

due oggetti uguali con equals() devono avere lo stesso hashCode();

se non fai override correttamente, puoi ottenere comportamenti strani nelle ricerche;

l’ordine degli elementi in una HashMap non è garantito.

In parole semplici: la HashMap è veloce perché evita di cercare tutto uno per uno.
Invece di scorrere tutta la struttura, usa l’hash per andare quasi subito nella zona giusta.

Appunti Java
java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mappa = new HashMap<>();

        mappa.put("gold", 2450);
        mappa.put("silver", 31);
        mappa.put("oil", 78);

        System.out.println(mappa.get("gold"));   // 2450
        System.out.println(mappa.get("silver")); // 31

        System.out.println(mappa.containsKey("oil")); // true
        System.out.println(mappa.containsValue(78));   // true

        mappa.put("gold", 2500); // sovrascrive il valore precedente
        System.out.println(mappa.get("gold")); // 2500
    }
}
Nota importante su hashCode() e equals()
Se crei una tua classe come chiave, devi sovrascrivere entrambi i metodi.
Questo è fondamentale perché HashMap usa prima l’hash e poi equals() per trovare la chiave esatta.

java
import java.util.Objects;

class Persona {
    String nome;
    int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return eta == persona.eta && Objects.equals(nome, persona.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta);
    }
}
Frase da ricordare
Puoi memorizzarla così: HashMap = chiave → hash → bucket → confronto finale con equals().
 */
		
		
		
	}

}
