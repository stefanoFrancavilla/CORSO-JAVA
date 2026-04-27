package esercizi_4;

import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivere un programma che richieda all’utente di inserire una sequenza di
           caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampi man mano che vengono inseriti.
           L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
           dovrà essere ripetuto 4 volte.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int ciclo = 0;
		
		while(ciclo < 4)
		{
			
		
		System.out.println("Quanti caratteri vuoi inserire?");
		
		int caratteriDaInserire = scanner.nextInt();
		
		String caratteri = "";
		
		
			for( int i = 0; i < caratteriDaInserire; i++)
			{
				System.out.println("Inserisci il carattere ");
				char carattereCorrente = scanner.next().charAt(0);
				
				caratteri = caratteri + carattereCorrente;
				
				System.out.println();
				System.out.println("I caratteri inseriti sono:  " + caratteri);
				System.out.println();
			}
		
			ciclo++;
		}
	}

	//voto 9/10
}
