package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		while (true)
		{
			try
			{
			System.out.println("	Inserisci il tuo primo numero");
			int n1 = scanner.nextInt();
			if(leggiNumeroPositivo(n1) == true)
			{
				numero1 = n1;
			}
			else 
			{
				continue;	
			}
			
			
			System.out.println("	Inserisci il tuo secondo numero");	
			int n2 = scanner.nextInt();
			if(leggiNumeroPositivo(n2) == true)
			{
				numero2 = n2;
			}
			else
			{
				continue;	
			}
			
			System.out.println("	Inserisci il tuo terzo numero");	
			int n3 = scanner.nextInt();
			
			if(leggiNumeroPositivo(n3) == true)
			{
				numero3 = n3;
				int somma = numero1 + numero2 + numero3;	
				double media = (numero1 + numero2 + numero3) / 3.0;
				
				System.out.println("	La somma dei numeri è: " + somma);
				System.out.println("	La media dei numeri inseriti è: " + media);
				System.out.println("Fine programma");
				break;
				
			}
			else
			{
				continue;
			}
		}
			catch(InputMismatchException e)
			{
				System.out.println("	Errore inserire solo numeri interi positivi");
				scanner.nextLine();
			}
			
		}
		
	}

	public static boolean leggiNumeroPositivo(int n)
	{
		boolean positivo = true;
		if(n <= 0)
		{
			System.out.println("	Il numero deve essere maggiore di zero");
			positivo = false;
		}
		return positivo;
	}
}
