package esercizio_classArray;

public class esercizio_classArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hai due array:

uno con i nomi

uno con i numeri di telefono

Dovrai:

Stampare ogni persona con relativo numero usando un for classico.

Stampare solo i nomi usando il foreach.

Creare un terzo array con i cognomi, collegarlo agli altri con il for e stampare nome + cognome + numero.

Usando un foreach, stampare solo i cognomi (senza numero e nome).

(Avanzato) Contare quanti nomi hai iterato nel foreach, usando la tecnica con il contatore esterno.

📝 TRACCIA COMPLETA

Crea questi array:

String nomi[] = {"Marco", "Luca", "Anna", "Sara"};
String numeri[] = {"1234", "5678", "9012", "3456"};
String cognomi[] = {"Rossi", "Verdi", "Bianchi", "Neri"};


Usando un for classico, stampa:

Marco Rossi - 1234
Luca Verdi - 5678
...


Usando un foreach, stampa solo i nomi:

Nome: Marco
Nome: Luca
...


Usando un foreach, stampa solo i cognomi.

Conta gli elementi del foreach con una variabile esterna.

🎯 OBIETTIVO

Questo esercizio ti fa usare:

for → perché hai bisogno dell’indice

foreach → per iterare facilmente

array definiti direttamente con {}

collegare array tramite la posizione

concetto del contatore esterno nel foreach
		 */
		String nomi[] = {"Marco", "Luca", "Anna", "Sara"};
		String numeri[] = {"1234", "5678", "9012", "3456"};
		String cognomi[] = {"Rossi", "Verdi", "Bianchi", "Neri"};
		
		for(int i = 0; i < nomi.length; i++)
		{
			System.out.println(nomi[i] + " " +numeri[i]);
		}
		
		System.out.println("---------------------------");
		
		for(String nomi2 : nomi) 
		{
			System.out.println("Nome: " +nomi2);
		}
		
		System.out.println("---------------------------");
		
		for(int c = 0; c < nomi.length; c++)
		{
			System.out.println(nomi[c] + " " + cognomi[c] + " - " + numeri[c]);
		}
		
		System.out.println("---------------------------");
		
		for( String cognomi2 : cognomi) 
		{
			System.out.println(cognomi2);
		}
		
		System.out.println("---------------------------");
		
		int contatore = 0;
	
		
		for (String nomi3 : nomi) 
		{
			contatore ++;
		}
		System.out.println("il numero di elementi nell'array nomi sono. " + contatore);
	}

}
