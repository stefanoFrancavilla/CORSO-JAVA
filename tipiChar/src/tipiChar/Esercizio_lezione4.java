package tipiChar;

import java.util.Scanner;

public class Esercizio_lezione4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println();
		System.out.println("esercizio 1 lezione 4-------------------------- ");
		System.out.println();
		
		/*Scrivi un programma Java che:

Chieda all’utente di inserire un numero intero.

Usi un’espressione booleana per determinare se il numero è pari o dispari.

Salvi il risultato in una variabile booleana chiamata isEven.

Usi un costrutto if per stampare:

"Il numero è pari" se isEven è true.

"Il numero è dispari" se isEven è false.*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("scrivi un numero");
		int n1 = scanner.nextInt();
		scanner.nextLine();
		
		boolean isEven = true;
		
		if((n1 %2 == 0) == true) {
			System.out.println(n1 + " è pari");
		}
		else
		{
			System.out.println(n1 + " è dispari");
		}
		scanner.close();*/
		
		
		
		
		System.out.println();
		System.out.println("esercizio 1.1 lezione 4-------------------------- ");
		System.out.println();
		
		/*Chieda due numeri all’utente.

          Indichi se entrambi sono pari, oppure se almeno uno è dispari.*/
		
		
		
		/*Scanner scanner =new Scanner(System.in);
		
		System.out.println("inserisci primo numero");
		int n1 = scanner.nextInt();
		System.out.println();
		
		System.out.println("inserisci secondo numero");
		int n2 = scanner.nextInt();
		System.out.println();
		
		boolean isEvenN1 = n1 %2 == 0;
		boolean isEvenN2 = n2 %2 == 0;
		
		if (isEvenN1) {
			System.out.println(n1 + " è pari");
		}
		else
		{
			System.out.println(n1 + " è dispari");
		}
			
		if (isEvenN2) {
		    System.out.println(n2 + " è pari");
		}
		else 
		{
			System.out.println(n2 + " è dispari");
		}
		scanner.close();*/
		
		
		
		
		
		System.out.println();
		System.out.println("esercizio 2 lezione 4-------------------------- ");
		System.out.println();
		
		/*Dichiarare tre variabili char:

una con il valore 'A'

una con il valore 'a'

una con il valore '0'

Stampare ciascun carattere e il suo corrispondente valore numerico (castando a int).

Stampare inoltre i valori di Character.MIN_VALUE e Character.MAX_VALUE come numeri.

Aggiungere un ciclo for che stampi i caratteri dal codice 65 al 90 (cioè dalla A alla Z) insieme al loro codice numerico.*/
		
		/*char ch1 = 'A';
		char ch2 = 'a';
	    char ch3 = '0';
	    
	    char chMin = Character.MIN_VALUE;
	    char chMax = Character.MAX_VALUE;
	    
	    System.out.println(ch1 + " " + (int) ch1);
	    System.out.println(ch2 + " " + (int) ch2);
	    System.out.println(ch3 + " " + (int) ch3);
	    System.out.println();
	    
	    System.out.println("il valore minimo di char è: " + (int) chMin);
	    System.out.println("il valore massimo di char è: " + (int) chMax);
	    System.out.println();
	    
	    for(int counter = 'A'; counter <= 'Z'; counter++) {
	    	System.out.println("il valore numerico corrispondente al carattere  " + (char) counter + "  è:  " + counter);
	    }*/
	    
		
		
		
		
		System.out.println();
		System.out.println("esercizio 2.1 lezione 4-------------------------- ");
		System.out.println();
		/*Scrivere un programma che chieda all’utente di inserire un carattere da tastiera
          e che dica se quel carattere è:

          una lettera maiuscola

          una lettera minuscola

          una cifra

          oppure un altro simbolo*/
	    
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un carattere");
		char ch1 = scanner.next().charAt(0);
		
		if (Character.isDigit(ch1) == true) {
		    System.out.println("il carattere " + ch1 + " è un numero , ed il suo valore numerico è: " + (int) ch1);
		}   
		    else if (Character.isUpperCase(ch1) == true) {
			System.out.println(ch1 + " è maiuscola " + " " + " ed il suo codice numerico è: " + (int) ch1 );
		}
		    else if ( Character.isLowerCase(ch1) == true)
		{
			System.out.println(ch1 + " è minuscola " + " " + " ed il suo codice numerico è: " + (int) ch1 );
		}
		    else 
		    {
		    	System.out.println(ch1 + " è un altro simbolo , ed il suo valore numerico è: " + (int) ch1);
		    }
	    
	     scanner.close();*/
		
	        
	     
	        System.out.println();
			System.out.println("esercizio 2.2 lezione 4-------------------------- ");
			System.out.println();
		
		
			/*Chiede all’utente di inserire un carattere.

			Controlla se il carattere è:

			una vocale (maiuscola o minuscola),

			una consonante,

			una cifra numerica,

			oppure un simbolo speciale.*/
			
			
			/*Scanner scanner = new Scanner(System.in);
			
			System.out.println("inserisci un carattere");
			char ch = scanner.next().charAt(0);
			
			if (Character.isDigit(ch) == true) {
				System.out.println("il carattere " + ch + " è un numero, ed il suo valore numerico è: " + (int) ch);
			}
			else if (Character.isUpperCase(ch) == true) {
				
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
					System.out.println("il carattere " + ch + " è una vocale maiuscola, e il suo valore numerico è: " +(int) ch );
				}
				else
				System.out.println("il carattere " + ch + " è una consonante maiuscola, e il suo valore numerico è: " +  (int) ch);
			}
			else if (Character.isLowerCase(ch) == true) {
				
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
					System.out.println("il carattere " + ch + " è una vocale minuuscola, e il suo valore numerico è: " +(int) ch );
				}
				else
				System.out.print("il carattere " + ch + " è una consonante minuscola, e il suo valore numerico è: " + (int) ch);
			}
			else {
				System.out.println("il carattere " + ch + " è un simbolo speciale, e il suo valore numerico è: " + (int) ch );
			}
			scanner.close();*/
			
	}
	}

