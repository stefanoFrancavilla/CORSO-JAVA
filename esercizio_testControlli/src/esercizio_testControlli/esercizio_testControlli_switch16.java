package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli_switch16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Esercizio: Voto Scolastico
1. Crea un enum Voto con questi valori:

text
A_PLUS, A, B, C, D, F
2. Scrivi funzione:

java
public static String descrizioneVoto(int punteggio)
Dove punteggio è da 0 a 100 e ritorna:

text
90-100 → Voto.A_PLUS → "Eccellente! Continua così"
80-89 → Voto.A → "Ottimo lavoro"
70-79 → Voto.B → "Buono, puoi migliorare"
60-69 → Voto.C → "Sufficiente"
50-59 → Voto.D → "Insufficiente, studia di più"
0-49 → Voto.F → "Boccciato! Ripeti l'anno"
default → "Punteggio non valido"
3. Nel main:

Chiedi punteggio (Scanner nextInt()).

Validazione: se <0 o >100 → "Punteggio non valido".

Stampa: "Punteggio: 95 → A_PLUS (Eccellente! Continua così)".

Esempio output
text
Inserisci il tuo punteggio (0-100): 95
Punteggio: 95 → A_PLUS (Eccellente! Continua così)

Inserisci il tuo punteggio (0-100): -5
Punteggio non valido!
Suggerimenti
java
enum Voto {
    A_PLUS, A, B, C, D, F
}

switch(punteggio/10) {  // 95/10 = 9 → 90-99
    case 9, 10 → Voto.A_PLUS
    case 8 → Voto.A
    // ...
}
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il tuo punteggio (0-100)");
		
		int scelta = scanner.nextInt();
		
		String messaggio;
		
		if ((scelta < 0) || (scelta > 100))
		{
			System.out.println("Punteggio non valido");
		}
		else 
		{
			messaggio = descrizioneVoto(scelta);
			System.out.println("Punteggio: " + scelta + " -> " + messaggio);
		}
		
	scanner.close();	
	
	}
	public static String descrizioneVoto(int punteggio)
	{
		String messaggio = "";
		
		switch (punteggio/10)
		{
		case 1, 2, 3, 4:
			messaggio = Voto.F + " Boccciato! Ripeti l'anno";
		    break;
		
		case 5:
			messaggio = Voto.D + " Insufficiente, studia di più";
			break;
			
		case 6:
			messaggio = Voto.C +  " Sufficiente";
			break;
			
		case 7:
			messaggio = Voto.B +  " Buono, puoi migliorare";
			break;
			
		case 8:
			messaggio = Voto.A + " Ottimo lavoro";
			break;
			
		case 9, 10:
		    messaggio = Voto.A_PLUS + " Eccellente! Continua così";
		    break;
		    
		default:
			messaggio = "Punteggio non valido";
			break;
		}
		return messaggio;
	}
	/*
	 * voto finale 10/10
	 */
}
