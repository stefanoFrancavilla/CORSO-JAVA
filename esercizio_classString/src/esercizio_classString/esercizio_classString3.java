package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Chiede all’utente di inserire una frase.

Stampa:

La lunghezza della stringa (length())

La frase tutta in maiuscolo (toUpperCase())

La frase tutta in minuscolo (toLowerCase())

La prima e l’ultima lettera della frase (charAt())

Chiede all’utente di inserire un’altra frase.

Confronta le due stringhe:

Se sono uguali (equals())

Se sono uguali ignorando le maiuscole/minuscole (equalsIgnoreCase())

Stampa la prima frase invertita (usa un ciclo o StringBuilder.reverse()).*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci la prima frase");
		
		String ingresso = scanner.nextLine();
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("la lunghezza della stringa inserita è: " + ingresso.length());
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("la stringa tutto in maiuscolo: " + ingresso.toUpperCase());
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("la stringa tutto in minuscolo: " + ingresso.toLowerCase());
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("il primo carattere della stringa inserita: " + ingresso.charAt(0));
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("l'ultimo carattere della stringa è: " + (ingresso.charAt(ingresso.length()-1)));
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println("inserisci inserisci la seconda frase");
		
		String ingresso2 = scanner.nextLine();
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println(ingresso.equals(ingresso2));
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		System.out.println(ingresso.equalsIgnoreCase(ingresso2));
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		char carattere;
		String risultato = "";
		for (int i = ingresso.length()-1; i >= 0; i-- ) {
			
			carattere = ingresso.charAt(i);
			
			risultato = risultato + carattere;
			
		}
		
		System.out.println(risultato);
		

	}

}
