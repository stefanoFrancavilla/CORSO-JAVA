package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli_switch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * SWITCH moderno con virgole (case multipli in una riga)

📌 Esercizio:
Scrivi:

public static String semaforo(String colore)


"rosso" → "STOP"

"giallo" → "ATTENZIONE"

"verde" → "VAI"

default → "Colore non valido"

✅ Ma scrivilo usando:

case "rosso", "red" -> ...
 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il colre del semaforo");
		String coloreSemaforo = scanner.nextLine().trim().toLowerCase();
		
		System.out.println(semaforo(coloreSemaforo));
		
	}
public static String semaforo(String colore)
{
	String messaggio = "";
	
	switch(colore)
	{
	case "rosso" -> messaggio = "STOP";
	case "giallo" -> messaggio = "ATTENZIONE";
	case "verde" -> messaggio = "VAI";
	default -> messaggio = "Colore non valido";
	}
	return messaggio;
 }
//Voto: 9/10
//✅ Switch moderno perfetto, input/output esatti, logica solida.
}