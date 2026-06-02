package appunti;

public class operatore_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * L’operatore ternario è un modo breve per scrivere una piccola scelta tra due valori, in pratica una versione compatta di un if‑else che “restituisce” un risultato.

In molti linguaggi (come Java, C, C#, JavaScript) si scrive così:

java
condizione ? valore_se_vero : valore_se_falso
In pratica:

se condizione è vera → si usa valore_se_vero;

se condizione è falsa → si usa valore_se_falso.

Cosa significa “ternario”
Un operatore ternario è semplicemente un operatore che lavora con tre parti (tre operandi):

una condizione (tipo a > 5),

il risultato se è vera,

il risultato se è falsa.

Nel nostro caso l’operatore è ?: e si chiama anche operatore condizionale.

Differenza tra if‑else e operatore ternario
Con un if‑else normale puoi scrivere:

java
int età = 18;
String categoria;

if (età >= 18) {
    categoria = "adulto";
} else {
    categoria = "minorenne";
}
Con l’operatore ternario diventa:

java
int età = 18;
String categoria = (età >= 18) ? "adulto" : "minorenne";
Noti che:

la condizione è età >= 18 (tra ? e :),

ciò che c’è dopo ? è il valore quando è vera ("adulto"),

ciò che c’è dopo : è il valore quando è falsa ("minorenne").

Esempio numerico in Java
Vediamo un esempio con numeri:

java
int numero = 5;
int segno = (numero > 0) ? 1 : -1;
se numero > 0 è vero → segno = 1,

se numero > 0 è falso → segno = -1.

Se cambi numero a -3:

java
int numero = -3;
int segno = (numero > 0) ? 1 : -1;
// qui segno diventa -1
Regole importanti da rispettare
La condizione deve essere booleana
Deve restituire true o false (es. a > b, x == y, flag).

I due valori devono essere compatibili
In molti linguaggi valore_se_vero e valore_se_falso devono essere dello stesso tipo (o tipi compatibili) per il tipo della variabile.
Esempio corretto:

java
boolean maggiorenne = (età >= 18) ? true : false;
Entrambi sono booleani.

Viene valutato solo uno dei due rami
Se la condizione è vera, viene eseguita/scelta solo l’espressione dopo ?, mai quella dopo :.

Non è adatto per istruzioni complesse
Non è pensato per sostituire blocchi lunghi con tanti if annidati o molte istruzioni. Serve per assegnazioni semplici o espressioni brevi.

Esempio pratico completo in Java
Immagina un programma che dice se un numero è pari o dispari usando l’operatore ternario:

java
public class Ternario {
    public static void main(String[] args) {
        int numero = 7;

        String risultato = (numero % 2 == 0) ? "pari" : "dispari";

        System.out.println("Il numero " + numero + " è " + risultato);
    }
}
Output:

text
Il numero 7 è dispari
In questo caso:

numero % 2 == 0 è la condizione (pari se il resto è 0),

"pari" è il valore se è vera,

"dispari" è il valore se è falsa.

Quando usarlo (linee guida semplici)
✅ Usa il ternario quando devi assegnare un valore a una variabile in base a una condizione semplice.

✅ Usa il ternario quando vuoi codice più compatto e leggibile per cose molto semplici.

❌ Evita il ternario quando:

la condizione è complicata o poco leggibile,

devi eseguire più istruzioni,

annidi troppi operatori ternari uno dentro l’altro.
		 */
		
		
		/*
		 * Gli operatori ternari annidati sono semplicemente ternari messi uno dentro l’altro, per gestire più di due casi (es. positivo / negativo / zero, oppure voti A/B/C/D).

L’idea di base è: se la prima condizione è falsa, invece di restituire un valore semplice, si valuta un altro ternario.

Sintassi di un ternario annidato
Sintassi base:

java
condizione1 ? valore_se_vero1 : (condizione2 ? valore_se_vero2 : valore_se_falso2)
Leggilo così:

se condizione1 è vera → valore_se_vero1,

se condizione1 è falsa → valuta un nuovo ternario:

se condizione2 è vera → valore_se_vero2,

se condizione2 è falsa → valore_se_falso2.

In pratica è come un if … else if … else in una sola riga.

Esempio classico: segno del numero
java
int x = -5;
String segno = (x > 0) ? "Positivo" : (x < 0) ? "Negativo" : "Zero";
Cosa succede:

se x > 0 → "Positivo",

altrimenti (x <= 0):

se x < 0 → "Negativo",

altrimenti (quindi x == 0) → "Zero".

La stessa cosa con if‑else:

java
int x = -5;
String segno;

if (x > 0) {
    segno = "Positivo";
} else {
    if (x < 0) {
        segno = "Negativo";
    } else {
        segno = "Zero";
    }
}
Il ternario annidato è la versione compatta di questo.

Esempio in Java: voto scolastico
Supponiamo di avere una media e vogliamo assegnare una valutazione:

media ≥ 90 → "A"

media ≥ 75 → "B"

media ≥ 60 → "C"

altrimenti → "D"

Con if‑else
java
double media = 82.5;
String voto;

if (media >= 90) {
    voto = "A";
} else if (media >= 75) {
    voto = "B";
} else if (media >= 60) {
    voto = "C";
} else {
    voto = "D";
}
Con ternario annidato
java
double media = 82.5;
String voto = (media >= 90) ? "A" 
              : (media >= 75) ? "B" 
              : (media >= 60) ? "C" 
              : "D";
Come leggere:

se media >= 90 → "A",

altrimenti, se media >= 75 → "B",

altrimenti, se media >= 60 → "C",

altrimenti → "D".

Esempio con due condizioni incrociate
Immagina un sistema che verifica l’età e se la persona è studente con lavoro:

se età < 18 → "Troppo giovane"

altrimenti:

se studente e haLavoro → "Sconto studente"

se studente ma senza lavoro → "Vantaggi studente"

se non studente ma con lavoro → "Benefit lavoro"

altrimenti → "Non eleggibile"

Con if‑else
java
int eta = 19;
boolean studente = true;
boolean haLavoro = false;

String esito;

if (eta < 18) {
    esito = "Troppo giovane";
} else {
    if (studente) {
        if (haLavoro) {
            esito = "Sconto studente";
        } else {
            esito = "Vantaggi studente";
        }
    } else {
        if (haLavoro) {
            esito = "Benefit lavoro";
        } else {
            esito = "Non eleggibile";
        }
    }
}
Con ternario annidato
java
int eta = 19;
boolean studente = true;
boolean haLavoro = false;

String esito = (eta < 18) ? "Troppo giovane"
              : (studente && haLavoro) ? "Sconto studente"
              : studente ? "Vantaggi studente"
              : haLavoro ? "Benefit lavoro"
              : "Non eleggibile";
Leggenda:

se eta < 18 → "Troppo giovane",

altrimenti:

se studente && haLavoro → "Sconto studente",

altrimenti, se studente → "Vantaggi studente",

altrimenti, se haLavoro → "Benefit lavoro",

altrimenti → "Non eleggibile".

Regole e consigli per i ternari annidati
Anziana quasi sempre, ma con moderazione
I ternari si possono annidare, ma l’annidamento eccessivo rende il codice difficile da leggere.

Massimo 1–2 livelli di annidamento
Come regola pratica:

1 ternario semplice → spesso ok,

1 livello di annidamento → ancora accettabile se la logica è chiara,

2+ livelli → spesso meglio usare if‑else o switch.

Usa le parentesi per chiarezza
Anche se in Java non sempre obbligatorie, le parentesi aiutano a capire la struttura:

java
String segno = (x > 0) ? "Positivo" 
              : ((x < 0) ? "Negativo" : "Zero");
Priorità alla leggibilità
Se dopo aver scritto il ternario annidato pensi:

“Non capisco subito cosa fa”
allora è meglio riscriverlo con if‑else.

Conclusione pratica
Il ternario annidato è utile per scegliere tra 3 o più valori in modo compatto.

È equivalente a un if … else if … else annidato.

Va usato con parsimonia: se la logica diventa troppo complessa, torna a if‑else per non rendere il codice illeggibile.
		 */
	}

}
