package appunti;

public class AppuntiClasse_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *Certo. La classe Math in Java serve per fare calcoli matematici senza dover scrivere tutto da zero. Tutti i suoi metodi sono statici, quindi li usi direttamente con Math.nomeMetodo(...).

Idea semplice
Math è una scatola di strumenti per numeri: radice quadrata, potenza, valore assoluto, arrotondamenti, massimo, minimo, numeri casuali e molto altro.

Le funzioni più usate
Math.abs(x)
Restituisce il valore assoluto, cioè il numero senza segno negativo.
Si usa quando vuoi sapere “quanto vale” un numero senza guardare se è positivo o negativo.

java
Math.abs(-5);   // 5
Math.max(x, y)
Restituisce il valore più grande tra due numeri.
Si usa quando devi confrontare due valori e prendere il maggiore.

java
Math.max(8, 12);   // 12
Math.min(x, y)
Restituisce il valore più piccolo tra due numeri.
Si usa quando devi confrontare due valori e prendere il minore.

java
Math.min(8, 12);   // 8
Math.sqrt(x)
Restituisce la radice quadrata di un numero.
Si usa in formule geometriche, fisica o calcoli di distanza.

java
Math.sqrt(25);   // 5.0
Math.pow(x, y)
Restituisce 
x
x elevato a 
y
y, cioè la potenza.
Si usa quando vuoi fare esponenziali, aree, formule matematiche o crescita.

java
Math.pow(2, 3);   // 8.0
Math.round(x)
Arrotonda al numero intero più vicino.
Si usa quando vuoi trasformare un numero decimale in un intero “quasi corretto”.

java
Math.round(4.6);   // 5
Math.ceil(x)
Arrotonda per eccesso, cioè verso l’alto.
Si usa quando vuoi essere sicuro di non restare sotto una soglia.

java
Math.ceil(4.1);   // 5.0
Math.floor(x)
Arrotonda per difetto, cioè verso il basso.
Si usa quando vuoi prendere la parte intera minore.

java
Math.floor(4.9);   // 4.0
Math.random()
Restituisce un numero casuale tra 0.0 e 1.0.
Si usa per estrazioni casuali, giochi, simulazioni e scelte random.

java
Math.random();   // per esempio 0.347...
Per ottenere un intero da 0 a 100:

java
int n = (int)(Math.random() * 101);
Altre funzioni utili
Math.sin(x), Math.cos(x), Math.tan(x)
Servono per seno, coseno e tangente.
Si usano in trigonometria e calcoli con angoli; il valore di x è in radianti.

Math.toRadians(x)
Converte i gradi in radianti.
Si usa prima di sin, cos o tan se parti da un angolo in gradi.

java
double rad = Math.toRadians(90);
Math.toDegrees(x)
Converte i radianti in gradi.
Si usa quando hai un angolo in radianti ma vuoi leggerlo in gradi.

Math.log(x)
Restituisce il logaritmo naturale.
Si usa in matematica, statistica, fisica e crescita esponenziale.

Math.log10(x)
Restituisce il logaritmo in base 10.
Si usa spesso in calcoli scientifici o quando ragioni per ordini di grandezza.

Math.exp(x)
Restituisce 
e
x
e 
x
 .
Si usa in formule esponenziali e modelli matematici.

Math.PI e Math.E
Sono costanti importanti:

Math.PI = pi greco

Math.E = numero di Eulero.

Esempio completo
java
public class EsempioMath {
    public static void main(String[] args) {
        double numero = -9.7;

        System.out.println(Math.abs(numero));       // 9.7
        System.out.println(Math.max(10, 20));       // 20
        System.out.println(Math.min(10, 20));       // 10
        System.out.println(Math.sqrt(16));          // 4.0
        System.out.println(Math.pow(2, 4));         // 16.0
        System.out.println(Math.round(4.6));        // 5
        System.out.println(Math.ceil(4.1));         // 5.0
        System.out.println(Math.floor(4.9));        // 4.0
        System.out.println(Math.random());          // numero casuale
    }
}
Quando usare Math
Usa Math quando devi:

fare calcoli numerici;

trovare massimo o minimo;

fare potenze o radici;

arrotondare numeri;

generare numeri casuali;

lavorare con angoli e formule matematiche.

Regola facile
Se il problema riguarda i numeri, guarda prima Math.

Se vuoi una radice, una potenza, un arrotondamento o un random, Math ha già il metodo giusto.

Se vuoi, nel prossimo messaggio posso trasformarlo in una scheda di appunti semplice e ordinata con:

funzione,

uso,

esempio,

risultato.
		 */
	}

}
