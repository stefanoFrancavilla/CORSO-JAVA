package introduzione;

public class Test1Fondamenti_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 📝 TEST COMPLETO MODULO 1: FONDAMENTI JAVA
20 domande miste:

8 domande teoria

8 domande codice (scrivi/correggi)

4 domande risposta aperta (spiega concetto)

Devi fare 18/20 per passare al Modulo 2!

🧪 TEST MODULO 1 - FONDAMENTI
DOMANDE TEORIA (1-8)
1. Cosa fa la JVM (Java Virtual Machine)?

2. Qual è la differenza tra JDK e JRE?

3. Quali sono gli 8 tipi di dati primitivi in Java?

4. Dove sono salvati i valori primitivi in memoria? (Stack o Heap?)

5. Dove sono salvati gli oggetti in memoria? (Stack o Heap?)

6. Cosa è il Garbage Collector in Java?

7. Qual è la differenza tra == e .equals() quando compari String?

8. Cosa è il String Pool in Java?

DOMANDE CODICE (9-16)
9. Scrivi un programma Java cheDeclara un int con valore 5 e stampa il suo valore.

10. Quali errori ha questo codice? Correggilo:

java
public class Test {
    int x = "10";
    System.out.println(x);
}
11. Qual è l'output di questo codice?

java
int a = 10;
double b = a;
System.out.println(b);

12. Qual è l'output di questo codice?

java
int x = 10;
int y = 20;
System.out.println(x + y);
13. Scrivi il codice perDeclara un char con valore 'Z' e un boolean con valore true.

14. Qual è l'errore? Correggilo:

java
public class Test {
    public static void main(String[] args) {
        double d = 5.5;
        int x = d;
    }
}
15. Qual è l'output?

java
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2);

16. Qual è l'output?

java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2);
DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza tra Stack e Heap memory con un esempio di codice.

18. Perché int a = 10; double b = a; funziona ma double b = 10.5; int a = b; non funziona?

19. Spiega cosa sono JDK, JRE e JVM con una analogia pratica.

20. Perché usi .equals() invece di == per comparare String? Fai un esempio.
		 */
		
		
		//1.
		/*
		 * La JVM ha il compito di tradurre alla macchina il nostro codice.
		 * prende in ingresso il nostro codice BYTECODE e lo converte in codice macchina.
		 * in parole semplici mette in condizione l'operatore di parlare con la macchina.
		 */
		
		//2.
		/*
		 * JRE (Java Runtime Enviroment) è l'insieme delle librerie di java , utili per lo svolgimento del nostro preogetto
		 * 
		 * JDK (Java Development Kit) è il pachhetto necessario per la realizzazione del progetto.
		 * infatti comprende sia JVM che JRE. 
		 */
		
		//3.
		/*
		 * gli 8 primitivi di java sono: int, byte, float, long, short, double, boolean, char 
		 */
		
		//4.
		/*
		 * i valori primitivi sono salvati nella mempria stack
		 */
		
		//5.
		/*
		 * gli oggetti in java sono salvati nella memoria heap
		 */
		
		//6.
		/*
		 * Il garbage collector in java è il processo di eliminazione degli oggetti che sono stati creati ma non utilizzati.
		 * questo avviene automaticamente.
		 */
		
		//7.
		/*
		 * se compariamo due String , con il codice == stiamo verificando se tutti e due puntano allo stesso oggetto
		 * mentre con equals stiamo mettendo a confronto i loro valori.
		 */
		
		//8.
		/*
		 * lo string pool di java è un procedimento di verifica di java
		 * controlla se il valore dell'oggetto creato è esistente, cioè stato già creato.
		 */
		
		//9.
		
		int i = 5;
		System.out.println(i);
		
		//10.
		/*
		 * java
           public class Test {
           int x = "10";
           System.out.println(x);
           
           il codice in questione ha come errore le virgolette, che si usano su una variabile di tipo String
		 */
		 int x = 10;
         System.out.println(x); // codice corretto
         
         //11.
         /*
          * il risultato sarà 10.0 perchè in autamatico viene effettuato il casting.
          * 
          */
         
         //12.
         /*
          * l'output in questione sarà la somma delle due variabili int, quindi 30
          */
         
         //13.
         
         char c = 'Z';
         boolean b = true;
         
         
         //14.
         /*
          * l'erore nel codice è che stiamo dando come valore di un'int p  un valore double d
          * per risolverlo bisogna effettuare un cast
          */
         double d = 5.5;
         int p = (int) d;
         
         //15.
         /*
          * l'output in questione sarà un true poichè grazie allo string pool le due variabili puntano allo stesso oggetto
          * 
          * 
          */
         
         //16.
         /*
          * 
          *  String s1 = new String("Java");
             String s2 = new String("Java");
             System.out.println(s1 == s2);
             
             abbiamo già creato due oggetti differenti (grazie all'uso di new) , ma con lo stesso valore.
             quindi nel momento in cui mettiamo a confronto s1==s2 avremo come output false poichè non puntano più allo stesso oggetto
          */
         
         //17.
         /*
          * la memoria stack è più veloce rispetto ad una heap , ed è anche più piccola 
          * esempio
          * int i = 2; // stack
          * essendo un primitivo ha una memoria delimitata in MB
          * essendo più piccola di una heap è molto più veloce 
          * 
          * String s2 = "Ciao"; // heap
          * la memoria heap essendo dinamica può variare il suo valore e puo arrivare a contenere anche GB
          */
         
         
         //18.
         /*
          * 
          * nel primo caso quando stiamo passando da una variabile int in double viene effettuato un'autocasting
          * mentre nel secondo caso abbiamo bisogno di un cast manuale , poichè di base non è possibile passare da un double ad un int
          * nel momento in cui effettuiamo il cast manuale il risultato sarà arrotondato per difetto
          */
         
         
         //19
          /*
           * JVM è il cuore di java trasforma il byte code in codice macchina
           * JRE è l'insieme delle librerie di java
           * JDK è tutto il kit necessario per lo svolgimento del progetto e comprende JVM e JRE
           */
         
         //20
         /*
          * uso l'equals poichè l'obbiettivo comune è capire se i due valori sono uguali
          * mentre meno comune è capire se le variabili puntano o meno allo stessto reference
          */

        
         String s3 = "casa";
         String s4 = "casa";
         System.out.println(s3 == s4); // se puntano allo stesso reference
         
         System.out.println(s3.equals(s4)); // se il valore è uguale cioè se il ciao di s3 è uguale al casa si s4
         // se il valore di s3 fosse stato "Casa" l'output sarebbe stato false poichè hanno un valore diverso
         
         
	}

}
