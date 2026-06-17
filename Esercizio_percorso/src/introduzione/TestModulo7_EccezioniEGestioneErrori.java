package introduzione;

public class TestModulo7_EccezioniEGestioneErrori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 📝 TEST MODULO 7 - INIZIA QUI
DOMANDE TEORIA (1-8)
1. Cosa è un'eccezione in Java? Differenza tra errore ed eccezione.

2. Cosa è la classe Exception? Qual è la sua posizione nella hierarchy delle eccezioni?

3. Cosa significa try-catch? Scrivi la struttura base.

4. Cosa è il blocco finally? Quando viene eseguito?

5. Differenza entre throws e throw.

6. Cosa sono le eccezioni RuntimeException? Fai 3 esempi.

7. Cosa è l'exception hierarchy? Nomina le 3 classi principali (Throwable, Error, Exception).

8. Cosa è un'eccezione custom (personale)? Come si crea?

DOMANDE CODICE (9-16)
9. Scrivi un codice try-catch che gestisce un'eccezione ArithmeticException.

10. Qual è l'output?

java
try {
    int x = 10 / 0;
    System.out.println("A");
} catch (ArithmeticException e) {
    System.out.println("B");
}
System.out.println("C");
11. Scrivi un metodo che dichiara throws IllegalArgumentException e lanica l'eccezione con throw.

12. Qual è l'errore? Correggilo:

java
try {
    int x = 10 / 2;
} catch (ArithmeticException e) {
    System.out.println(e);
}
13. Scrivi un codice con try-catch-finally e spiega quando viene eseguito finally.

14. Qual è l'output?

java
try {
    String s = null;
    System.out.println(s.length());
} catch (NullPointerException e) {
    System.out.println("Null");
} catch (Exception e) {
    System.out.println("Exception");
}
15. Scrivi una classe custom MyException che estende Exception.

16. Qual è l'errore? Correggilo:

java
public void metodo() {
    try {
        int x = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Errore");
    }
    throw e;
}
DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza entre try-catch e throws con un esempio per ciascuno.

18. Perché usi il blocco finally? Fai un esempio pratico (es: chiusura file, chiusura connection).

19. Cosa sono le eccezioni checked vs unchecked? Differenza principale.

20. Scrivi e spiega un codice completo con:

try-catch per ArithmeticException

try-catch per NullPointerException

Blocco finally

Spiega l'ordine di esecuzione
		 */
	}

}
