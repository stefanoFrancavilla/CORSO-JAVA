package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/*
//		 * Chieda all’utente di inserire due numeri interi.
//
//Li divida tra loro.
//
//Gestisca con try/catch questi casi:
//
//divisione per zero;
//
//input non numerico, ad esempio se l’utente scrive abc.
//
//Mostri un messaggio diverso per ogni errore.
//
//Alla fine, stampi un messaggio nel finally, tipo: Operazione conclusa.
//		 */
//
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Inserisci un numero: ");
//		int num1 = scanner.nextInt();
//		System.out.println("Inserisci un'altro numero: ");
//		int num2 = scanner.nextInt();
//		
//		try {
//			int risultato = num1 / num2;
//			System.out.println("Il risultato della divisione è: " + risultato);
//		}
//		
//		catch (ArithmeticException e) 
//		{
//			System.out.println("Errore: Divisione per zero non consentita.");
//		} 
//		
//		catch (InputMismatchException e) 
//		{
//			System.out.println("Errore: Input non numerico. Per favore, inserisci un numero intero.");
//		} 
//		
//		finally
//		
//		{
//			System.out.println("Operazione conclusa.");
//			scanner.close();
//		}
//	
	
		
		/*
		 * Esercizio: conversione e media
Scrivi un programma Java che:

Chieda all’utente di inserire 3 numeri interi.

Calcoli la media dei tre numeri.

Gestisca questi errori:

input non numerico;

divisione per zero, nel caso in cui tu decida di dividere per una variabile che potrebbe essere zero.

Stampi un messaggio finale nel finally, ad esempio: Fine programma.

Vincoli
Usa Scanner.

Usa almeno due catch diversi.

Il calcolo della media deve avvenire solo se tutti e 3 i numeri sono validi.

Se c’è un errore, il programma non deve andare in crash.

Come verrà valutato
Quando me lo consegni, ti darò un voto da 1 a 10 in base a:

correttezza del codice;

uso giusto di try/catch;

pulizia e ordine;

capacità di gestire gli errori nel modo giusto.

Consiglio
Per farti davvero testare bene, prova anche ad aggiungere una piccola modifica tua, per esempio:

se l’utente inserisce un numero negativo, mostra un messaggio;

oppure fai un secondo calcolo oltre alla media.

Quando me lo mandi, lo correggo e ti do il voto.
		 */
		
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		try 
//		{
//			System.out.println("inserisci il primo numero");
//			int n1 = scanner.nextInt();
//			
//			System.out.println("inserisci il secondo numero");
//			int n2 = scanner.nextInt();
//			
//			System.out.println("inserisci il terzo numero");
//			int n3 = scanner.nextInt();
//			
//			double media = (n1 + n2 + n3) / 3.0;
//			
//			System.out.println(media);
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println("Errore: divisione per zero non consentita.");
//		}
//		
//		catch ( InputMismatchException e)
//		{
//			System.out.println("Hai inserito il testo al posto di un numero ");
//		}
//		
//		finally {
//            System.out.println("Fine programma.");
//            scanner.close();
//        }
//		
		
		
		
		/*
		 * Esercizio
Scrivi un programma Java che:

chieda all’utente di inserire 2 numeri interi;

controlli che nessuno dei due sia negativo;

se uno dei due è negativo, stampi: Errore: hai inserito un numero negativo;

se entrambi sono validi, calcoli la somma;

gestisca l’input non numerico con catch (InputMismatchException e);

chiuda con un messaggio nel finally, ad esempio Fine programma.
		 * 
		 * 
		 */
		
//		Scanner scanner = new Scanner (System.in);
//		try
//		
//		{
//			System.out.println("	Inserisci un numero");
//			int n1 = scanner.nextInt();
//			
//			
//			
//			System.out.println("	Inserisci un' altro numero");
//			int n2 = scanner.nextInt();
//			
//			if ( (n2 < 0) || (n1 < 0))
//			{
//				System.out.println("	Errore : Hai inserito un numero negativo ");
//			}
//			else
//			{
//				
//				
//				int somma = n1 + n2;
//				System.out.println("	La somma è: " + somma);
//			}
//			
//		}
//		
//		catch(InputMismatchException e)
//		{
//			System.out.println("	Devi inserire un numero intero");
//		}
//		
//		finally
//		{
//			System.out.println("	Fine programma");
//			
//			scanner.close();
//		}
	
		
		Scanner scanner = new Scanner(System.in);
		
		try 
		{
		
			System.out.println("	Inserisci il prezzo del prodotto");
			
			double prezzoIniziale = scanner.nextDouble();
			
			
			
		}
		
		
	}

}
