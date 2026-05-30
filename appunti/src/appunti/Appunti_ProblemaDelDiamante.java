package appunti;

public class Appunti_ProblemaDelDiamante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Guida base al problema del diamante in Java
Il problema del diamante è una situazione di ambiguità che nasce quando un tipo eredita lo stesso metodo da più rami diversi della gerarchia.
 In Java il problema classico viene evitato perché una classe non può estendere più classi, ma può riapparire con le interfacce che hanno metodi default.

Perché si chiama così
Si parla di “diamante” perché lo schema della gerarchia assomiglia a un diamante: in alto c’è un tipo base, al centro due rami diversi, e in basso una classe che eredita da entrambi i rami.

Schema logico
text
        A
       / \
      B   C
       \ /
        D
Se B e C forniscono entrambi un metodo con la stessa firma, D può trovarsi in difficoltà perché il compilatore non sa quale usare.

In Java quando può comparire davvero
Java supporta l’ereditarietà multipla di tipo, cioè una classe può implementare più interfacce.
 Con Java 8, i default methods hanno introdotto anche una forma di ereditarietà di implementazione nelle interfacce, e questo è il punto in cui può comparire il problema del diamante.

Quindi la regola pratica è questa:

tra classi, Java evita il problema perché non permette di estendere due classi insieme.

tra interfacce senza default methods, non c’è ambiguità di implementazione perché la classe deve comunque scrivere il metodo.

tra interfacce con default methods uguali, il problema può comparire davvero.

Come riconoscere il problema
Puoi sospettare il problema del diamante quando succedono queste cose:

una classe implementa due interfacce diverse;

entrambe le interfacce dichiarano un metodo default con lo stesso nome e la stessa firma;

il compilatore segnala un conflitto perché non sa quale implementazione scegliere.

Primo esempio: il problema compare davvero
Questo è il caso più classico da riconoscere.

java
interface A {
    default void saluta() {
        System.out.println("Ciao da A");
    }
}

interface B {
    default void saluta() {
        System.out.println("Ciao da B");
    }
}

class Persona implements A, B {
}
Questo codice non compila, perché Persona riceve due versioni diverse di saluta() e Java obbliga il programmatore a risolvere il conflitto in modo esplicito.

Come capire subito che sei davanti al problema
La domanda da farti è: “la mia classe implementa due interfacce che offrono già lo stesso metodo default?”.
 Se la risposta è sì, stai quasi certamente guardando il problema del diamante.

Soluzione 1: override del metodo nella classe
La soluzione più importante è riscrivere il metodo nella classe concreta.
 In questo modo la classe elimina l’ambiguità e decide da sola quale comportamento usare.

java
interface A {
    default void saluta() {
        System.out.println("Ciao da A");
    }
}

interface B {
    default void saluta() {
        System.out.println("Ciao da B");
    }
}

class Persona implements A, B {
    @Override
    public void saluta() {
        System.out.println("Ciao scelto da Persona");
    }
}
Qui il problema è risolto perché Persona fornisce la propria implementazione e il compilatore non deve più scegliere tra A e B.

Soluzione 2: scegliere un’interfaccia precisa con InterfaceName.super.metodo()
Se vuoi riutilizzare uno dei due comportamenti già esistenti, puoi richiamarlo in modo esplicito con NomeInterfaccia.super.nomeMetodo().
 Questa sintassi dice chiaramente al compilatore quale implementazione usare.

java
interface A {
    default void saluta() {
        System.out.println("Ciao da A");
    }
}

interface B {
    default void saluta() {
        System.out.println("Ciao da B");
    }
}

class Persona implements A, B {
    @Override
    public void saluta() {
        A.super.saluta();
    }
}
In questo caso Persona sceglie esplicitamente il comportamento di A.

Soluzione 3: combinare i due comportamenti
A volte non vuoi scegliere solo uno dei due rami, ma vuoi usare entrambi in sequenza.
 Anche questo si può fare facendo override del metodo e richiamando entrambe le implementazioni nell’ordine desiderato.

java
interface Audio {
    default void avvia() {
        System.out.println("Audio avviato");
    }
}

interface Video {
    default void avvia() {
        System.out.println("Video avviato");
    }
}

class PlayerMultimediale implements Audio, Video {
    @Override
    public void avvia() {
        Audio.super.avvia();
        Video.super.avvia();
        System.out.println("Player pronto");
    }
}
Questa soluzione è utile quando i due comportamenti non si escludono a vicenda e hanno senso insieme.

Caso importante: se una classe padre ha già il metodo
Java applica regole precise per risolvere i metodi ereditati, e una di queste è che il metodo di una superclasse concreta ha priorità rispetto ai default methods delle interfacce.
 Quindi, se la classe eredita già un metodo da una classe padre, spesso il conflitto scompare.

Esempio
java
class EssereVivente {
    public void saluta() {
        System.out.println("Ciao da EssereVivente");
    }
}

interface A {
    default void saluta() {
        System.out.println("Ciao da A");
    }
}

class Persona extends EssereVivente implements A {
}
Qui viene usato saluta() della classe EssereVivente, perché il metodo della classe ha precedenza su quello default dell’interfaccia.

Caso in cui non c’è problema del diamante
Non basta implementare più interfacce per avere il problema del diamante.
 Il problema nasce solo quando c’è davvero un conflitto di implementazione, cioè quando esistono più metodi default compatibili con la stessa firma.

Esempio senza conflitto
java
interface Stampabile {
    void stampa();
}

interface Salvabile {
    void salva();
}

class Documento implements Stampabile, Salvabile {
    @Override
    public void stampa() {
        System.out.println("Stampo il documento");
    }

    @Override
    public void salva() {
        System.out.println("Salvo il documento");
    }
}
Qui non c’è alcuna ambiguità, perché i metodi sono diversi e la classe li implementa normalmente.

Esempio realistico per riconoscerlo al volo
Immagina un progetto con un oggetto SmartDevice che implementa sia WiFi sia Bluetooth.
 Se entrambe le interfacce hanno un metodo default connect(), la classe finale si troverà davanti a un conflitto tipico del diamante.

java
interface WiFi {
    default void connect() {
        System.out.println("Connessione WiFi");
    }
}

interface Bluetooth {
    default void connect() {
        System.out.println("Connessione Bluetooth");
    }
}

class SmartDevice implements WiFi, Bluetooth {
    @Override
    public void connect() {
        System.out.println("Scelgo una logica personalizzata");
        WiFi.super.connect();
    }
}
Per riconoscere subito il problema in casi reali, controlla se due interfacce stanno offrendo lo stesso comportamento già pronto con lo stesso nome e la stessa firma.

Strategia pratica per risolverlo sempre
Quando incontri un conflitto simile, puoi seguire questa procedura semplice:

Controlla quali interfacce stai implementando.

Cerca metodi default con lo stesso nome e gli stessi parametri.

Fai @Override del metodo nella classe concreta.

Decidi se scrivere una logica nuova oppure richiamare A.super.metodo() o B.super.metodo().

Errori comuni dei principianti
Pensare che basti implementare due interfacce qualsiasi per avere il problema del diamante.

Confondere un semplice obbligo di implementazione con un vero conflitto tra default methods.

Dimenticare l’annotazione @Override, che aiuta a capire subito che la classe sta risolvendo il conflitto.

Credere che Java scelga automaticamente una delle due interfacce: in questo caso non lo fa, e obbliga a una scelta esplicita.

Da ricordare
In Java il problema del diamante classico è evitato tra classi, ma può comparire con interfacce e default methods.

Il segnale principale è la presenza dello stesso metodo default in più interfacce implementate dalla stessa classe.

La soluzione è fare override del metodo nella classe concreta.

Se serve, puoi scegliere un ramo preciso con NomeInterfaccia.super.metodo().

Se una superclasse concreta possiede già quel metodo, in genere prevale la versione della classe.
		 * 
		 */
	}

}
