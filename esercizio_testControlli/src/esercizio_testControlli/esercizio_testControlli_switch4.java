package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli_switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4) Funzione che ritorna String (come verificaTitolo)

📌 Esercizio:
Scrivi:

public static String categoriaTemperatura(int t)


Che ritorna:

sotto 0 → "Gelo"

0–10 → "Freddo"

11–20 → "Fresco"

21–30 → "Caldo"

sopra 30 → "Bollente"

✅ Usa if/else.
 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una temperatura");
		int temperatura = scanner.nextInt();
		System.out.println("con " + temperatura + " °C è: " + categoriaTemperatura(temperatura));
		
	}

	public static String categoriaTemperatura(int t)
	{
		String messaggio = "";
		
		if(t < 0)
		{
			messaggio = "Gelo";
		}
		else if((t >= 0) && (t <= 10))
		{
			messaggio = "Freddo";
		}
		else if((t > 10) && (t <= 20))
		{
			messaggio = "Fresco";
		}
		else if((t > 20) && (t <= 30))
		{
			messaggio = "Caldo";
		}
		else 
		{
			messaggio = "Bollente";
		}
		return messaggio;
	}
	//Voto: 10/10
}
