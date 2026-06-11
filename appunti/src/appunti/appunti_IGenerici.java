package appunti;

public class appunti_IGenerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Certo: qui sotto trovi appunti semplici ma completi sui generics in Java, spiegati in parole semplici, con codice pronto da copiare e incollare in Eclipse. I generics servono a scrivere classi, metodi e interfacce che lavorano con tipi diversi senza perdere il controllo dei tipi, evitando molti errori e riducendo i cast inutili.

Cosa sono i generics
I generics ti permettono di scrivere codice “riutilizzabile” che funziona con più tipi di dati.
Invece di scrivere una classe per String, una per Integer e una per Double, ne scrivi una sola e scegli il tipo quando la usi.

Esempio semplice:

senza generics: devi creare più classi o usare Object.

con generics: scrivi una sola classe, per esempio Box<T>, e poi decidi se sarà una Box<String>, Box<Integer>, ecc..

Perché servono
I generics servono soprattutto per:

evitare errori di tipo già in compilazione.

evitare cast manuali inutili.

rendere il codice più pulito e riutilizzabile.

scrivere collezioni e metodi più sicuri e leggibili.

Un vantaggio importante è che Java controlla il tipo prima di eseguire il programma, quindi trovi prima eventuali errori.

Sintassi base
Il simbolo più usato è T, che significa “Type”.

java
public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
Qui T è un segnaposto: quando crei l’oggetto, scegli tu il tipo reale.

Esempio d’uso:

java
public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setValue("Ciao");
        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>();
        box2.setValue(100);
        System.out.println(box2.getValue());
    }
}
Come funziona
Quando scrivi:

java
Box<String> box = new Box<>();
stai dicendo: “questa scatola conterrà solo String”.
Se poi provi a mettere un Integer, Java segnala errore in compilazione.

Questo è il vero vantaggio dei generics: il codice resta flessibile, ma anche sicuro.

Classi generiche
Una classe generica è una classe che usa uno o più tipi generici.

Esempio completo:

java
public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
Uso:

java
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Età", 20);

        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}
Metodi generici
Un metodo generico è un metodo che può lavorare con tipi diversi anche se la classe non è generica.

Esempio:

java
public class Utility {
    public static <T> void stampa(T valore) {
        System.out.println(valore);
    }
}
Uso:

java
public class Main {
    public static void main(String[] args) {
        Utility.stampa("Testo");
        Utility.stampa(123);
        Utility.stampa(12.5);
    }
}
Qui <T> si scrive prima del tipo di ritorno del metodo.

Interfacce generiche
Anche le interfacce possono essere generiche.

Esempio:

java
public interface Repository<T> {
    void save(T obj);
    T findById(int id);
}
Implementazione:

java
public class StringRepository implements Repository<String> {
    private String data;

    @Override
    public void save(String obj) {
        data = obj;
    }

    @Override
    public String findById(int id) {
        return data;
    }
}
Le interfacce generiche sono utili quando vuoi definire un comportamento comune per tipi diversi.

Wildcard ?
La wildcard ? significa “tipo sconosciuto”.

? extends
Usa un tipo che estende una classe.

java
public static void printList(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
Qui puoi passare List<Integer>, List<Double>, List<Float>, ecc.

? super
Usa un tipo che è superclasse di un tipo.

java
public static void addNumbers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}
Le wildcard servono quando lavori con collezioni e vuoi più flessibilità.

Tipi di generici più usati
I simboli più comuni sono:

T = Type.

E = Element.

K = Key.

V = Value.

N = Number.

Non è obbligatorio usare questi simboli, ma sono convenzioni molto comuni.

Dove conviene usarli
I generics convengono soprattutto in questi casi:

classi contenitore, per esempio Box<T>, Pair<A, B>.

collezioni, come List<String> o Map<Integer, String>.

metodi che devono lavorare su più tipi.

librerie e codice riutilizzabile.

interfacce comuni per più oggetti.

Quando usarli bene
Usali quando vuoi:

evitare duplicazione di codice.

proteggerti dagli errori di tipo.

scrivere API più pulite.

lavorare con strutture dati riutilizzabili.

Non servono invece se il tipo è sempre uno solo e non cambierà mai. In quel caso i generics aggiungono complessità inutile.

Errori comuni
1. Usare Object al posto dei generics
Con Object perdi il controllo forte dei tipi e devi fare cast.

2. Dimenticare il tipo durante la dichiarazione
Sbagliato:

java
Box box = new Box();
Meglio:

java
Box<String> box = new Box<>();
3. Pensare che i generics accettino tipi primitivi
Non puoi scrivere Box<int>.
Devi usare le classi wrapper:

int → Integer

double → Double

boolean → Boolean

Esempio completo da incollare in Eclipse
File Box.java
java
public class Box<T> {
    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" + "value=" + value + '}';
    }
}
File Pair.java
java
public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
File Utility.java
java
public class Utility {
    public static <T> void stampa(T valore) {
        System.out.println(valore);
    }

    public static <T> T restituisci(T valore) {
        return valore;
    }
}
File Main.java
java
public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setValue("Ciao generics");
        System.out.println(boxString.getValue());

        Box<Integer> boxInt = new Box<>(100);
        System.out.println(boxInt.getValue());

        Pair<String, Integer> pair = new Pair<>("Età", 25);
        System.out.println(pair.getFirst() + " -> " + pair.getSecond());

        Utility.stampa("Prova");
        Utility.stampa(123);
        Utility.stampa(45.6);

        String testo = Utility.restituisci("Messaggio");
        Integer numero = Utility.restituisci(99);

        System.out.println(testo);
        System.out.println(numero);
    }
}
Riassunto da ricordare
I generics in Java servono a scrivere codice più sicuro, più pulito e più riutilizzabile.
Si usano per classi, metodi e interfacce, soprattutto quando vuoi lavorare con tipi diversi senza riscrivere sempre lo stesso codice.

La regola pratica è semplice:

se il codice deve funzionare con più tipi, usa i generics.

se il tipo è fisso e non cambia, non servono.

nelle collezioni e nelle utility sono spesso la scelta migliore.
		 */
	}

}
