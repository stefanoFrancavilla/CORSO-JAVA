package esercizi_4;

import java.util.Scanner;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivere un programma che richieda all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi,
           al termine dell’inserimento dell’intera sequenza, stampi "Tutti i numeri sono pari e positivi." se i numeri inseriti sono tutti pari e positivi,
           altrimenti stampa "NO".
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanti numeri interi vuoi inserire nella sequenza?");
		
		int arrayLength = scanner.nextInt();
		System.out.println();
		
		int [] sequenza = new int[arrayLength];
		
		for(int i = 0; i < sequenza.length; i++)
		{
			sequenza[i] = scanner.nextInt();
		}
		
	    int PariEPositivi = 0;
		
		
		
			for(int i = 0; i < sequenza.length; i++)
			{
				if ((sequenza[i] % 2 == 0) && ( sequenza[i] >= 0))
				{
					PariEPositivi++;	
				}
				
				else
				{
					System.out.println("NO");
					break;
				}
			}
			if (PariEPositivi == sequenza.length)
			{
				System.out.println("Tutti i numeri inseriti sono pari e positivi");
			}
		
		
		scanner.close();
	}

	// 8.5/10
}
