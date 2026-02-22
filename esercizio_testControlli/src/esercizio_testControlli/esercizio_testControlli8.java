package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ESERCIZIO: Gestore Prenotazioni Hotel

Devi creare un programma Java che calcola il costo di un soggiorno in hotel.

1️⃣ Tipo di stanza

Chiedi all’utente il tipo di stanza:

SINGOLA → 55€ a notte
DOPPIA → 90€ a notte
SUITE → 150€ a notte
PRESIDENZIALE → 280€ a notte

⚠️ Se la stanza non esiste:

Errore: stanza non disponibile

Il programma termina.

2️⃣ Numero di notti

Chiedi:

Quante notti vuoi prenotare?

Deve essere un intero positivo

Se ≤ 0:

Errore: numero notti non valido

e deve ricominciare la prenotazione dall’inizio.

3️⃣ Tassa di soggiorno

Costo fisso aggiuntivo:

1–2 notti → +8€

3–5 notti → +15€

oltre 5 notti → +25€

4️⃣ Sconto soggiorno lungo

Dopo aver calcolato il totale:

1–2 notti → nessuno sconto

3–4 notti → 6%

5–7 notti → 12%

oltre 7 notti → 20%

5️⃣ Calcoli richiesti

Devi stampare:

prezzo a notte

costo base

tassa soggiorno

totale senza sconto

sconto applicato

totale finale

6️⃣ Esempio output
Stanza: DOPPIA
Notti: 6
Prezzo a notte: 90.0€
Costo base: 540.0€
Tassa soggiorno: 25.0€
Totale senza sconto: 565.0€
Sconto applicato: 67.8€
Totale da pagare: 497.2€
7️⃣ Ripetizione

Alla fine chiedi:

Vuoi effettuare un'altra prenotazione? (SI/NO)

Ripeti finché l’utente non scrive NO

🔧 Requisiti tecnici OBBLIGATORI

Devi usare:

Scanner

toUpperCase()

double

almeno 3 metodi

Esempio:

static double getPrezzoNotte(String stanza)
static double getTassa(int notti)
static double getSconto(int notti, double totale)
⭐ Extra (facoltativo)

Se il totale finale supera 1000€ → applica un bonus cliente VIP di 50€ di sconto.
 */
		
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;
		
		while (continua) {
		System.out.println("Vuoi effettuare una prenotazione? SI/NO");
		String risposta = scanner.nextLine().trim().toUpperCase();
		if (risposta.equalsIgnoreCase("NO") ) {
			continua = false;
			System.out.println("Grazie per aver scelto il nostro Hotel");
		}
		else if (!risposta.equalsIgnoreCase("SI") && !risposta.equalsIgnoreCase("NO"))
		{
			continua = false;
			System.out.println("Errore nella scelta");
		}
		else
		{
		System.out.println("Scegli una stanza. (SINGOLA, DOPPIA, SUITE, PRESIDENZIALE) ");
		String stanza = scanner.nextLine().trim().toUpperCase();
			
			
			
		}
		
		}	
	}

}
