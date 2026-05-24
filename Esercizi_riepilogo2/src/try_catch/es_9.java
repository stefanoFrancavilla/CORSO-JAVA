package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: registro dei voti
Scrivi un programma Java che:

crei un array int[] voti = new int[5];

chieda all’utente di inserire 5 voti interi;

controlli che ogni voto sia tra 0 e 10;

se il voto non è valido, chieda di inserirlo di nuovo;

alla fine stampi:

tutti i voti inseriti;

la somma totale;

la media;

il voto più alto;

il voto più basso.

Vincoli
Usa Scanner.

Usa while o for per inserire i voti.

Usa if per controllare il range.

Usa try/catch per l’input non numerico.

Non usare ArrayList.
		 */
		Scanner scanner = new Scanner(System.in);
		int [] voti = new int[5];
		voti[0] = controlloVoto(scanner);
		voti[1] = controlloVoto(scanner);
		voti[2] = controlloVoto(scanner);
		voti[3] = controlloVoto(scanner);
		voti[4] = controlloVoto(scanner);
		
		somma(voti);
		media(voti);
		votoAlto(voti);
		votoBasso(voti);
		
	}
	public static int controlloVoto (Scanner sc)
	{
		int voto = 0;
		boolean valido = false;
		
		while (!valido)
		{
			try
			{
				System.out.println("	Inserisci il voto");
				voto = sc.nextInt();
				sc.nextLine();
				
				if(voto < 0 || voto > 10)
				{
					System.out.println("	Il voto inserito non è compreso tra 0 - 10");
				}
				else 
				{
					System.out.println("Voto valido");
					valido = true;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("	Non sono consentiti altri caratteri oltre quello numerico");
				sc.nextLine();
			}
		}
		return voto;
		
	}

	public static void somma ( int[] voti)
	{
		int somma = 0;
		
		for(int voto : voti)
		{
			somma += voto;
		}
		System.out.println("	La somma dei voti è: " + somma);
	}
	
	public static void media (int[] voti)
	{
		double somma = 0;
		 double media = 0;
		 
		 for(int i = 0; i < voti.length; i++)
		 {
			 somma += voti[i];
		 }
		 
		 media = somma / voti.length;
		 System.out.println("	La media dei voti è : " + media); 
	}
	
	public static void votoAlto (int [] voti)
	{
		int votoAlto = 0;
		for(int voto : voti)
		{
			int votoCorrente = voto;
			if (votoCorrente > votoAlto)
			{
				votoAlto = votoCorrente;
			}
		}
		System.out.println("	Il voto più alto è: " + votoAlto);
	}
	
	public static void votoBasso (int [] voti)
	{
		int votoBasso = 10;
		for(int voto : voti)
		{
			int votoCorrente = voto;
			if (votoCorrente < votoBasso)
			{
				votoBasso = votoCorrente;
			}
		}
		System.out.println("	Il voto più basso è: " + votoBasso);
	}
}
