package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		boolean run = false;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		while (!run)
		{
		try
		{
		    System.out.println("	Inserisci il tuo pimo numero");
	     	int numero1 = scanner.nextInt();
			
		if (numero1 <= 0)
		{
			System.out.println("	Il numero inserito deve essere superiore a 0");
			continue;
	     }
		else
		{
			n1 = numero1;
			while (!run)
		{
		try
		{
			System.out.println("	Inserisci il tuo secondo numero");
			int numero2 = scanner.nextInt();
						
		if (numero2 <= 0)
		{
		    System.out.println("	Il numero inserito deve essere superiore a 0");
			continue;
		 }
		else
		{
			n2 = numero2;
			while (!run)
		{
		try
		{
			System.out.println("	Inserisci il tuo terzo numero");
			int numero3 = scanner.nextInt();
									
		if (numero3 <= 0)
		{
												
		    System.out.println("	Il numero inserito deve essere superiore a 0");
	        continue;
	    }
		else
		{
											n3 = numero3;
											int somma = n1 + n2 + n3;
											System.out.println("	Somma dei 3 numeri inseriti = " + somma);
											run = true;
		}
	}
     	catch(InputMismatchException e)
		{
										System.out.println("	Errore: devi inserire solo numeri interi");
										scanner.nextLine();
		}
	}
}
}
		catch(InputMismatchException e)
		{
			System.out.println("	Errore: devi inserire solo numeri interi");
			scanner.nextLine();
		}
					
					
		}
	}
}
		catch(InputMismatchException e)
		{
		    System.out.println("	Errore: devi inserire solo numeri interi");
			scanner.nextLine();
		}
		 
		
		
		}
		
		System.out.println("Fine programma");
		scanner.close();
	
				
	}
}



//else 
//{
//	contatore++;
//	System.out.println("	Inserisci il tuo " + contatore + " numero");
//	int numero2 = scanner.nextInt();
//	if (numero2 <= 0)
//	{
//		System.out.println("	Il numero inserito deve essere superiore a 0");
//		continue;
//	}
//	else
//	{
//		contatore++;
//		System.out.println("	Inserisci il tuo " + contatore + " numero");
//		int numero3 = scanner.nextInt();
//		if (numero3 <= 0)
//		{
//			System.out.println("	Il numero inserito deve essere superiore a 0");
//			continue;
//		}
//		else
//		{
//			int somma = numero1 + numero2 + numero3;
//			System.out.println("	La somma dei 3 numeri è: " + somma);
//		}
//	}
//}
//
//}
//catch(InputMismatchException e)
//{
//System.out.println("	Errore: devi inserire solo numeri interi");
//scanner.nextLine();
//}
//
//}
//
//System.out.println("Fine programma");
//scanner.close();




//while (!run)
//{
//	try
//	{
//		System.out.println("	Inserisci il tuo terzo numero");
//		int numero3 = scanner.nextInt();
//	
//		if (numero3 <= 0)
//			{
//				System.out.println("	Il numero inserito deve essere superiore a 0");
//				return;
//	        }
//		else
//		{
//			n3 = numero3;
//			int somma = n1 + n2 + n3;
//			System.out.println("	Somma dei 3 numeri inseriti = " + somma);
//			run = true;
//		}
//}
//	catch(InputMismatchException e)
//	{
//		System.out.println("	Errore: devi inserire solo numeri interi");
//		scanner.nextLine();
//	}
//}
