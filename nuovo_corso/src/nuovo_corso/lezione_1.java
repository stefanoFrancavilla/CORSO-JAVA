package nuovo_corso;
import java.util.Scanner;
public class lezione_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("inserisci primo numero ");
	int n1 = scanner.nextInt();
	
	System.out.print("inserisci secondo numero ");
	int n2 = scanner.nextInt();
	
	boolean run = true;
	while (run) {
	System.out.println();
	System.out.println("--------menù-------");
	System.out.println();
	System.out.println("1. mostra i due numeri");
	System.out.println("2. somma i due numeri");
	System.out.println("3. moltiplica i due numeri");
	System.out.println("4. esci dal programma");
	
	int scelta = scanner.nextInt();
	
	switch (scelta) {
	
	case 1 :
		System.out.println("i numeri inseriti sono: " );
		System.out.println("primo numero: " + n1);
        System.out.println("secondo numero " + n2);	
		break;
		
	case 2:
		int risultato = n1 +n2;
		System.out.println("la somma dei due numeri è : " + risultato);
		break;
		
	case 3 :
		int prodotto = n1 *n2;
		System.out.println("il prodotto dei due numeri è : " + prodotto);
		break;
		
	case 4 :
		run = false;
		System.out.println("uscita dal programma");
		break;
		
	default :
		System.out.println("scelta non valida");
		
		
	}
	}
	scanner.close();
	}
}
