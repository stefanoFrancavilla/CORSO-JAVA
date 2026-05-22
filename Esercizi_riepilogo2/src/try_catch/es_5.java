package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int numero1 = numeroValido(scanner, "	Inserisci il primo numero");
		int numero2 = numeroValido(scanner, "	Inserisci il secondo numero");
		
		
		
			double divisione = (double) numero1 / numero2;
			
			System.out.println("	La divisione dei due numeri è: " + divisione);
		
		
		System.out.println("Fine programma");
		scanner.close();
	}
	
	
	
	public static int numeroValido(Scanner scanner, String messaggio )
	{
		while(true)
		{
			try 
			{
			System.out.println(messaggio);
			int numero = scanner.nextInt();
			
			if (numero > 0)
			{
				return numero;
					
			}
			else
			{
				System.out.println("Il numero deve essere maggiore di 0");
			}
		    }
			
			catch(InputMismatchException e)
			{
				System.out.println("Errore: devi inserire solo numeri interi");
				scanner.nextLine();
			}	
		}
		
		
		
	}

}
