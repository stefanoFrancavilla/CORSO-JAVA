package appunti;

public class Appunti_sealed_nonSealed_implementazione_piuInterfacce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Guida base a interfacce, classi sealed e non-sealed in Java
Le interfacce in Java servono a definire un contratto, cioè un insieme di metodi che una classe deve fornire quando decide di implementarle.
 Le sealed classes e sealed interfaces, introdotte in forma stabile da Java 17, servono invece a controllare chi può estendere una classe o implementare un’interfaccia.

Che cos’è un’interfaccia
Un’interfaccia descrive cosa una classe deve saper fare, ma non rappresenta direttamente un oggetto istanziabile.
 Oracle spiega che le interfacce non possono essere istanziate e possono solo essere implementate da classi o estese da altre interfacce.

Esempio semplice
java
interface Animale {
    void verso();
}

class Cane implements Animale {
    @Override
    public void verso() {
        System.out.println("Bau");
    }
}
In questo esempio Animale definisce il metodo verso(), mentre Cane fornisce l’implementazione concreta.

Perché usare le interfacce
Le interfacce aiutano a scrivere codice più flessibile, perché permettono di lavorare sul tipo astratto invece che sulla classe concreta.
 Questo rende più facile sostituire implementazioni diverse senza cambiare troppo il resto del programma.

Esempio pratico
java
interface Pagamento {
    void paga(double importo);
}

class CartaDiCredito implements Pagamento {
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
Qui il programma può usare il tipo Pagamento senza dipendere da una sola implementazione concreta.

Come implementare un’interfaccia
Per implementare un’interfaccia si usa la parola chiave implements nella dichiarazione della classe.
 Se la classe è concreta, deve fornire il corpo dei metodi richiesti dall’interfaccia.

Sintassi
java
class NomeClasse implements NomeInterfaccia {
    // implementazione dei metodi
}
Come implementare più interfacce
Java supporta l’ereditarietà multipla di tipo, cioè una classe può implementare più interfacce contemporaneamente.
 Oracle specifica che, per dichiararlo, dopo implements si scrive una lista di interfacce separate da virgole.

Sintassi
java
class NomeClasse implements Interfaccia1, Interfaccia2, Interfaccia3 {
    // implementazione dei metodi richiesti
}
Esempio semplice
java
interface Volante {
    void vola();
}

interface Nuotante {
    void nuota();
}

class Anatra implements Volante, Nuotante {
    @Override
    public void vola() {
        System.out.println("L'anatra vola");
    }

    @Override
    public void nuota() {
        System.out.println("L'anatra nuota");
    }
}
In questo caso Anatra implementa due interfacce, quindi deve realizzare tutti i metodi richiesti da entrambe.

extends e implements
In Java una classe può estendere una sola classe, ma può implementare più interfacce.
 Per convenzione, se ci sono entrambi, prima si scrive extends e poi implements.

Esempio
java
class Veicolo {
    void accendi() {
        System.out.println("Veicolo acceso");
    }
}

interface Elettrico {
    void ricarica();
}

interface Connesso {
    void collegaInternet();
}

class AutoElettrica extends Veicolo implements Elettrico, Connesso {
    @Override
    public void ricarica() {
        System.out.println("Ricarica in corso");
    }

    @Override
    public void collegaInternet() {
        System.out.println("Connessione attiva");
    }
}
Cosa sono le sealed classes
Una sealed class limita in modo esplicito quali classi possono estenderla.
 Oracle descrive queste classi come tipi che restringono l’estendibilità a un insieme noto e controllato di sottoclassi.

Sintassi base
java
public sealed class Veicolo permits Auto, Moto {
}
Con permits, si elencano le classi autorizzate a estendere la classe sealed.
 Le sottoclassi permesse devono essere note al compilatore e trovarsi nello stesso modulo, oppure nello stesso package quando non si usa un modulo nominato.

Cosa sono le sealed interfaces
Anche un’interfaccia può essere sealed, così si controlla quali classi possono implementarla e quali interfacce possono estenderla.
 Questo è utile quando si vuole modellare una gerarchia chiusa e ben definita.

Esempio
java
public sealed interface Forma permits Cerchio, Rettangolo {
}

public final class Cerchio implements Forma {
}

public final class Rettangolo implements Forma {
}
Qui solo Cerchio e Rettangolo possono implementare Forma.

final, sealed e non-sealed
Quando una classe estende una sealed class o implementa una sealed interface, deve dichiarare esplicitamente come continua la gerarchia.
 Oracle indica tre possibilità: final, sealed oppure non-sealed.

Modificatore	Significato
final	La classe non può essere estesa ulteriormente.
sealed	La classe continua a limitare chi può estenderla.
non-sealed	La classe riapre la gerarchia e torna estendibile liberamente.
Che cosa significa non-sealed
Una classe non-sealed è una classe che, pur nascendo dentro una gerarchia sealed, decide di non mantenere più il vincolo verso i livelli successivi.
 In pratica “rompe il sigillo” e permette ad altre classi sconosciute di estenderla liberamente.

Esempio
java
public sealed class Documento permits PDF, Testo {
}

public final class PDF extends Documento {
}

public non-sealed class Testo extends Documento {
}

class Articolo extends Testo {
}
In questo esempio Documento controlla direttamente chi lo può estendere, ma Testo riapre la gerarchia e quindi Articolo può estenderlo.

Quando conviene usare sealed
Le sealed classes e interfaces sono utili quando il programmatore vuole mantenere il controllo su una gerarchia di tipi e sapere in anticipo quali varianti esistono.
 Questo approccio è molto utile in modelli chiusi, come tipi di documento, forme geometriche, mezzi di pagamento o stati di un processo.

Situazioni tipiche
Quando le varianti valide sono poche e note in anticipo.

Quando si vuole evitare che altri aggiungano sottotipi non previsti.

Quando si vuole rendere la gerarchia più chiara e controllata.

Quando conviene usare non-sealed
non-sealed conviene quando si vuole controllare solo il primo livello della gerarchia, ma lasciare libertà ai livelli successivi.
 È una scelta utile quando alcune parti del modello devono restare aperte a future estensioni.

Situazioni tipiche
Quando il tipo base deve essere controllato, ma una sua sottoclasse deve restare estendibile.

Quando si vuole combinare ordine nella gerarchia principale e flessibilità in rami specifici.

Esempio completo con interfacce multiple e sealed interface
java
interface Stampabile {
    void stampa();
}

interface Salvabile {
    void salva();
}

public sealed interface FileGestibile permits FileTesto, FilePDF {
}

final class FilePDF implements FileGestibile, Stampabile {
    @Override
    public void stampa() {
        System.out.println("Stampa PDF");
    }
}

non-sealed class FileTesto implements FileGestibile, Stampabile, Salvabile {
    @Override
    public void stampa() {
        System.out.println("Stampa file di testo");
    }

    @Override
    public void salva() {
        System.out.println("Salvataggio file di testo");
    }
}

class FileMarkdown extends FileTesto {
}
Questo esempio mostra tre idee insieme: una classe può implementare più interfacce, una sealed interface limita i tipi autorizzati, e una classe non-sealed può riaprire la gerarchia per sottoclassi future.

Errori comuni dei principianti
Confondere extends con implements: una classe estende una classe ma implementa un’interfaccia.

Pensare che una classe possa estendere più classi: Java non supporta l’ereditarietà multipla tra classi, ma permette di implementare più interfacce.

Usare sealed senza ricordare permits, oppure senza dichiarare i sottotipi come final, sealed o non-sealed.

Pensare che non-sealed significhi la stessa cosa di final: in realtà final chiude del tutto la gerarchia, mentre non-sealed la riapre.

Da ricordare
Interfaccia = contratto di comportamento.

implements = una classe realizza un’interfaccia.

Una classe può implementare più interfacce separate da virgole.

sealed = limita chi può estendere o implementare.

non-sealed = riapre la gerarchia.

final = impedisce ogni ulteriore estensione.
		 */
	}

}
