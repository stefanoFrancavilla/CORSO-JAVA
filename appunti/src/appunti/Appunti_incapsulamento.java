package appunti;

public class Appunti_incapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Certo. L’incapsulamento è uno dei concetti più importanti della programmazione a oggetti: significa nascondere i dati interni di una classe e permettere l’accesso solo in modo controllato, di solito tramite metodi pubblici chiamati getter e setter. In pratica, non fai toccare i dati direttamente dall’esterno, ma passi da “porte controllate”.

Idea semplice
Immagina una scatola con dentro i dati.
Tu non apri la scatola e cambi tutto a mano: usi dei comandi precisi per leggere o modificare quello che c’è dentro.

Perché è utile
L’incapsulamento serve a:

proteggere i dati da modifiche sbagliate;

controllare cosa entra e cosa esce dalla classe;

evitare errori;

mantenere il codice più ordinato e facile da cambiare.

Come si fa
Di solito si fa così:

i campi della classe vengono dichiarati private;

si creano metodi public per leggerli o modificarli;

nei setter puoi anche mettere controlli, così non accetti valori sbagliati.

Esempio semplice
java
public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("Età non valida");
        }
    }
}
Uso
java
Persona p = new Persona("Marco", 20);

System.out.println(p.getNome());
p.setEta(25);
Perché non usare i campi pubblici
Se fai i campi public, chiunque può cambiarli quando vuole.
Questo è rischioso perché potresti mettere valori sbagliati senza alcun controllo.

Esempio brutto:

java
public class Persona {
    public String nome;
    public int eta;
}
Con questo codice, dall’esterno qualcuno può fare:

java
p.eta = -50;
e la tua classe non può fermarlo.

Uso dei getter
I getter servono per leggere il valore di un campo privato.

Esempio
java
public String getNome() {
    return nome;
}
Quando usarli
Usali quando vuoi sapere il valore di un campo senza farlo modificare direttamente.

Uso dei setter
I setter servono per modificare un campo privato.

Esempio
java
public void setEta(int eta) {
    if (eta >= 0) {
        this.eta = eta;
    }
}
Quando usarli
Usali quando vuoi permettere la modifica, ma solo con regole precise.

Perché i setter sono importanti
Nel setter puoi fare controlli prima di salvare il dato.
Per esempio:

un’età non può essere negativa;

un nome non può essere vuoto;

uno stipendio non può essere inferiore a zero.

Esempio con controllo
java
public void setNome(String nome) {
    if (nome != null && !nome.trim().isEmpty()) {
        this.nome = nome;
    } else {
        System.out.println("Nome non valido");
    }
}
Quando conviene usarlo
L’incapsulamento conviene quasi sempre quando stai creando classi che rappresentano dati reali, come:

persone;

auto;

conti bancari;

prodotti;

studenti.

Quando è particolarmente importante
È fondamentale quando:

i dati devono essere protetti;

ci sono regole da rispettare;

vuoi evitare modifiche dirette e pericolose;

prevedi che la classe possa cambiare in futuro.

Relazione con i modificatori di accesso
L’incapsulamento si costruisce soprattutto con:

private per i dati;

public per i getter e setter.

Quindi il legame è questo:

private nasconde i dati;

public permette un accesso controllato.

Esempio completo un po’ più realistico
java
public class ContoBancario {
    private String intestatario;
    private double saldo;

    public ContoBancario(String intestatario, double saldoIniziale) {
        this.intestatario = intestatario;
        this.saldo = saldoIniziale;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        } else {
            System.out.println("Operazione non valida");
        }
    }
}
Uso
java
ContoBancario conto = new ContoBancario("Stefano", 1000);
conto.deposita(200);
conto.preleva(150);
System.out.println(conto.getSaldo());
Qui il saldo non si cambia direttamente, ma solo tramite metodi sicuri.

Regola facile
Se un dato è importante e va protetto, mettilo private.

Se vuoi leggerlo, crea un getter.

Se vuoi modificarlo, crea un setter con controllo.

Se una modifica deve passare da una regola, non esporre il campo direttamente.


		 */
	}

}
