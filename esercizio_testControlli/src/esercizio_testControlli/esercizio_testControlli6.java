package esercizio_testControlli;

public class esercizio_testControlli6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ✅ ESERCIZIO: Gestore Noleggio con Supplementi e Sconto

Scrivi un programma Java che gestisce il noleggio di un mezzo.

1) Scelta del mezzo

Il programma chiede all’utente di inserire il mezzo da noleggiare tra:

FURGONE → 45€ al giorno

SCOOTER → 18€ al giorno

E-BIKE → 15€ al giorno

SKATE → 6€ al giorno

✅ Se il mezzo inserito non è valido, stampa:
Errore: mezzo non disponibile
e termina il programma.

2) Numero di giorni

Se il mezzo è valido, chiedi:

Quanti giorni vuoi noleggiarlo? (intero positivo)

✅ Se l’utente inserisce 0 o un numero negativo, stampa:
Errore: giorni non validi
e fai ripartire la richiesta del noleggio (non deve crashare).

3) Supplemento fisso per assicurazione

Ogni noleggio ha un costo extra di assicurazione:

Se giorni da 1 a 5 → +5€ totale

Se giorni più di 5 → +10€ totale

4) Sconto sul totale

Dopo aver calcolato il totale (prezzo base + assicurazione), applica uno sconto:

1–2 giorni → nessuno sconto

3–6 giorni → 7% di sconto

più di 6 giorni → 12% di sconto

5) Calcoli richiesti

Devi calcolare e stampare:

prezzo giornaliero

costo base (prezzo * giorni)

costo assicurazione

totale senza sconto

sconto applicato

totale finale da pagare

6) Riepilogo finale

Il programma stampa un riepilogo così:

Mezzo scelto: E-BIKE
Giorni: 7
Prezzo giornaliero: 15.0€
Costo base: 105.0€
Assicurazione: 10.0€
Totale senza sconto: 115.0€
Sconto applicato: 13.8€
Totale da pagare: 101.2€

✅ Requisiti tecnici (OBBLIGATORI)

✅ Usa Scanner
✅ Usa almeno 2 metodi, ad esempio:

static double getPrezzoGiornaliero(String mezzo)

static double getAssicurazione(int giorni)


✅ Usa toUpperCase() per non avere problemi con maiuscole/minuscole
✅ Usa double per i prezzi
✅ Dopo il riepilogo chiedi:

Vuoi effettuare un altro noleggio? (SI/NO)

e ripeti finché l’utente non scrive NO.

⭐ Extra (facoltativa)

Se il totale finale supera 200€, applica anche un ulteriore sconto di 5€ fisso.
		 */
	}

}
