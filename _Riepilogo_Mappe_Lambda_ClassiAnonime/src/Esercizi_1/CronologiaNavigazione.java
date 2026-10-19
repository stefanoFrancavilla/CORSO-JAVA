package Esercizi_1;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CronologiaNavigazione {

	public static void main(String[] args) {
		
		Deque<String> cronologia = new LinkedList<>();
		
		
		cronologia.addLast("google.com");
		cronologia.addLast("perplexity.ai");
		cronologia.addLast("github.com");
		cronologia.addLast("stackoverflow.com");
		cronologia.addLast("openai.com");
		
		cronologia.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("----------------------------------");
		
		String ultimaPaginaVisitata = cronologia.getLast();
		cronologia.remove(ultimaPaginaVisitata);
		System.out.println();
		System.out.println("Tornato indietro da: " + ultimaPaginaVisitata);
		
		ultimaPaginaVisitata = cronologia.getLast();
		cronologia.remove(ultimaPaginaVisitata);
		System.out.println("Tornato indietro da: " + ultimaPaginaVisitata);
		System.out.println();
		System.out.println("----------------------------------");
		
		cronologia.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(paginaPiuRecente(cronologia));
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(contaPagine(cronologia));
		System.out.println();
		System.out.println("----------------------------------");
		
		cronologia.addFirst("perplexity.ai");
		
		cronologia.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(rimuoviDuplicati(cronologia));
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(riepilogoPagine(cronologia));
	}

	public static String paginaPiuRecente(Deque<String> cronologia)
	{
		String ultimaPagina = cronologia.getLast();
		return ultimaPagina;
	}
	
	public static Map<String, Integer> contaPagine(Deque<String> cronologia)
	{
		Map<String, Integer> conteggioPagine = new LinkedHashMap<>();
		
		for(String sito : cronologia)
		{
			if (conteggioPagine.containsKey(sito))
			{
				int count = conteggioPagine.get(sito) + 1;
				conteggioPagine.put(sito, count);
			}
			else
			{
				conteggioPagine.put(sito, 1);
			}
		}
		return conteggioPagine;
	}
	
	public static Deque<String> rimuoviDuplicati(Deque<String> cronologia)
	{
		Deque<String> cronologiaNoDuplicati = new LinkedList<>();
		Set<String> noDuplicati = new LinkedHashSet<>();
		for(String sito : cronologia)
		{
			noDuplicati.add(sito);
		}
		for(String sitoNoDuplicato : noDuplicati)
		{
			cronologiaNoDuplicati.add(sitoNoDuplicato);
		}
		return cronologiaNoDuplicati;
	}
	
	public static String riepilogoPagine(Deque<String> cronologia) 
	{
		StringBuilder riepilogo = new StringBuilder("Pagine visitate: ");
		Set<String> riepilogoSiti = new LinkedHashSet<>();
		for(String sito : cronologia)
		{
			riepilogoSiti.add(sito);
		}
		int count = 0;
		for(String sito : riepilogoSiti)
		{
			count++;
			if (count == riepilogoSiti.size())
			{
				riepilogo.append(" ").append(sito);
			}
			else
			{
				riepilogo.append(" ").append(sito).append(",");
			}
		}
		String riepilogoFinale = riepilogo.toString();
		return riepilogoFinale;
		
	}
 }
