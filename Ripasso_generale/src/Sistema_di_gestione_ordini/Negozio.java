package Sistema_di_gestione_ordini;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

	//variabili di istanza
	
	private List<Cliente> clienti;
	private List<Prodotto> prodotti;
	private List<Ordine> ordini;
	
	//costruttore
	
	public Negozio() {

		this.clienti = new ArrayList<>();
		this.prodotti = new ArrayList<>();
		this.ordini = new ArrayList<>();
	}

	//metodi getter setter
	
	public List<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	
	//metodi
	
	 public void aggiungiProdotto(Prodotto prodotto) {
	        if (prodotto != null) {
	            prodotti.add(prodotto);
	        }
	    }
	
	
	//-------------------------------------------------------------------------------------------
	public boolean rimuoviProdotto(Prodotto prodotto)
	{
		return prodotti.remove(prodotto);
	}
	
	//-------------------------------------------------------------------------------------------
	public Prodotto cercaProdotto(String nome) {

	    for (Prodotto prodotto : prodotti) {

	        if (prodotto.getNome().equalsIgnoreCase(nome)) {
	            return prodotto;
	        }

	    }

	    return null;
	}
	
	//-------------------------------------------------------------------------------------------
	public Prodotto cercaProdottoPerId (String Id)
	{
		for(Prodotto prodotto : prodotti)
		{
		  if (prodotto.getId().equals(Id))
		  {
			  return prodotto;
		  }
		}
		
		return null;
	}
	
	
	//-------------------------------------------------------------------------------------------
	public void mostraProdotti() {

	    if (prodotti.isEmpty()) {
	        System.out.println("Nessun prodotto presente.");
	        return;
	    }

	    for (Prodotto prodotto : prodotti) {
	        System.out.println(prodotto);
	    }
	}
	
	
	//-------------------------------------------------------------------------------------------
	public void aggiungiCliente(Cliente cliente)
	{
		clienti.add(cliente);
		
	}
	
	
	//-------------------------------------------------------------------------------------------
		public boolean rimuoviCliente(Cliente cliente)
		{
			return clienti.remove(cliente);
		}
	
		

   //-------------------------------------------------------------------------------------------
		public void stampaClienti() {
		    for (Cliente cliente : clienti) {
		        System.out.println(cliente);
		    }
		}
	
		
	//-------------------------------------------------------------------------------------------
		public Cliente cercaClientePerId (String Id)
		{
			for(Cliente cliente : clienti )
			{
			  if (cliente.getId().equals(Id))
			  {
				  return cliente;
			  }
			}
			
			return null;
		}
   //-------------------------------------------------------------------------------------------	
	
		public Ordine creaOrdine(String idOrdine, String idCliente) {

		    Cliente cliente = cercaClientePerId(idCliente);

		    if (cliente == null) {
		        return null;
		    }

		    Ordine ordine = new Ordine(idOrdine, cliente);

		    ordini.add(ordine);

		    return ordine;
		}

   //-------------------------------------------------------------------------------------------
	
		public Ordine cercaOrdine(String idOrdine) {
		    for (Ordine ordine : ordini) {
		        if (ordine.getIdOrdine().equals(idOrdine)) {
		            return ordine;
		        }
		    }
		    return null;
		}
	
	//-------------------------------------------------------------------------------------------
	
	public boolean aggiungiProdottoOrdine(String idOrdine, String idProdotto, int quantita) {

	    Ordine ordine = cercaOrdine(idOrdine);
	    if (ordine == null) {
	        return false;
	    }

	    Prodotto prodotto = cercaProdottoPerId(idProdotto);
	    if (prodotto == null) {
	        return false;
	    }

	    if (quantita <= 0) {
	        return false;
	    }

	    if (prodotto.getQuantitaMagazzino() < quantita) {
	        return false;
	    }

	    for (int i = 0; i < quantita; i++) {
	        ordine.aggiungiProdotto(prodotto);
	    }

	    prodotto.setQuantitaMagazzino(prodotto.getQuantitaMagazzino() - quantita);

	    return true;
	}
}
