package Esercizi_avanzati;

import java.util.HashSet;

public class Esrecizi_riepilogo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Breve teoria (5 minuti)

Fino ad oggi abbiamo usato classi come:

String
Integer
LocalDate

Ti sei mai chiesto perché funzionano così bene dentro un HashSet?

Perché chi ha scritto Java ha già implementato correttamente:

equals()
hashCode()

Quando invece scrivi una tua classe:

class Libro {
    private String isbn;
    private String titolo;
}

Java non può sapere quando due libri sono uguali.

È una decisione che spetta allo sviluppatore.

Ed è qui che entra in gioco il tuo ragionamento sul dominio applicativo.

2. Esercizio 1 (semplice)

Ti do una classe volutamente incompleta.

class Libro {

    private String isbn;
    private String titolo;

    public Libro(String isbn, String titolo) {
        this.isbn = isbn;
        this.titolo = titolo;
    }
}

e questo main:

HashSet<Libro> libri = new HashSet<>();

libri.add(new Libro("111", "Java Base"));
libri.add(new Libro("111", "Java Base"));
libri.add(new Libro("222", "Spring"));

System.out.println(libri.size());
Domanda 1

Prima di pensare al codice.

Quanti elementi verranno stampati?

E soprattutto...

Raccontami cosa succede dentro il HashSet, passo dopo passo.

Voglio una spiegazione, non solo il numero.

Domanda 2

Adesso ragioniamo da sviluppatori.

Abbiamo detto che, nel nostro dominio, un libro è identificato dal suo ISBN.

Ti chiedo una cosa.

Se dovessi implementare solo equals(), cosa confronteresti?

Non scrivere ancora il metodo.

Dimmi solo:

"Confronterei ______"

e spiegami perché.
		 */
		
		
		//domanda 1
		/*
		 * nel codice vedo che è assente l'equals e l'hashcode, significa che il metodo equals che userà java sarà quello della classe Object
		 * quindi valuterà l'uguaglianza in base al loro indirizzo
		 * per questo motivo la size sarà 3
		 */
		
		//domanda 2
		/*
		 * se dovessi implementare solo l'equals confronterei ISBN che rappresenta il codice identificativo di un libro
		 * quindi se hanno lo stesso codice allora sono lo stesso libro
		 */
		
		
		/*
		 * class Libro {

    private String isbn;
    private String titolo;

    public Libro(String isbn, String titolo) {
        this.isbn = isbn;
        this.titolo = titolo;
    }

    // QUI implementa equals()
   
   @Override
   public boolean equals(Object o)
   if (!(o instanceOf Libro))
   {
   return false;
   }
   
   Libro l = (Libro) o;
   
   return this.ISBN.equals(l.ISBN);
   }
	}
	*/
		
	HashSet<String> oggetti =new HashSet<>();
	oggetti.add("Mouse");
	oggetti.add("Tastiera");
	oggetti.add("Monitor");
	oggetti.add("Mouse");
	oggetti.add("cuffie");
	
	for (String s : oggetti)
	{
		System.out.println(s);
	}
	
	}
}
