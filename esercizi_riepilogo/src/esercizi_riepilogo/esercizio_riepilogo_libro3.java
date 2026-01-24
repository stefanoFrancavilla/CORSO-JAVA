package esercizi_riepilogo;
import java.util.Scanner;
public class esercizio_riepilogo_libro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Scrivi un programma Java che restituisce il numero di giorni di un mese
		 *  dato in input dall’utente. Il mese è dato sotto forma di intero,
		 *  ad esempio 3 corrisponde a marzo. Ignorare gli anni bisestili.
		 *  Esempio Dati di test Immettere un numero di mese: 2 Uscita prevista: Febbraio  ha 28 giorni
         */
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un numero da 1 a 12 e scopri a che mese corrisponde e quanti giorni ha");
		
		int x = scanner.nextInt();
		
		if (x == 1) {
			System.out.println("gennaio ha 31 giorni");
		}
		if (x == 2) {
			System.out.println("febbraio ha 28 giorni");
		}
		else if (x == 3) {
			System.out.println("marzo ha 31 giorni");
		}
		else if (x == 4) {
			System.out.println("aprile ha 30 giorni");
		}
		else if (x == 5) {
			System.out.println("maggio ha 31 giorni");
		}
		else if (x == 6) {
			System.out.println("giugno ha 30 giorni");
		}
		else if (x == 7) {
			System.out.println("luglio ha 31 giorni");
		}
		else if (x == 8) {
			System.out.println("agosto ha 31 giorni");
		}
		else if (x == 9) {
			System.out.println("settembre ha 30 giorni");
		}
		else if (x == 10) {
			System.out.println("ottobre ha 31 giorni");
		}
		else if (x == 11) {
			System.out.println("novembre ha 30 giorni");
		}
		else if (x == 12) {
			System.out.println("dicembre ha 31 giorni");
		}
		else {
			System.out.println("numero non valido");
		}
		
		


		scanner.close();
		
	}

}
