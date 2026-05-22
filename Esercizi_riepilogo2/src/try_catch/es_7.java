package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Esercizio: conto bancario
Scrivi un programma Java che:

parta con un saldo iniziale di 1000;

mostri un menu con queste opzioni:

1 vedere il saldo;

2 depositare soldi;

3 prelevare soldi;

4 uscire;

usi un ciclo while per continuare fino all’uscita;

gestisca:

input non numerico con catch;

deposito negativo o zero con if;

prelievo negativo o zero con if;

prelievo superiore al saldo con un messaggio di errore;

stampi Fine programma alla fine.

Vincoli
Usa almeno una funzione per leggere importi validi.

Usa switch per il menu.

Usa double per saldo e importi.

Non usare più scanner diversi: uno solo per tutto il programma.
		 */
		Scanner scanner = new Scanner(System.in);
		double saldo = 1000;
		boolean run = true;
		
		while (run)
		{
			try
			{
				System.out.println("----------menu----------");
				System.out.println("1. saldo");
				System.out.println("2. depositare");
				System.out.println("3. prelevare");
				System.out.println("4. esci");
				
				int scelta = scanner.nextInt();
				
				switch(scelta)
				{
				case 1:
					System.out.println("	Il saldo attuale è: " + saldo);
					break;
					
				case 2:
					System.out.println("	Inserire la cifra da depositare");
					double importo = scanner.nextDouble();
					importoValido(importo);
				}
				    
			}
			catch(InputMismatchException e )
			{
				System.out.println("	Errore: immetti il numero corrispondente alla scelta");
				scanner.nextLine();
			}
			
			
		}
		
		
		
		
		
	}
	
	public static double importoValido( double importo)
	{
		while (true)
		{
			try
			{
		
			
			if(importo > 0)
			{
				return importo;
			}
			else
			{
				System.out.println("	L'importo inserito deve essere superiore a zero");
			}
			}
			catch(InputMismatchException e )
			{
				System.out.println("	Errore: inserisci solo cifre");
				continue;
			}
		}
	}
	
	public static double deposito(double importo , double saldo)
	{
		
		saldo = saldo + importo;
		System.out.println( "	Il deposito è avvenuto con successo, saldo aggiornato: " + saldo);
		return saldo;
	}
	
	public static double prelievo (double importo, double saldo)
	{
		if (importo > saldo)
		{
			System.out.println("	Importo superiore al saldo");
		}
		else 
		{
			saldo = saldo - importo;
			System.out.println( "	Il prelievo è avvenuto con successo, saldo aggiornato: " + saldo);
		}
		return saldo;
	}

}
