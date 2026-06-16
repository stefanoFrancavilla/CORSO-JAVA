package introduzione;

public class Test_modulo3_iniziaQui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 📝 TEST MODULO 3 - INIZIA QUI
DOMANDE TEORIA (1-7)
1. Cosa è un metodo in Java? Spiega la sua funzione principale.
/*
 * con il metodo abbiamo la possibilità di ripetere una situazione semplicemente chiamandolo in causa.
 * questo ci aiuta nella scrittura del codice, senza ripetere la scrittura del codice più volte.
 * e ci aiuta anche nella lettura.
 * quindi in parole semplici un'azione scritta una sola volta ma che possiamo usare più più volte
 */
/*
2. Qual è la differenza tra metodo void e metodo con return?
/*
 * il metodo con il void non restituisce nulla
 * mentre il metodo con return deve restituire per forza qualcosa.
 */
/*
3. Cosa sono i parametri di un metodo? Differenza tra parametro e argomento.
i parametri sono le variabili cha accetta il metodo al suo interno
mentre gli argomenti sono i valori che inseriamo nel momento in cui vengono chiamati




4. Cosa è l'overloading dei metodi? Fai un esempio.
con java abbiamo la possibilità di creare più metodi con lo stesso nome, questo però a patto che abbiamo:
o un numero di parametri diverso
oppure dei parametri di tipologia diversa

5. Qual è la differenza tra variabile locale e variabile di classe?
una variabile di classe è condivisa con tutta la classe 
metre la variabile locale ha valenza solo nel blocco di codice racchiuso tra le parentesi graffe.
per esempio in un ciclo for la variabile inizializzata ha valenza solo nel blocco di codice del for

6. Cosa significa "passing by value" in Java? Gli oggetti sono passati come valore o riferimento?
con il valore intendiamo il valore stesso dell'oggetto, cioè tutti i suoi parametri al suo interno.
con riferimento intendiamo la sua posizione nella memoria

7. Cosa è la ricorsione? Quando usi un metodo ricorsivo invece di un ciclo?

con la ricorsione intendiamo ripetere la stessa operazione semplificando il problema stesso.

quando vogliamo semplificare un'operazione complessa



DOMANDE CODICE (8-16)
8. Scrivi un metodo somma che prende 2 int e retorna la loro somma.

9. Qual è l'output?

java
public class Test {
    public static void main(String[] args) {
        int x = 5;
        stampa(x);
        System.out.println(x);
    }
    
    public static void stampa(int n) {
        n = 10;
        System.out.println(n);
    }
}

in questo caso abbiamo prima la stampa del codice stampa(x),
che ha la funzione di sostituire il valore della x, che originariamente aveva volre 5 con il valore 10
per poi mandare a stampa il primo valore di x coiè 5
quindi l'output sarà 10 5

10. Scrivi un metodo isPositivo che prende un int e retorna true se positivo, false altrimenti.

11. Qual è l'errore? Correggilo:

java
public class Test {
    public static int doppio(int x) {
        int risultato = x * 2;
    }
}

qui l'errore è che manca un return.
il return deve essere un'int come richiesto dal codice.

12. Scrivi un metodo ricorsivo fattoriale che calcolo il fattoriale di un numero.

13. Qual è l'output?

java
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        modifica(arr);
        System.out.println(arr[0]);
    }
    
    public static void modifica(int[] a) {
        a[0] = 10;
    }
}

qui abbiamo un'array iniziale composto da 3 valori (1, 2, 3)
questo array viene accettato dal metodo modifica
il metodo modifica , prende il valore alla posizione 0 e lo modifica in 10
quindi quando chiamiamo a stampa l'output sarà 10.


14. Scrivi un metodo saluta che prende una String nome e stampa "Benvenuto, [nome]!".

15. Qual è l'errore? Correggilo:

java
public class Test {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(doppio(x));
    }
    
    public static int doppio(int n) {
        return n * 2;
    }
    
    public static void doppio(int n) {
        System.out.println(n * 2);
    }
}
qui abbiamo due metodi chiamati doppio che accettano al suo interno un parametro di tipo int 
noi possiamo si avere dei metodi chiamti con lo stesso nome a patto che , o il numero di parametri sia diverso o
o il tipo di parametri sia diverso.
16. Qual è l'output?

java
public class Test {
    public static void main(String[] args) {
        System.out.println(somma(2, 3));
        System.out.println(somma(2.5, 3.5));
    }
    
    public static int somma(int a, int b) {
        return a + b;
    }
    
    public static double somma(double a, double b) {
        return a + b;
    }
}
qui abbiamo due metodi somma che accettano due parametri al suo interno, ma di tipo diverso
quindi il suo output sarà 5 , 6.0

DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza tra parametri e argomenti con un esempio di codice.

i parametri di un metodo sono le variabili che accetta in ingresso
supponiamo di avere un metodo tipo:
public void stampaNome(String nome) // nome è il paramentro accettato
{
System.out.println(nome);
}
mentre

stampaNome("Alessio") // Alessio sarà il nostro argomento

18. Perché in Java gli oggetti sono "passati by value" ma il comportamento sembra "by reference"? Spiega con un esempio.

a differenza dei primitivi che vengono passatin per il valore , gli oggetti vengono sia passati per il valore,
che per reference.
in pratica quando dobbiamo cambiare un'oggetto java non ci fornisce il suo valore, ma il suo indirizzo(reference)
quindi se l'oggetto che dobbiamo modificare e l'oggetto che modifica, puntano allo stesso indirizzo allora va bene.

19. Quando è meglio usare un metodo ricorsivo invece di un ciclo for? Fai un esempio pratico.
un metodo ricorsivo ha la funzone di semplificare un'operazione a prima vista complicata , scomponendo il problema.
ripetendo il metodo più volte e semplificando sempre di più il problema

supponiamo che supponiamo che dobbiamo ridurre ai minimi termini il valore 16
con un metodo creato dividiPerDue() andiamo a semplificare l'operazione successiva
esempio:
dividiPerDue(16);
dividiPerDue(8);
dividiPerDue(4);
dividiPerDue(2);

20. Scrivi e spiega un metodo che usa overloading per sommare 2 numeri, 3 numeri e 4 numeri.
per overloading intendiamo dei metodi che hanno lo stesso nome ma con numero di parametri differenti o tipi di parametri differenti

es:

public static int somma(int x, int, y)
{
 sommaNumeri = x + y;
 return sommaNumeri;
}

public static int somma(int x, int, y, int z)
{
 sommaNumeri = x + y + z;
 return sommaNumeri;
}

public static int somma(int x, int, y, int z, int v)
{
 sommaNumeri = x + y + z + v;
 return sommaNumeri;
}

qui abbiamo 3 metodi somma , questo è accettato per java , poichè i parametri sono nel primo caso 2 nel secondo3
e nel quarto casa 4


		 */
	
		
		
		/*
		 * 1. Passing by Value ⭐⭐⭐⭐⭐
Spiega in 2-3 frasi perché questa affermazione è ERRATA:

"In Java, gli oggetti sono passati per riferimento."

Correggi l'affermazione e spiega con un esempio di codice.

in java gli oggetti sono sempre passati per (passing by value), anche se può sembrare che sia passato per riferimento.
questo succede perchè negli oggetti viene passata una copia del suo indirizzo di riferimento.

class Persona {
    String nome;
}

public class Main {
    public static void cambia(Persona p) {
        p.nome = "Luca";      // modifica l'oggetto originale
        p = new Persona();    // p punta a un nuovo oggetto
        p.nome = "Anna";
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nome = "Marco";

        cambia(persona);

        System.out.println(persona.nome);
    }
}

La modifica p.nome = "Luca" cambia l'oggetto originale, perché p e persona puntano allo stesso oggetto.
 Invece, l'istruzione p = new Persona() cambia solo la copia del riferimento, quindi persona continua a puntare all'oggetto iniziale.

2. Overloading ⭐⭐⭐⭐
Qual è l'errore in questo codice? Correggilo:

java
public class Test {
    public static void stampa(int x) {
        System.out.println(x);
    }
    
    public static void stampa(int y) {
        System.out.println(y * 2);
    }
}
Spiega PERCHÉ è errore e come fare overloading correttamente.

qui abbiamo 2 metodi stampa che accettano 1 parametro di tipo int
l'errore è che non possono essere creati 2 metodi chiamati in ugual modo ,
che accettano lo stesso numero di parametro e lo stesso tipo

per risolvere questo errore possiamo sostituire al primo metoso stampa il tipo int con un'altro tipo es: short

3. Return e Void ⭐⭐⭐⭐
Qual è l'errore in questo codice? Correggilo:

java
public class Test {
    public static int doppio(int x) {
        int risultato = x * 2;
    }
}
Spiega la differenza tra metodo void e metodo con return.

il metodo void non ritorna nulla, mentre nel metodo con return ci si aspetta un ritorno.
nel nostro caso abbiamo un metodo che si aspetta un ritorno.
l'errore è proprio quello la mancanza di un return nel metodo.
per correggerlo bisogna inserire nel metodo un return risultato; alla fine del metodo

4. Ricorsione ⭐⭐⭐⭐
Scrivi un metodo ricorsivo potenza(base, exp) che calcola base^exp (es: potenza(2, 3) = 8).

Devi specificare:

Il caso base

Il caso ricorsivo

public static int potenza(int base, int exp)
{
if (exp == 0) {
   return1 // metodo base
   }
   else
   {
   return base * potenza(base, exp-1); // chiamata ricorsiva
   }

}
il nostro metodo ci ritornerà il valore 1 se riscontra il metodo base
mentre la chiamata ricorsiva nel caso non riscontrasse il metodo base




5. Parametri e Argomenti ⭐⭐⭐
Spiega la differenza con un esempio di codice:

java
public static void moltiplica(int a, int b) { // int a e int b sono i parametri
    System.out.println(a * b);
}

moltiplica(3, 4);  // mentre 3, 4 sono gli argomenti
In questo esempio:

Quali sono i PARAMETRI?
int a , int b

Quali sono gli ARGOMENTI?
3, 4

		 */
	}	
	
	//8.
		public static int somma(int x, int y)
		{
			int somma = x + y;
			return somma;
		}
		
	//10.
		
		public static boolean isPositivo(int numero)
		{
			boolean positivo = true;
			if(numero >=0)
			{
				positivo = true;
				System.out.println("Questo numero è positivo");
			}
			else
			{
				positivo = false;
				System.out.println("Questo numero è negativo");
			}
			
			return positivo;
		}
		
	//12.
		public static int fattoriale(int n)
		{
			if (n == 0 || n == 1 ) // questo è il noistro caso base
			{
				return 1;
			}
			else 
				return n * fattoriale(n - 1); // questo sarà il fattoriale
		}
	
	//14.
		public static void  saluta(String nome)
		{
			System.out.println("Benvenuto, [" + nome + "]!" );
		}


}
