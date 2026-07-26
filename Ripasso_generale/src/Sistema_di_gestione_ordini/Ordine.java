package Sistema_di_gestione_ordini;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ordine {

	
	//variabili di istanza
	
	private String idOrdine;
	private Cliente cliente;
	private List<Prodotto> prodotti = new ArrayList<>();
	private double totale;
	private boolean completato;
	private LocalDateTime data;
	//-------------------------------------------------------------------------------------------
	//costruttore
	
	public Ordine(String idOrdine, Cliente cliente) {
		
		this.idOrdine = idOrdine;
		this.cliente = cliente;
		this.prodotti = new ArrayList<>();
		this.totale = 0;
		this.completato = false;
		this.data = LocalDateTime.now();
	}
	//-------------------------------------------------------------------------------------------
	//metodi getter setter
	public String getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(String idOrdine) {
		this.idOrdine = idOrdine;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public double getTotale() {
		return totale;
	}


	public boolean isCompletato() {
		return completato;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	//-------------------------------------------------------------------------------------------
	//metodi
		
	@Override
	public String toString() {
		return "Ordine: \n "
				+ "idOrdine=" + idOrdine + ", \n"
				+ " cliente=" + cliente + ", \n"
				+ " totale=" + totale + ",\n"
				+ " completato=" + completato + ", \n"
				+ " data=" + data + ".";
	}
	
	//-------------------------------------------------------------------------------------------
	
	public double calcolaOrdine ()
	{
		double totale = 0;
		
		if(prodotti.isEmpty())
		{
			totale = 0;
		}
		else
		{
			for(int i = 0; i < prodotti.size(); i++)
			{
				totale += prodotti.get(i).getPrezzo();
			}
		}
		
		return totale;
	}
	
	public double calcolaTotale()
	{
		double totale = 0;
		
		for(Prodotto p : prodotti){
		    totale += p.getPrezzo();
		}
		
		return totale;
	}
	
	//-------------------------------------------------------------------------------------------

	public void aggiungiProdotto(Prodotto prodotto)
	{
		prodotti.add(prodotto);
		calcolaTotale();
		
	}
	
	//-------------------------------------------------------------------------------------------

	public void rimuoviProdotto(Prodotto prodotto)
	{
		prodotti.remove(prodotto);
		calcolaTotale();
	}
	
	//-------------------------------------------------------------------------------------------

	public boolean completaOrdine()
	{
		return true;
	}
	
	//-------------------------------------------------------------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(idOrdine);
	}
	
	//-------------------------------------------------------------------------------------------
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordine other = (Ordine) obj;
		return Objects.equals(idOrdine, other.idOrdine);
	}
	
	
	

	
}
