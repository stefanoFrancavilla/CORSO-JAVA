package appunti;

public class Appunti_StringBuilder_Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Con String normale, ogni modifica crea una nuova stringa.
Con StringBuilder e StringBuffer, invece, modifichi lo stesso oggetto aggiungendo, togliendo o cambiando testo.

Le funzioni principali
Le due classi hanno quasi gli stessi metodi:

append() → aggiunge testo alla fine.

insert() → inserisce testo in una certa posizione.

delete() → elimina una parte del testo.

replace() → sostituisce una parte del testo.

reverse() → inverte il testo.

toString() → converte il risultato in una String normale.

Esempio semplice
java
StringBuilder sb = new StringBuilder();
sb.append("Ciao");
sb.append(" ");
sb.append("Marco");
System.out.println(sb.toString());
Risultato:

java
Ciao Marco
Utilizzo di ogni funzione
append()
Si usa quando vuoi aggiungere testo passo dopo passo, per esempio dentro un ciclo o quando costruisci una frase.

java
StringBuilder sb = new StringBuilder("Ciao");
sb.append(" Java");
insert()
Si usa quando vuoi inserire un pezzo di testo in mezzo alla stringa.

java
StringBuilder sb = new StringBuilder("Ciao mondo");
sb.insert(5, "bel ");
Risultato:

java
Ciao bel mondo
delete()
Si usa quando vuoi togliere una parte del testo.

java
StringBuilder sb = new StringBuilder("Ciao mondo");
sb.delete(4, 10);
Risultato:

java
Ciao
replace()
Si usa quando vuoi cambiare una parte del testo con un’altra.

java
StringBuilder sb = new StringBuilder("Ciao mondo");
sb.replace(5, 10, "Java");
Risultato:

java
Ciao Java
reverse()
Si usa quando vuoi ribaltare il testo.

java
StringBuilder sb = new StringBuilder("Java");
sb.reverse();
Risultato:

java
avaJ
toString()
Si usa per trasformare il risultato in una String normale.

java
String testo = sb.toString();
Differenza tra i due
StringBuilder: più veloce, non sincronizzato, quindi ideale in casi normali a singolo thread.

StringBuffer: sincronizzato, quindi più sicuro se più thread lavorano sullo stesso oggetto, ma un po’ più lento.

Quando usare StringBuilder
Usalo quando:

stai lavorando da solo in un programma normale;

devi aggiungere testo molte volte;

sei in un ciclo;

vuoi più velocità.

Quando usare StringBuffer
Usalo quando:

lo stesso oggetto può essere usato da più thread;

ti serve più sicurezza nella gestione del testo condiviso.

Regola facile
Se lavori in un programma normale: StringBuilder.

Se lavori in un contesto con più thread: StringBuffer.

Esempio pratico di differenza
Se devi creare una frase pezzo per pezzo:

java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append(i).append(" ");
}
System.out.println(sb.toString());
		 */
	}

}
