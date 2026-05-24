package try_catch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class es_10 {

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
		
		ArrayList<String> storico = new ArrayList<>();
		
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

                     double importoDeposito = leggiImporto(scanner);

                     if (importoValido(importoDeposito)) {

                         saldo = deposito(importoDeposito, saldo);

                         storico.add("Deposito di " + importoDeposito +
                                 " € | Saldo: " + saldo + " €");
                     }

                     break;
					
				 case 3:

                     double importoPrelievo = leggiImporto(scanner);

                     if (importoValido(importoPrelievo)) {

                         double nuovoSaldo = prelievo(importoPrelievo, saldo);

                         if (nuovoSaldo != saldo) {

                             saldo = nuovoSaldo;

                             storico.add("Prelievo di " + importoPrelievo +
                                     " € | Saldo: " + saldo + " €");
                         }
                     }

                     break;
					
				case 4:
					visualizzaOperazioni(storico, saldo);
					break;
					
				case 5:
					CancellaStorico(storico, saldo);
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
		System.out.println("	Fine programma");
		scanner.close();
	}
	
	  public static double leggiImporto(Scanner scanner) {

	        System.out.println("Inserisci importo:");

	        return scanner.nextDouble();
	    }
	  
	public static boolean importoValido(double importo)
	{
		if(importo <= 0)
		{
			System.out.println("	L'importo non può essere negativo");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static double deposito(double importo, double saldo)
	{
		saldo = saldo + importo;
		System.out.println("	Deposito avvenuto con successo");
		return saldo;
	}
	
	public static double prelievo(double importo, double saldo)
	{
		if(importo > saldo)
		{
			System.out.println("	Importo superiore al saldo , prelievo fallito");
		}
		else
		{
			saldo = saldo - importo;
			System.out.println("	Prelievo avvenuto con successo");
		}
		return saldo;
	}
	
	public static ArrayList<String> operazione (ArrayList<String> storico, double saldo)
	{
		storico.add("	Saldo aggiornato: " + saldo);
		return storico;
	}
	
	public static void CancellaStorico (ArrayList<String> storico, double saldo)
	{
		storico.clear();
		System.out.println("	Storico cancellato");
	
	}
	
	
	public static void visualizzaOperazioni(ArrayList<String> storico, double saldo) {

		if (storico.isEmpty()) {

			System.out.println("	Nessuna operazione presente");
			} else {

				System.out.println("	\n----- STORICO -----");

				for (String operazione : storico) {

					System.out.println(operazione);
				}
			}

		System.out.println("	\nSaldo attuale: " + saldo + " €");
	}

}
