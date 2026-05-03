package Es_7;

import java.util.Arrays;

public class es_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 7: Sequenza Fibonacci Array
           Riempi array 15 elementi con Fibonacci (0,1,1,2,3...). Stampa e verifica se ultimo è primo.
		 */
		//sequenza di fibonacci( 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...)
		
	
		int[] fibonacci = new int[15];
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i = 2; i < fibonacci.length; i++)
		{
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		System.out.println("I primi 15 numeri della sequenza di fibonacci sono: " + Arrays.toString(fibonacci));
		
		int ultimo = fibonacci[fibonacci.length -1];
		boolean primo = true;  // imposto il risultato booleano a true;
		
		if(ultimo < 2) // se ultimo è minore di 2 allora primo diventa false.
		{
			primo = false;
		}
		else
		{
			for ( int i = 2; i <= Math.sqrt(ultimo); i++) //faccio partire il ciclo da 2 per saltare la condizione già verificata
				                                         // fino a quando i non raggiunge o è uguale il valore della radice quadrata di ultimo
			{
				if(ultimo % i == 0) // se la divisione di ultimo con il valore attuale di i da 0 come resto allora primo diventa false
				{
					primo = false;
					break;
				}
			}
		}
		if (primo)
		{
		    System.out.println("L'ultimo numero " + ultimo + " è primo");
		}
		else
		{
		    System.out.println("L'ultimo numero " + ultimo + " non è primo");
	    }
		
		// voto 9.5/10
	}
}
