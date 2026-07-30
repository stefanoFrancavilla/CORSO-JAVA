package HotelManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

	//variabili di istanza
	private List<Cliente> clienti;
	private List<Camera> camere;
	private List <Prenotazione> prenotazioni;
	
	//costruttore
	public Hotel() {
		
		this.clienti = new ArrayList<>();
		this.camere = new ArrayList<>();
		this.prenotazioni = new ArrayList<>();
	}

	
	//metodi getter setter
	public List<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(List<Cliente> cliente) {
		this.clienti = clienti;
	}

	public List<Camera> getCamere() {
		return camere;
	}

	public void setCamere(List<Camera> camere) {
		this.camere = camere;
	}

	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazione(List<Prenotazione> prenotazione) {
		this.prenotazioni = prenotazioni;
	}

	//metodi
	
	@Override
	public String toString() {
		return "Hotel \n"
				+ "clienti = " + clienti + ", \n"
						+ " camere = " + camere + ", \n"
								+ " prenotazione = " + prenotazioni + ".";
	}
	
	//metodi cliente --------------------------------------------------------
	
	
	
	public void registraCliente(Cliente cliente) {
	    for (Cliente c : clienti) {
	        if (c.getEmail().equalsIgnoreCase(cliente.getEmail()) || c.getId().equals(cliente.getId())) {
	            System.out.println("Cliente già presente nel sistema.");
	            return;
	        }
	    }
	    clienti.add(cliente);
	    System.out.println("Cliente registrato con successo!");
	}
	
	public void eliminiaCliente (String id)
	{
		if (cercaClientePerId(id) != null)
		{
			clienti.remove(cercaClientePerId(id));
		}
	}
	
	public Cliente cercaClientePerNome(String nome) {
	    for (Cliente c : clienti) {
	        if (c.getId().equals(nome)) {
	            return c; // Ritorna subito il cliente trovato!
	        }
	    }
	    return null;
	}
	
	public Cliente cercaClientePerId(String id) {
	    for (Cliente c : clienti) {
	        if (c.getId().equals(id)) {
	            return c; 
	        }
	    }
	    return null;
	}
		

	public void stampaClienti()
	{
		for(Cliente cliente : clienti)
		{
			System.out.println(cliente.toString());
		}
	}
	
	//metodi camere --------------------------------------------------------
	
	public void inserisciCamera ( Camera camera)
	{
	
		for(Camera cameraCorrente : camere)
		{
			if (cameraCorrente.getNumero() == camera.getNumero())
			{
				System.out.println("il numero della camera è esistente");
				return;
			}
		}
		camere.add(camera);
		System.out.println("Camera inseerita con successo");
	}
	
	public void eliminaCamera ( int numero)
	{
		if (cercaCamera(numero) != null)
		{
			camere.remove(cercaCamera(numero));
		}
	}
	
	public Camera cercaCamera ( int numero)
	{
		Camera camera = null;
		for (Camera cameraProvvisoria : camere)
		{
			if (cameraProvvisoria.getNumero() == numero)
				camera = cameraProvvisoria;
		}
		
		return camera;
	}
	
	public void visualizzaCamere()
	{
		for(Camera camera : camere)
		{
			System.out.println(camera.toString());
		}
	}
	
	//metodi Prenotazioni --------------------------------------------------------
	
	
	public boolean confermaPrenotazione (Prenotazione prenotazioneDaConfermare) 
	{
		boolean conferma = true;
			
		
		for(Camera camera : camere)
		{
			if(camera.getTipoCamera() == prenotazioneDaConfermare.getCamera().getTipoCamera())
			{
				
				for(Prenotazione prenotazione : prenotazioni)
				{
					if(prenotazioneDaConfermare.getCodice().equals(prenotazione.getCodice()))
					{
						System.out.println("Il codice della prenotazione è già presente");
						conferma = false;
					}
					else
					{
						
					
					if(prenotazioneDaConfermare.getCheckIn().isBefore(prenotazione.getCheckOut()) 
							&& prenotazioneDaConfermare.getCheckOut().isAfter(prenotazione.getCheckIn()) )
					{
						System.out.println("I giorni sono già occupati");
						conferma =  false;
					}
					else
					{
						conferma = true;
					}
					}
				}	
			}
			
			else 
			{
				conferma = false;
			}
		
		}
		
		return conferma;
		
	}
	
	public void aggiungiPrenotazione ( Prenotazione prenotazione)
	{
		if(confermaPrenotazione(prenotazione))
		{
			prenotazione.setStatoPrenotazione(StatoPrenotazione.CONFERMATA);
			prenotazione.getCamera().setDisponibile(false);
			prenotazioni.add(prenotazione);
			System.out.println("Prenotazione aggiunta");
		}
		else 
		{
			System.out.println("Prenotazione non aggiunta");
		}
	}
	
	public Prenotazione cercaPrenotazione ( String codice)
	{
		Prenotazione prenotazione = null;
		
		for (Prenotazione prenotazioneCorrente : prenotazioni )
		{
			if(prenotazioneCorrente.getCodice().equals(codice))
			{
				prenotazione = prenotazioneCorrente;
			}
			else
			{
				System.out.println("Prenotazione non trovata");
			}
		}
		return prenotazione;
	}
	
	public void annullaPrenotazione (String codice)
	{
		Prenotazione prenotazione = cercaPrenotazione(codice);
		if (prenotazione != null)
		{
			prenotazione.setStatoPrenotazione(StatoPrenotazione.ANNULLATA);
			prenotazioni.remove(prenotazione);
		}
	}
	
	public void stampaPrenotazioni()
	{
		for ( Prenotazione prenotazione : prenotazioni)
		{
			System.out.println(prenotazione.toString());
		}
	}
	
	public boolean controlloPrenotazioneCompletata (Prenotazione prenotazione)
	{
		boolean completata = false;
		LocalDate oggi = LocalDate.now();
		
			if ((prenotazione.getCheckOut() == oggi) || prenotazione.getCheckOut().isBefore(oggi))
			{
				completata = true;
				System.out.println("La prenotazione scade oggi");
				
			}
		
		return completata;
	}
	
	public void aggiornaStatoPrenotazione (Prenotazione prenotazione)
	{
		if(controlloPrenotazioneCompletata(prenotazione))
		{
			prenotazione.setStatoPrenotazione(StatoPrenotazione.COMPLETATA);
			
			for(Camera camera : camere)
			{
				if(prenotazione.getCamera() == camera)
				{
					camera.setDisponibile(true);
				}
			}
		}
		
	}
	
	//metodi per report -------------------------------------------------------------
	public int numeroDiCamere ()
	{
		int numeroCamere = camere.size();
		return numeroCamere;
	}
	
	public List<Camera> camereDisponibili()
	{
		List<Camera> camereDisponibili = new ArrayList<>();
		for (Camera camera : camere)
		{
			if (camera.isDisponibile())
			{
				camereDisponibili.add(camera);
			}
		}
		
		return camereDisponibili;
	}
	
	public List<Camera> camereOccupate()
	{
		List<Camera> camereOccupate = new ArrayList<>();
		for (Camera camera : camere)
		{
			if (!camera.isDisponibile())
			{
				camereOccupate.add(camera);
			}
		}
		
		return camereOccupate;
	}
	
	public int numeroClienti ()
	{
		int numeroClienti = clienti.size();
		return numeroClienti;
	}
	
	public int numeroPrenotazioni ()
	{
		int numeroPrenotazioni = prenotazioni.size();
		return numeroPrenotazioni;
	}
	
	public List<Prenotazione> prenotazioniConfermate()
	{
		List<Prenotazione> prenotazioniConfermate = new ArrayList<>();
		
			for (Prenotazione prenotazione : prenotazioni)
			{
				if (prenotazione.getStatoPrenotazione() == StatoPrenotazione.CONFERMATA)
				{
					prenotazioniConfermate.add(prenotazione);
				}
			}
			
			return prenotazioniConfermate;
		
	}
	
	public void report()
	{
		System.out.println("Numero di camere dell'hotel è : " + numeroDiCamere());
		System.out.println("---------------------------------------");
		System.out.println("le camere disponibili dell'hotel sono: \n" + camereDisponibili().toString());
		System.out.println("---------------------------------------");
		System.out.println("le camere occupoate dell'hotel sono: \n" + camereOccupate().toString());
		System.out.println("---------------------------------------");
		System.out.println("Numero di clienti dell'hotel è : " + numeroClienti());
		System.out.println("---------------------------------------");
		System.out.println("Numero di prenotazioni dell'hotel è : " + numeroPrenotazioni());
		System.out.println("---------------------------------------");
		System.out.println("le prenotazioni confermate dell'hotel sono: \n" + prenotazioniConfermate().toString());
		System.out.println("---------------------------------------");
		
	}
	
}
