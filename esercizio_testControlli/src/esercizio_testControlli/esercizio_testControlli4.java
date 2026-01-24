package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserici un mezzo di trasporto");
		
		String mezzoDiTrasporto = scanner.nextLine();
		
		String messaggio = Noleggio(mezzoDiTrasporto);

		System.out.println(messaggio);
	}

	public static String Noleggio (String mezzoDiTrasporto)
	{
		mezzoDiTrasporto = mezzoDiTrasporto.toUpperCase();
		String messaggio = "Il mezzo inserito non è disponibile a noleggio";
		
		switch (mezzoDiTrasporto )
		{
		case "AUTO":
			messaggio = "Auto disponibile a 30€ al giorno";
			break;
			
		case "MOTO":
			messaggio = "Moto disponibile a 20€ al giorno";
			break;
			
		case "BICICLETTA":
			messaggio = "Bicicletta disponibile a 10€ al giorno";
			break;
			
		case "MONOPATTINO":
			messaggio = "Monopattino disponibile a 8€ al giorno";
			break;
			
		default:
			break;
		}
		return messaggio;
	}
}
