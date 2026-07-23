package GestioneBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		List<Libro> libriBiblioteca = new ArrayList<>();
		List<Utente> utentiBiblioteca = new ArrayList<>();
		
		List<Libro> libriUtente1 = new ArrayList<>();
		List<Libro> libriUtente2 = new ArrayList<>();
		List<Libro> libriUtente3 = new ArrayList<>();
		
		Libro libro1 = new Libro("Non mentire", "Freida", "8795642", true);
		Libro libro2 =new Libro("Il cuore", "Lucas", "9453672", true);
		Libro libro3 =new Libro("La luna di agosto", "Pedro", "9635642", true);
		Libro libro4 =new Libro("La vita", "Michael", "2585642", true);
		Libro libro5 =new Libro("Non sbagliare", "Susan", "725369841", true);
		
		Utente utente1 = new Utente("Mario", "q123", libriUtente1);
		Utente utente2 = new Utente("Sara", "p456", libriUtente2);
		Utente utente3 = new Utente("Dora", "e789", libriUtente3);
		
		Gestore gestore = new Gestore("Paolo", "Palla123");
		
		Biblioteca biblioteca = new Biblioteca();
		StampaGenerale stampa = new StampaGenerale();
		biblioteca.aggiungiLibro(libro1);
		biblioteca.aggiungiLibro(libro2);
		biblioteca.aggiungiLibro(libro3);
		biblioteca.aggiungiLibro(libro4);
		biblioteca.aggiungiLibro(libro5);
		
		biblioteca.aggiungiUtente(utente1);
		biblioteca.aggiungiUtente(utente2);
		biblioteca.aggiungiUtente(utente3);
		
		try {
			boolean run = true;
			
			
			while (run)
			{
				stampa.stampaMenuPrincipale();
				stampa.scelta();
				
				int scelta = scanner.nextInt();
				scanner.nextLine();
				
				if (scelta == 1)
				{
	//----------------------------------------------------------------------------------------------------
					stampa.controlloUtenteRegistrato();
					
					int sceltaControllo = scanner.nextInt();
							scanner.nextLine();
	//---------------------------------------------------------
					if(sceltaControllo == 1)
					{
						
						boolean inserisciID = true;
						
			while(inserisciID)
						{
						stampa.inserisciID();
						String Id = scanner.nextLine();
	//----------------------------------------
						if(biblioteca.accediMenuUtente(Id) )
						{
							Utente utenteAutorizzato = biblioteca.controlloUtenteTramiteId(Id);
							boolean menuUtente = true;
							
			while(menuUtente)
							{
								
							
							stampa.stampaMenuUtente();
							
							int sceltaMenuUtente = scanner.nextInt();
							scanner.nextLine();
							
							switch (sceltaMenuUtente)
							{
			case 1:
				               
								stampa.inserisciTitolo();
								
								String titolo = scanner.nextLine();
							
								if (biblioteca.cercaLibroPerTitolo(titolo) != null)
								{
									stampa.presenteInBiblioteca();
									
									if(biblioteca.cercaLibroPerTitolo(titolo).isDisponibile())
									{
										stampa.IsDisponibile();
									}
									else
									{
										stampa.notDisponibile();
									}
								}
								else
								{
									stampa.notPresenteInBiblioteca();
									
								}
								break;
								
			case 2:
								
							biblioteca.stampaLibri();
							System.out.println();
							stampa.inserisciTitolo();
							
							String titoloLibro = scanner.nextLine(); 
							Libro libroDaPrendere = biblioteca.cercaLibroPerTitolo(titoloLibro);

							if(libroDaPrendere != null)
							{
							    biblioteca.prestaLibro(libroDaPrendere.getIsbn(), utenteAutorizzato.getId());
							}
							else
							{
							    stampa.notPresenteInBiblioteca();
							}
							break;
							
			case 3:
				
				           utenteAutorizzato.stampaLibriPresi();
				           System.out.println();
							stampa.inserisciTitolo();
							String titoloLibroDaRestituire = scanner.nextLine();
							utenteAutorizzato.stampaLibriPresi();
							System.out.println();

							stampa.inserisciIsbn();

							String isbn = scanner.nextLine();

							Libro libro = biblioteca.cercaLibroPerIsbn(isbn);

							if(libro != null)
							{
							    biblioteca.restituisciLibro(isbn,
							            utenteAutorizzato.getId());
							}
							else
							{
							    stampa.notPresenteInBiblioteca();
							}
							
							break;
							
			case 4:
				
				           utenteAutorizzato.stampaLibriPresi();
				           break;
				           
			case 5:
				           run = false;
				           break;
				           
		    default:
		    	           stampa.uscitaDalProgramma();
				           
							}
							}
							
						}
						else
						{
						    stampa.IdNonValido();
						}
					
						}
					}
	//--------------------------------------------------------------------------------
					else if(sceltaControllo == 2)
					{
						stampa.inserisciNome();
						 String nomeUtente = scanner.nextLine();
						 stampa.inserisciID();
						 String idUtente = scanner.nextLine();
						 
						 List<Libro> listaUtenteCreato = new ArrayList<>();
						 Utente utenteCreato = creaUtente (nomeUtente, idUtente, listaUtenteCreato);
						 biblioteca.aggiungiUtente(utenteCreato);
						 stampa.utenteRegistrato();
						 
						 continue;
					}
					
					else if (sceltaControllo == 3)
					{
						run = false;
						stampa.uscitaDalProgramma();
					}
				}
	//-------------------------------------------------------------------------------------
					
					else if(scelta == 2)
					{
						boolean inserisciPassword = true;
	
						while (inserisciPassword)
						{
						stampa.inserisciPassword();
						String password = scanner.nextLine();
	//----------------------------------------------------------------------------
						if(gestore.controlloPassword(password))
						{
							boolean menuBiblioteca = true;
							
							while(menuBiblioteca)
							{
								
							
							stampa.stampaBiblioteca();
							
							System.out.println("----------------------------------");
							stampa.scelta();
							
						    int sceltaMenuBiblioteca = scanner.nextInt();
						    		scanner.nextLine();
						    		
						 switch (sceltaMenuBiblioteca )   
						 {
						 
				 case 1:
							 stampa.creaLibro();
							 stampa.inserisciTitolo();
							 
							 String titoloDaAggiungere = scanner.nextLine();
							 stampa.inserisciAutore();
							 
							 String autoreDaAggiungere =  scanner.nextLine();
							 stampa.inserisciIsbn();
							 
							 String isbnDaAggiungere = scanner.nextLine();
							 
							Libro libroCreato =  creaLibro(titoloDaAggiungere, autoreDaAggiungere, isbnDaAggiungere, true );
							 biblioteca.aggiungiLibro(libroCreato);
							 break;
							 
				 case 2:
					 
					         stampa.inserisciTitolo();
					         String titoloDaRimuovere = scanner.nextLine();
					         
					         biblioteca.rimuoviLibro(titoloDaRimuovere);
					         break;
					         
				 case 3:	         
					 
					 stampa.inserisciTitolo();
						
						String titolo = scanner.nextLine();
					
						if (biblioteca.cercaLibroPerTitolo(titolo) != null)
						{
							stampa.presenteInBiblioteca();
							
							if(biblioteca.cercaLibroPerTitolo(titolo).isDisponibile())
							{
								stampa.IsDisponibile();
							}
							else
							{
								stampa.notDisponibile();
							}
						}
						else
						{
							stampa.notPresenteInBiblioteca();
							
						}
						break;
						
				 case 4:
					 
					 stampa.inserisciNome();
					 String nomeUtente = scanner.nextLine();
					 stampa.inserisciID();
					 String idUtente = scanner.nextLine();
					 
					 List<Libro> listaUtenteCreato = new ArrayList<>();
					 Utente utenteCreato = creaUtente (nomeUtente, idUtente, listaUtenteCreato);
					 biblioteca.aggiungiUtente(utenteCreato);
					 break;
					 
				 case 5:
					 biblioteca.stampaLibri();
					 break;
					 
				 case 6:
					 biblioteca.stampaUtenti();
					 break;
					 
				 case 7:
				 
					    stampa.uscitaDalProgramma();
					    menuBiblioteca = false;
					    run = false;
					    break;
				default:
					stampa.sceltaNonValida();
					break;
					
						 }
							}
							
						}
						else
						{
						    stampa.passwordNonValida();
						}
						
						}
						
					}
					
					
				
				
				else if (scelta == 3)
				{
					stampa.uscitaDalProgramma();
					run = false;
				}
				else
				{
					stampa.sceltaNonValida();
				}
				
				
			}
			
			
			
			
			
			
		
		
		}
		catch(Exception e)
		{
			System.out.println("Errore: " + e.getMessage());
		}
	
		scanner.close();
	}
	public static Libro creaLibro(String titolo, String autore, String isbn, boolean disponibile)
	{
		Libro libroCreato =
		        new Libro(titolo, autore, isbn, disponibile);
		
		 return libroCreato;
	}
	
	public static Utente creaUtente(String nome ,String id, List<Libro> lista)
	{
		Utente utenteCreato = new Utente(nome, id, lista);
				return utenteCreato;
	}

}
