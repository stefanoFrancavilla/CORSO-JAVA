package Argomento_5;

public class Esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3 (Difficile) — Pattern Repository & Service (Simulazione Backend)
Crea un'interfaccia UtenteRepository con due metodi:

void salva(String email, String password);

boolean esistePerEmail(String email);

Crea una classe concreta UtenteRepositoryImpl che implementa UtenteRepository 
(puoi usare un array o un semplice array di appoggio / logica di controllo).

Crea una classe di servizio AuthService che riceve via costruttore un'interfaccia UtenteRepository 
(questo si chiama Dependency Injection tramite interfaccia):

Aggiungi un metodo public void registraUtente(String email, String password).

Se l'email esiste già, stampa "Errore: email già registrata!".

Se non esiste, chiama salva sul repository e stampa "Registrazione completata per: " + email.

Nel main, configura il repository, passalo al service e tenta registrazioni valide e duplicate.
		 */
		
		UtenteRepository utenteRepository = new UtenteRepositoryImpl();
		
		AuthService authService = new AuthService(utenteRepository);
		
		authService.registraUtente("romeo@gmail", "P01");
		authService.registraUtente("aldo@gmail", "P02");
		authService.registraUtente("marco@gmail", "P03");
		
		authService.registraUtente("romeo@gmail", "P01");

	}

}
