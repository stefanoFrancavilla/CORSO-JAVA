package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestoreFilm {

	private List<Film> film = new ArrayList<>();

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
	
	public void aggiungiFilm(Film filmDaAggiungere) {
        if (filmDaAggiungere == null || filmDaAggiungere.getTitolo() == null) {
            System.out.println("Errore: il film o il suo titolo non possono essere null");
            return;
        }

        for (Film filmCorrente : film) {
            if (filmCorrente.getTitolo() != null && 
                filmCorrente.getTitolo().equalsIgnoreCase(filmDaAggiungere.getTitolo())) {
                System.out.println("Il film è già presente nella lista");
                return;
            }
        }

        film.add(filmDaAggiungere);
        System.out.println("Film aggiunto correttamente");
      
    }
	
	
	
	public Film cercaFilm( String titolo)
	{
		
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else
		{
			Film filmDaCercare = null;
			for(Film filmCorrente : film)
			{
				if(filmCorrente.getTitolo().equals(titolo))
				{
					filmDaCercare = filmCorrente;
					return  filmDaCercare;
				}
			}
			return filmDaCercare;
		}
		
	}
	
	public void segnaComeFilmVisto(String titolo)
	{
		Film filmDaTrovare = cercaFilm(titolo);
		
		if(filmDaTrovare != null)
		{
			filmDaTrovare.segnaComeVisto();
		}
	}
	
	public int calcolaDurataTotale()
	{
		int durata = 0;
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			return durata ;
		}
		else
		{
			for (Film filmCorrente : film)
			{
				durata += filmCorrente.getDurata();
			}
			
		}
		return durata;
	}
	
	public Film trovaFilmPiuLungo()
	{
		Film filmPiuLungo = null;
		int durataFilm = 0;
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			return filmPiuLungo;
		}
		else
		{
			for(Film filmCorrente : film)
			{
				if(filmCorrente.getDurata() > durataFilm)
				{
					filmPiuLungo = filmCorrente;
					durataFilm = filmCorrente.getDurata();
				}
			}
			
		}
		return filmPiuLungo;
	}
	
	public Film trovaFilmPiuCorto()
	{
	
		
		
		
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else
		{
			int durataFilm = film.get(0).getDurata();
			Film filmPiuCorto = film.get(0);
			if (film.size() == 1)
			{
				return filmPiuCorto;
			}
			else
			{
				for(int i = 1;i < film.size();i++)
				{
					Film filmCorrente = film.get(i);
					int durataCorrente = film.get(i).getDurata();
					
					if(durataCorrente < durataFilm)
					{
						filmPiuCorto = filmCorrente;
						durataFilm = durataCorrente;
					}
				}
				
			}
			return filmPiuCorto;
		}
		
	}
	
	public int contaFilmVisti()
	{
		
		
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			return 0;
		}
		else
		{
			int counter = 0;
			for( Film filmCorrente : film)
			{
				if(filmCorrente.isVisto() == true)
				{
					counter ++;
				}
			}
			return counter;
			
		}
		
	}
	
	public void stampaFilm()
	{
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			
		}
		else
		{
			System.out.println("-------------Lista film--------------");
			for (Film filmCorrente : film)
			{
				System.out.println(filmCorrente.toString());
			}
			System.out.println("--------------------------------------");
		}
	}
	
	public void stampaFilmVisti()
	{
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			
		}
		else
		{
			System.out.println("--------------Lista film visti---------------");
			ArrayList<Film> filmVisti = new ArrayList<>();
			for (Film filmCorrente : film)
			{
				if (filmCorrente.isVisto() == true)
				{
					filmVisti.add(filmCorrente);
				}
			}
			if(filmVisti.isEmpty())
			{
				System.out.println("Tutti i film sono già visti");
			}
			else
			{
				for(Film filmDaStampare : filmVisti)
				{
					System.out.println(filmDaStampare.toString());
				}
			}
			
			System.out.println("---------------------------------------");
		}
	}
	
	
	public void stampaFilmNonVisti()
	{
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			
		}
		else
		{
			System.out.println("--------------Lista film non visti---------------");
			ArrayList<Film> filmNonVisti = new ArrayList<>();
			for (Film filmCorrente : film)
			{
				if (filmCorrente.isVisto() == false)
				{
					filmNonVisti.add(filmCorrente);
				}
			}
			if(filmNonVisti.isEmpty())
			{
				System.out.println("Tutti i film sono ancora da vedere");
			}
			else
			{
				for(Film filmDaStampare : filmNonVisti)
				{
					System.out.println(filmDaStampare.toString());
				}
			}
			
			System.out.println("---------------------------------------");
		}
	}
	
	public void stampaFilmDiRegista(String regista)
	{
		if(film == null || film.isEmpty())
		{
			System.out.println("La lista è vuota");
			
		}
		else
		{
			System.out.println("--------------Lista film per regista---------------");
			ArrayList<Film> listaFilmRegista = new ArrayList<>();
			
			for (Film filmCorrente : film)
			{
				if(filmCorrente.getRegista().equals(regista))
				{
					listaFilmRegista.add(filmCorrente);
				}
			}
			
			if (listaFilmRegista.isEmpty())
			{
				System.out.println("Non ci sono film per questo regista");
			}
			else
			{
				for (Film filmCorrente : listaFilmRegista)
				{
					System.out.println(filmCorrente.toString());
				}
			}
			
			System.out.println("---------------------------------------");
		}
	}
	
	
	

	
}
