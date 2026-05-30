package appunti;

public class Appunti_classiAnnidate_Astratte_AnnidateStatiche_Interne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Astratte, statiche, interne e anonime
Questi tipi di classi in Java sembrano difficili all'inizio, ma l'idea è abbastanza semplice: servono per organizzare meglio il codice e per scegliere il modo giusto di scrivere una classe in base a quello che ti serve.

1. Classe astratta
Idea semplice
Una classe astratta è una classe base. Serve per dire: "tutte le classi figlie avranno queste cose in comune". Però non la puoi usare direttamente per creare oggetti.

Quando si usa
La usi quando hai più classi simili e vuoi costringerle ad avere certi metodi.

Esempio
Immagina degli animali. Tutti gli animali possono fare un suono, ma ogni animale lo fa in modo diverso.

java
public abstract class Animale {
    protected String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public abstract void faiSuono();

    public void dormi() {
        System.out.println(nome + " sta dormendo");
    }
}

public class Cane extends Animale {
    public Cane(String nome) {
        super(nome);
    }

    public void faiSuono() {
        System.out.println(nome + " fa Bau Bau");
    }
}

public class Gatto extends Animale {
    public Gatto(String nome) {
        super(nome);
    }

    public void faiSuono() {
        System.out.println(nome + " fa Miao");
    }
}
Differenza importante
Non puoi fare:

java
Animale a = new Animale("Generico");
perché la classe è astratta.

Perché è utile
Ti evita di creare una classe troppo generica. Invece crei una base comune e poi ogni classe figlia completa il comportamento.

2. Classe annidata
Idea semplice
Una classe annidata è una classe scritta dentro un'altra classe.

Perché farlo
Perché quella classe serve solo lì dentro, quindi ha più senso tenerla vicina alla classe principale.

Tipi principali
classe statica annidata

classe interna

classe anonima

3. Classe statica annidata
Idea semplice
È una classe dentro un'altra classe, ma è legata alla classe esterna solo in parte. Si usa con static.

Cosa può fare
Può usare i campi static della classe esterna, ma non quelli normali dell'oggetto.

Esempio
java
public class Auto {
    private String modello;
    private static int totaleAuto = 0;

    public Auto(String modello) {
        this.modello = modello;
        totaleAuto++;
    }

    public static class Info {
        public void mostraTotale() {
            System.out.println("Auto create: " + totaleAuto);
        }
    }
}
Uso
java
Auto.Info info = new Auto.Info();
info.mostraTotale();
Quando conviene
Conviene quando la classe interna è utile, ma non ha bisogno di sapere i dati del singolo oggetto esterno.

Esempio pratico
Un Builder, una classe di supporto, un contenitore di piccole funzioni legate alla classe principale.

4. Classe interna
Idea semplice
È una classe dentro un'altra classe, ma non è static.

Differenza rispetto alla statica
Questa classe è legata a una singola istanza della classe esterna. Quindi può leggere anche i campi dell'oggetto esterno.

Esempio
Immagina una casa e una stanza. Ogni stanza appartiene a una casa precisa.

java
public class Casa {
    private String colore;

    public Casa(String colore) {
        this.colore = colore;
    }

    public class Stanza {
        public void mostraInfo() {
            System.out.println("La stanza è dentro una casa colorata di " + colore);
        }
    }
}
Uso
java
Casa casa = new Casa("bianco");
Casa.Stanza stanza = casa.new Stanza();
stanza.mostraInfo();
Quando conviene
Conviene quando la classe interna ha bisogno di usare i dati della classe esterna.

Differenza con la statica
statica = non dipende dall'oggetto esterno

interna = dipende dall'oggetto esterno

5. Classe anonima
Idea semplice
È una classe senza nome. La scrivi e la usi subito, spesso una sola volta.

Quando si usa
Si usa quando ti serve un comportamento veloce, senza creare una classe completa separata.

Esempio
Se vuoi far eseguire un pezzo di codice in un thread:

java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Sto eseguendo il thread");
    }
};

Thread t = new Thread(r);
t.start();
Versione moderna
Con Java 8 puoi usare una lambda:

java
Runnable r = () -> System.out.println("Sto eseguendo il thread");
Quando conviene
Conviene quando ti serve qualcosa al volo, senza creare una classe nuova con nome.

Limite
Se il codice diventa lungo o complicato, meglio creare una classe vera e propria.

6. Confronto semplice
Classe astratta
Serve come base

Non si può creare direttamente

Utile quando vuoi imporre regole comuni

Classe statica annidata
Sta dentro un'altra classe

Non ha bisogno dell'oggetto esterno

Utile per supporto o organizzazione

Classe interna
Sta dentro un'altra classe

Dipende dall'oggetto esterno

Utile quando deve usare i suoi dati

Classe anonima
Non ha nome

Si usa una sola volta

Utile per azioni rapide

7. Come scegliere
Se vuoi un modello comune
Usa una classe astratta.

Se la classe interna non ha bisogno dell'oggetto esterno
Usa una classe statica annidata.

Se la classe interna deve leggere i dati dell'oggetto esterno
Usa una classe interna.

Se ti serve qualcosa di veloce e una sola volta
Usa una classe anonima o una lambda.

8. Esempio finale per capire bene
Pensa a una scuola:

Persona astratta = idea generale di persona, ma non una persona concreta.

Studente e Professore = classi concrete che partono da quella base.

Persona.Info statica = una parte di supporto che può dare informazioni generali.

Persona.Indirizzo interna = ha senso solo legata a quella persona.

Classe anonima = una regola veloce usata una sola volta, per esempio un controllo rapido.

9. Regola facile da ricordare
Astratta = base comune

Statica annidata = dentro la classe, ma indipendente dall'oggetto

Interna = dentro la classe e legata all'oggetto

Anonima = senza nome, usa e getta


		 */
	}

}
