package RiepilogoCollectors;

import java.util.ArrayList;
import java.util.List;

public class AnalisiOrdini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ordini = new ArrayList<>();

		ordini.add("Smartphone:Elettronica:Anna:2:299.90");
		ordini.add("Cuffie:Audio:Luca:1:79.99");
		ordini.add("Smartwatch:Elettronica:Marco:1:199.00");
		ordini.add("Casse:Audio:Anna:3:45.50");
		ordini.add("Caricabatterie:Accessori:Luca:5:19.90");
		ordini.add("Smartphone:Elettronica:Marco:1:299.90");
		ordini.add("Tastiera:Accessori:Anna:2:59.00");
		ordini.add("Cuffie:Audio:Marco:2:79.99");
		ordini.add("Smartwatch:Elettronica:Anna:1:199.00");
		ordini.add("Mouse:Accessori:Luca:4:25.00");
		ordini.add("Casse:Audio:Luca:1:45.50");
		ordini.add("Smartphone:Elettronica:Anna:2:299.90");
		

		System.out.println("1. Ordini inseriti:");
		
		
		ordini.stream()
		.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("----------------------------------");
		
		
		// controllo metodi di estrazione
		String prodotto = recuperaProdotto("Smartphone:Elettronica:Anna:2:299.90");
		System.out.println(prodotto);
		System.out.println("----------------------------------");
		
		String categoria = recuperaCategoria("Smartphone:Elettronica:Anna:2:299.90");
		System.out.println(categoria);
		System.out.println("----------------------------------");
		
		String utente = recuperaUtente("Smartphone:Elettronica:Anna:2:299.90");
		System.out.println(utente);
		System.out.println("----------------------------------");
		
		
		int quantita = recuperaQuantita("Smartphone:Elettronica:Anna:2:299.90");
		System.out.println(quantita);
	    System.out.println("----------------------------------");
			
		double prezzo = recuperaPrezzoUnitario("Smartphone:Elettronica:Anna:2:299.90");
		System.out.println(prezzo);
		System.out.println("----------------------------------");
		
		
		
		
		
		
		
		
	}

	
	public static String recuperaProdotto(String ordine)
	
	{
		
		int primiDuePunti = ordine.indexOf(":");
		String prodotto = ordine.substring( 0, primiDuePunti);
		return prodotto;
	}
	
	public static String recuperaCategoria(String ordine)
	{
		int primiDuePunti = ordine.indexOf(":");
		int secondiDuePunti = ordine.indexOf(":" , primiDuePunti + 1);
		String categoria = ordine.substring(primiDuePunti +1, secondiDuePunti);
		return categoria;
	}
	
	public static String recuperaUtente(String ordine)
	{
		int primiDuePunti = ordine.indexOf(":");
		int secondiDuePunti = ordine.indexOf(":" , primiDuePunti + 1);
		int terziDuePunti = ordine.indexOf(":", secondiDuePunti +1 );
		String utente = ordine.substring(secondiDuePunti +1, terziDuePunti);
		return utente;
	}
	
	public static int recuperaQuantita(String ordine)
	{
		int primiDuePunti = ordine.indexOf(":");
		int secondiDuePunti = ordine.indexOf(":" , primiDuePunti + 1);
		int terziDuePunti = ordine.indexOf(":", secondiDuePunti +1);
		int quartiDuePunti = ordine.indexOf(":", terziDuePunti +1);
		String quantita = ordine.substring(terziDuePunti +1, quartiDuePunti);
		return Integer.parseInt(quantita);
	}
	
	public static double recuperaPrezzoUnitario(String ordine)
	{
		int primiDuePunti = ordine.indexOf(":");
		int secondiDuePunti = ordine.indexOf(":" , primiDuePunti + 1);
		int terziDuePunti = ordine.indexOf(":", secondiDuePunti +1);
		int quartiDuePunti = ordine.indexOf(":", terziDuePunti +1);
		String prezzo = ordine.substring(quartiDuePunti +1, ordine.length());
		return Double.parseDouble(prezzo);
		
	}
}