package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo_libro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scrivi un programma Java che prende tre numeri da tastiera e stampi il maggiore.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un valore al primo numero x");
		
		int x = scanner.nextInt();
		
		System.out.println("inserisci un valore al secondo numero y");
		
		int y = scanner.nextInt();
		
		System.out.println("inserisci un valore al terzo numero z");
		
		int z = scanner.nextInt();
		
		if (x > y && x > z) {
			
			System.out.println("il primo numero x: " + x + " è il maggiore");
		}
		else if (y > x && y > z) {
			System.out.println("il secondo numero y: " + y + " è il maggiore");
		}
		else {
			System.out.println("il primo terzo z: " + z + " è il maggiore");
		}
		
		scanner.close();
	}

}
