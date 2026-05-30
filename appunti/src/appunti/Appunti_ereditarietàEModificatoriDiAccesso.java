package appunti;

public class Appunti_ereditarietàEModificatoriDiAccesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Certo. L’ereditarietà in Java serve a creare una nuova classe partendo da una già esistente, così puoi riusare codice, aggiungere funzioni e organizzare meglio il programma. Si usa con extends, e funziona bene quando c’è un vero rapporto is-a, per esempio Cane è un Animale.

Idea semplice
Pensa alla classe padre come a una base comune. La classe figlia eredita i dati e i metodi utili, poi può aggiungerne di nuovi o cambiare quelli già presenti con l’override.

java
class Animale {
    void mangia() {
        System.out.println("Mangia");
    }
}

class Cane extends Animale {
    void abbaia() {
        System.out.println("Bau");
    }
}
Cosa eredita davvero
La sottoclasse eredita i membri accessibili della superclasse, ma non i costruttori, e non può accedere direttamente ai membri private.

Per i membri privati di solito si usano getter e setter, oppure protected quando ha senso farli vedere alle classi figlie.

Le sfaccettature più comuni
Overriding
La classe figlia può riscrivere un metodo del padre per cambiare il comportamento. È una delle parti più importanti dell’ereditarietà e si segnala con @Override.

java
class Animale {
    void verso() {
        System.out.println("Suono generico");
    }
}

class Gatto extends Animale {
    @Override
    void verso() {
        System.out.println("Miao");
    }
}
super
super serve per richiamare costruttore o metodo della classe padre. Nei costruttori deve stare come prima istruzione se viene usato.

java
class Persona {
    Persona(String nome) { }
}

class Studente extends Persona {
    Studente(String nome) {
        super(nome);
    }
}
Polimorfismo
Un oggetto figlio può essere trattato come oggetto padre. Questo rende il codice più flessibile e permette di usare la stessa variabile per tipi diversi compatibili.

java
Animale a = new Cane();
a.mangia();
Classi astratte e interfacce
L’ereditarietà si collega bene anche alle classi astratte, quando vuoi una base comune ma non un oggetto diretto. Per comportamenti condivisi tra classi non necessariamente legate, spesso sono meglio le interfacce.

Errori da non commettere
Usarla solo per riusare codice
Uno degli errori più comuni è usare l’ereditarietà solo per copiare metodi, anche se le classi non hanno un vero rapporto logico. In questi casi spesso è meglio la composizione.

Creare gerarchie troppo profonde
Se fai troppe classi una sotto l’altra, il codice diventa difficile da capire e mantenere.

Meglio restare con gerarchie semplici e chiare.

Aspettarsi di ereditare i costruttori
I costruttori non si ereditano. Se la superclasse non ha costruttore vuoto, devi chiamare quello giusto con super(...).

Dimenticare @Override
Se riscrivi un metodo e non usi @Override, rischi errori di firma o refusi nel nome.

Usare male private
Una sottoclasse non vede direttamente i campi private del padre.

Cercare di fare ereditarietà multipla con classi
Java non permette che una classe estenda più classi. Se ti serve condividere più comportamenti, usa le interfacce.

Fare cast sbagliati
Convertire un padre in un figlio sbagliato può causare ClassCastException. In questi casi è utile instanceof.

Usare static come se fosse polimorfismo
I metodi static non vengono davvero sovrascritti: vengono nascosti. Con l’ereditarietà il vero polimorfismo riguarda i metodi di istanza.

Usi principali
L’ereditarietà si usa soprattutto per:

riusare codice comune tra classi correlate;

creare gerarchie logiche, come Animale -> Cane, Veicolo -> Auto;

cambiare solo alcune parti del comportamento nelle classi figlie;

sfruttare il polimorfismo per scrivere codice più flessibile;

definire basi comuni con classi astratte.

Quando conviene usarla
Usala quando esiste davvero un rapporto is-a e le classi condividono comportamento e struttura.

Non usarla solo perché vuoi riusare due metodi: in quel caso spesso la composizione è una scelta migliore.

Regola semplice
Se una classe è un tipo di un’altra, l’ereditarietà ha senso.

Se una classe ha dentro un’altra cosa, spesso è meglio la composizione.





Certo. Gli access modifiers in Java servono a decidere chi può vedere o usare una classe, un attributo, un metodo o un costruttore. Sono importantissimi perché ti aiutano a proteggere i dati, evitare errori e tenere il codice pulito e ordinato.

I quattro modificatori
In Java ci sono 4 livelli principali di accesso:

public

protected

default / package-private

private

public
public significa che il membro è visibile da ovunque.
Si usa quando qualcosa deve essere accessibile anche da altre classi e da altri package.

Quando usarlo
Usalo per:

metodi che devono essere chiamati dall’esterno;

classi principali;

costanti pubbliche ben definite.

Esempio
java
public class Persona {
    public String nome;
}
private
private significa che il membro è visibile solo dentro la stessa classe.
È il livello più sicuro e di solito è quello da preferire per i campi.

Quando usarlo
Usalo per:

attributi;

metodi di supporto interni;

dettagli che non devono essere toccati da fuori.

Esempio
java
public class Persona {
    private int eta;
}
default / package-private
Se non scrivi nessun modificatore, il membro diventa visibile solo dentro lo stesso package.

Si usa quando la classe o il metodo devono restare interni al gruppo di classi del progetto.

Quando usarlo
Usalo per:

classi di supporto;

utility interne al package;

logica che non deve uscire da quel gruppo di classi.

Esempio
java
class Aiuto {
    void stampa() {
        System.out.println("Ciao");
    }
}
protected
protected è visibile nel package e anche nelle sottoclassi, pure se stanno in un altro package.

È utile quando vuoi dare accesso controllato alle classi figlie.

Quando usarlo
Usalo per:

membri pensati per l’ereditarietà;

metodi da sovrascrivere;

dati che le sottoclassi devono poter leggere o usare.

Esempio
java
public class Animale {
    protected String nome;
}
Confronto semplice
Modificatore	Chi può usarlo
public	Tutti
protected	Stesso package + sottoclassi
default	Solo stesso package
private	Solo stessa classe
Dove conviene metterli
Per gli attributi
Di solito conviene usare private.
Così nessuno cambia i dati direttamente da fuori e tu controlli tutto con metodi come getter e setter.

Per i metodi
public se devono essere usati da fuori.

private se servono solo internamente.

protected se devono essere disponibili anche alle sottoclassi.

default se servono solo dentro il package.

Per le classi
Per le classi esterne di livello superiore, in pratica usi spesso public o default.
Una classe public si vede ovunque; una senza modificatore si vede solo nel package.

Regole pratiche
Parti sempre da private e apri l’accesso solo se serve.

Usa public solo per ciò che davvero deve essere usato dall’esterno.

Usa protected quando stai progettando per l’ereditarietà.

Usa default quando vuoi tenere la cosa interna al package.

Esempio completo
java
public class Persona {
    private String nome;
    protected int eta;
    String citta; // default
    public static final String SPECIE = "Homo sapiens";

    public Persona(String nome, int eta, String citta) {
        this.nome = nome;
        this.eta = eta;
        this.citta = citta;
    }

    public String getNome() {
        return nome;
    }

    private void controlloInterno() {
        System.out.println("Controllo interno");
    }
}
Idea facile da ricordare
private = solo qui dentro.

default = solo nel package.

protected = package + figli.

public = tutti.
		 */
	}

}
