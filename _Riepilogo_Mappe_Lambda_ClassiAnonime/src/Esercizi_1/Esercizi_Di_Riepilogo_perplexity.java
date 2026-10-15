package Esercizi_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Esercizi_Di_Riepilogo_perplexity {
	
	interface ValidatoreUsername {
	    boolean accetta(String username);
	}
	
	interface FiltroNumero {
	    boolean accetta(int numero);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> parole = List.of("cane", "gatto", "cane", "cane", "topo");
		System.out.println(contaParole(parole));
		 System.out.println("----------------------------------");
		 
		 String testo = "Java è divertente";
		 System.out.println(contaVocali(testo));
		 System.out.println("----------------------------------");

		 ValidatoreUsername filtro = new ValidatoreUsername() 
				 {
			 @Override
			 public boolean accetta(String username)
			 {
				 return username != null &&
						 (username.length() >= 5 && username.length() <= 12) &&
						 (!username.contains(" "));
			 }
				 };
				 
				 
				 System.out.println(filtro.accetta("stefano"));
				 System.out.println(filtro.accetta("abc"));
				 System.out.println(filtro.accetta("username troppo lungo"));
				 System.out.println(filtro.accetta("stefano 1"));
				 System.out.println("----------------------------------");
		  
				 
				 FiltroNumero filtroNumeri = new FiltroNumero() {
					 
					 public boolean accetta(int numero)
					 {
						 return numero > 0 &&
								 numero % 2== 0 &&
								 numero < 100;
					 }
				 };
				 
				 System.out.println(filtroNumeri.accetta(2));
				 System.out.println(filtroNumeri.accetta(101));
				 System.out.println(filtroNumeri.accetta(-4));
				 System.out.println(filtroNumeri.accetta(7));
				 System.out.println(filtroNumeri.accetta(98));
			
				 System.out.println("----------------------------------");
				 
				 
				 List<String> animali = new ArrayList<>(
						    List.of("cane", "gatto", "cavallo", "topo", "coniglio")
						);
				 
				animali.forEach(a -> System.out.println(a));
				System.out.println("----------------------------------");
				
				animali.removeIf(n -> n.length() <= 5);
				System.out.println(animali);
				System.out.println("----------------------------------");
				
				
				animali.replaceAll(n -> n.toUpperCase());
				System.out.println(animali);
				System.out.println("----------------------------------");
				
				
				
				List<String> frutti = new ArrayList<>(
					    List.of("mela", "banana", "kiwi", "arancia", "pera")
					);	

				frutti.sort((a, b) -> Integer.compare(a.length(), b.length()) );
				System.out.println(frutti);
				System.out.println("----------------------------------");
				
				List<Integer> prezzi = new ArrayList<>(
					    List.of(10, 45, 7, 99, 120, 33, 60)
					);
				
				prezzi.removeIf(p -> (p <= 10) || (p > 100));
				System.out.println(prezzi);
				System.out.println("----------------------------------");
				
				prezzi.replaceAll(p -> p * 2);
				prezzi.sort((a, b) -> Integer.compare(b, a));
				System.out.println(prezzi);
				System.out.println("----------------------------------");
				
				
				List<Integer> numeri = List.of(1, 2, 2, 3, 3, 3, 4);
				
				System.out.println(contaFrequenze(numeri));
				
	}
	// Esercizio 1
	public static Map<String, Integer> contaParole(List<String> parole)
	{
		Map<String, Integer> mappaParole = new HashMap<>();
		
		for (int i = 0; i < parole.size(); i++)
		{
			if (mappaParole.containsKey(parole.get(i)))
			{
				int count = mappaParole.get(parole.get(i));
				count++;
				mappaParole.put(parole.get(i), count);
			}
			else	
			{
				mappaParole.put(parole.get(i), 1);
			}
		}
		return mappaParole;
	}
	
	
	// Esercizio 2
	public static Map<Character, Integer> contaVocali(String testo)
	{
		Map<Character, Integer> conteggioVocali = new HashMap();
		
		if (testo == null || testo.isBlank())
		{
			return null;
		}
		else
		{
			testo = testo.toLowerCase();
			
			for (int i = 0; i < testo.length(); i++)
			{
			   char c = testo.charAt(i);
			   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			   {
				   char vocale = c;
				   
				   if (conteggioVocali.containsKey(vocale))
				   {
					   int count = conteggioVocali.get(vocale);
					   count++;
					   conteggioVocali.put(vocale, count);
				   }
				   else
				   {
					   conteggioVocali.put(vocale, 1);
				   }
			   }
			}
			
			return conteggioVocali;
		}
		
	}
	
	
	// Esercizio 10
	
	public static Map<Integer, Integer> contaFrequenze(List<Integer> numeri)
	{
		Map<Integer, Integer> mappaFrequenza = new HashMap();
		
		for (Integer numero : numeri)
		{
			if (mappaFrequenza.containsKey(numero))
			{
				int count = mappaFrequenza.get(numero);
				count++;
				mappaFrequenza.put(numero, count);
			}
			else
			{
				mappaFrequenza.put(numero, 1);
			}
		}
		
		return mappaFrequenza;
	}
	
}

