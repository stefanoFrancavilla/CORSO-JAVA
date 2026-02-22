package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ESERCIZIO: Gestore Parcheggio a Pagamento

Devi creare un programma Java che gestisce il costo di un parcheggio.

1️⃣ Scelta del veicolo

Chiedi all’utente il tipo di veicolo:

AUTO → 2.50€ all’ora
MOTO → 1.20€ all’ora
FURGONE → 3.80€ all’ora
CAMPER → 5.00€ all’ora

⚠️ Se il veicolo non è valido:

Errore: veicolo non ammesso

Il programma termina.

2️⃣ Ore di sosta

Se il veicolo è valido chiedi:

Quante ore resterai parcheggiato?

Deve essere un numero intero positivo

Se ≤ 0:

Errore: ore non valide

e deve ricominciare il noleggio dall’inizio (come nel tuo esercizio).

3️⃣ Supplemento notturno

Il parcheggio applica un costo fisso:

fino a 3 ore → +1€

da 4 a 8 ore → +2.5€

oltre 8 ore → +4€

4️⃣ Sconto lunga sosta

Dopo aver calcolato il totale:

1–2 ore → nessuno sconto

3–6 ore → 5%

7–12 ore → 10%

oltre 12 ore → 18%

5️⃣ Calcoli richiesti

Devi stampare:

tariffa oraria

costo base

supplemento

totale senza sconto

sconto applicato

totale finale

6️⃣ Riepilogo esempio
Veicolo: AUTO
Ore: 10
Tariffa oraria: 2.50€
Costo base: 25.00€
Supplemento: 4.00€
Totale senza sconto: 29.00€
Sconto applicato: 2.90€
Totale da pagare: 26.10€
7️⃣ Ripetizione

Alla fine chiedi:

Vuoi calcolare un altro parcheggio? (SI/NO)

Ripeti finché non scrive NO

🔧 Requisiti tecnici OBBLIGATORI

Devi usare:

Scanner

toUpperCase()

double

almeno 2 metodi:

Esempio:

static double getTariffaOraria(String veicolo)
static double getSupplemento(int ore)
 */
		
	Scanner scanner = new Scanner(System.in);
	
	boolean continua = true;
	
	while (continua) {
	
	System.out.println("Vuoi calcolare un parcheggio? (SI/NO)");
	String risposta = scanner.nextLine().toUpperCase();
	if (risposta.equals("NO")) {
		continua = false;
		System.out.println("Grazie per aver usato il nostro servizio!");
	}
	else if (risposta.equals("SI")) {
	
	System.out.println("quale veicolo vuoi parcheggiare? (AUTO/MOTO/FURGONE/CAMPER)");
	String veicolo = scanner.nextLine().toUpperCase();
	
	System.out.println("quante ore resterai parcheggiato?");
	int ore = scanner.nextInt();
	scanner.nextLine(); 
	
	final double parcheggioAuto = 2.50;
	final double parcheggioMoto = 1.20;
	final double parcheggioFurgone = 3.80;
	final double parcheggioCamper = 5.00;
	
	double tariffaOraria = 0.0;
	double costoBase = 0.0;
	double supplemento = 0.0;
	double totaleSenzaSconto = 0.0;
	double scontoApplicato = 0.0;
	double totaleFinale = 0.0;
	
	
	if (veicolo.equals("AUTO") || veicolo.equals("MOTO") || veicolo.equals("FURGONE") || veicolo.equals("CAMPER")) {
			switch (veicolo ) {
			case "AUTO":
				if ( ore <= 3) {
					supplemento = 1.00;
				}
				else if (ore >= 4 && ore <= 8) {
					supplemento = 2.50;
				}
				else if (ore > 8) {
					supplemento = 4.00;
				}
				tariffaOraria = parcheggioAuto;
				costoBase = tariffaOraria * ore;
				totaleSenzaSconto = costoBase + supplemento;
				
				if (ore >= 3 && ore <= 6) {
					scontoApplicato = totaleSenzaSconto * 0.05;
				}
				else if (ore >= 7 && ore <= 12) {
					scontoApplicato = totaleSenzaSconto * 0.10;
				}
				else if (ore > 12) {
					scontoApplicato = totaleSenzaSconto * 0.18;
				}
				totaleFinale = totaleSenzaSconto - scontoApplicato;
				System.out.println("Veicolo: " + veicolo);
				System.out.println("Ore: " + ore);
				System.out.println("Tariffa oraria: " + tariffaOraria + "€");
				System.out.println("Costo base: " + costoBase + "€");
				System.out.println("Supplemento: " + supplemento + "€");
				System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
				System.out.println("Sconto applicato: " + scontoApplicato + "€");
				System.out.println("Totale da pagare: " + totaleFinale + "€");
				
				break;
				
				case "MOTO":
					if ( ore <= 3) {
						supplemento = 1.00;
					}
					else if (ore >= 4 && ore <= 8) {
						supplemento = 2.50;
					}
					else if (ore > 8) {
						supplemento = 4.00;
					}
					tariffaOraria = parcheggioMoto;
					costoBase = tariffaOraria * ore;
					totaleSenzaSconto = costoBase + supplemento;
					
					if (ore >= 3 && ore <= 6) {
						scontoApplicato = totaleSenzaSconto * 0.05;
					}
					else if (ore >= 7 && ore <= 12) {
						scontoApplicato = totaleSenzaSconto * 0.10;
					}
					else if (ore > 12) {
						scontoApplicato = totaleSenzaSconto * 0.18;
					}
					totaleFinale = totaleSenzaSconto - scontoApplicato;
					System.out.println("Veicolo: " + veicolo);
					System.out.println("Ore: " + ore);
					System.out.println("Tariffa oraria: " + tariffaOraria + "€");
					System.out.println("Costo base: " + costoBase + "€");
					System.out.println("Supplemento: " + supplemento + "€");
					System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
					System.out.println("Sconto applicato: " + scontoApplicato + "€");
					System.out.println("Totale da pagare: " + totaleFinale + "€");
					break;
					
				case "FURGONE":
					if ( ore <= 3) {
						supplemento = 1.00;
					}
					else if (ore >= 4 && ore <= 8) {
						supplemento = 2.50;
					}
					else if (ore > 8) {
						supplemento = 4.00;
					}
					tariffaOraria = parcheggioFurgone;
					costoBase = tariffaOraria * ore;
					totaleSenzaSconto = costoBase + supplemento;
					
					if (ore >= 3 && ore <= 6) {
						scontoApplicato = totaleSenzaSconto * 0.05;
					}
					else if (ore >= 7 && ore <= 12) {
						scontoApplicato = totaleSenzaSconto * 0.10;
					}
					else if (ore > 12) {
						scontoApplicato = totaleSenzaSconto * 0.18;
					}
					totaleFinale = totaleSenzaSconto - scontoApplicato;
					System.out.println("Veicolo: " + veicolo);
					System.out.println("Ore: " + ore);
					System.out.println("Tariffa oraria: " + tariffaOraria + "€");
					System.out.println("Costo base: " + costoBase + "€");
					System.out.println("Supplemento: " + supplemento + "€");
					System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
					System.out.println("Sconto applicato: " + scontoApplicato + "€");
					System.out.println("Totale da pagare: " + totaleFinale + "€");
					break;
					
					case "CAMPER":
						if ( ore <= 3) {
							supplemento = 1.00;
						}
						else if (ore >= 4 && ore <= 8) {
							supplemento = 2.50;
						}
						else if (ore > 8) {
							supplemento = 4.00;
						}
						tariffaOraria = parcheggioCamper;
						costoBase = tariffaOraria * ore;
						totaleSenzaSconto = costoBase + supplemento;
						
						if (ore >= 3 && ore <= 6) {
							scontoApplicato = totaleSenzaSconto * 0.05;
						}
						else if (ore >= 7 && ore <= 12) {
							scontoApplicato = totaleSenzaSconto * 0.10;
						}
						else if (ore > 12) {
							scontoApplicato = totaleSenzaSconto * 0.18;
						}
						totaleFinale = totaleSenzaSconto - scontoApplicato;
						System.out.println("Veicolo: " + veicolo);
						System.out.println("Ore: " + ore);
						System.out.println("Tariffa oraria: " + tariffaOraria + "€");
						System.out.println("Costo base: " + costoBase + "€");
						System.out.println("Supplemento: " + supplemento + "€");
						System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
						System.out.println("Sconto applicato: " + scontoApplicato + "€");
						System.out.println("Totale da pagare: " + totaleFinale + "€");
						break;
						
						default:
							System.out.println("Errore: veicolo non ammesso");
							continua = false;
							break;
			}
		
			}
			else
			{
				System.out.println("Errore: veicolo non ammesso");
				continua = false;
			}
	}
	}
	
		}
	}	
		
	