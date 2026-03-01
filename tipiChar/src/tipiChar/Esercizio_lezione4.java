package tipiChar;

import java.util.Scanner;

public class Esercizio_lezione4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println();
		System.out.println("esercizio 1 lezione 4-------------------------- ");
		System.out.println();
		
//		/*Scrivi un programma Java che:
//
//Chieda all’utente di inserire un numero intero.
//
//Usi un’espressione booleana per determinare se il numero è pari o dispari.
//
//Salvi il risultato in una variabile booleana chiamata isEven.
//
//Usi un costrutto if per stampare:
//
//"Il numero è pari" se isEven è true.
//
//"Il numero è dispari" se isEven è false.*/
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Inserisci un numero intero");
//		int n1 = scanner.nextInt();
//		
//		boolean isEven = true;
//		
//		if(n1 %2 == 0)
//		{
//			System.out.println("Il numero " + n1 + " inserito è pari");
//		}
//		else
//		{
//			isEven = false;
//			System.out.println("Il numero "+ n1 + " inserito è dispari");
//		}
//		
		//esercizio svolto correttamente
		
		
		
		
		System.out.println();
		System.out.println("esercizio 1.1 lezione 4-------------------------- ");
		System.out.println();
		
		/*Chieda due numeri all’utente.

          Indichi se entrambi sono pari, oppure se almeno uno è dispari.*/
		
		
		
//		Scanner scanner =new Scanner(System.in);
//		
//		System.out.println("Inserisci il primo numero intero.");
//		
//		int n1 = scanner.nextInt();
//		scanner.nextLine();
//		
//        System.out.println("Inserisci il secondo numero intero.");
//		
//		int n2 = scanner.nextInt();
//		scanner.nextLine();
//		
//		if ((n1 %2 == 0) && (n2 %2 == 0))
//		{
//			System.out.println("tutti e due i numeri sono pari");
//		}
//		else if ((n1 %2 == 0) || (n2 %2 == 0))
//		{
//			System.out.println("Almeno un numero è pari");
//		}
//		else
//		{
//			System.out.println("Tutti e due i numeri sono dispari");
//		}
//		
		//l'esercizio è svolto correttamente
		
		
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
		
//		char char1 = 'A';
//		char char2 = 'a';
//		char char3 = '0';
//		
//		int char_max =(int)Character.MAX_VALUE;
//		int char_min =(int)Character.MIN_VALUE;
//		
//		System.out.println("il valore numerico di char1 è: " + (int)char1);
//		System.out.println("il valore numerico di char2 è: " + (int)char2);
//		System.out.println("il valore numerico di char3 è: " + (int)char3);
//		System.out.println();
//		
//		System.out.println(char_min + " è il valore minimo di char");
//		System.out.println(char_max + " è il valore massimo di char");
//		System.out.println();
//		
//		for (int i = 65; i <= 90 ; i++)
//		{
//			System.out.println("il carattere " + (char)i + " ha come valore numerico " + i);
//		}
//		
		// esercizio svolto correttamente.
		//voto 9.5 / 10
		
		
		
		System.out.println();
		System.out.println("esercizio 2.1 lezione 4-------------------------- ");
		System.out.println();
		/*Scrivere un programma che chieda all’utente di inserire un carattere da tastiera
          e che dica se quel carattere è:

          una lettera maiuscola

          una lettera minuscola

          una cifra

          oppure un altro simbolo*/
	    
	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("inserisci un carattere");
//		
//		char char1 = scanner.next().charAt(0);
//		
//		if (Character.isUpperCase(char1))
//		{
//		     System.out.println("Il carattere inserito è una lettera maiuscola");
//		}
//		else if (Character.isLowerCase(char1))
//		{
//			System.out.println("Il carattere inserito è una lettera minuscola");
//		}
//		else if (Character.isDigit(char1))
//		{
//			System.out.println("Il carattere inserito è un numero");
//		}
//		else 
//		{
//			System.out.println("Il carattere inserito è un simbolo");
//		}
//		scanner.close();
//	        
	     
	        System.out.println();
			System.out.println("esercizio 2.2 lezione 4-------------------------- ");
			System.out.println();
		
		
			/*Chiede all’utente di inserire un carattere.

			Controlla se il carattere è:

			una vocale (maiuscola o minuscola),

			una consonante,

			una cifra numerica,

			oppure un simbolo speciale.*/
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Inserisci un carattere");
			char char1 = scanner.next().charAt(0);
			scanner.nextLine();
			
			if (Character.isLetter(char1))
			{
				if (Character.isUpperCase(char1))
				{
				if ((char1 == 'A') || (char1 == 'E') || (char1 == 'I') || (char1 == 'O') || (char1 == 'U') )
				{
					System.out.println("Il carattere inserito è una vocale maiuscola");
				}
		       }
				else if (Character.isLowerCase(char1))
				{
					if ((char1 == 'a') || (char1 == 'e') || (char1 == 'i') || (char1 == 'o') || (char1 == 'u') )
					{
						System.out.println("Il carattere inserito è una vocale minuscola");
					}
				}
				else 
				{
					System.out.println("Il carattere inserito è una consonante");
				}
			 
			}
			else if (Character.isDigit(char1))
			{
				System.out.println("Il carattere inserito è un numero");
			}
			else 
			{
				System.out.println("Il carattere inserito è un carattere speciale");
			}
			
			scanner.close();
		
			//esercizio svolto correttamente voto 8/10
			
	}
	}

