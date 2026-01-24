package nuovo_corso;
import java.util.Scanner;
public class esercizo_2_lezione_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("inserisci un numero");
		float n1 = scanner.nextFloat();
		
		System.out.println("inserisci secondo numero");
		float n2 = scanner.nextFloat();

		boolean run = true;
		
		while (run) {
		
		System.out.println("------menù------");
		System.out.println("1. mostra i due numeri");
		System.out.println("2. somma i due numeri");
		System.out.println("3. moltiplica i due numero");
		System.out.println("4. dividi il primo numero con il secondo");
		System.out.println("5. sottrai dal primo numero il secondo");
		System.out.println("6. esci dal programma");
		
		int scelta = scanner.nextInt();
		
		switch (scelta) {
		
			case 1:
			System.out.println("i numeri inseriti sono : " + n1 + " il primo numero " + n2 + " il secondo numero");
			break;
			
			case 2:
				float somma = n1 + n2;
				System.out.println();
			    System.out.println("la somma dei due numeri è : " + somma );
			    System.out.println();
			    break;
			    
			case 3:
				float prodotto = n1 * n2;
				System.out.println();
				System.out.println(" il prodotto dei due numeri è : " + prodotto);
				System.out.println();
				break;
				
			case 4:
				float divisione = n1 / n2;
				System.out.println();
				System.out.println(" la divisione del primo numero con il secondo è : " + divisione);
				System.out.println();
				break;
				
			case 5:
				float differenza = n1 - n2;
				System.out.println();
				System.out.println("la differenza tra il primo0 numero ed il secondo numero è : " + differenza);
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				System.out.println(" uscita dal programma");
				System.out.println();
				break;
				
			default:
				System.out.println("scelta non valida");
				break;
		
		
		
	}
}
		scanner.close();
}
}