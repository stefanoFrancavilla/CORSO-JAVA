package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3: Validazione Password
Crea una classe ValidaPassword con metodo static boolean validaPassword(String p)
 che verifica: lunghezza ≥8, almeno 1 maiuscola, 1 minuscola, 1 cifra, 1 speciale (!@#$%).
  Usa cicli separati per ogni controllo, restituisci true solo se tutti ok. Nel main, leggi password, 
  chiama funzione, stampa "Sicura" o dettagli errore (usa if multipli).

java
import java.util.Scanner;

// Più difficile: 5 contatori (lunghezza, upper, lower, digit, special), return tutti true
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una password");
		String password = scanner.nextLine();
		
		if (validaPassword(password))
		{
			System.out.println(password + " Password Sicura");
		}
		else
		{
			System.out.println(password + " Password non Sicura");
		}
	}
	
	public static boolean validaPassword(String p)
	{
		boolean sicura = false;
		int maiuscola = 0;
		int minuscola = 0;
		int cifra = 0;
		int speciale = 0;
		
		for(int i = 0; i < p.length();i++)
		{
			char carattereCorrente = p.charAt(i);
			
			if (Character.isLowerCase(carattereCorrente))
			{
				minuscola++;
			}
			else if (Character.isUpperCase(carattereCorrente))
			{
				maiuscola++;
			}
			else if (Character.isDigit(carattereCorrente))
			{
				cifra++;
			}
			else
			{
				speciale++;
			}
		}
		if (maiuscola != 0 && minuscola != 0 && cifra != 0 && speciale != 0)
		{
			if(p.length() >= 8)
			{
				sicura = true;
			}
		}
		return sicura;
	}
/*
 * Voto: 9/10
 */
}
