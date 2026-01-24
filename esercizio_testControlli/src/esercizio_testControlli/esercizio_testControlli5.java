package esercizio_testControlli;

import java.util.Scanner;

public class esercizio_testControlli5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ESERCIZIO: Gestore di Noleggio con Calcolo Totale e Sconti

Scrivi un programma Java che:

Chiede il mezzo di trasporto da noleggiare (come prima):

AUTO → 30€ al giorno

MOTO → 20€ al giorno

BICICLETTA → 10€ al giorno

MONOPATTINO → 8€ al giorno

Se il mezzo non è disponibile, stampa un messaggio di errore e termina il programma.

Se il mezzo è valido, chiede all’utente:

per quanti giorni vuole noleggiarlo (numero intero positivo)

In base al numero di giorni, applica degli sconti:

se i giorni sono da 1 a 3 → nessuno sconto

se i giorni sono da 4 a 7 → 5% di sconto sul totale

se i giorni sono più di 7 → 10% di sconto sul totale

Calcola:

il prezzo totale senza sconto

lo sconto applicato

il prezzo finale da pagare

Stampa un riepilogo tipo:

Mezzo scelto: AUTO
Giorni di noleggio: 5
Prezzo giornaliero: 30.0€
Totale senza sconto: 150.0€
Sconto applicato: 7.5€
Totale da pagare: 142.5€

Requisiti tecnici (quello che voglio che tu usi)

Usa Scanner per leggere i dati.

Crea almeno un metodo separato, ad esempio:

static double getPrezzoGiornaliero(String mezzo)
che restituisce il prezzo giornaliero in base al mezzo (usa switch).

Gestisci il confronto delle stringhe in modo da non essere sensibile a maiuscole/minuscole (es. toUpperCase()).

Usa i tipi double per importi in euro.

Sfida extra (facoltativa, se vuoi alzare ancora il livello)

Aggiungi anche:

Controllo: se l’utente inserisce un numero di giorni minore o uguale a 0, stampa un messaggio di errore.

Dopo aver stampato il riepilogo, chiedi:
Vuoi effettuare un altro noleggio? (SI/NO)
e ripeti il programma finché l’utente non scrive NO.
 */
		

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi noleggiare un mezzo? (si/no)");
        String sceltaNoleggio = scanner.nextLine();

        if (!sceltaNoleggio.equalsIgnoreCase("si")) {
            System.out.println("Uscita dal programma");
            scanner.close();
            return;
        }

        // Prezzi giornalieri
        final int prezzoAuto = 30;
        final int prezzoMoto = 20;
        final int prezzoBicicletta = 10;
        final int prezzoMonopattino = 8;

        // Totali accumulati
        double totaleSenzaSconto = 0;
        double scontoTotale = 0;
        double contoFinale = 0;
        String mezzoScelto = "";

        boolean run = true;

        while (run) {
            System.out.println();
            System.out.println("----------------menù------------");
            System.out.println("1. AUTO");
            System.out.println("2. MOTO");
            System.out.println("3. BICICLETTA");
            System.out.println("4. MONOPATTINO");
            System.out.println("5. CONTO TOTALE");
            System.out.println("6. EXIT");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {

                case 1: {
                    System.out.println("Inserisci il numero di giorni:");
                    int giorni = scanner.nextInt();
                    scanner.nextLine();

                    double base = giorni * prezzoAuto;
                    double sconto = calcolaSconto(base, giorni);

                    totaleSenzaSconto += base;
                    scontoTotale += sconto;
                    contoFinale += (base - sconto);

                    mezzoScelto += " AUTO,";
                    break;
                }

                case 2: {
                    System.out.println("Inserisci il numero di giorni:");
                    int giorni = scanner.nextInt();
                    scanner.nextLine();

                    double base = giorni * prezzoMoto;
                    double sconto = calcolaSconto(base, giorni);

                    totaleSenzaSconto += base;
                    scontoTotale += sconto;
                    contoFinale += (base - sconto);

                    mezzoScelto += " MOTO,";
                    break;
                }

                case 3: {
                    System.out.println("Inserisci il numero di giorni:");
                    int giorni = scanner.nextInt();
                    scanner.nextLine();

                    double base = giorni * prezzoBicicletta;
                    double sconto = calcolaSconto(base, giorni);

                    totaleSenzaSconto += base;
                    scontoTotale += sconto;
                    contoFinale += (base - sconto);

                    mezzoScelto += " BICICLETTA,";
                    break;
                }

                case 4: {
                    System.out.println("Inserisci il numero di giorni:");
                    int giorni = scanner.nextInt();
                    scanner.nextLine();

                    double base = giorni * prezzoMonopattino;
                    double sconto = calcolaSconto(base, giorni);

                    totaleSenzaSconto += base;
                    scontoTotale += sconto;
                    contoFinale += (base - sconto);

                    mezzoScelto += " MONOPATTINO,";
                    break;
                }

                case 5: {
                    System.out.println("Mezzi scelti:" + mezzoScelto);
                    System.out.println("Totale senza sconto: " + totaleSenzaSconto);
                    System.out.println("Sconto totale: " + scontoTotale);
                    System.out.println("Totale da pagare: " + contoFinale);
                    break; // IMPORTANTISSIMO
                }

                case 6: {
                    run = false;
                    System.out.println("Uscita dal programma");
                    break;
                }

                default: {
                    System.out.println("Scelta non valida");
                    break;
                }
            }
        }

        scanner.close();
    }

    public static double calcolaSconto(double base, int giorni) {
        if (giorni >= 4 && giorni <= 7) {
            return base * 0.05;
        } else if (giorni > 7) {
            return base * 0.10;
        }
        return 0.0;
  }
    /*
     * Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il mezzo da noleggiare (AUTO, MOTO, BICICLETTA, MONOPATTINO): ");
            String mezzo = scanner.nextLine().trim().toUpperCase();

            double prezzoGiornaliero = getPrezzoGiornaliero(mezzo);

            if (prezzoGiornaliero == -1) {
                System.out.println("Errore: mezzo non disponibile. Programma terminato.");
                break; // termina come richiesto dalla traccia
            }

            System.out.print("Per quanti giorni vuoi noleggiarlo? ");
            int giorni = scanner.nextInt();
            scanner.nextLine(); // consuma newline

            if (giorni <= 0) {
                System.out.println("Errore: il numero di giorni deve essere positivo.");
                continue; // riparte chiedendo un nuovo noleggio
            }

            double totaleSenzaSconto = prezzoGiornaliero * giorni;
            double sconto = calcolaSconto(totaleSenzaSconto, giorni);
            double totaleDaPagare = totaleSenzaSconto - sconto;

            System.out.println("\n--- RIEPILOGO NOLEGGIO ---");
            System.out.println("Mezzo scelto: " + mezzo);
            System.out.println("Giorni di noleggio: " + giorni);
            System.out.println("Prezzo giornaliero: " + prezzoGiornaliero + "€");
            System.out.println("Totale senza sconto: " + totaleSenzaSconto + "€");
            System.out.println("Sconto applicato: " + sconto + "€");
            System.out.println("Totale da pagare: " + totaleDaPagare + "€");

            System.out.print("\nVuoi effettuare un altro noleggio? (SI/NO): ");
            String risposta = scanner.nextLine().trim();

            if (risposta.equalsIgnoreCase("NO")) {
                continua = false;
            }
            System.out.println();
        }

        scanner.close();
        System.out.println("Fine programma.");
    }

    static double getPrezzoGiornaliero(String mezzo) {
        switch (mezzo) {
            case "AUTO":
                return 30.0;
            case "MOTO":
                return 20.0;
            case "BICICLETTA":
                return 10.0;
            case "MONOPATTINO":
                return 8.0;
            default:
                return -1; // mezzo non valido
        }
    }

    public static double calcolaSconto(double totale, int giorni) {
        if (giorni >= 4 && giorni <= 7) {
            return totale * 0.05;
        } else if (giorni > 7) {
            return totale * 0.10;
        }
        return 0.0;
    }
}
     */
	
}	

