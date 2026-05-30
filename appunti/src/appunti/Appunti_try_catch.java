package appunti;

public class Appunti_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Certo. In Java, try e catch servono per gestire gli errori in modo ordinato senza far crashare subito il programma.

L’idea è semplice: dentro try metti il codice che può dare problemi, e nei vari catch dici cosa fare se quel problema succede.

Idea semplice
Pensa a try come a una zona “a rischio”.
Se lì dentro succede un errore, Java interrompe quel pezzo di codice e passa al catch giusto.

java
try {
    int risultato = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Divisione per zero!");
}
A cosa serve
Serve a:

evitare che il programma si chiuda all’improvviso;

mostrare un messaggio chiaro;

recuperare da un errore quando è possibile.

I catch più comuni
Quando dici “i catch”, in pratica stai parlando dei blocchi che catturano tipi diversi di eccezioni.
Non esiste un numero fisso di catch da usare sempre: dipende dal tipo di errore che vuoi gestire.

catch (ArithmeticException e)
Si usa per errori matematici, soprattutto divisione per zero.

java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Errore matematico");
}
catch (NullPointerException e)
Si usa quando provi a usare un oggetto che in realtà è null.

java
try {
    String testo = null;
    System.out.println(testo.length());
} catch (NullPointerException e) {
    System.out.println("Oggetto null");
}
catch (ArrayIndexOutOfBoundsException e)
Si usa quando accedi a una posizione non valida di un array.

java
try {
    int[] a = {1, 2, 3};
    System.out.println(a[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Indice fuori dall'array");
}
catch (NumberFormatException e)
Si usa quando provi a trasformare una stringa in numero ma il testo non è valido.

java
try {
    int n = Integer.parseInt("ciao");
} catch (NumberFormatException e) {
    System.out.println("Numero non valido");
}
catch (IllegalArgumentException e)
Si usa quando un metodo riceve un argomento sbagliato.

java
try {
    throw new IllegalArgumentException("Valore non valido");
} catch (IllegalArgumentException e) {
    System.out.println("Argomento sbagliato");
}
catch (IOException e)
Si usa per problemi di input/output, per esempio file o letture da risorse esterne.

catch (FileNotFoundException e)
Si usa quando un file non esiste o non si trova.

catch (Exception e)
È il catch più generico.
Cattura tante eccezioni diverse, ma è meglio usarlo solo come ultima scelta, non come soluzione principale.

java
try {
    // codice rischioso
} catch (Exception e) {
    System.out.println("C'è stato un errore");
}
Ordine corretto dei catch
Se usi più catch, devi mettere prima quelli più specifici e dopo quelli più generici.

Se metti prima catch (Exception e), gli altri catch più specifici diventano inutili.

java
try {
    // codice
} catch (NumberFormatException e) {
    System.out.println("Numero non valido");
} catch (Exception e) {
    System.out.println("Errore generico");
}
finally
finally è un blocco opzionale che viene eseguito quasi sempre, sia che ci sia un errore sia che tutto vada bene.

Si usa per pulizia finale, per esempio chiudere file o liberare risorse.

java
try {
    System.out.println(10 / 2);
} catch (ArithmeticException e) {
    System.out.println("Errore");
} finally {
    System.out.println("Fine blocco");
}
Quando usarlo
Usa try-catch quando:

il codice può fallire;

vuoi evitare che il programma si interrompa;

vuoi gestire l’errore in modo controllato.

Quando conviene un catch specifico
Conviene usare un catch specifico quando sai già che tipo di errore può succedere.
Così puoi dare un messaggio più chiaro e trattare l’errore nel modo giusto.

Esempio completo
java
public class EsempioTryCatch {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt("abc");
            System.out.println(10 / 0);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("La stringa non è un numero");
        } catch (ArithmeticException e) {
            System.out.println("Divisione per zero");
        } finally {
            System.out.println("Operazione conclusa");
        }
    }
}
Regola facile
try = provo il codice.

catch = gestisco l’errore.

finally = faccio la pulizia finale.
		 */
	}

}
