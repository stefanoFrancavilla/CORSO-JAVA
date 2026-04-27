package esercizi_3;

import java.util.Scanner;

public class es_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Stampare una sequenza di numeri da -10 ad un numero inserito dall'utente, utilizzando un ciclo "while".
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero");
		
		int numeroInserito = scanner.nextInt();
		System.out.println();
		
		int i = -10;
		
		if (i < numeroInserito)
		{
			while (i <= numeroInserito)
			{
				System.out.println(i);
				i++;
			}
				
		}
		else
		{
			while ( i >= numeroInserito)
			{
				System.out.println(i);
				i--;
			}
		}
		
		scanner.close();
	}
// voto 9.5/10
}
