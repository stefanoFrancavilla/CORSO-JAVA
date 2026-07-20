package rubrica_Contatti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RubricaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		List<Contatto> listaContatti = new ArrayList<>();
		Rubrica rubrica = new Rubrica(listaContatti);
		
		while(run)
		{
			System.out.println(" -------- menu app ---------- ");
			System.out.println(" 1) Crea contatto / Aggiuingi contatto a rubrica");
			System.out.println(" 2) Rimuovi contatto da rubrica");
			System.out.println(" 3) Cerca contatto per nome ");
			System.out.println(" 4) Stampa rubrica ");
			System.out.println(" 5) Esci dall'app");
			
			try
			{
				int scelta = scanner.nextInt();
						scanner.nextLine();
			
			
			switch (scelta)
			{
			case 1:
			System.out.println("inserisci nome del contatto");
			String nomeContatto = scanner.nextLine();
			
			System.out.println("inserisci il telefono del contatto");
			String numeroTelefono = scanner.nextLine();
			
			
			System.out.println("Inserisci email del contatto");
			String emailContatto = scanner.nextLine();
			
			Contatto contatto1 = creaContatto(nomeContatto, numeroTelefono, emailContatto);
			
			System.out.println("Contatto creato");
			
			System.out.println("Vuoi aggiungerlo in rubrica? Y/N");
			String scelta1= scanner.nextLine();
			
			if (scelta1.equalsIgnoreCase("Y"))
			{
			   rubrica.aggiungiContatto(contatto1);
			   break;
			}
			else
			{
				break;
			}
			
			
			case 2:
				
				System.out.println("Inserisci il telefono del contatto che intendi eliminare");
				
				String telefonoContattoDaEliminare = scanner.nextLine();
				
				rubrica.rimuoviContatto(telefonoContattoDaEliminare);
				
				break;
				
			case 3:
				
				
			
			
			System.out.println(" Inserisci il nome del contatto da cercare ");
			
			String nomeDaCercare = scanner.nextLine();
			
			rubrica.cercaPerNome(nomeDaCercare);
		
			break;
			
			case 4:
				
				if(rubrica.getLista().isEmpty() == true)
				{
					System.out.println("La lista è vuota");
				}
				else
				{
					stampaTutti(rubrica.getLista());
				}
				break;
				
			case 5:
				
				run = false;
				System.out.println("Uscita dal programma");
				break;
				
			default:
				System.out.println("Selezione non valida");
			    break;
			}
			}
			catch(Exception e)
			{
				System.out.println("Errore nella digitazione della scelta");
			}
			finally 
			{
				System.out.println("Fine controllo");
			}
		}
		
		scanner.close();
	}
	
	//metodi
	
	public static Contatto creaContatto(String nome, String telefono, String email)
	{
		Contatto nuovoContatto = new Contatto(nome, telefono, email);
		
		return  nuovoContatto;
	}
	
	public static void stampaTutti(List<Contatto> lista)
	 {
		 for (Contatto contatto:lista)
		 {
			 System.out.println(contatto.toString());
		 }
	 }

}
