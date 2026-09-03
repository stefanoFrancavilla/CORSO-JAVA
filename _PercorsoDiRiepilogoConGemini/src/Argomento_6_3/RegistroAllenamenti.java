package Argomento_6_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroAllenamenti {

	private Map<String, List<Integer>> allenamenti = new HashMap<>();
	
	public void aggiungiAllenameto(String nome, int minuti)
	{
		allenamenti.putIfAbsent(nome, new ArrayList());
		allenamenti.get(nome).add(minuti);
	}
	
	public int calcolaMinutiTotali(String nome)
	{
		List<Integer> minutiAllenamento = allenamenti.get(nome);
		
		if (minutiAllenamento == null || minutiAllenamento.isEmpty())
		{
			return 0;
		}
		int minutiTotali = 0;
		
		for (int minutiCorrenti : minutiAllenamento)
		{
			minutiTotali += minutiCorrenti;
		}
		
		return minutiTotali;
		
	}
	
	public double calcolaMediaAllenamento(String nome)
	{
		List<Integer> minutiAllenamento = allenamenti.get(nome);
		
		if (minutiAllenamento.isEmpty() || minutiAllenamento == null)
		{
			return 0.0;
		}
		
		
			double minutiTotali = 0.0;
			 
			 for(int minutiCorrenti : minutiAllenamento)
			 {
				 minutiTotali += minutiCorrenti;
			 }
		
		
		double media =  minutiTotali / minutiAllenamento.size();
		
		return media;
	}
	
	
	public void stampaAllenamenti()
	{
		for (String nome : allenamenti.keySet())
		{
			String nomeCorrente = nome;
			List<Integer> tempiDegliAllenamenti = allenamenti.get(nomeCorrente);
			
			
			System.out.println("Il nome è: " + nomeCorrente);
		
			System.out.println("I tempi degli allenamenti sono: " + tempiDegliAllenamenti.stream().toList()); 
			System.out.println("I minuti totali degli allenamenti sono: " + calcolaMinutiTotali(nomeCorrente)); 
			System.out.println("La media degli alenamenti è: " + calcolaMediaAllenamento(nomeCorrente));
			System.out.println("-------------------------");
			
		}
	}
	
	public String trovaUtenteConPiuMinuti() {
	    String nome = "";
	    double minutiMax = 0;

	    for (String nominativo : allenamenti.keySet()) {
	        double minutiCorrenti = calcolaMinutiTotali(nominativo);

	        if (minutiCorrenti > minutiMax) {
	            minutiMax = minutiCorrenti;
	            nome = nominativo;
	        }
	    }

	    return nome;
	}
	
	public void stampaUtentiSopraMedia(double soglia) {
	    if (soglia <= 0) {
	        System.out.println("Inserire una soglia valida");
	        return;
	    }

	    for (String nome : allenamenti.keySet()) {
	        if (calcolaMediaAllenamento(nome) > soglia) {
	            System.out.println("Gli utenti con la media sopra alla soglia sono: " + nome);
	        }
	    }
	}
	
	public boolean esisteUtente(String nome)
	{
		if (allenamenti.containsKey(nome))
		{
			return true;
		}
		return false;
	}
	
	public void contaAllenamenti ( String nome)
	{
		int numeroAllenamenti = allenamenti.get(nome).size();
		
		System.out.println("Il numero delgi allenamenti è: " + numeroAllenamenti);
	
		
	}
}
