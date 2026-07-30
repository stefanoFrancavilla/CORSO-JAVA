package HotelManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestioneScelte {

	private Scanner scanner;
	private Hotel hotel;
	private Stampa stampa;
	
	public GestioneScelte(Hotel hotel)
	{
		this.scanner = new Scanner(System.in);
		this.hotel = hotel;
		this.stampa = new Stampa();
	}

	public Hotel getHotel() {
		return hotel;
	}
	
	public Stampa getStampa() {
		return stampa;
	}

	public void avvia()
	{
		
		boolean run = true;
		
		while(run)
		{
		
		stampa.menuPrincipale();
		stampa.inserisciScelta();
		int scelta = scanner.nextInt();
		scanner.nextLine();
		
		switch(scelta)
		{
		case 1:
			boolean gestioneCamere= true;
			while(gestioneCamere)
			{
			int sceltaGestioneCamere;
			stampa.gestioneCamere();
			stampa.inserisciScelta();
			sceltaGestioneCamere = scanner.nextInt();
			scanner.nextLine();
			
			switch(sceltaGestioneCamere)
			{
			case 1:
				inserisciCameraDaInput();
				break;
				
			case 2:
				
				stampa.numeroCamera();
				int numero = scanner.nextInt();
				scanner.nextLine();
				
				hotel.eliminaCamera(numero);
				break;
				
			case 3:
				stampa.numeroCamera();
				int numero2 = scanner.nextInt();
				scanner.nextLine();
				hotel.cercaCamera(numero2);
				break;
			case 4:
				
				hotel.visualizzaCamere();
				break;
			case 5:
				
				gestioneCamere = false;
				break;
			default : 
				stampa.sceltaNonValida();
				
			}
			}
			
			break;
		case 2:
			boolean gestioneClienti = true;
			
			while(gestioneClienti)
			{
				int sceltaGestioneClienti;
				stampa.GestioneClienti();
				stampa.inserisciScelta();
				sceltaGestioneClienti = scanner.nextInt();
				scanner.nextLine();
				
				switch(sceltaGestioneClienti)
				{
				case 1:
					Cliente nuovoCliente;
					creaClienteDaInput();
					nuovoCliente = creaClienteDaInput();
					hotel.registraCliente(nuovoCliente);
					break;
					
				case 2:
					boolean cercaCliente = true;
					while ( cercaCliente)
					{
						stampa.cercaCliente();
						stampa.inserisciScelta();
						int sceltaCercaCliente =scanner.nextInt();
						scanner.nextLine();
						
						switch(sceltaCercaCliente)
						{
						case 1:
							stampa.inserisciId();
							String idDaTrovare = scanner.nextLine();
							hotel.cercaClientePerId(idDaTrovare);
							break;
							
						case 2:
							stampa.inserisciNome();
							String nomeDaTrovare = scanner.nextLine();
							hotel.cercaClientePerNome(nomeDaTrovare);
							break;
							
						case 3:
							cercaCliente = false;
							break;
							
						default:
							stampa.sceltaNonValida();
							break;
						}
					}
					break;
					
				case 3:
					hotel.stampaClienti();
					break;
					
				case 4:
					gestioneClienti = false;
					break;
					
				default:
					stampa.sceltaNonValida();
					break;
				}
			}
			
		case 3:
			boolean gestionePrenotazione = true;
			while(gestionePrenotazione)
			{
				
				stampa.gestionePrenotazioni();
				stampa.inserisciScelta();
				int sceltaGestionePrenotazione = scanner.nextInt();
				scanner.nextLine();
				
				switch(sceltaGestionePrenotazione)
				{
				case 1 :
					
				Prenotazione prenotazione =	creaPrenotazioneDaId();
				hotel.aggiungiPrenotazione(prenotazione);
				break;
				
				case 2 :
					stampa.inserisciCodice();
					String codice = scanner.nextLine();
					
					hotel.annullaPrenotazione(codice);
					break;
					
				case 3 :
					hotel.stampaPrenotazioni();
					break;
					
				case 4:
					
					gestionePrenotazione = false;
					break;
				default:
					stampa.sceltaNonValida();
					break;
					
				
				}
			}
			break;
			
		case 4:
			hotel.report();
			break;
			
		case 5:
			System.out.println("Uscita dal programma");
			run = false;
			break;
			
		default:
			
			stampa.sceltaNonValida();
			break;
		}
		
		
	}
	}
	
	 private void inserisciCameraDaInput() {
	        System.out.print("Numero camera: ");
	        int numero = scanner.nextInt();
	        scanner.nextLine();

	        if (hotel.cercaCamera(numero) != null) {
	            System.out.println("Camera già esistente.");
	            return;
	        }

	        System.out.print("Tipo camera (SINGOLA, DOPPIA, SUITE): ");
	        String tipoInput = scanner.nextLine().toUpperCase();

	        TipoCamera tipo = TipoCamera.valueOf(tipoInput);
	        Camera camera = new Camera(numero, tipo);

	        hotel.inserisciCamera(camera);
	        System.out.println("Camera inserita correttamente.");
	    }
	 
	 private Camera creaCameraDaInput()
	 {
		 Camera cameraCreata;
		 stampa.numeroCamera();
		 int numeroCamera = scanner.nextInt();
		 scanner.nextLine();	
		 
	        if (hotel.cercaCamera(numeroCamera) != null) {
	            System.out.println("Camera già esistente.");
	           
	        }

	        System.out.print("Tipo camera (SINGOLA, DOPPIA, SUITE): ");
	        String tipoInput = scanner.nextLine().toUpperCase();

	        TipoCamera tipo = TipoCamera.valueOf(tipoInput);
	        cameraCreata = new Camera(numeroCamera, tipo);
	        
	        return cameraCreata;
	 }
	
	 private Cliente creaClienteDaInput()
	 {
		 stampa.inserisciId();
		 String id = scanner.nextLine();
		 
		 stampa.inserisciNome();
		 String nome = scanner.nextLine();
		 
		 stampa.inserisciCognome();
		 String cognome = scanner.nextLine();
		 
		 stampa.inserisciEmail();
		 String email = scanner.nextLine();
		 
		 Cliente clientecreato = new Cliente(id, nome, cognome, email);
		 
		 return clientecreato;
	 }
	 
	 private Prenotazione creaPrenotazioneDaId ()
	 {
		 stampa.inserisciCodice();
		 String codice = scanner.nextLine();
		 
		 Cliente cliente = creaClienteDaInput();
		 Camera camera =creaCameraDaInput();
		 stampa.inserisciDataCheckIn();
		 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		 stampa.inserisciData();
		 String input = scanner.nextLine();

		 LocalDate datacheckIn = LocalDate.parse(input, formatter);
		 
		 stampa.inserisciDataCheckOut();
		 
		 DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		 stampa.inserisciData();
		 String input2 = scanner.nextLine();

		 LocalDate datacheckOut = LocalDate.parse(input2, formatter2);
		 
		 Prenotazione nuovaPrenotazione = new Prenotazione(codice, cliente, camera, datacheckIn, datacheckOut );
		 
		 return nuovaPrenotazione;
	 }
}
