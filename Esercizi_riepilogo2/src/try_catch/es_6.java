package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Esercizio: mini-calcolatrice a menu
Scrivi un programma Java che:

mostri un menu con 4 opzioni:

1 somma

2 sottrazione

3 moltiplicazione

4 divisione

chieda all’utente di scegliere un’opzione;

legga due numeri interi positivi;

esegua l’operazione scelta con switch;

gestisca:

input non numerico con catch;

numero negativo o zero con if;

divisione per zero con catch oppure prevenendola con controllo;

stampi Fine programma alla fine.

Vincoli
Usa almeno una funzione per leggere numeri validi.

Usa switch per scegliere l’operazione.

Se l’utente inserisce una scelta non compresa tra 1 e 4, stampa un messaggio di errore.
		 */
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while ( run)
		{
		
			int numero1 = numeroValido(scanner , " 	Inserisci il primo numero");
		
			int numero2 = numeroValido(scanner,  "	Inserisci il secondo numero");
		
			
			System.out.println("----------menu-----------");
			System.out.println("1. Somma");
			System.out.println("2. Sottrazione");
			System.out.println("3. Moltiplicazione");
			System.out.println("4. Divisione");
			System.out.println("5. Esci");
			
			try
			{
			int scelta = scanner.nextInt();
			switch(scelta)
			{
			case 1:
			int somma =  numero1 + numero2;
			System.out.println("	La somma dei due numeri è: " + somma);
			break;
			
			case 2:
			int sottrazione = numero1 - numero2;
			System.out.println("	La sottrazione dei due numeri è: " + sottrazione);
			break;
			
			case 3:
			int moltiplicazone = numero1 * numero2;
			System.out.println("	La moltiplicazone dei due numeri è: " + moltiplicazone);
			break;
			
			case 4:
			double divisione = (double) numero1 / numero2;
			System.out.println("	La divisione dei due numeri è: " + divisione);
			break;
			
			case 5:
				run = false;
				break;
				
			default:
				System.out.println("	La scelta inserita non è valida");
				break;
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println("	Errore: devi inserire il numero corrispondente alla scelta");
				scanner.nextLine();
			}
			
		}
		System.out.println("	Fine programma");
		scanner.close();
		
		
		
	}
	
	public static int numeroValido ( Scanner scanner, String messaggio)
	{
		while(true)
		{
			try
			{
				System.out.println(messaggio);
				int numero = scanner.nextInt();
				
				if ( numero > 0)
				{
					return numero;
				}
				else 
				{
					System.out.println("	Il numero deve essere maggiore di zero");
				}
			}
			catch(InputMismatchException e )
			{
				System.out.println("	Errore: devi inserire solo numeri interi");
				scanner.nextLine();
			}
		}
	}

}
