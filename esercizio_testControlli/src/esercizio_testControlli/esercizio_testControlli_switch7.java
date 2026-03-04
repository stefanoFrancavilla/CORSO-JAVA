package esercizio_testControlli;

public class esercizio_testControlli_switch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ENUM + verifica boolean (come verificaPianeta)

📌 Esercizio:
Crea un enum:

enum Ruolo { ADMIN, UTENTE, OSPITE }


Crea una funzione:

public static boolean puòAccedere(Ruolo ruolo)


ADMIN e UTENTE → true

OSPITE → false

✅ Nel main fai almeno 3 test.
 */
		if (puòAccedere(Ruolo.ADMIN) == true)
		{
			System.out.println(Ruolo.ADMIN + " può accedere");
		}
		if (puòAccedere(Ruolo.UTENTE) == true)
		{
			System.out.println(Ruolo.UTENTE + " può accedere");
		}
		if (puòAccedere(Ruolo.OSPITE) == false)
		{
			System.out.println(Ruolo.OSPITE + " NON può accedere");
		}
	}

	public static boolean puòAccedere(Ruolo ruolo)
	{
		boolean puòAccedere = false;
		if(ruolo == ruolo.ADMIN || ruolo == ruolo.UTENTE)
		{
			puòAccedere = true;
		}
		else 
		puòAccedere = false;
		return puòAccedere;
	}
	
	/*
	 * public class TestRuolo {
    public static void main(String[] args) {
        if (puòAccedere(Ruolo.ADMIN)) {
            System.out.println(Ruolo.ADMIN + " può accedere");
        }
        if (puòAccedere(Ruolo.UTENTE)) {
            System.out.println(Ruolo.UTENTE + " può accedere");
        }
        if (!puòAccedere(Ruolo.OSPITE)) {
            System.out.println(Ruolo.OSPITE + " NON può accedere");
        }
    }

    public static boolean puòAccedere(Ruolo ruolo) {
        return ruolo == Ruolo.ADMIN || ruolo == Ruolo.UTENTE;
    }
}

voto 8/10
	 */
}
