package esercizi_riepilogo;
import java.util.Scanner;
public class esrcizio_riwpilogo_libro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Esercizio 1 Scrivi un programma Java che prende due numeri da tastiera 
		 * e stampa quello è più grande.
		 *  Esempio Dati di test: Inserire il primo numero: 10 Inserire il secondo numero: 5 Uscita prevista: Il primo numero è più grande del secondo
		 */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("inserisci primo numero");
        
        int x = scanner.nextInt();
       
        System.out.println();
        System.out.println("inserisci secondo numero");
        
        int y = scanner.nextInt();
        
        if (x > y) {
        	 System.out.println("il primo numero " + x + " è più grande del secondo numero " + y);
        }
        else if ( x < y) {
        	 System.out.println("il primo numero " + x + " è più piccolo del secondo numero " + y);
        }
        else {
        	 System.out.println("i due numeri sono uguali");
        }
		scanner.close();
	}

}
