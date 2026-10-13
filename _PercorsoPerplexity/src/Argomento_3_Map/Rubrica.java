package Argomento_3_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rubrica {

	private Map<String, Contatto> contatti;

	//costruttore
	public Rubrica() {
	
		this.contatti = new HashMap<>();
	}

	// metodi getter setter
	public Map<String, Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(Map<String, Contatto> contatti) {
		this.contatti = contatti;
	}
	
	// metodi
	
	// metodo aggiungi contatto
	public boolean aggiungiContatto(Contatto contatto)
	{
		if (contatto == null)
		{
			return false;
		}
		else if (contatto.getNumeroTelefono() == null || contatto.getNumeroTelefono().isBlank())
		{
			return false;
		}
		else
		{
			String numeroTelefonico = contatto.getNumeroTelefono();
			
			if (contatti.containsKey(numeroTelefonico))
			{
				return false;
			}
			
			contatti.put(numeroTelefonico, contatto);
			return true;
		}
	}
	
	
	// metodo cerca contatto per numero
	
	public Contatto cercaContattoPerNumero(String numeroTelefono)
	{
		if (numeroTelefono == null || numeroTelefono.isBlank())
		{
			return null;
		}
		
		return contatti.get(numeroTelefono);
	}
	
	// metodo rimuovi contatto
	
	public boolean rimuoviContatto(String numeroTelefono)
	{
		if (numeroTelefono == null || numeroTelefono.isBlank())
		{
			return false;
		}
		else if (!contatti.containsKey(numeroTelefono))
		{
			return false;
		}
		else
		{
			contatti.remove(numeroTelefono);
			return true;
		}
	}
	
	// metodo per contare i contatti
	
	public int contaContatti()
	{
		int numeroContatti = contatti.size();
		return numeroContatti;
	}
	
	// metodo ottieni tutti i numeri
	public Set<String> ottieniNumeriTelefono()
	{
	  return new HashSet<>(contatti.keySet());
	}
	
	// metodo ottieni tutti i contatti
	public Collection<Contatto> ottieniContatti()
	{
		return new HashSet<>(contatti.values());
	}
	
	// metodo cerca contatti per nome
	public List<Contatto> cercaContattiPerNome(String nome)
	{
		List<Contatto> contattiTrovati = new ArrayList<>();
		if (nome == null || nome.isBlank())
		{
			return contattiTrovati;
		}
		else
		{
			for (Contatto contatto : contatti.values())
			{
				 String nomeCorrente = contatto.getNome();
				 if (nomeCorrente.equalsIgnoreCase(nome))
				 {
					 contattiTrovati.add(contatto);
				 }
			}
			return contattiTrovati;
		}
	}
	
	// metodo aggiorna email di un contatto
	
	public boolean aggiornaEmail(String numeroTelefono, String nuovaEmail)
	{
		if (numeroTelefono == null || numeroTelefono.isBlank())
		{
			return false;
		}
		else if (nuovaEmail == null || nuovaEmail.isBlank() || !nuovaEmail.contains("@"))
		{
			return false;
		}
		else
		{
			Contatto contattoDaAggiornare = cercaContattoPerNumero(numeroTelefono);
			if (contattoDaAggiornare == null)
			{
				return false;
			}
			else
			{
				contattoDaAggiornare.setEmail(nuovaEmail);
				return true;
			}
		}
	}
	
}
