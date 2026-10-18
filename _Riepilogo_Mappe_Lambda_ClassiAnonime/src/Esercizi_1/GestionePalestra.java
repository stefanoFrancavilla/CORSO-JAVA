package Esercizi_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestionePalestra {

	interface ValidatoreAccesso {
	    boolean accetta(String accesso);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ValidatoreAccesso validatore = new ValidatoreAccesso()
			{
		@Override
		public boolean accetta(String accesso)
		{
			if (accesso == null || accesso.isEmpty())
			{
				return false;
			}
			else if (!accesso.contains(":") || accesso.split(":").length != 3)
			{
				return false;
			}
			else
			{
				String corso = recuperaCorso(accesso);
				String utente = recuperaNome(accesso);
				int minuti = recuperaDurata(accesso);
				
				if(corso.isEmpty() || utente.isEmpty() || minuti <= 0)
				{
					return false;
				}
				return true;
			}
			
				
		}
			};
		
			List<String> accessi = new ArrayList<>(List.of(
				    "Yoga:Anna:60",
				    "Pilates:Luca:45",
				    "Yoga:Marco:75",
				    "Spinning:Anna:50",
				    "Yoga:Anna:0",
				    "Pilates::30",
				    "Spinning:Luca:65",
				    "Yoga:Marco:90",
				    "Pilates:Sara:40"
				));
			
			accessi.removeIf(n -> !validatore.accetta(n));
			accessi.forEach(n -> System.out.println(n));
			
			List<Integer> durateAccessi = new ArrayList<>();
			for(String accesso : accessi )
			{
				int durataCorrente = recuperaDurata(accesso);
				durateAccessi.add(durataCorrente);
			}
			
			System.out.println();
			System.out.println("----------------------------------");
			
			durateAccessi.forEach(n -> System.out.println(n));
			
			System.out.println();
			System.out.println("----------------------------------");
			
			durateAccessi.sort((a, b) -> Integer.compare(b, a));
			durateAccessi.forEach(n -> System.out.println(n));
			System.out.println();
			System.out.println("----------------------------------");
			
			System.out.println(contaCorsi(accessi));
			System.out.println();
			System.out.println("----------------------------------");
			
			System.out.println(minutiPerUtente(accessi));
			System.out.println();
			System.out.println("----------------------------------");
			
			System.out.println(corsoPiuFrequentato(accessi));
			System.out.println();
			System.out.println("----------------------------------");
			
			System.out.println(riepilogoUtenti(accessi));
			
			
	}

	public static String recuperaCorso (String accesso)
	{
		int primiDuePunti = accesso.indexOf(":");
		String corso = accesso.substring(0, primiDuePunti);
		return corso;
	}
	
	public static String recuperaNome (String accesso)
	{
		int primiDuePunti = accesso.indexOf(":");
		int secondiDuePunti = accesso.indexOf(":", primiDuePunti +1);
		String nome = accesso.substring(primiDuePunti + 1, secondiDuePunti);
		return nome;
	}
	
	public static int recuperaDurata (String accesso)
	{
		int primiDuePunti = accesso.indexOf(":");
		int secondiDuePunti = accesso.indexOf(":", primiDuePunti +1);
		String minuti = accesso.substring(secondiDuePunti + 1, accesso.length());
		
		return Integer.parseInt(minuti);	
	}
	
	public static String[] separaAccesso(String accesso)
	{
		String[] accessoSeparato = new String[3];
		
		String corso = recuperaCorso(accesso);
		String utente = recuperaNome(accesso);
		
		int primiDuePunti = accesso.indexOf(":");
		int secondiDuePunti = accesso.indexOf(":", primiDuePunti +1);
		String minuti = accesso.substring(secondiDuePunti + 1, accesso.length());
		
		accessoSeparato[0] = corso;
		accessoSeparato[1] = utente;
		accessoSeparato[2] = minuti;
		
		return accessoSeparato;
	}
	
	public static Map<String, Integer> contaCorsi(List<String> accessi)
	{
		Map<String, Integer> contatoreCorsi = new HashMap<>();
		for (String accesso : accessi)
		{
			String corso = recuperaCorso(accesso);
			
			if (contatoreCorsi.containsKey(corso))
			{
				int count = contatoreCorsi.get(corso) + 1;
				contatoreCorsi.put(corso, count);
			}
			else
			{
				contatoreCorsi.put(corso, 1);
			}
		}
		return contatoreCorsi;
	}
	
	public static Map<String, Integer> minutiPerUtente(List<String> accessi)
	{
		Map<String, Integer> contaMinutiTotali = new HashMap<>();
		
		for (String accesso : accessi)
		{
			int minutiCorrente = recuperaDurata(accesso);
			String utenteCorrente = recuperaNome(accesso);
			
			if(contaMinutiTotali.containsKey(utenteCorrente))
			{
				int minutiUtente = contaMinutiTotali.get(utenteCorrente) + minutiCorrente;
				contaMinutiTotali.put(utenteCorrente, minutiUtente);
			}
			else
			{
				contaMinutiTotali.put(utenteCorrente, minutiCorrente);
			}
		}
		return contaMinutiTotali;
	}
	
	public static String corsoPiuFrequentato (List<String> accessi)
	{
		Map<String, Integer> frequenze = contaCorsi(accessi);
		
		int counter = 0;
		String utenteFrequente = null;
		
		for(String utente : frequenze.keySet())
		{
			
		int frequenzaCorrente = frequenze.get(utente);
		String utenteCorrente =  utente;
		
		if(frequenzaCorrente > counter)
		{
			counter = frequenzaCorrente;
			utenteFrequente = utenteCorrente;
		}
			
		}
		return utenteFrequente;
	}
	
	public static String riepilogoUtenti(List<String> accessi)
	{
		Set<String> utenti = new HashSet<>();
		StringBuilder riepilogo = new StringBuilder("Utenti iscritti:");
		
		for(String accesso : accessi)
		{
			String nomeUtente = recuperaNome(accesso);
			utenti.add(nomeUtente);
		}
		
		int count = 0;
		for (String utente : utenti)
		{
		    count++;
		    if (count == utenti.size()) {
		       
		        riepilogo.append(" ").append(utente);
		    } else {
		    
		        riepilogo.append(" ").append(utente).append(",");
		    }
		}
		
		String riepilogoFinale = riepilogo.toString();
		return riepilogoFinale;
		
	}
}
