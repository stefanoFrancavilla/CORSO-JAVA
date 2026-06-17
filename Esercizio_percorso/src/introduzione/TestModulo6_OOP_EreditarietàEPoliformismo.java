package introduzione;

public class TestModulo6_OOP_EreditarietàEPoliformismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 📝 TEST MODULO 6 - INIZIA QUI
DOMANDE TEORIA (1-8)
1. Cosa è l'ereditarietà in Java? Perché è utile?

l'ereditarietà in java è importatante perchè ci consente di avere una migliore logica del codice sia in fase di scrittura che in fase di lettura
ci consente di evitare la ripetizione di srittura e lettura del codice.

2. Cosa significa extends? Scrivi un esempio di classe che estende un'altra.
public class Animale{
}

public class Cane extends Animale{
}
qui abbiamo una classe Cane che estende una classe Animale
con il codice extends stiamo estendendo una classe padre.

3. Qual è la differenza entre overloading e overriding?
overloading è la possibilità di creare più metodi a patto che abbiamo parametri diversi o di diverso numero.
overriding invece è usato da una classe per la ridefinizione di un metodo della superclasse a patto che la firma sia la stessa.

4. Cosa è il metodo super()? Quando lo usi?
il metodo super viene usato per esempio tra una classe e una superclasse,
si usa per ereditare per esempio i parametri della superclasse,
se la superclasse ha come parametri nome e eta , la sottoclasse aggiungendo il codice super nel suo costruttore può ereditare i parametri

5. Cosa è l'overriding (sovrascrittura)? Scrivi un esempio.

l'override è un concetto fondamentale dell'ereditarietà , ci consente di ridefinire un metodo della superclasse a patto che la firma sia la stessa
@Override questo codice distingue una ridefinizione di un metodo

6. Cosa è il polimorfismo? Fai un esempio con superclassi e sottoclassi.
il poliformismo , come dice la parola stessa , sono più forme.
supponiamo si avere una superclasse animale e una sottoclasse cane 
nel main possiamo usare il codice

Animale pippo = new Cane(); // questo è un classico esempio di poliformismo

7. Cosa è una classe astratta (abstract class)? Differenza tra classe astratta e interfaccia.
la classe astratta è una classe che non può essere istanziata , ma ha la funzione di essere una base per altre classi con metodi astratti e concreti.
l'interfaccia è l'insieme di comportamenti che una classe deve implementare


8. Cosa significa final per una classe, un metodo e una variabile?

con final per una classe intendiamo che non può essere estesa.
con final nel metodo significa che non può essere sovrascritto.
con final in una variabile , significa che il suo valore è immutabile , diventando una costante.

DOMANDE CODICE (9-16)
9. Scrivi una classe Animal con metodo verso() e una classe Cane che estende Animal e overriding verso().

10. Qual è l'output?

java
class Animal {
    String verso() {
        return "Verso generico";
    }
}

class Cane extends Animal {
    String verso() {
        return "Bau bau";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cane();
        System.out.println(a Verso());
    }
}
l'output sarà Bau Bau , poichè l'oggetto creato è cane e quindi di conseguenza il verso in questione è del cane

11. Scrivi una classe astratta FiguraGeometrica con metodo astratto area().
abstract class FiguraGeometrica {

    
    abstract double area();
}

12. Qual è l'errore? Correggilo:

java
class Animal {
    final void verso() {
        System.out.println("Verso");
    }
}

class Cane extends Animal {
    void verso() {
        System.out.println("Bau");
    }
}
qui l'errore è il final, che non consente la sovrascrittura del metodo.
quindi eliminiamo il final e aggiungiamo il codice @Override

13. Scrivi un'interfaccia Volabile con metodo vola() e una classe Uccello che implementa l'interfaccia.

public interface Volabile {
@Override
public void vola();
}

public class Uccello impements Volabile {
@Override
public void vola(){
System.out.println("L'uccello ha spiccato il volo");
}

14. Qual è l'output?

java
class Animal {
    String nome = "Animal";
}

class Cane extends Animal {
    String nome = "Cane";
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cane();
        System.out.println(a.nome);
    }
}

l'output sarà cane poichè l'oggetto creato è cane

15. Scrivi un esempio di upcasting e downcasting con instanceof.
class Animale {
    void verso() {
        System.out.println("Verso generico");
    }
}

class Cane extends Animale {
    void abbaia() {
        System.out.println("Bau bau");
    }
}

public class Main {
    public static void main(String[] args) {

        // Upcasting
        Animale a = new Cane();

        a.verso();

        // Downcasting con instanceof
        if (a instanceof Cane) {
            Cane c = (Cane) a;
            c.abbaia();
        }
    }
}
16. Qual è l'errore? Correggilo:

java
abstract class Figura {
    abstract double area();
}

class Cerchio extends Figura {
    double area() {
        return 3.14 * 5 * 5;
    }
}
nel complesso non vedo errori nel codice , si può migliorare aggiungendo@Override per verificare che effettivamente sta ridefinendo il metodo della superclasse

DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza entre overloading e overriding con un esempio per ciascuno.
con overloading abbiamo la possibilità di creare più metodi con lo stesso nome
 a patto che abbiamo o numero di parametri differenti o tipo di parametri differenti
 
 public static int somma(int x, int y) {
		return x + y;
	}
	public static int somma(int x, int y, int z)
	{
		return x + y + z;
	}
questo è un'esempio di overloading due metodi somma ma con un numero di parametri diverso


con l'override invece c'è bisogno che i due metodi abbiano la stessa firma e che si svolga tra una classe padre e una classe figlia

questo è un'esempio di Override
class Animal {
@Override
    public void verso() {
        System.out.println("Verso");
    }
}

class Cane extends Animal {
@Override
    public void verso() {
        System.out.println("Bau");
    }
}


18. Perché usi classi astratte? Quando usi un'interfaccia invece di una classe astratta?

le classi astratte hanno la funzione di semplificarci la vita sia con la scrittura che con la lettura del codice.
ci da la possibilità di non riscrivere lo stesso codice per ogni classe che la estende, 
inoltre può contenere metodi astratti (senza implementazione) e concreti(con implementazione) 

siccome le classi possono estendere solo una classe , java ci viene in aiuto con le interfacce.
le classi possono implementare tutte le interfacce che gli serve, senza limiti.
con le interfacce possiamo far compiere un'azione all'oggetto che la implementa.

19. Cosa è il polimorfismo? Spiega con un esempio di codice dove un oggetto di sottoclasse è assegnato a una variabile di superclassi.

Animale pippo = new Cane();

con questa riga di codice capiamo la vera potenza del ppoliformismo.
la parte sinistra all'operatore di assegnamento ci dice che è un'oggetto di tipo Animale (classePadre)
mentre alla destra 

20. Scrivi e spiega una classe astratta Persona con metodo astratto saluta(), e due classi Studente e Professore che estendono Persona e implementano saluta().

public abstract class Persona {
		
		@Override
		public void saluta() {
			System.out.println("Ciao");
		}
	}
	
	public class Studente extends Persona {
		
		@Override
		public void saluta() {
			System.out.println("Buongiorno prof");
		}
		
	}
	
	public class Professore {
		
		
		@Override
		public void saluta() {
			System.out.println("Buongiorno ragazzi");
		}
	}
		 */
		
		
	}
	
	
}
