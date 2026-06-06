package appunti;

public class Appunti_classiAnonime_classiAnonimeLambda {
	public static void main(String[] args) {
/*
 *Certo — qui sotto trovi la scheda super ordinata da studiare, pronta da copiare e incollare in Eclipse o nei tuoi appunti. Le definizioni e gli esempi sono coerenti con la documentazione Java e con il confronto tra classi anonime e lambda.

Scheda di studio: classi anonime e lambda in Java
1) Definizione rapida
Una classe anonima è una classe senza nome che crei e usi nello stesso punto del codice.

Serve quando vuoi personalizzare rapidamente un comportamento senza scrivere un file di classe separato.

La lambda è una forma più corta per scrivere un comportamento, ma funziona solo con interfacce funzionali, cioè interfacce con un solo metodo astratto.

2) A cosa servono
Le classi anonime servono per sovrascrivere metodi o implementare interfacce al volo.

Le lambda servono per rendere più compatto il codice quando devi implementare un’unica funzione.

In pratica, entrambe evitano di creare una classe completa per un caso semplice e temporaneo.

3) Classe anonima: idea facile
Pensa a una classe anonima come a una classe “usa e getta”.
La scrivi solo nel punto in cui ti serve, cambi un comportamento e poi il programma continua.

È molto utile quando vuoi personalizzare un metodo senza creare una nuova classe con nome.

4) Esempio classe anonima
java
class Animal {
    void sound() {
        System.out.println("Suono generico");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            void sound() {
                System.out.println("Miao");
            }
        };

        a.sound();
    }
}
Qui new Animal() { ... } crea una nuova classe senza nome che eredita da Animal e cambia il metodo sound().

L’oggetto a userà quindi il comportamento personalizzato, cioè stamperà Miao.

5) Lambda: idea facile
La lambda è una scorciatoia per scrivere una funzione breve e diretta.

Si usa soprattutto quando hai un’interfaccia funzionale, cioè una sola funzione da implementare.

Il vantaggio principale è che il codice è più corto e più leggibile.

6) Esempio lambda
java
interface Operazione {
    int calcola(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Operazione somma = (a, b) -> a + b;
        System.out.println(somma.calcola(3, 5));
    }
}
Questa lambda implementa il metodo calcola dell’interfaccia Operazione.

Il risultato è lo stesso di una classe anonima, ma con meno codice.

7) Stesso esempio con classe anonima
java
interface Operazione {
    int calcola(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Operazione somma = new Operazione() {
            @Override
            public int calcola(int a, int b) {
                return a + b;
            }
        };

        System.out.println(somma.calcola(3, 5));
    }
}
Questa versione è più lunga, ma fa esattamente la stessa cosa.

Ti aiuta a capire meglio cosa succede “dietro le quinte”.

8) Differenze principali
Aspetto	Classe anonima	Lambda
Nome della classe	No 
No, ma è una funzione anonima 
Dove si usa	Classe, interfaccia, override di metodi 
Solo interfacce funzionali 
Lunghezza del codice	Più lunga 
Più corta 
Può avere stato interno	Sì 
No, non come una classe normale 
this	Riferisce l’oggetto anonimo 
Riferisce la classe esterna 
9) Quando usare quale
Usa una classe anonima se devi estendere una classe o se l’interfaccia ha più di un metodo.

Usa una lambda se l’interfaccia è funzionale e il comportamento è semplice.

Se vuoi scrivere codice moderno, pulito e leggibile, la lambda è spesso la scelta migliore.

10) Frase da ricordare
La classe anonima è una classe senza nome usata per un comportamento temporaneo.

La lambda è una versione più compatta, ma funziona solo con interfacce funzionali.

Se hai un solo metodo da implementare, la lambda di solito è preferibile.

11) Codice completo pronto per Eclipse
java
interface Operazione {
    int calcola(int a, int b);
}

class Animal {
    void sound() {
        System.out.println("Suono generico");
    }
}

public class Main {
    public static void main(String[] args) {

        // Classe anonima: personalizzo un metodo al volo
        Animal a = new Animal() {
            @Override
            void sound() {
                System.out.println("Miao");
            }
        };

        a.sound();

        // Lambda: stessa idea, ma solo per interfacce funzionali
        Operazione somma = (x, y) -> x + y;
        System.out.println("Somma: " + somma.calcola(3, 5));
    }
}
12) Mini ripasso finale
Classe anonima = classe senza nome, utile per personalizzare rapidamente un comportamento.

Lambda = forma più breve per implementare un’interfaccia funzionale.

Classe anonima = più flessibile.

Lambda = più elegante quando il caso è semplice.

Posso anche trasformare questa scheda in una versione ancora più compatta da 1 pagina, perfetta da ripassare prima di un’interrogazione o di un esame.
 */
}
}