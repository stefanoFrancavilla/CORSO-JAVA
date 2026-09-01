package Argomento_6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorePlaylist {

	private Map<String, List<Integer>> playlist = new HashMap<>();
	
	
	
	public Map<String, List<Integer>> getPlaylist() {
		return playlist;
	}

	public void aggiungiDurate(String nomePlaylist, int durata) {
		
		playlist.putIfAbsent(nomePlaylist, new ArrayList());
		playlist.get(nomePlaylist).add(durata);
	}
	
	public int durataTotale ( String nomePlaylist)
	{
		
		List<Integer> secondi = playlist.get(nomePlaylist);
		if(secondi == null || secondi.isEmpty())
		{
			return 0;
		}
		
		int somma = 0;
		for (int durataSingola  : secondi)
		{
			somma += durataSingola;
		}
		
		return somma;
	}
	
	public Double durataMedia(String nomePlaylist)
	{
		List<Integer> secondi = playlist.get(nomePlaylist);
		
		Double somma = 0.0;
		for(int durataSingola : secondi)
		{
			somma += durataSingola;
		}
		
		return somma / secondi.size();
	}
	
	public void stampaPlaylist()
	{
		for(String nome : playlist.keySet())
		{
			List<Integer> durataSingola = playlist.get(nome);
			
			Double media = durataMedia(nome);
			
			int durataTotale = durataTotale(nome);
			
			System.out.println("Nome della playlist: " + nome);
			System.out.println("Media in secondi della playlist: " + media);
			System.out.println("Durata totale dlla playslit: " + durataTotale);
			System.out.println("-----------------------------");
			
		}
	}
	
	public String playlistPiuLunga ()
	{
	
		int durataCorrente = 0;
		String nomeCorrente = "";
		
		for (String nome : playlist.keySet())
		{
			if (durataTotale(nome) > durataCorrente)
			{
			  durataCorrente = durataTotale(nome);
			  nomeCorrente = nome;
			}
		}
		
		return nomeCorrente;
	}
	
	public void stampaPlaylistSopraDurata(int durata)
	{
	
		
		for (String nome : playlist.keySet())
		{
			if(durataTotale(nome) > durata)
			{
				System.out.println("nome della playlist che supera il limite di durata è: " + nome);
			}
		}
	}
	
	public boolean esistePlaylist(String nomePlaylist)
	{
		if (playlist.containsKey(nomePlaylist))
		{
			return true;
		}
		return false;
	}
}
