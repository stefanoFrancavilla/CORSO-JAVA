package Esercizi_1;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CronologiaAcquisti {

	public interface ValidatoreAcquisto {
	    boolean valida(String acquisto);
	}
	
	public static void main(String[] args) {
	
	ValidatoreAcquisto validatore = new ValidatoreAcquisto()
			{
		
		public boolean valida(String acquisto)
		{
			if ( acquisto == null || acquisto.isBlank())
			{
				return false;
			}
			else if( acquisto.split(":").length != 3)
			{
				return false;
			}
			else
			{
				String prodotto = recuperaProdotto(acquisto);
				String utente = recuperaUtente(acquisto);
				double prezzo;

				try {
				    prezzo = recuperaPrezzo(acquisto);
				} catch (NumberFormatException e) {
				    return false;
				}

				if (prodotto.isEmpty() || utente.isEmpty() || prezzo <= 0) {
				    return false;
				}

				return true;
			}
		}
			};
			
			
			
			Deque<String> acquisti = new LinkedList<>();

			aggiungiAcquisto(acquisti, "Mouse:Anna:25.50", validatore);
			aggiungiAcquisto(acquisti, "Tastiera:Luca:45.00", validatore);
			aggiungiAcquisto(acquisti, "Mouse:Anna:25.50", validatore);
			aggiungiAcquisto(acquisti, "Monitor:Luca:180.00", validatore);
			aggiungiAcquisto(acquisti, "Cuffie:Marco:60.00", validatore);

			aggiungiAcquistoPrioritario(acquisti, "Cavo HDMI:Anna:12.00", validatore);

			aggiungiAcquisto(acquisti, "Mouse", validatore);
			aggiungiAcquisto(acquisti, "Mouse:Anna:-5.00", validatore);
			aggiungiAcquisto(acquisti, "Mouse:Anna:abc", validatore);
			aggiungiAcquisto(acquisti, "", validatore);
			aggiungiAcquisto(acquisti, null, validatore);

			System.out.println(annullaUltimoAcquisto(acquisti));

			System.out.println(totaleSpesoPerUtente(acquisti));
			System.out.println(numeroAcquistiPerProdotto(acquisti));
			System.out.println(riepilogoUtenti(acquisti));

			acquisti.forEach(acquisto -> System.out.println(acquisto));
			

		
	}

	//------------------------------------------------------------------------------------
	public static String recuperaProdotto(String acquisto)
	{
		int primiDuePunti = acquisto.indexOf(":");
		String prodotto = acquisto.substring(0, primiDuePunti);
		return prodotto;
	}
	
	public static String recuperaUtente(String acquisto)
	{
		int primiDuePunti = acquisto.indexOf(":");
		int secondiDuePunti = acquisto.indexOf(":", primiDuePunti +1);
		String utente = acquisto.substring(primiDuePunti + 1, secondiDuePunti);
		return utente;
	}
	
	public static double recuperaPrezzo(String acquisto)
	{
		int primiDuePunti = acquisto.indexOf(":");
		int secondiDuePunti = acquisto.indexOf(":", primiDuePunti +1);
		String prezzoString = acquisto.substring(secondiDuePunti +1, acquisto.length());
		double prezzo = Double.parseDouble(prezzoString);
		return prezzo;
	}
	//------------------------------------------------------------------------------------
	
	
	public static boolean aggiungiAcquisto(Deque<String> acquisti, String acquisto, ValidatoreAcquisto validatore)
	{
		if (!validatore.valida(acquisto))
		{
			return false;
		}
		else
		{
			acquisti.addLast(acquisto);
			return true;
		}
	}
	
	public static boolean aggiungiAcquistoPrioritario(Deque<String> acquisti, String acquisto, ValidatoreAcquisto validatore)
	{
		if (!validatore.valida(acquisto))
		{
			return false;
		}
		else
		{
			acquisti.addFirst(acquisto);
			return true;
		}
	}
	
	public static String annullaUltimoAcquisto(Deque<String> acquisti)
	{
		if (acquisti.isEmpty())
		{
			return "Nessun acquisto da annullare";
		}
		else
		{
			String ultimoAcquisto = acquisti.getLast();
			acquisti.removeLast();
			return ultimoAcquisto;
		}
	}
	
	public static Map<String, Double> totaleSpesoPerUtente(Deque<String> acquisti)
	{
		Map<String, Double> spesePerUtente = new LinkedHashMap<>();
		
		for(String acquisto : acquisti)
		{
			String utenteCorrente = recuperaUtente(acquisto);
			double prezzoCorrente = recuperaPrezzo(acquisto);
			
			if (spesePerUtente.containsKey(utenteCorrente))
			{
				double prezzo = spesePerUtente.get(utenteCorrente) + prezzoCorrente;
				spesePerUtente.put(utenteCorrente, prezzo);	
			}
			else
			{
				spesePerUtente.put(utenteCorrente, prezzoCorrente);
			}
		}
		return spesePerUtente;
	}
	
	public static Map<String, Integer> numeroAcquistiPerProdotto(Deque<String> acquisti)
	{
		Map<String, Integer> numeroAcquisti = new LinkedHashMap<>();
		
		for(String acquisto : acquisti)
		{
			String prodottoCorrente = recuperaProdotto(acquisto);
			
			if (numeroAcquisti.containsKey(prodottoCorrente))
			{
				int conteggioAcquisti = numeroAcquisti.get(prodottoCorrente) + 1;
				numeroAcquisti.put(prodottoCorrente, conteggioAcquisti);
			}
			else
			{
				numeroAcquisti.put(prodottoCorrente, 1);
			}
		}
		return numeroAcquisti;
	}
	
	public static String riepilogoUtenti(Deque<String> acquisti)
	{
		StringBuilder riepilogo = new StringBuilder();
	
		Set<String> noDuplicati = new LinkedHashSet<>();
			
		Map<String, Double> spesePerUtente =  totaleSpesoPerUtente(acquisti);
		for(String acquisto : acquisti)
		{
			noDuplicati.add(recuperaUtente(acquisto));
		}
		
		for (String nome : noDuplicati)
		{
			if (spesePerUtente.containsKey(nome))
			{
				double prezzoCorrente = spesePerUtente.get(nome);
				riepilogo.append(nome).append(" ha speso ").append(prezzoCorrente).append(" euro").append("\n");
			}
		}
		return riepilogo.toString();
		
	}
}
