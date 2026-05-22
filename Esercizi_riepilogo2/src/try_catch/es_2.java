package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		boolean run = false;
		
		while (!run)
		{
			try 
			{
				System.out.println("	Inserisci un numero intero");
				int numero = scanner.nextInt();
				
				if (numero <= 0)
				{
					System.out.println("	Il numero non può essere inferiore o uguale a 0");	
				
					continue;
				}
				else
				{
					int quadrato = numero * numero;
					System.out.println("	Il quadrato del numero inserito è: " + quadrato);
					run = true;
				}
				
			}
			catch ( InputMismatchException e)
			{
				System.out.println("	Errore: Inserisci solo numeri interi");
			scanner.nextLine();
				
			}
		}
		System.out.println("	Fine programma");
		scanner.close();
		
	}

}
