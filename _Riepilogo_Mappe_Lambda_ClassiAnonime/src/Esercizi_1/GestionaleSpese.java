package Esercizi_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionaleSpese {

	interface ValidatoreSpesa {
	    boolean accetta(String spesa);
	}
	
	public static void main(String[] args) {
		
		
		ValidatoreSpesa validatore = new ValidatoreSpesa()
				{
			@Override
			public boolean accetta (String spesa)
			{
				if (spesa == null || spesa.isBlank())
				{
					return false;
				}
				else if (!spesa.contains(":"))
				{
					return false;
				}
				else
				{
					String[] spesaSeparata = separaSpesa(spesa);
					if (spesaSeparata[0].isBlank())
					{
						return false;
					}
					else if (recuperaImporto(spesaSeparata) <= 0)
					{
						return false;
					}
						
					return true;	
				}	
			}
				};
				
				
				List<String> spese = new ArrayList<>(List.of(
					    "Affitto:1200.50",
					    "Spesa:85.30",
					    "Benzina:60",
					    "Svago:-20",
					    "Internet:49.90",
					    ":30",
					    "Ristorante:75.20",
					    "Benzina:45.80"
					));	
				
				spese.removeIf(n -> (!validatore.accetta(n)));
				spese.forEach(n -> System.out.println(n));
				
				System.out.println();
				System.out.println("----------------------------------");
				
				List<Double> importi = new ArrayList<>();
				
				for(String spesa : spese)
				{
					double importo = recuperaImporto(separaSpesa(spesa));
					importi.add(importo);
				}
				
				importi.forEach(n -> System.out.println(n));
				
				System.out.println();
				System.out.println("----------------------------------");
				
				importi.sort((a, b) -> Double.compare(b, a));
				importi.forEach(n -> System.out.println(n));
				
				System.out.println();
				System.out.println("----------------------------------");
				
				System.out.println(totalePerCategoria(spese));
				
				System.out.println();
				System.out.println("----------------------------------");
				
				System.out.println(totaleComplessivo(spese));
	}
	
	public static String[] separaSpesa(String spesa)
	{
		int primiDuePunti = spesa.indexOf(":");
		String categoria =spesa.substring(0, primiDuePunti);
		String importo = spesa.substring(primiDuePunti +1, spesa.length());
		String[] spesaSeparata = {categoria, importo};
		return spesaSeparata;
	}
	
	public static double recuperaImporto(String[] datiSpesa)
	{
		String importo = datiSpesa[1];
		double importoNumerico = Double.parseDouble(importo);
		return importoNumerico;
	}

	public static Map<String, Integer> contaCategorie(List<String> spese)
	{
		Map<String, Integer> conteggioCategorie = new HashMap<>();
		
		for(String spesa : spese)
		{
			String categoria = separaSpesa(spesa)[0];
			
			if (conteggioCategorie.containsKey(categoria))
			{
				int count = conteggioCategorie.get(categoria) + 1;
				conteggioCategorie.put(categoria, count);
			}
			else
			{
				conteggioCategorie.put(categoria, 1);
			}
		}
		return conteggioCategorie;
	}
	
	public static Map<String, Double> totalePerCategoria(List<String> spese)
	{
		Map<String, Double> importoTotalePerCategoria = new HashMap<>();
		
		for (String spesa : spese)
		{
			String categoria = separaSpesa(spesa)[0];
			double importoCorrente = recuperaImporto(separaSpesa(spesa));
			
			if (importoTotalePerCategoria.containsKey(categoria))
			{
				double importoCategoria = importoTotalePerCategoria.get(categoria);
				importoCategoria += importoCorrente;
				importoTotalePerCategoria.put(categoria, importoCategoria);
			}
			else
			{
				importoTotalePerCategoria.put(categoria, importoCorrente);
			}
		}
		return importoTotalePerCategoria;
	}
	
	public static double totaleComplessivo(List<String> spese)
	{
		double totale = 0;
		for (String spesa : spese)
		{
			double importoCorrente = recuperaImporto(separaSpesa(spesa));
			totale += importoCorrente;
		}
		return totale;
	
	}
}
