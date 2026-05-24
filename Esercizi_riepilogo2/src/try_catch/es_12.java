package try_catch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class es_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> videoteca = new ArrayList<>();
		videoteca.add("MATRIX");
		videoteca.add("INCEPTION");
		videoteca.add("AVATAR");
		videoteca.add("INTERSTELLAR");
		videoteca.add("IL PADRINO");
		
		ArrayList<String> filmDisponibili = new ArrayList<>();
		filmDisponibili.add("MATRIX");
		filmDisponibili.add("INCEPTION");
		filmDisponibili.add("AVATAR");
		filmDisponibili.add("INTERSTELLAR");
		filmDisponibili.add("IL PADRINO");
		
		ArrayList<String> storico = new ArrayList<>();
		
		boolean run = true;
		
		while (run)
		{
		
			System.out.println("----------Menu----------");
			System.out.println("1. film disponibili");
			System.out.println("2. noleggio film");
			System.out.println("3. restituzione film");
			System.out.println("4. storico operazioni");
			System.out.println("5. uscita");
			System.out.println("6. cerca film per titolo");
			
			int scelta = controlloScelta(scanner);
			
			switch ( scelta)
			{
			case 1 :
				mostraFilmDisponibili(filmDisponibili);
				break;
				
			case 2:
				System.out.println("	Inserisci il titolo del film da noleggiare");
				String filmDaNoleggiare = scanner.nextLine();
				
				filmDaNoleggiare = filmDaNoleggiare.toUpperCase();
				if(noleggio(filmDisponibili,filmDaNoleggiare) == true)
				{
					 filmDisponibili.remove(filmDaNoleggiare);
					 storico.add("	Noleggio film: " + filmDaNoleggiare);
				}
				else
				{
					System.out.println("	Film non disponibile");
				}
				break;
				
			case 3:
				System.out.println("	Inserisci il titolo del film da noleggiare");
				String filmDaRestituire = scanner.nextLine();
				
				filmDaRestituire = filmDaRestituire.toUpperCase();
			
				if(restituzione(filmDisponibili , filmDaRestituire) == true)
				{
					filmDisponibili.add(filmDaRestituire);
					storico.add("	restituzione film: " + filmDaRestituire);
				}
				else 
				{
					System.out.println("	Film non disponibile");
				}
				break;
				
			case 4:
				mostraStorico(storico);
				break;
				
			case 5:
				run = false;
				break;
				
			case 6:
				System.out.println("	Inserisci il titolo del film da cercare");
				String titolo = scanner.nextLine();
				cercaFilm(filmDisponibili, videoteca, titolo);
				break;
				
			}
			
		}
		System.out.println("Fine programma...");
		scanner.close();
	}
	public static int controlloScelta ( Scanner sc)
	{
		int numero = 0;
		boolean valido = false;
		
		while (!valido) {
		try
		  {
			System.out.println("	Inserisci il numero corrispondente alla scelta");
              numero = sc.nextInt();
              sc.nextLine();

              if (numero <= 0 || numero > 6)
      		{
      			System.out.println("	Il numero deve corrispondere alla scelta");
      		}
              else 
              {
            	  valido = true;
              }
              
              

          }
		catch (InputMismatchException e) 
		  {

              System.out.println("	Errore: devi inserire solo numeri");
              sc.nextLine(); 
          }
		}
      return numero;
		}
	
	
	public static void mostraFilmDisponibili (ArrayList<String> films)
	{
		System.out.println("----------Film Disponibili----------");
		if (films.isEmpty())
		{
			System.out.println("	Non ci sono film disponibili");
		}
		else
		{
			for(String film : films)
			{
				System.out.println(film);
			}
		}
	}
	
	public static void mostraStorico (ArrayList<String> operazioni)
	{
		System.out.println("----------Storico Operazioni----------");
		if (operazioni.isEmpty())
		{
			System.out.println("	Non ci sono operazioni");
		}
		else
		{
			for(String operazione : operazioni)
			{
				System.out.println(operazione);
			}
		}
	}
	
	public static void cercaFilm(ArrayList<String> film, ArrayList<String> lista, String ricerca)
	{
		ricerca = ricerca.toUpperCase();
		
		if(lista.contains(ricerca))
		{
			System.out.println("	Il film è presente nella videoteca");
			
			if(film.contains(ricerca))
			{
				System.out.println("	 è disponibile per un noleggio");
			}
			else 
			{
				System.out.println("	 è stato già noleggiato");
			}
		}
		else
		{
			System.out.println("	Questo film non è presente nella nostra videoteca");
		}
		
	}
	
	public static boolean noleggio ( ArrayList<String> film, String ricerca)
	{
	   
		if(film.contains(ricerca))
		{
			System.out.println("	Noleggio avvenuto con successo");
			return true;
		}
		else
		{
			System.out.println("	Noleggio fallito");
			return false;
		}
	}
	
	public static boolean restituzione (ArrayList<String> film, String ricerca )
	{
		if(film.contains(ricerca))
		{
			System.out.println("	Restituzione falita, il film non appartiene a questa videoteca");
			return false;
		}
		else
		{
			System.out.println("	Restituzione avvenuta con successo");
			return true;
		}
	}

}
