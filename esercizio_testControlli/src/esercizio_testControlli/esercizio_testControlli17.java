package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Gestore Noleggio Auto
Crea programma che calcola costo noleggio auto.

1. Tipo auto
Chiedi tipo:

ECONOMICA → 35€/giorno

INTERMEDIA → 55€/giorno

SUV → 85€/giorno

LUSSO → 140€/giorno

⚠️ Non valida → "Errore: auto non disponibile". Termina programma.

2. Giorni noleggio
"Quanti giorni noleggiare?"

Integro positivo

≤0 → "Errore: giorni non validi". Ricomincia da tipo auto.

3. Assicurazione extra
Costo fisso:

1–3 giorni → +12€

4–6 giorni → +20€

6 giorni → +30€

4. Sconto fedeltà
Dopo totale:

1–2 giorni → 0%

3–5 giorni → 8%

6–9 giorni → 15%

≥10 giorni → 25%

5. Output richiesto
text
Auto: INTERMEDIA
Giorni: 5
Prezzo/giorno: 55.0€
Costo base: 275.0€
Assicurazione: 20.0€
Totale senza sconto: 295.0€
Sconto applicato: 23.6€
Totale da pagare: 271.4€
6. Ripetizione
"Nuovo noleggio? (SI/NO)" → Loop fino NO.

🔧 OBBLIGATORIO
Scanner, toUpperCase()

double

Almeno 3 metodi es:

static double prezzoGiorno(String auto)

static double assicurazione(int giorni)

static double scontoPerc(int giorni)

⭐ Extra
Totale >800€ → Bonus cliente PREMIUM: -40€.

Scrivi codice completo (classe + main + metodi), compila/testa:

INTERMEDIA 5gg → 271.4€

SUV -1 → Riparti

"ABC" auto → Termina
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Benvenuto al gestore noleggio auto!");
		boolean continua = true;
		
		while (continua) {
			System.out.println("Che tipo di auto vuoi noleggiare? (ECONOMICA/INTERMEDIA/SUV/LUSSO)");
			String auto = scanner.nextLine().toUpperCase();
			double prezzoGiorno = prezzoGiorno(auto);
			if (prezzoGiorno == 0) {
				System.out.println("Errore: auto non disponibile");
				continue;
			}
			
			System.out.println("Quanti giorni vuoi noleggiare?");
			int giorni = scanner.nextInt();
			scanner.nextLine(); 
			if (giorni <= 0) {
				System.out.println("Errore: giorni non validi");
				continue;
			}
			
			double costoBase = prezzoGiorno * giorni;
			double costoAssicurazione = assicurazione(giorni);
			double totaleSenzaSconto = costoBase + costoAssicurazione;
			double scontoApplicato = totaleSenzaSconto * scontoPerc(giorni) / 100;
			double totaleDaPagare = totaleSenzaSconto - scontoApplicato;
			
			System.out.println("Auto: " + auto);
			System.out.println("Giorni: " + giorni);
			System.out.println("Prezzo/giorno: " + prezzoGiorno + "€");
			System.out.println("Costo base: " + costoBase + "€");
			System.out.println("Assicurazione: " + costoAssicurazione + "€");
			System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
			System.out.println("Sconto applicato: " + scontoApplicato + "€");
			System.out.println("Totale da pagare: " + totaleDaPagare + "€");
			
			System.out.println("Vuoi effettuare un nuovo noleggio? (SI/NO)");
			String risposta = scanner.nextLine().toUpperCase();
			if (risposta.equals("NO")) {
				continua = false;
				System.out.println("Grazie per aver usato il gestore noleggio auto!");
			}
		}
		
		scanner.close();
	}
	
	public static double prezzoGiorno(String auto) {
		double prezzo = 0;
		switch (auto) {
		case "ECONOMICA":
			prezzo = 35;
			break;
		case "INTERMEDIA":
			prezzo = 55;
			break;
		case "SUV":
			prezzo = 85;
			break;
		case "LUSSO":
			prezzo = 140;
			break;
		default:
			System.out.println("Errore: auto non disponibile");
			break;
		}
		return prezzo;
	}
	
	public static double assicurazione(int giorni) {
		double costoAssicurazione = 0;
		if (giorni >= 1 && giorni <= 3) {
			costoAssicurazione = 12;
		} else if (giorni >= 4 && giorni <= 6) {
			costoAssicurazione = 20;
		} else if (giorni > 6) {
			costoAssicurazione = 30;
		}
		return costoAssicurazione;
	}
	
	public static double scontoPerc(int giorni) {
		double sconto = 0;
		if (giorni >= 1 && giorni <= 2) {
			sconto = 0;
		} else if (giorni >= 3 && giorni <= 5) {
			sconto = 8;
		} else if (giorni >= 6 && giorni <= 9) {
			sconto = 15;
		} else if (giorni >= 10) {
			sconto = 25;
		}
		return sconto;
	}

}
