package HotelManagementSystem;

public class Stampa {

	public void menuPrincipale()
	{
		System.out.println("1) Gestione camere");
		System.out.println("2) Gestione clienti");
		System.out.println("3) GestionePrenotazioni");
		System.out.println("4) Report");
		System.out.println("5) Esci");
	}
	
	public void gestioneCamere ()
	{
		System.out.println("1) Inserisci camera");
		System.out.println("2) Elimina Camera");
		System.out.println("3) Cerca camera");
		System.out.println("4) Visualizza camera");
		System.out.println("5) Torna indietro");
	}
	
	public void GestioneClienti()
	{
		
		System.out.println("1) Registra cliente");
		System.out.println("2) Cerca cliente");
		System.out.println("3) Visualizza cliente");
		System.out.println("4) Torna indietro");
	}
	
	public void gestionePrenotazioni ()
	{
		System.out.println("1) Aggiungi prenotazione");
		System.out.println("2) Annulla prenotazione");
		System.out.println("3) Visualizza prenotazioni");
		System.out.println("4) Torna indietro");
	}
	
	public void cercaCliente ()
	{
		System.out.println("1) Cerca cliente per id");
		System.out.println("2) Cerca cliente per nome");
		System.out.println("3) Torna indietro");
	}
	
	public void inserisciScelta()
	{
		System.out.println("Inserisci la tua scelta");
	}
	
	public void numeroCamera() 
	{
		System.out.println("Inserisci il numero della camera");
	}
	
	public void sceltaNonValida()
	{
		System.out.println("Scelta non valida");
	}
	public void inserisciNome() 
	{
		System.out.println("Inserisci nome del cliente");
	}
	
	public void inserisciCognome() 
	{
		System.out.println("Inserisci cognome del cliente");
	}
	
	public void inserisciId() 
	{
		System.out.println("Inserisci id del cliente");
	}
	
	public void inserisciEmail() 
	{
		System.out.println("Inserisci Email del cliente");
	}
	
	public void inserisciCodice()
	{
		System.out.println("Inserisci codice identificativo della prenotazione");
	}
	public void inserisciDataCheckIn()
	{
		System.out.println("Inserisci data checkIn");
	}
	
	public void inserisciDataCheckOut()
	{
		System.out.println("Inserisci data checkOut");
	}
	
	public void inserisciData()
	{
		System.out.print("Inserisci la data (dd/MM/yyyy): ");
	}
}
