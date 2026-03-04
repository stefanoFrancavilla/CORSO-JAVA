package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2: Conta Vocali
Crea una classe ContaVocali con metodo static int contaVocali(String s) 
che conta le vocali (a,e,i,o,u,A,E,I,O,U) case-insensitive usando un ciclo for e toLowerCase().
 Nel main, leggi una stringa, chiama la funzione e stampa "Numero vocali: X".

java
import java.util.Scanner;

		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String parola = scanner.nextLine();
		
		int vocali = contaVocali(parola);
		
		System.out.println(vocali);
		
	}

	public static int contaVocali(String s)
	{
		int numeroVocali = 0;
		
		for( int i = 0; i < s.length();i++)
		{
			char carattereCorrente = s.charAt(i);
			
			switch (carattereCorrente)
			{
			case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> numeroVocali++;
			}
		}
		
		return numeroVocali;
	}
	//voto 9/10
	}
