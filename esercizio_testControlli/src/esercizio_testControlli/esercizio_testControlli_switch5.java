package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli_switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5) SWITCH con più case che portano allo stesso risultato

📌 Esercizio:
Scrivi una funzione:

public static String tipoAnimale(String animale)


Dove:

"cane", "gatto", "coniglio" → "Domestico"

"leone", "tigre", "orso" → "Selvatico"

"squalo", "delfino" → "Marino"

default → "Sconosciuto"

✅ Converti tutto con .toLowerCase().
 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un'animale");
		
		String animale = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("L'animale " + animale + " è un' animale: " + tipoAnimale(animale));
		
	}
	public static String tipoAnimale(String animale)
	{
		String messaggio = "";
		
		switch (animale)
		{
		case "cane", "gatto", "coniglio" -> messaggio = "Domestico";
		
		case "leone", "tigre", "orso" -> messaggio = "Selvatico";
		
		case "squalo", "delfino" -> messaggio = "Marino";
		
		default -> messaggio = "Sconosciuto";
		}
		
		return messaggio;
	}
	// voto finale 9/10
}
