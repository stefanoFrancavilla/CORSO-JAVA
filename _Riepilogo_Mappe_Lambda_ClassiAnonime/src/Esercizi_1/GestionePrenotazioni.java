package Esercizi_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

interface ValidatorePrenotazione {
    boolean valida(String prenotazione);
}

public class GestionePrenotazioni {

	public static void main(String[] args) {
		
		List<String> prenotazioni = new ArrayList<>();

		prenotazioni.add("Calcetto:Anna:18:30.00");
		prenotazioni.add("Tennis:Luca:10:25.00");
		prenotazioni.add("Calcetto:Marco:20:30.00");
		prenotazioni.add("Padel:Anna:16:35.00");
		prenotazioni.add("Tennis:Anna:12:25.00");
		prenotazioni.add("Calcetto:Luca:19:30.00");
		prenotazioni.add("Padel:Marco:18:35.00");
		prenotazioni.add("Calcetto:Anna:21:30.00");
		prenotazioni.add("Tennis:Marco:09:25.00");
		prenotazioni.add("Padel:Luca:20:35.00");
		prenotazioni.add("Calcetto:Anna:18:30.00");
		prenotazioni.add("Tennis:Luca:10:25.00");
	
		
		// validazione con classe anonima
		ValidatorePrenotazione filtro = new ValidatorePrenotazione()
				{
			@Override
			public boolean valida(String prenotazione)
			{
				if (prenotazione == null || prenotazione.isBlank())
				{
					return false;
				}
				else if (prenotazione.split(":").length != 4)
				{
					return false;
				}
				else
				{
					String campo = recuperaCampo(prenotazione);
					String utente = recuperaUtente(prenotazione);
					int ora = Integer.parseInt(recuperaOraDiInizio(prenotazione));
					double prezzo = Double.parseDouble(recuperaPrezzo(prenotazione));
					
					if( campo.isEmpty() || utente.isEmpty())
					{
						return false;
					}
					else if (ora < 0 || ora > 23)
					{
						return false;
					}
					else if (prezzo <= 0)
					{
						return false;
					}
					else
					{
						return true;
					}
				}
			}
				};
				
				
				List<String> prenotazioniValide = new ArrayList<>();
				
				for (String prenotazione : prenotazioni)
				{
					boolean validato = filtro.valida(prenotazione);
					if (validato)
					{
						prenotazioniValide.add(prenotazione);
					}
				}
				
				prenotazioniValide.forEach(n -> System.out.println(n));
				
			     System.out.println("----------------------------------");	
	// rimozione duplicati con set
				
		Set<String> prenotazioniUniche = new LinkedHashSet<>();
		
		for (String p : prenotazioniValide)
		{
			prenotazioniUniche.add(p);
		}
		
		prenotazioniUniche.forEach(n -> System.out.println(n));
		
	     System.out.println("----------------------------------");	
	     
	// prima introduzione a stream
	     
	     prenotazioniUniche.stream()
	     .forEach(n -> System.out.println(n));

	     System.out.println("----------------------------------");	
	     
	// stream con filter
	     
	  prenotazioniUniche.stream()
	  .filter(n -> n.startsWith("Calcetto"))
	  .forEach(n -> System.out.println(n));
	  System.out.println("----------------------------------");	
	  
	  // stream con map
	  
	  prenotazioniUniche.stream()
	  .filter(n -> n.startsWith("Padel"))
	  .map(n -> recuperaUtente(n))
	  .forEach(n -> System.out.println(n));
	  
	  System.out.println("----------------------------------");	
	  
	  // stream con sorted
	  
	  System.out.println("6. Prenotazioni ordinate per prezzo");
      prenotazioniUniche.stream()
          .sorted(
              Comparator.comparingDouble((String s) -> Double.parseDouble(recuperaPrezzo(s)))
                        .thenComparing(Comparator.naturalOrder())
          )
          .forEach(n -> System.out.println(n));
      System.out.println("----------------------------------");	
      
      // stream con distinct
      
      prenotazioniValide.stream()
      .distinct()
      .forEach(s -> System.out.println(s));
      System.out.println("----------------------------------");	
      
      
      // map con totale speso
      
      Map<String , Double> totalePerUtente = new LinkedHashMap<>();
      
      for (String prenotazione : prenotazioniUniche)
      {
    	  String utenteCorrente = recuperaUtente(prenotazione);
    	  double prezzoCorrente = Double.parseDouble(recuperaPrezzo(prenotazione));
    	  
    	  if (totalePerUtente.containsKey(utenteCorrente))
    	  {
    		  double prezzo = totalePerUtente.get(utenteCorrente) + prezzoCorrente;
    		  
    		  totalePerUtente.put(utenteCorrente, prezzo);
    	  }
    	  else
    	  {
    		  totalePerUtente.put(utenteCorrente, prezzoCorrente);
    	  }
      }
      
      System.out.println(totalePerUtente);
      System.out.println("----------------------------------");	
      //stream con collect e groupingBy
      Map<String, Double> totalePerUtenteStream = prenotazioniUniche.stream()
    	.collect(Collectors.groupingBy(
    			GestionePrenotazioni::recuperaUtente,
    			LinkedHashMap::new,
    			Collectors.summingDouble(s -> Double.parseDouble(recuperaPrezzo(s)))
    			));	  
      System.out.println(totalePerUtenteStream);
      System.out.println("----------------------------------");	
// Esercizio 10 — Riepilogo finale con StringBuilder e Stream
      
    
      Deque<String> ultimePrenotazioni = new ArrayDeque<>();
      for (String p : prenotazioniUniche) {
          ultimePrenotazioni.addLast(p);
      }

     
      ultimePrenotazioni.removeLast(); 

    
      StringBuilder sb = new StringBuilder("Prenotazioni costose: \n");

      ultimePrenotazioni.stream()
          .filter(p -> Double.parseDouble(recuperaPrezzo(p)) >= 30.00)
          .forEach(p -> sb.append(p).append("\n"));

    
      System.out.print(sb.toString());
      
	}
	
	public static String recuperaCampo(String prenotazione)
	{
		int primiDuePunti = prenotazione.indexOf(":");
		String campo = prenotazione.substring((0),primiDuePunti);
		return campo;
		
	}
	
	public static String recuperaUtente(String prenotazione)
	{
		int primiDuePunti = prenotazione.indexOf(":");
		int secondiDuePunti = prenotazione.indexOf(":", primiDuePunti + 1);
		String utente = prenotazione.substring(primiDuePunti + 1, secondiDuePunti);
		return utente;
	}

	public static String recuperaOraDiInizio(String prenotazione)
	{
		int primiDuePunti = prenotazione.indexOf(":");
		int secondiDuePunti = prenotazione.indexOf(":", primiDuePunti + 1);
		int terziDuePunti = prenotazione.indexOf(":" , secondiDuePunti + 1);
		String ora = prenotazione.substring(secondiDuePunti + 1, terziDuePunti);
		return ora;
	}
	
	public static String recuperaPrezzo(String prenotazione)
	{
		int primiDuePunti = prenotazione.indexOf(":");
		int secondiDuePunti = prenotazione.indexOf(":", primiDuePunti + 1);
		int terziDuePunti = prenotazione.indexOf(":" , secondiDuePunti + 1);
		String prezzo = prenotazione.substring(terziDuePunti +1 , prenotazione.length());
		return prezzo;
	}
}
