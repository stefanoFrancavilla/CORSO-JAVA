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

static double prezzoNotte(String stanza)
static double tassa(int notti)
static double sconto(int notti, double totale)
⭐ Extra (facoltativo)

Se il totale finale supera 1000€ → applica un bonus cliente VIP di 50€ di sconto.
 */
		
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;
		System.out.println("Vuoi effettuare una prenotazione? SI/NO");
	
		
		while (continua) {
			String risposta = scanner.nextLine().trim().toUpperCase();
		if (risposta.equalsIgnoreCase("NO") ) {
			continua = false;
			System.out.println("Grazie per aver scelto il nostro Hotel");
		}
		else if (!risposta.equalsIgnoreCase("SI") && !risposta.equalsIgnoreCase("NO"))
		{
			continua = false;
			System.out.println("Errore nella scelta");
			System.out.println("Grazie per aver scelto il nostro Hotel");
		}
		else
		{
		System.out.println("Scegli una stanza. (SINGOLA, DOPPIA, SUITE, PRESIDENZIALE) ");
		String stanza = scanner.nextLine().trim().toUpperCase();
			
		System.out.println("Quante notti vuoi prenotare?");
		int notti = scanner.nextInt();
		double costoBase = prezzoNotte(stanza) * notti;
		double tassaSoggiorno = tassa(notti);
		double totaleSenzaSconto = costoBase + tassaSoggiorno;
		double scontoPercentuale = ((sconto(notti)) * (totaleSenzaSconto)) / 100;
		double totale = totaleSenzaSconto - scontoPercentuale;
		double totaleScontato = totale - scontoPercentuale;
		double scontoApplicato = totale - totaleScontato;
		double totale_finale = totale;
		if (totale > 1000)
		{
			totale_finale = totale - 50;
			System.out.println("Bonus cliente VIP applicato: 50€");
		}
		
		System.out.println("Stanza: " + stanza);
		System.out.println("Notti: " + notti);
		System.out.println("Prezzo per notte: " + prezzoNotte(stanza));
		System.out.println("Costo base: " + costoBase);
		System.out.println("Tassa soggiorno " + tassaSoggiorno);
		System.out.println("Totale senza sconto: " + totaleSenzaSconto);
		System.out.println("Sconto applicato: " + scontoApplicato);
		System.out.println("Totale da pagare: " + totale_finale);
		System.out.println("");
		System.out.println("Vuoi effettuare un'altra prenotazione?");
		String risposta2 = scanner.nextLine().trim().toUpperCase();
		if (risposta2.equalsIgnoreCase("NO") ) {
			continua = false;
			System.out.println("Grazie per aver scelto il nostro Hotel");
		}
		else if (!risposta.equalsIgnoreCase("SI") && !risposta.equalsIgnoreCase("NO"))
		{
			continua = false;
			System.out.println("Errore nella scelta");
		}
		else {
			continue;
		}
			
		}
		
		}	
		scanner.close();
	}

	public static double prezzoNotte(String s)
	{
		double costoStanza = 0;
		switch (s)
		{
		
		
		case "SINGOLA":
			costoStanza = 55;
			break;
			
		case "DOPPIA":
			costoStanza = 90;
			break;
			
		case "SUITE":
			costoStanza = 150;
			break;
		
		case "PRESIDENZIALE":
			costoStanza = 280;
			break;
			
		default:
			System.out.println("Errore: stanza non disponibile");
			
		}
		return costoStanza;
	}
	
	public static int tassa(int n)
	{
		int costoAggiuntivo = 0;
		
		switch (n)
		{
		
		
		case 1, 2:
			costoAggiuntivo = 8;
		    break;
		    
		case 3, 4, 5:
			costoAggiuntivo = 15;
		    break;
		    
		default:
			costoAggiuntivo = 25;
		    break;
			
		}
		
		return costoAggiuntivo;
	}
	
	public static int sconto (int sc)
	{
		int scontoApplicato = 0;
		
		switch (sc)
		{
		case 1, 2:
			scontoApplicato = 0;
		break;
		
		case 3, 4:
			scontoApplicato = 6;
		break;
		
		case 5, 6, 7:
			scontoApplicato = 12;
		break;
		
		default: 
			scontoApplicato = 20;
			break;
		}
		
		
		
		return scontoApplicato;
	}
}
