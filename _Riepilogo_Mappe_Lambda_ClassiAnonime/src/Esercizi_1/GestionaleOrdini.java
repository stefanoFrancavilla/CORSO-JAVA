package Esercizi_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionaleOrdini {

	interface ValidatoreOrdine {
	    boolean accetta(String ordine);
	}
	
	
	
	public static void main(String[] args) {
	
		ValidatoreOrdine valida = new ValidatoreOrdine() {
		
		@Override
		public boolean accetta(String ordine)
		{
			if (ordine == null || ordine.isEmpty())
			{
				return false;
			}
			else if (!ordine.contains(":"))
			{
				return false;
			}
			else
			{
			   String prodotto = recuperaProdotto(ordine);
			   int quantita = recuperaQuantita(ordine);
			   double prezzo = recuperaPrezzo(ordine);
			   
			   if (prodotto.isEmpty())
			   {
				   return false;
			   }
			   else if (quantita <= 0)
			   {
				   return false;
			   }
			   else if ( prezzo <= 0)
			   {
				   return false;
			   }
			   else 
			   {
				   if (separaOrdine(ordine).length != 3)
				   {
					   return false;
				   }
				   return true;
			   }
			}
		}
		};
		
		
		List<String> ordini = new ArrayList<>(List.of(
			    "Mouse:3:25.50",
			    "Tastiera:2:45.00",
			    "Monitor:1:199.99",
			    "Cavo:0:10.00",
			    "SSD:2:89.90",
			    "Mouse:1:25.50"
			));
		
		ordini.removeIf(n -> !valida.accetta(n));
		ordini.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		List<Double> totali = new ArrayList<>();
		for (String ordine : ordini)
		{
			double prezzo = calcolaTotale(separaOrdine(ordine));
			totali.add(prezzo);	
		}
		
		totali.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		totali.sort((a, b) -> Double.compare(b, a));
		totali.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		Map<String, Integer> contoDeiProdotti = contaProdotti(ordini);
		System.out.println(contoDeiProdotti);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(totaleComplessivo(ordini));
		
	}
	
	//------------------------------------------------------------------------------------
	// ho voluto implementarle per esrcizio personale
	
	public static String recuperaProdotto(String ordine)
	{
			int primiDuePunti = ordine.indexOf(":");
			String prodotto = ordine.substring(0, primiDuePunti);
			return prodotto;
	}
	public static int recuperaQuantita(String ordine) {
	    int primiDuePunti = ordine.indexOf(":");
	    int secondiDuePunti = ordine.indexOf(":", primiDuePunti + 1);
	    
	    String quantita = ordine.substring(primiDuePunti + 1, secondiDuePunti);
	    return Integer.parseInt(quantita);
	}
	public static double recuperaPrezzo(String ordine)
	{
		int primiDuePunti = ordine.indexOf(":");
	    int secondiDuePunti = ordine.indexOf(":", primiDuePunti +1);
	    String stringaPrezzo = ordine.substring(secondiDuePunti +1, ordine.length());
	    double prezzo = Double.parseDouble(stringaPrezzo);
	    return prezzo;
	}
	
	//------------------------------------------------------------------------------------
	
	public static String[] separaOrdine(String ordine)
	{
		String primaStringa = "";
		String secondaStringa ="";
		String terzaStringa = "";
		
		int primiDuePunti = ordine.indexOf(":");
		primaStringa = ordine.substring(0, primiDuePunti);
		
		int secondiDuePunti = ordine.indexOf(":", primiDuePunti +1);
		secondaStringa = ordine.substring(primiDuePunti +1, secondiDuePunti);
		terzaStringa = ordine.substring(secondiDuePunti +1, ordine.length());
		
		String[] elementi = {primaStringa, secondaStringa, terzaStringa};
		return elementi;
		
	}
	
	public static double calcolaTotale(String[] datiOrdine)
	{
		double prezzoTotale = 0;
		 String quantita = datiOrdine[1];
		 String prezzo = datiOrdine[2];
		 
		 int numeroQuantita = Integer.parseInt(quantita);
		 double numeroPrezzo = Double.parseDouble(prezzo);
		 prezzoTotale = numeroQuantita * numeroPrezzo;
		 return prezzoTotale;
	}
	
	public static Map<String, Integer> contaProdotti(List<String> ordini)
	{
		Map<String, Integer> conteggioProdotti = new HashMap<>();
		for (String ordine : ordini)
		{
			String prodotto = recuperaProdotto(ordine);
			if (conteggioProdotti.containsKey(prodotto))
			{
				int count = conteggioProdotti.get(prodotto) + 1;
				conteggioProdotti.put(prodotto, count);
			}
			else
			{
				conteggioProdotti.put(prodotto, 1);
			}
		}
		return conteggioProdotti;
	}
	
	public static double totaleComplessivo(List<String> ordini)
	{
		double totale = 0;
		for(String ordine : ordini)
		{
			double prezzoCorrente = calcolaTotale(separaOrdine(ordine));
			totale += prezzoCorrente;
		}
		return totale;
	}
}
