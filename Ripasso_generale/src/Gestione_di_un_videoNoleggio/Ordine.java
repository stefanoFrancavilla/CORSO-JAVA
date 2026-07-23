package Gestione_di_un_videoNoleggio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	public Ordine(String idOrdine, Cliente cliente, List<Prodotto> prodotti, double totale, boolean completato,
			LocalDateTime data) {
		
		this.idOrdine = idOrdine;
		this.cliente = cliente;
		this.prodotti = prodotti;
		this.totale = totale;
		this.completato = completato;
		this.data = data;
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

	public void setTotale(double totale) {
		this.totale = totale;
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
				+ "prodotti=" + prodotti + ", \n"
				+ " totale=" + totale + ",\n"
				+ " completato=" + completato + ", \n"
				+ " data=" + data + ".";
	}
	
	//-------------------------------------------------------------------------------------------
	
	public double calcolaOrdine (List<Prodotto> prodotti)
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
	
	

	
}
