package GestioneBiblioteca;

public class StampaGenerale {

	
	
	public void stampaMenuPrincipale()
	{
		System.out.println("---------menu principale--------");
		System.out.println("1) Accedi al menu utente");
		System.out.println("2) Accedi al menu della biblioteca");
		System.out.println("3) Esci");

	}
	
	public void stampaMenuUtente()
	{
		System.out.println("--------menu utente-----------");
		System.out.println("1) Cerca libro per titolo");
		System.out.println("2) Prendi in prestito un libro");
		System.out.println("3) Restituisci un libro");
		System.out.println("4) Stampa libri presi");
		System.out.println("5) Esci dal programma");
	}
	public void stampaBiblioteca()
	{
		System.out.println("--------menu della biblioteca-----------");
		System.out.println("1) Aggiungi libro alla biblioteca");
		System.out.println("2) Rimuovi libro dalla biblioteca");
		System.out.println("3) Cerca libro per titolo");
		System.out.println("4) Aggiungi utente alla biblioteca");
		System.out.println("5) Stampa libri biblioteca disponibili");
		System.out.println("6) Stampa lista utenti registrati");
		System.out.println("7) Esci dal programma");
	}
	public void scelta()
	{
		System.out.println("Inserisci la tua scelta");
	}
	
	public void sceltaNonValida()
	{
		System.out.println("Scelta non valida");
	}
	
	public void controlloUtenteRegistrato()
	{
		System.out.println("Sei registrato alla biblioteca?");
		System.out.println("1) Si, sono registrato");
		System.out.println("2) No, non sono registrato, vorrei registrarmi");
		System.out.println("3) Esci dal programma");
	}
	public void inserisciID()
	{
		System.out.println("Inserisci il tuo ID");
	}
	
	public void IdNonValido()
	{
		System.out.println("Id inserito non trovato");
	}
	public void uscitaDalProgramma()
	{
		System.out.println("Uscita dal programma");
	}
	public void inserisciTitolo()
	{
		System.out.println("Iserisci titolo");
	}
	public void IsDisponibile ()
	{
		System.out.println("Il libro è disponibile per un prestito");
	}
	public void notDisponibile ()
	{
		System.out.println("Il libro non è disponibile per un prestito");
	}
	public void presenteInBiblioteca ()
	{
		System.out.println("Il libro è presente in biblioteca");
	}
	
	public void notPresenteInBiblioteca ()
	{
		System.out.println("Il libro non è presente in biblioteca");
	}
	
	public void inserisciPassword()
	{
		System.out.println("Inserisci password");
	}
	public void passwordNonValida()
	{
		System.out.println("Password non valida");
	}
	public void creaLibro ()
	{
		System.out.println("Inserisci i parametri del libro da aggiungere alla biblioteca");
	}
	public void inserisciAutore ()
	{
		System.out.println("Inserisci autore");
	}
	
	public void inserisciIsbn ()
	{
		System.out.println("Inserisci isbn");
	}
	
	public void inserisciNome ()
	{
		System.out.println("Inserisci nome");
	}
	
	public void utenteRegistrato()
	{
		System.out.println("Utente registrato correttamente");
	}
	
}
