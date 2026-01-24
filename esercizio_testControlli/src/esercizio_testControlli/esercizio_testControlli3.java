package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("scrivi un'oggetto e scopri se è in offerta quel prodotto");
		
		String oggetti = scanner.nextLine();
		
		String messaggio = Cartoleria(oggetti);
		
		System.out.println(messaggio);
	}

	public static String Cartoleria(String oggetti)
	{
		oggetti = oggetti.toUpperCase();
		String messaggio = "l'oggetto non è in offerta";
		
		switch (oggetti)
		{
		case "PENNA":
			messaggio = "la penna bic è in offerta";
			break;
			
		case "ASTUCCIO":
			messaggio = "l'astuccio della seven è in offerta";
			break;
			
		case "COLORI":
			messaggio = "i colori giotto sono in offerta";
			break;
			
		case "LIBRO":
			messaggio = "il libro della giungla è in offerta";
			break;
			
			default:
				break;
			
		}
		return messaggio;
	}
}
