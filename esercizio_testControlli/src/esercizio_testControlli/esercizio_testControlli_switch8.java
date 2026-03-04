package esercizio_testControlli;

public class esercizio_testControlli_switch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8) Funzione che usa un boolean per creare un messaggio

📌 Esercizio:
Scrivi:

public static String messaggioAccesso(Ruolo ruolo)


Che usa puòAccedere(ruolo) e ritorna:

"Accesso consentito" se true

"Accesso negato" se false

✅ Stessa logica del tuo ottieniMessaggioPerTipoDiPianeta.
 */
        Ruolo ruolo1 = Ruolo.UTENTE;
        System.out.println(messaggioAccesso(ruolo1));
    }

    public static boolean puòAccedere(Ruolo ruolo) {
        return ruolo == Ruolo.ADMIN || ruolo == Ruolo.UTENTE;
    }

    public static String messaggioAccesso(Ruolo ruolo) {
        if (puòAccedere(ruolo)) {
            return "Accesso consentito";
        } else {
            return "Accesso negato";
        }
    }
}