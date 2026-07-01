package Esame;

public class Esame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Sistema di valutazione
Sezione	Punti
Teoria	30
Analisi del codice	20
Programmazione	50
Totale	100 punti
Esito
90-100 → Ottimo (A)
80-89 → Distinto
70-79 → Buono
60-69 → Sufficiente
0-59 → Bocciato

Per superare l'esame devi ottenere almeno 60/100.

Inoltre:

ogni errore di sintassi importante: -2 punti
codice non compilabile: fino a -10 punti
soluzione inefficiente: -5 punti
mancato uso dell'OOP quando richiesto: -10 punti
PARTE 1 - TEORIA (30 punti)
Domanda 1 (4 punti)

Spiega la differenza tra:

JDK
JRE
JVM

e descrivi il processo di compilazione ed esecuzione di un programma Java.

Domanda 2 (4 punti)

Qual è la differenza tra:

==

e

equals()

Fornisci un esempio pratico.

Domanda 3 (4 punti)

Spiega:

incapsulamento
ereditarietà
polimorfismo
astrazione

con un esempio per ciascuno.

Domanda 4 (4 punti)

Cosa sono le eccezioni?

Differenza tra:

Checked Exception
Unchecked Exception

Quando useresti un blocco finally?

Domanda 5 (4 punti)

Qual è la differenza tra:

Array

e

ArrayList

Vantaggi e svantaggi.

Domanda 6 (5 punti)

Spiega il funzionamento del Garbage Collector.

È possibile eliminarlo?

Come gestisce la memoria?

Domanda 7 (5 punti)

Descrivi i modificatori di accesso:

public
private
protected
default
PARTE 2 - ANALISI DEL CODICE (20 punti)
Esercizio 1 (10 punti)

Osserva il codice.

public class Test {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}

Rispondi:

Quale sarà l'output?
Perché?
Come modificare il codice affinché entrambe le stampe restituiscano true?
Esercizio 2 (10 punti)

Cosa stampa questo codice?

public class Main {

    public static void main(String[] args) {

        int x = 3;

        while(x < 10){

            if(x == 6){
                break;
            }

            System.out.print(x + " ");

            x++;

        }

    }

}

Spiega ogni passaggio.

PARTE 3 - PROGRAMMAZIONE (50 punti)
ESERCIZIO 1 (20 punti)

Realizza una classe

Studente

con:

nome
cognome
matricola
votoMedio

Implementa:

costruttore
getter
setter
metodo toString()

Nel main crea almeno 3 studenti.

Stampali tutti.

ESERCIZIO 2 (15 punti)

Realizza una classe

ContoBancario

Attributi:

intestatario
saldo

Metodi:

deposita()
preleva()
mostraSaldo()

Il saldo non può mai diventare negativo.

ESERCIZIO 3 (15 punti)

Crea una gerarchia OOP.

Classe padre

Animale

Metodo

verso()

Classi figlie

Cane
Gatto

Override del metodo.

Nel main crea un array di animali.

Usa il polimorfismo per stampare il verso di ciascun animale.

BONUS (+10 punti)

Realizza un piccolo gestionale studenti.

Menu:

1) Inserisci studente

2) Visualizza studenti

3) Cerca per matricola

4) Elimina studente

5) Esci

Utilizza:

ArrayList
metodi
classi
cicli
if/switch
OOP

Il bonus viene considerato solo se hai già raggiunto almeno 60 punti.
		 */
		
		/*
		 * domanda 1 
		 * La differenza tra JDK, JRE e JVM è la seguente:
		 * 
		 * la JVM è il cuore di java, ha la funzione essenziale di tradurre il byte code in linguaggio macchina.
		 * in poche parole ci consente di comunicare con la macchina.
		 * 
		 * Con JRE intendiamo l'insieme di tutte le librerie, interfacce, classi, metodi, ecc che consentono lo sviluppo del progetto
		 * 
		 * Invece il JDk è tutto il kit completo che serve per svolgere il nostro progetto, e comprende sia JVM che JRE
		 */
		
		/*
		 * domanda 2
		 * La differenza tra == e equals è:
		 * con == stiamo valutando che l'indirizzo dell'oggetto sia uguale.
		 * 
		 * mentre con equals stiamo confrontando il loro valore.
		 * supponiamo di avere due stringhe:
		 * String s1 = "A";
		 * String s2 = new String("A");
		 * 
		 * con == tra le due stringhe il risultato sarà false , poichè hanno due indirizzi diversi.
		 * mentre con equals l'output sarà true , poichè il loro valore è uguale.
		 */
		
		/*
		 * domanda 3
		 * l'incapsulamento possiamo descriverla come una barriera di protezione per i nostri dati.
		 * il suo funzionamento consiste nel rendere private le variabili di classe e fornire metodi pubblici controllati per accedere ai dati.
		 * 
		 * con l'ereditarietà abbiamo la possibilità di ereditare da classi padre parametri , metodi ecc.
		 * consente di semplificare il codice sia in lettura che scrittura.
		 * 
		 * poliformismo ( più forme ) esempio: se abbiamo una superclasse Animale e una sottoclasse cane , possiamo chiamarla nel main in questo modo:
		 * Animale billy = new Cane(); la sintassi è : un tipo animale , nello specifico cane.
		 * 
		 * astrazione : possiamo creare delle superclassi astratte che ci aiutano a semplificare la struttura del codice.
		 * le classi astratte non possono essere istanziate, ma possono contenere dei metodi astratti e concreti.
		 */
		
		/*
		 * domanda 4
		 * 
		 * le checked Exception devono essere obbliagatoriamente gestite da un blocco try/catch.
		 * sono controllate dal compilaote
		 * 
		 * mentre le unchecked exception non sono controllate dal compilatore 
		 * possono essere gestite dal blocco try/catch ma non sono obbligatorie
		 * 
		 * il blocco finally si usa sempre , sia che ci sia stata un'intercettazione di un'errore , sia che non ci sia stata.
		 * indica una fine di un controllo.
		 */
		
		
		/*
		 * domanda 5
		 * Le differenze tra array e arrayList sono:
		 * con l'array abbiamo una velocità maggiore rispetto all'ArrayList.
		 * con l'arrayList possimo usare solo oggetti.
		 * con l'arrayList abbiamo metodi che ci aiutano alla compilazione.
		 * con l'arraylist possiamo aggiungere dei doppioni.
		 * con l'array possiamo lavorare anche con i primitivi.
		 * l'array ha una size definita, mentre arrayList ha una size dimanica.
		 */
		
		/*
		 * domanda 6
		 * il garbage Collector è una funzione di java che consente di tenere sempre il codice pulito da parti di codice inutilizzati.
		 * con il garbage collector abbiamo la possibilità di eliminare automaticamente , esempio , quelle variabili inutilizzate.
		 */
		
		/*
		 * domanda 7
		 * con public l'accesso ai dati della classe è aperta anche negli altri package
		 * con private solo la classe stessa può accedere ai dati.
		 * con protected tutte le classi dello stesso package
		 * con default possono accedere solo le classi dello stesso package
		 */
		
		//PARTE 2
		
		//Esercizio 1
		/*
		 * l'output sarà false , true.
		 * in questo esercizio abbiamo s1 e s2 che hanno due indirizzi diversi , ma il loro valore è uguale.
		 * quindi nel momento in cui stiamo verificando i loro indirizzi con == abbiamo un false , poichè sono due cose diverse s1 e s2
		 * mentre quando stiamo chiedendo l'output di equals sarà true poiche i loro valori sono usguali.
		 * 
		 * per avere tutte e due le stampe true non bisogna dichiararle con il codice new, poiche genera due elementi differenti.
		 *  String s1 ="Java";
		 *  String s2 ="Java";
		 *  
		 *  scritto il codice in questo modo , sia con == che con equals avremno true, poichè tutti e due punteranno allo stesso indirizzo.
		 *
		 */
		
		//Esercizio 2
		/*
		 * public class Main {

    public static void main(String[] args) {

        int x = 3;    // abbiamo creato una variabile di valore 3

        while(x < 10){  // con while stiamo creando un ciclo. nel blocco entriamo  se x è minore di 10

            if(x == 6){  // se x è uguale a 6
                break;   // interrompi il cliclo
            }

            System.out.print(x + " ");  // manda a stampa x

            x++; // incrementiamo di 1 il ciclo

        }

    }

}

l'output di questo codice sarà: 3 4 5 
poichè il ciclo si interrompe una volta che x diventa uguale a 6
		 */
		//Parte 3
		//Esercizio 1
		
		Studente Marco = new Studente("Marco", "Bianchi", 50, 6.5);
		Studente Simone = new Studente("Simone", "Verdi", 60, 7.5);
		Studente Vito = new Studente("Vito", "Rossi", 55, 8.5);
		
		System.out.println(Marco);
		System.out.println(Simone);
		System.out.println(Vito);
		
	
		
	}

}
