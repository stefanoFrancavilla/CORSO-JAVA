package Esercizi_1;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class AssistenzaTecnica {

	public interface ValidatoreRichiesta {
	    boolean valida(String richiesta);
	}
	public static void main(String[] args) {
		
		
		ValidatoreRichiesta validatore = new ValidatoreRichiesta() 
				{
			@Override
			public boolean valida(String richiesta)
			{
				if (richiesta == null || richiesta.isBlank())
				{
					return false;
				}
				else if (richiesta.split(":").length != 4)
				{
					return false;
				}
				else
				{
					String id = recuperaId(richiesta);
					String cliente = recuperaCliente(richiesta);
					String problema = recuperaProblema(cliente);
					String priorita = recuperaPriorita(cliente).toUpperCase();
					
					if(id.isEmpty() || cliente.isEmpty() || problema.isEmpty())
					{
						return false;
					}
					else if (!(priorita.equals("ALTA") || priorita.equals("MEDIA") || priorita.equals("BASSA")))
					{
						return false;
					}
					else if (!id.startsWith("T"))
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
				
				
				Deque<String> richieste = new LinkedList<>();

				aggiungiRichiesta(richieste, "T001:Anna:PC non si accende:ALTA", validatore);
				aggiungiRichiesta(richieste, "T002:Luca:Stampante offline:MEDIA", validatore);
				aggiungiRichiesta(richieste, "T003:Anna:Wi-Fi lento:BASSA", validatore);
				aggiungiRichiesta(richieste, "T004:Marco:Schermo nero:MEDIA", validatore);
				aggiungiRichiesta(richieste, "T005:Anna:Hard disk rumoroso:ALTA", validatore);
				aggiungiRichiesta(richieste, "T006:Luca:Mouse non funziona:BASSA", validatore);

				aggiungiRichiesta(richieste, "T01:Anna:PC non si accende:ALTA", validatore);
				aggiungiRichiesta(richieste, "X001:Anna:PC non si accende:ALTA", validatore);
				aggiungiRichiesta(richieste, "T001:Anna:PC non si accende:URGENTE", validatore);
				aggiungiRichiesta(richieste, "T001::PC non si accende:ALTA", validatore);
				aggiungiRichiesta(richieste, "", validatore);
				aggiungiRichiesta(richieste, null, validatore);

				System.out.println(visualizzaProssimaRichiesta(richieste));
				System.out.println(gestisciProssimaRichiesta(richieste));

				System.out.println(richiestePerPriorita(richieste));
				System.out.println(richiestePerCliente(richieste));
				System.out.println(idsPrioritaAlta(richieste));
				System.out.println(riepilogoRichieste(richieste));

				richieste.forEach(richiesta -> System.out.println(richiesta));

	}
	
	// metodi per recuperare dati
	
	//---------------------------------------------------------------------------------
	public static String recuperaId(String richiesta)
	{
		int primiDuePunti = richiesta.indexOf(":");
		String id = richiesta.substring(0, primiDuePunti);
		return id;
	}
	
	public static String recuperaCliente(String richiesta)
	{
		int primiDuePunti = richiesta.indexOf(":");
		int secondiDuePunti = richiesta.indexOf(":" , primiDuePunti +1);
		String nome = richiesta.substring(primiDuePunti + 1, secondiDuePunti);
		return nome;
	}
	
	public static String recuperaProblema(String richiesta)
	{
		int primiDuePunti = richiesta.indexOf(":");
		int secondiDuePunti = richiesta.indexOf(":" , primiDuePunti +1);
		int terziDuePunti = richiesta.indexOf(":", secondiDuePunti +1);
		String problema = richiesta.substring(secondiDuePunti + 1, terziDuePunti);
		return problema;
	}
	
	public static String recuperaPriorita(String richiesta)
	{
		int primiDuePunti = richiesta.indexOf(":");
		int secondiDuePunti = richiesta.indexOf(":" , primiDuePunti +1);
		int terziDuePunti = richiesta.indexOf(":", secondiDuePunti +1);
		String priorita = richiesta.substring(terziDuePunti + 1, richiesta.length());
		return priorita;
	}
  //------------------------------------------------------------------------------------------

	public static boolean aggiungiRichiesta(Deque<String> richieste, String richiesta, ValidatoreRichiesta validatore)
	{
		if (!validatore.valida(richiesta))
		{
			return false;
		}
		else 
		{
		 
			String priorita = recuperaPriorita(richiesta);
			if (priorita != "ALTA")
			{
				richieste.addLast(richiesta);
				return true;
			}
			else
			{
				richieste.addFirst(richiesta);
				return true;
			}
		}
	}
	
	public static String gestisciProssimaRichiesta(Deque<String> richieste)
	{
		if (richieste.isEmpty())
		{
			return "Nessuna richiesta in attesa";
		}
		else
		{
			String richiestaInAttesa = richieste.getFirst();
			richieste.removeFirst();
			return richiestaInAttesa;
		}
	}
	
	public static String visualizzaProssimaRichiesta(Deque<String> richieste)
	{
		if (richieste.isEmpty())
		{
			return "Nessuna richiesta in attesa";
		}
		else
		{
			String prossimaRichiesta = richieste.getFirst();
			return prossimaRichiesta;
		}
	}
	
	public static Map<String, Integer> richiestePerPriorita(Deque<String> richieste)
	{
		Map<String, Integer> prioritaRichieste = new LinkedHashMap<>();
		
		for(String richiesta : richieste)
		{
			String prioritaCorrente = recuperaPriorita(richiesta);
			
			if(prioritaRichieste.containsKey(prioritaCorrente))
			{
				int count = prioritaRichieste.get(prioritaCorrente) + 1;
				prioritaRichieste.put(prioritaCorrente, count);
			}
			else
			{
				prioritaRichieste.put(prioritaCorrente, 1);
			}
		}
		return prioritaRichieste;
	}
	
	public static Map<String, Integer> richiestePerCliente(Deque<String> richieste)
	{
		Map<String , Integer> richiesteCliente = new LinkedHashMap<>();
		for(String richiesta : richieste)
		{
			String clienteCorrente = recuperaCliente(richiesta);
			if(richiesteCliente.containsKey(clienteCorrente))
			{
				int count = richiesteCliente.get(clienteCorrente) + 1;
				richiesteCliente.put(clienteCorrente, count);
			}
			else
			{
				richiesteCliente.put(clienteCorrente, 1);
			}
		}
		return richiesteCliente;
	}

	// questo metodo non lo ricordavo e mi sono fatto aiutare.
	//vorrei ripetere gli stream partendo dalle basi ripassando un'elemento alla volta in ogni esercizio.
	public static String idsPrioritaAlta(Deque<String> richieste) {
        if (richieste == null || richieste.isEmpty()) {
            return "Nessuna richiesta ad alta priorità";
        }

        StringBuilder sb = new StringBuilder();

        richieste.stream()
           
            .filter(r -> r != null && r.toUpperCase().contains("ALTA"))
            .map(r -> {
                String[] parti = r.split(":");
                return parti[0].trim();
            })
            .forEach(id -> {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(id);
            });

        return sb.length() > 0 ? sb.toString() : "Nessuna richiesta ad alta priorità";
    }

	public static String riepilogoRichieste(Deque<String> richieste)
	{
		StringBuilder riepilogo = new StringBuilder();

		Map<String, Integer> nomiERichieste = new LinkedHashMap<>();
		
		Set<String> clienti = new LinkedHashSet<>();
		for(String richiesta : richieste)
		{
			String nomeCorrente = recuperaCliente(richiesta);
			clienti.add(nomeCorrente);
		}
		
		for(String cliente : clienti)
		{
			if(nomiERichieste.containsKey(cliente))
			{
				int countRichieste = nomiERichieste.get(cliente);
				riepilogo.append(cliente).append(" ha ").append(countRichieste).append(" in attesa");
			}
		}
		
		return riepilogo.toString();
		
	}
}
