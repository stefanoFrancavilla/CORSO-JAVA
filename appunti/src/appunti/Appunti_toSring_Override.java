package appunti;

public class Appunti_toSring_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * toString, metodi e override in Java
Questa guida spiega in modo semplice cos'è toString(), a cosa serve l'override e perché questi strumenti sono utili quando lavori con le classi.

1. Cos'è toString()
Idea semplice
toString() è un metodo che serve a trasformare un oggetto in una stringa leggibile.

Quando stampi un oggetto con System.out.println(), Java usa proprio toString() per capire cosa mostrare.

Esempio base
java
public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
}
Se fai:

java
Persona p = new Persona("Marco", 20);
System.out.println(p);
potresti vedere qualcosa come:

java
Persona@7a81197d
Questo non è comodo da leggere.

2. Perché usare toString()
A cosa serve
Serve per mostrare i dati dell'oggetto in modo chiaro.

Quando è utile
quando stampi un oggetto per controllarlo;

quando vuoi vedere i suoi dati in modo ordinato;

quando lavori con liste o collezioni di oggetti.

Esempio utile
java
public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String toString() {
        return "Nome: " + nome + ", Età: " + eta;
    }
}
Ora:

java
Persona p = new Persona("Marco", 20);
System.out.println(p);
mostra:

java
Nome: Marco, Età: 20
3. Cos'è l'override
Idea semplice
L'override significa riscrivere un metodo ereditato da una classe padre.

Lo fai quando la classe figlia deve avere un comportamento diverso.

Esempio
java
public class Animale {
    public void faiSuono() {
        System.out.println("Suono generico");
    }
}

public class Cane extends Animale {
    public void faiSuono() {
        System.out.println("Bau bau");
    }
}
Qui Cane ha preso il metodo faiSuono() di Animale e lo ha cambiato.

4. Differenza tra override e overload
Override
si usa con ereditarietà;

il metodo ha stesso nome, stessi parametri, stesso tipo di ritorno compatibile;

cambia il comportamento del metodo della classe padre.

Overload
stesso nome del metodo, ma parametri diversi;

si usa nella stessa classe o in una classe figlia;

serve ad avere più versioni dello stesso metodo.

Esempio di overload
java
public class Calcolatrice {
    public int somma(int a, int b) {
        return a + b;
    }

    public int somma(int a, int b, int c) {
        return a + b + c;
    }
}
Esempio di override
java
public class Animale {
    public void faiSuono() {
        System.out.println("Suono generico");
    }
}

public class Cane extends Animale {
    @Override
    public void faiSuono() {
        System.out.println("Bau bau");
    }
}
5. La parola chiave @Override
A cosa serve
@Override dice a Java: "questo metodo deve davvero sovrascrivere un metodo della classe padre".

Perché è utile
Ti aiuta a evitare errori.
Se scrivi male il nome o i parametri, Java te lo segnala.

Esempio
java
public class Cane extends Animale {
    @Override
    public void faiSuono() {
        System.out.println("Bau bau");
    }
}
Vantaggio
Se sbagli a scrivere faiSuono, il compilatore te lo fa notare subito.

6. Come funziona toString() insieme all'override
toString() è già un metodo della classe Object, che è la classe madre di tutte le classi in Java.

Quindi quando lo riscrivi nella tua classe, stai facendo un override di toString().

Esempio completo
java
public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{nome='" + nome + "', eta=" + eta + "}";
    }
}
Uso
java
Persona p = new Persona("Marco", 20);
System.out.println(p);
Output:

java
Persona{nome='Marco', eta=20}
7. Perché toString() è importante
Quando stampi direttamente l'oggetto
Java chiama automaticamente toString().

Quando lavori con liste
Se fai una lista di oggetti e la stampi, toString() aiuta a vedere meglio il contenuto.

java
ArrayList<Persona> persone = new ArrayList<>();
persone.add(new Persona("Marco", 20));
persone.add(new Persona("Luca", 25));

System.out.println(persone);
Senza toString() avresti risultati poco leggibili.
Con toString() vedi i dati reali.

8. Regole semplici per scrivere un buon toString()
deve essere chiaro;

deve mostrare i dati utili;

deve essere breve ma leggibile;

non deve fare cose complicate, solo restituire testo.

Esempio consigliato
java
@Override
public String toString() {
    return "Persona{nome='" + nome + "', eta=" + eta + "}";
}
9. Esempio completo con toString() e override
java
public class Animale {
    protected String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void faiSuono() {
        System.out.println("Suono generico");
    }

    @Override
    public String toString() {
        return "Animale{nome='" + nome + "'}";
    }
}

public class Cane extends Animale {
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void faiSuono() {
        System.out.println(nome + " fa Bau Bau");
    }

    @Override
    public String toString() {
        return "Cane{nome='" + nome + "'}";
    }
}
Uso
java
Cane c = new Cane("Rex");
System.out.println(c);
c.faiSuono();
10. Quando usare cosa
Usa toString()
Quando vuoi stampare bene un oggetto.

Usa @Override
Quando vuoi riscrivere un metodo della classe padre.

Usa override in generale
Quando una classe figlia deve comportarsi in modo diverso dalla classe padre.

11. Riassunto finale
toString() trasforma un oggetto in una stringa

toString() viene usato quando stampi un oggetto

override significa riscrivere un metodo ereditato

@Override ti aiuta a non sbagliare

toString() è un esempio di override molto importante

12. Regola facile da ricordare
Se vuoi vedere bene un oggetto, usa toString().

Se vuoi cambiare il comportamento di un metodo ereditato, usa l'override.

Se vuoi evitare errori, metti @Override.
		 */
	}

}
