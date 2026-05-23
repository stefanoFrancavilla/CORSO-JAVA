package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: conto con storico
Scrivi un programma Java che:

parta con un saldo iniziale di 1000;

mostri un menu con:

1 vedere saldo;

2 depositare;

3 prelevare;

4 vedere storico operazioni;

5 uscire;

usi un ciclo while per ripetere il menu;

salvi ogni operazione in una lista di stringhe;

gestisca input non numerico con catch;

gestisca importi negativi o zero con if;

gestisca prelievo superiore al saldo con messaggio di errore;

stampi Fine programma alla fine.

Vincoli
Usa ArrayList<String> per lo storico.

Usa almeno una funzione per leggere importi validi.

Ogni operazione riuscita deve essere registrata nello storico.

Se l’utente sceglie 4, stampa tutto lo storico in ordine.

Se vuoi, puoi anche aggiungere una sesta opzione: svuota storico.Se vuoi, puoi anche aggiungere una sesta opzione: svuota storico.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String[] storico = new String[5];
		
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
				System.out.println("4. storico operazioni");
				System.out.println("5. svuota storico");
				System.out.println("6. uscita");
				
				int scelta = scanner.nextInt();
				
				switch(scelta)
				{
				case 1:
					System.out.println("	Il saldo attuale è: " + saldo);
					break;
					
				case 2:
					System.out.println("	Inserire la cifra da depositare");
					double importoDeposito = scanner.nextDouble();
					if (importoValido(importoDeposito) == true)
					{
					   if(storico(storico, saldo) == true)
					    {
					      saldo = deposito(importoDeposito, saldo);
					    }
					 
					}
					else
					{
						System.out.println("	Il deposito non è avvenuto");
					}
					break;
					
				case 3:
					System.out.println("	Inserire la cifra da prelevare");
					double importoPrelievo = scanner.nextDouble();
					if ( importoValido(importoPrelievo) == true)
					{
						if(storico(storico, saldo) == true)
						{
					      saldo = prelievo(importoPrelievo, saldo);
						}
					}
					else
					{
						System.out.println("	Il deposito non è avvenuto");
					}
					break;
					
				case 4:
					for(int i = 0; i < storico.length; i++ )
					{
						if(storico[i] == null)
						{
							continue;
						}
						else
						{
						System.out.println(i + ". " + storico[i]);
						}
					}
					break;
					
				case 5:
					svuotaStorico(storico);
					break;
					
				case 6:
					run = false;
					break;
				}
				    
			}
			catch(InputMismatchException e )
			{
				System.out.println("	Errore: sono consentiti solo numeri");
				scanner.nextLine();
			}
			
			
		}
		
		
		
		System.out.println("Fine programma");
		scanner.close();
	}
	
	
	public static boolean importoValido( double importo)
	{
			if(importo > 0)
			{
				return true;
			}
			else
			{
				System.out.println("	L'importo inserito deve essere superiore a zero");  
			    return false;
			}
	}
	
	public static double prelievo(double importo, double saldo)
	{
		if( importo > saldo)
		{
			System.out.println("	Deposito non consentito, importo superiore al saldo");
		}
		else
		{
			saldo = saldo - importo;
			System.out.println("Il prelievo è avvenuto con successo il saldo aggiornato è: " + saldo);
		}
		
		return saldo;
	}
	
	public static double deposito(double importo, double saldo)
	{
		saldo = saldo + importo;
		System.out.println("	Il deposito è avventuto con successo il saldo aggiornato è: " + saldo);
		return saldo;
		
	}

	public static boolean storico(String[] storico, double saldo)
	{
		for (int i = 0; i < storico.length; i++)
		{
		
			if (storico[i] == null)
			{
				storico[i] = String.valueOf("	Saldo aggiornato " + saldo);
				return  true;
			}
			
		}
		System.out.println("	Memoria dello storico piena , prego svuota lo storico");
		return false;
	}
	
	public static String[] svuotaStorico(String[] storico)
	{
		for (int i = 0; i < storico.length; i++)
		{
			storico[i] = null;
		}
		System.out.println("	La memoria è stata svuotata con successo");
		return storico;
	}
	
	
}
